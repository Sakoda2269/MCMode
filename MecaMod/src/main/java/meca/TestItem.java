package meca;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class TestItem extends WeaponUnit{



	int a;

	TestItem(int size,int type){
		super(size,type, type);
		this.setRegistryName("test");
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("test");
		this.maxStackSize=1;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack stack = playerIn.getHeldItemMainhand();
		NBTTagCompound nbt = stack.getTagCompound();
		if(nbt==null) {
			stack.setTagCompound(new NBTTagCompound());
			nbt = stack.getTagCompound();
		}
		nbt.setInteger("parent", nbt.getInteger("parent")+1);
		System.out.println(nbt.getInteger("parent"));

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}




}
