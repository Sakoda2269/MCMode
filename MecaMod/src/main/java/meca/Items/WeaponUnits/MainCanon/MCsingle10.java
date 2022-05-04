package meca.Items.WeaponUnits.MainCanon;

import meca.MecaMod;
import meca.UnitBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MCsingle10 extends MainCanon{

	public MCsingle10(){
		super(UnitBase.Small,3,10,150,1,10);
		this.setRegistryName(new ResourceLocation(MecaMod.MODID,"single10"));
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName("single10");
	}


}
