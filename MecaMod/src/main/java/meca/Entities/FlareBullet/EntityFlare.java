package meca.Entities.FlareBullet;

import java.util.List;

import meca.MecaMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFlare extends EntityLiving{

	int timer;
	BlockPos posb[] = new BlockPos[13];

	EntityPlayer owner;
	Vec3d ve = new Vec3d(0,0,0);
	boolean grounded=false;
	double vx,vz,vy;
	boolean summon;
	boolean set;
	List<EntityLivingBase> entity2;

	public EntityFlare(World worldIn) {super(worldIn);}

	public EntityFlare(World worldIn,EntityPlayer player) {
		super(worldIn);
		timer=0;
		owner = player;
		this.setSize(0.1f, 0.1f);
		ve = player.getLookVec();
		vy=0.5;
		vx=ve.x;
		vz=ve.z;
		grounded=false;
		summon=false;
		set=false;
		this.setPosition(owner.posX, owner.posY+1.5, owner.posZ);
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	public void onAddedToWorld() {
		super.onAddedToWorld();
		this.setSilent(true);

		timer=0;
		vy=0.5;
		set=false;
		grounded=false;
		summon=false;
	}






	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		// TODO 自動生成されたメソッド・スタブ
		return 15728880;
	}

	@Override
	public float getBrightness() {
		// TODO 自動生成されたメソッド・スタブ
		return 50.0f;
	}

	@Override
	public boolean isImmuneToExplosions() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if(!grounded) {
			world.spawnParticle(EnumParticleTypes.FLAME, posX, posY, posZ, 0, 0, 0);
		}
		if (!world.isRemote) {
			timer+=1;
			if(timer<50) {
				this.setVelocity(vx, vy, vz);

			}

			if(timer>=50 && timer<400) {
				if(!summon) {
					world.spawnEntity(new EntityFlareInTheSky(world,this));
					summon=true;
				}
				if(this.onGround) {
					if(!set) {
						double bx=this.getPositionVector().x;
						double by=this.getPositionVector().y;
						double bz=this.getPositionVector().z;
						posb[0] = new BlockPos(this.getPositionVector());
						posb[1] = new BlockPos(bx+10,by,bz);
						posb[2] = new BlockPos(bx-10,by,bz);
						posb[3] = new BlockPos(bx,by,bz+10);
						posb[4] = new BlockPos(bx,by,bz-10);
						posb[5] = new BlockPos(bx,by,bz-20);
						posb[6] = new BlockPos(bx,by,bz+20);
						posb[7] = new BlockPos(bx+20,by,bz);
						posb[8] = new BlockPos(bx-20,by,bz);
						posb[9] = new BlockPos(bx-20,by,bz+20);
						posb[10] = new BlockPos(bx-20,by,bz-20);
						posb[11] = new BlockPos(bx+20,by,bz+20);
						posb[12] = new BlockPos(bx+20,by,bz-20);
						set=true;
					}

					for(int i=0;i<posb.length;i++) {
						world.setBlockState(posb[i],  MecaMod.flareB.getDefaultState());
					}

					grounded=true;

					entity2 = world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25));
					for(int i=0;i<world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25)).size();i++) {
						if(!world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25)).get(i).isGlowing() && !world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25)).get(i).equals(this)) {
							entity2.add(world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25)).get(i));
							world.getEntities(EntityLivingBase.class, EntitySelectors.withinRange(this.posX, this.posY, this.posZ, 25)).get(i).setGlowing(true);
						}
					}
				}
			}
			else if(timer>=400) {
				for(int i=0;i<posb.length;i++) {
					world.setBlockToAir(posb[i]);
				}
				for(int i=0;i<entity2.size();i++) {
					entity2.get(i).setGlowing(false);
				}
				this.setDead();
			}
		}
	}


	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		return;
	}

	@Override
	public void knockBack(Entity entityIn, float strength, double xRatio, double zRatio) {
		return;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

}
