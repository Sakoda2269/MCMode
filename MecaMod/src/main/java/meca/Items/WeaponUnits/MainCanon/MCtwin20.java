package meca.Items.WeaponUnits.MainCanon;

import meca.MainCanon;
import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCtwin20 extends MainCanon{


	public MCtwin20() {
		super(UnitBase.Large, 10, 23, 300,2,20);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"twin20"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("twin20");
	}

}
