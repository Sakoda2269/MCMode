package meca.Entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBullet extends EntityLiving{

	float vy;
	float lookx,lookz;
	float looky;
	float speed=1.5f;
	boolean hitent;
	EntityPlayer owner;

	public EntityBullet(World worldIn) {
		super(worldIn);
		this.setSize(0.1f, 0.1f);
	}
	public EntityBullet(World worldin,EntityPlayer ownerin) {
		super(worldin);
		owner=ownerin;
		float p = (float)Math.atan(owner.getPitchYaw().y/owner.getPitchYaw().x);
		looky=(float)owner.getLookVec().y;
		lookx=(float)owner.getLookVec().x;
		lookz=(float)owner.getLookVec().z;
		this.setLocationAndAngles(owner.posX, owner.posY+1.5, owner.posZ, owner.getRotationYawHead(), p);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		vy-=0.005f;
		if(owner!=null) {
			this.setVelocity(speed*lookx, vy, speed*lookz);
			if(this.onGround || this.collided || hitent) {
				world.createExplosion(this, this.posX, this.posY,this.posZ, 10, false);
				owner.setPosition(posX, posY, posZ);
				this.setDead();
			}
		}


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
