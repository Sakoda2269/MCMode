package meca.Items.WeaponUnits.Other;

import meca.MecaMod;
import meca.UnitBase;
import meca.Entities.FlareBullet.EntityFlare;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class MCFlare extends UnitBase{

	public MCFlare() {
		super(UnitBase.Small);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"flare"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("flare");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		if (!worldIn.isRemote) {
			worldIn.spawnEntity(new EntityFlare(worldIn,playerIn));
			playerIn.getCooldownTracker().setCooldown(this, 50);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}





}
