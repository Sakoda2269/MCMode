package meca;

import java.util.Random;

import meca.Entities.Bullet1.EntityBullet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public abstract class MainCanon extends WeaponUnit{

	Random rnd = new Random();

	public int power;
	public int range;
	public int canonnum;
	public boolean shooted;
	public int caliber;

	int damage=0;

	public MainCanon(int sizein,int weightin,int powerin,int rangein,int canonnumin,int caliberin) {
		super(sizein, WeaponUnit.MainCanon,weightin);
		power = powerin;
		range = rangein;
		canonnum=canonnumin;
		caliber = caliberin;
		this.setMaxDamage(101);
		this.setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		for(int i=0;i<20;i++) {
			int a=45-rnd.nextInt(90);
			float b=0.5f-rnd.nextFloat();
			float c=45-rnd.nextInt(90);
			float d = playerIn.getRotationYawHead();
			System.out.println(d);
			double e=-Math.sin(Math.toRadians(d+a));
			double f=Math.cos(Math.toRadians(d+c));
			worldIn.spawnParticle(EnumParticleTypes.FLAME, playerIn.posX, playerIn.posY+1.5f, playerIn.posZ, 0.5*e,0.8*b, 0.5*f);
		}
		if (!worldIn.isRemote) {
			damage+=(int)(100/canonnum);
			this.setDamage(playerIn.getHeldItemMainhand(), damage);
			if(101-damage<=10) {
				playerIn.getCooldownTracker().setCooldown(this, size*50);
				shooted=true;
			}
			worldIn.spawnEntity(new EntityBullet(worldIn,playerIn,range,power));
		}
		playerIn.rotationPitch-=(1.5f*caliber);

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		EntityPlayer player=(EntityPlayer)entityIn;
		if (!worldIn.isRemote) {
			if(player.getCooldownTracker().getCooldown(this, 0)==0 && shooted) {
				this.setDamage(stack,0);
				damage=0;
				shooted=false;
			}
		}

	}











}
