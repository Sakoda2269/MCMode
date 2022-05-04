package meca.Items.WeaponUnits.SubCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCHighSub15 extends SubCanon{

	public MCHighSub15() {
		super(UnitBase.Middle, 5, 9, 120, 1, 15, true);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"highsub15"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("highsub15");
	}

}
