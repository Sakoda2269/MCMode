package meca.Entities.Bullet1;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityBullet extends EntityLiving{

	float vy;
	float vydown;
	float lookx,lookz;
	float looky;
	float speed=0;
	boolean hitent;
	float range;
	EntityPlayer owner;

	public EntityBullet(World worldIn) {
		super(worldIn);
		this.setSize(0.1f, 0.1f);
		this.setHealth(100000000);

	}
	public EntityBullet(World worldin,EntityPlayer ownerin,int rangein) {
		super(worldin);
		owner=ownerin;
		range = rangein/120;
		speed=rangein/100*1.5f;
		float p = (float)Math.atan(owner.getPitchYaw().y/owner.getPitchYaw().x);
		looky=(float)owner.getLookVec().y;
		lookx=(float)owner.getLookVec().x;
		lookz=(float)owner.getLookVec().z;
		this.setLocationAndAngles(owner.posX, owner.posY+1.5, owner.posZ, owner.getRotationYawHead(), p);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, posX, posY, posZ, 0, 0, 0);
		if (!world.isRemote) {
			vy-=0.025f;
			if(owner!=null) {
				this.setVelocity(speed*lookx, vy, speed*lookz);
				if(this.onGround || this.collided || hitent) {
					world.createExplosion(this, this.posX, this.posY,this.posZ, 10, false);
					this.setDead();
				}
			}
		}


	}



	@Override
	public void knockBack(Entity entityIn, float strength, double xRatio, double zRatio) {
	}

	@Override
	public void onAddedToWorld() {
		super.onAddedToWorld();
		vy=looky*1.2f;

	}
	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if(!entityIn.equals(owner)) {
			hitent=true;
		}
	}












}
