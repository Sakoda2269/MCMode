package meca.Items.WeaponUnits.SubCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCHighSub20 extends SubCanon{

	public MCHighSub20() {
		super(UnitBase.Large, 8, 16, 240, 1, 20, true);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"highsub20"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("highsub20");
	}

}