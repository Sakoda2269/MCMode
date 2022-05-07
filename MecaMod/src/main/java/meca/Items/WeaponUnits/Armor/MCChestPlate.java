package meca.Items.WeaponUnits.Armor;

import meca.MecaMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class MCChestPlate extends ItemArmor implements Runnable{

	int tick=0;
	boolean jump=false;
	Thread th = new Thread(this);
	public EntityPlayer p;


	public MCChestPlate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName("chest");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"chest"));
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void jumppig() {
			jump=true;
	}



	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		p=player;
		if(!th.isAlive()) {
			th.start();
		}


	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2);
				if(jump) {
					p.jump();
					jump=false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



}
