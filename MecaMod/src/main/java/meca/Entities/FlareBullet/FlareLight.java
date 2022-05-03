package meca.Entities.FlareBullet;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FlareLight extends Block implements ITileEntityProvider{

	public FlareLight() {
		super(Material.AIR);
		this.setLightLevel(1.0F);
		this.setResistance(10000.0F);
		this.setDefaultState(this.blockState.getBaseState());
		this.setUnlocalizedName("flareblock");
		this.setRegistryName("flareblock");
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		// TODO 自動生成されたメソッド・スタブ
		return BlockRenderLayer.CUTOUT;
	}
	
	
	
	
	
	





}
