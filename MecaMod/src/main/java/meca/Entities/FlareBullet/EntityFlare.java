package meca.Entities.FlareBullet;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityFlare extends EntityLiving{

	int timer;
	BlockPos posb[] = new BlockPos[5];

	EntityPlayer owner;
	Vec3d ve;

	public EntityFlare(World worldIn,EntityPlayer player) {
		super(worldIn);
		timer=0;
		owner = player;
		ve = player.getLookVec();
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	public void onAddedToWorld() {
		super.onAddedToWorld();
		timer=0;
	}


	@Override
	public void onUpdate() {
		super.onUpdate();
		timer+=1;
		this.setVelocity(ve.x, 0.2, ve.z);
		if(timer>=200) {
//			posb[0] = new BlockPos(this.getPositionVector());
//			world.setBlockState(posb[0], (IBlockState) MecaMod.flareB);
//			posb[1] = new BlockPos(this.getPositionVector());
//			world.setBlockState(posb[0], (IBlockState) MecaMod.flareB);
//			posb[2] = new BlockPos(this.getPositionVector());
//			world.setBlockState(posb[0], (IBlockState) MecaMod.flareB);
//			posb[3] = new BlockPos(this.getPositionVector());
//			world.setBlockState(posb[0], (IBlockState) MecaMod.flareB);
//			posb[4] = new BlockPos(this.getPositionVector());
//			world.setBlockState(posb[0], (IBlockState) MecaMod.flareB);
			System.out.println(this.getPositionVector());
			timer=0;
			this.setDead();
		}
	}


	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
	}

}
