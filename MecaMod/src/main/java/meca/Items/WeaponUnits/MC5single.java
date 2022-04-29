package meca.Items.WeaponUnits;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MC5single extends MainCanon{

	public MC5single() {
		super(UnitBase.Small, 3, 5, 100);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"single5"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("single5");
		this.maxStackSize=1;
	}

}
