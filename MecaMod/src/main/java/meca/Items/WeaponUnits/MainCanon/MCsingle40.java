package meca.Items.WeaponUnits.MainCanon;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCsingle40  extends MainCanon{


	public MCsingle40() {
		super(UnitBase.Huge, 20, 45, 500,1,40);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"single40"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("single40");
	}

}
