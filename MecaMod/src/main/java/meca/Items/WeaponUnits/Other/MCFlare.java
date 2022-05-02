package meca.Items.WeaponUnits.Other;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCFlare extends UnitBase{

	public MCFlare() {
		super(UnitBase.Small);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"Flare"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("Flare");
	}



}
