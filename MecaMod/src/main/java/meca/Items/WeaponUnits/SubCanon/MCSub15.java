package meca.Items.WeaponUnits.SubCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCSub15 extends SubCanon{

	public MCSub15() {
		super(UnitBase.Large, 12, 12, 185, 4, 15, false);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"sub15"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("sub15");
	}

}