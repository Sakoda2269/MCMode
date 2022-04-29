package meca;

import meca.Entities.EntityBullet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class MainCanon extends WeaponUnit{

	int power;
	int range;

	public MainCanon(int sizein,int weightin,int powerin,int rangein) {
		super(sizein, WeaponUnit.MainCanon,weightin);
		power = powerin;
		range = rangein;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {


		if (!worldIn.isRemote) {
			worldIn.spawnEntity(new EntityBullet(worldIn,playerIn));
		}


		return super.onItemRightClick(worldIn, playerIn, handIn);
	}





}
