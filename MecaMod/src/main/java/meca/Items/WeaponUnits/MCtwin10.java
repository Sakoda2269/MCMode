package meca.Items.WeaponUnits;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCtwin10 extends MainCanon{


	public MCtwin10() {
		super(UnitBase.Middle, 5, 10, 150,2,10);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"twin10"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("twin10");
	}

}
