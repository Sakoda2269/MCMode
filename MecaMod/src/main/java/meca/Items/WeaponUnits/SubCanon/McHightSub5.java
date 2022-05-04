package meca.Items.WeaponUnits.SubCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class McHightSub5 extends SubCanon{

	public McHightSub5() {
		super(UnitBase.Small, 3, 3, 100, 1, 5,true);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"highsub5"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("highsub5");
	}

}
