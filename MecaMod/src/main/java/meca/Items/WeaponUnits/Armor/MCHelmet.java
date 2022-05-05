package meca.Items.WeaponUnits.Armor;

import meca.MecaMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class MCHelmet  extends ItemArmor{


	public MCHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName("helmet");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"helmet"));
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
