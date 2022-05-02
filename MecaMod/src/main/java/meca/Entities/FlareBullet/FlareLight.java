package meca.Entities.FlareBullet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FlareLight extends Block{

	public FlareLight() {
		super(Material.AIR);
		this.setLightLevel(1.0F);
		this.setResistance(10000.0F);
		this.setDefaultState(this.blockState.getBaseState());
		this.setUnlocalizedName("crow_block");
		this.setRegistryName("crow_block");
	}



}
