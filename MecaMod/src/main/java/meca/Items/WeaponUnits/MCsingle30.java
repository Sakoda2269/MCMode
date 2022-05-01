package meca.Items.WeaponUnits;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCsingle30 extends MainCanon{

	public MCsingle30() {
		super(UnitBase.Large, 10, 30, 400,1,30);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"single30"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("single30");
	}

}
