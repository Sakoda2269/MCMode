package meca.Items.WeaponUnits.MainCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCsingle15 extends MainCanon{

	public MCsingle15() {
		super(UnitBase.Middle, 5, 180, 200,1,15);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"single15"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("single15");
	}

}
