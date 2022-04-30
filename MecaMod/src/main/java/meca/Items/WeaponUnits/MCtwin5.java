package meca.Items.WeaponUnits;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCtwin5 extends MainCanon{

	public MCtwin5() {
		super(UnitBase.Small, 3, 5, 100);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"twin5"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("twin5");
		this.maxStackSize=1;
		range=100;
	}

}
