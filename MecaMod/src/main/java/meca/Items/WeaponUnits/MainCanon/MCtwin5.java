package meca.Items.WeaponUnits.MainCanon;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCtwin5 extends MainCanon{

	public MCtwin5() {
		super(UnitBase.Small, 3, 5, 100,2,5);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"twin5"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("twin5");
	}

}
