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
	int power;
	boolean hitent;
	float range;
	EntityPlayer owner;

	public EntityBullet(World worldIn) {
		super(worldIn);
		this.setSize(0.1f, 0.1f);
		this.setHealth(100000000);

	}
	public EntityBullet(World worldin,EntityPlayer ownerin,int rangein,int powerin) {
		super(worldin);
		owner=ownerin;
		power=powerin;
		range = rangein;
		speed=range/100*1.5f;
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
			vy-=2.5/range;
			if(owner!=null) {
				this.setVelocity(speed*lookx, vy, speed*lookz);
				if(this.onGround || this.collided || hitent) {
					world.createExplosion(owner, this.posX, this.posY,this.posZ, power/2, false);
					System.out.println(posX+","+posY+","+posZ);
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
	@Override
	protected boolean canDespawn() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}














}
