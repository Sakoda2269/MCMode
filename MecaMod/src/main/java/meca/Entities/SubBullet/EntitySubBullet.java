package meca.Entities.SubBullet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntitySubBullet extends EntityLiving{


	public EntityPlayer owner;
	public int power,range;
	double vx,vy,vz;
	double speed;
	boolean hitent;
	boolean ag;

	public EntitySubBullet(World worldIn) {
		super(worldIn);
		this.setSize(0.1f, 0.1f);
		this.setHealth(100000000);
	}

	public EntitySubBullet(World world,EntityPlayer player,int rangein,int powerin,boolean aghight) {
		super(world);
		owner=player;
		power=powerin;
		range=rangein;
		ag=aghight;
		vx=player.getLookVec().x;
		vy=(aghight?1.8:1.2)*player.getLookVec().y;
		vz=player.getLookVec().z;
		this.setSize(0.1f, 0.1f);
		this.setHealth(100000000);
		speed=range/100*1.5f;
		this.setLocationAndAngles(player.posX, player.posY+1.5, player.posZ, 0, 0);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, posX, posY, posZ, 0, 0, 0);
		if(!world.isRemote) {
			if(this.onGround || this.collided || hitent) {
				if(owner!=null) {
					world.createExplosion(owner, posX, posY, posZ, power, false);
					this.setDead();
				}
			}
			else {
				vy-=2.5/range;
				this.setVelocity(speed*vx, (ag?speed:1)*vy, speed*vz);
			}
		}

	}

	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if(!entityIn.equals(owner)) {
			hitent=true;
		}
	}
	@Override
	protected boolean canDespawn() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}



	@Override
	public void onAddedToWorld() {
		super.onAddedToWorld();
	}

	@Override
	public boolean isImmuneToExplosions() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}





}
