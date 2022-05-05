package meca;

import meca.Entities.FlareBullet.EntityFlare;
import meca.Entities.FlareBullet.EntityFlareInTheSky;
import meca.Entities.FlareBullet.FlareLight;
import meca.Entities.FlareBullet.ModelFlare;
import meca.Entities.FlareBullet.ModelFlare2;
import meca.Entities.FlareBullet.RenderFlare;
import meca.Entities.FlareBullet.RenderFlare2;
import meca.Entities.MainBullet.EntityMainBullet;
import meca.Entities.MainBullet.ModelMainBullet;
import meca.Entities.MainBullet.RenderMainBullet;
import meca.Entities.SubBullet.EntitySubBullet;
import meca.Items.WeaponUnits.Armor.MCBoots;
import meca.Items.WeaponUnits.Armor.MCChestPlate;
import meca.Items.WeaponUnits.Armor.MCHelmet;
import meca.Items.WeaponUnits.Armor.MCLeggings;
import meca.Items.WeaponUnits.MainCanon.MCsingle10;
import meca.Items.WeaponUnits.MainCanon.MCsingle15;
import meca.Items.WeaponUnits.MainCanon.MCsingle30;
import meca.Items.WeaponUnits.MainCanon.MCsingle40;
import meca.Items.WeaponUnits.MainCanon.MCtwin10;
import meca.Items.WeaponUnits.MainCanon.MCtwin20;
import meca.Items.WeaponUnits.MainCanon.MCtwin5;
import meca.Items.WeaponUnits.Other.MCFlare;
import meca.Items.WeaponUnits.SubCanon.MCHighSub15;
import meca.Items.WeaponUnits.SubCanon.MCHighSub20;
import meca.Items.WeaponUnits.SubCanon.MCSub15;
import meca.Items.WeaponUnits.SubCanon.McHightSub5;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod(modid = MecaMod.MODID, name = MecaMod.NAME, version = MecaMod.VERSION)
public class MecaMod {


	 	public static final String MODID = "mecamod";
	    public static final String NAME = "MecaMod";
	    public static final String VERSION = "1.0";

	    public static final ArmorMaterial Meca =
				EnumHelper.addArmorMaterial("mecca","mecamod:mecaarmor",30,new int[]{3,8,9,2},10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2F);


	    public static Item twin5 = new MCtwin5();
	    public static Item single10=new MCsingle10();
	    public static Item twin10=new MCtwin10();
	    public static Item single15=new MCsingle15();
	    public static Item twin20=new MCtwin20();
	    public static Item single30=new MCsingle30();
	    public static Item single40=new MCsingle40();
	    public static Item highsub5=new McHightSub5();
	    public static Item highsub15=new MCHighSub15();
	    public static Item sub15=new MCSub15();
	    public static Item highsub20=new MCHighSub20();
	    public static Item flare=new MCFlare();
	    public static ItemArmor mecah = new MCHelmet(Meca,1,EntityEquipmentSlot.HEAD);
	    public static ItemArmor mecac = new MCChestPlate(Meca,1,EntityEquipmentSlot.CHEST);
	    public static ItemArmor mecal = new MCLeggings(Meca,1,EntityEquipmentSlot.LEGS);
	    public static ItemArmor mecab = new MCBoots(Meca,1,EntityEquipmentSlot.FEET);



//	    public static Item test=new TestItem(1,1);

	    public static Block flareB=new FlareLight();

	    @Mod.Instance(MODID)
		public static MecaMod instance;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {

	    	ForgeRegistries.ITEMS.register(twin5);
	    	ForgeRegistries.ITEMS.register(single10);
	    	ForgeRegistries.ITEMS.register(twin10);
	    	ForgeRegistries.ITEMS.register(single15);
	    	ForgeRegistries.ITEMS.register(twin20);
	    	ForgeRegistries.ITEMS.register(single30);
	    	ForgeRegistries.ITEMS.register(single40);
	    	ForgeRegistries.ITEMS.register(highsub5);
	    	ForgeRegistries.ITEMS.register(highsub15);
	    	ForgeRegistries.ITEMS.register(sub15);
	    	ForgeRegistries.ITEMS.register(highsub20);
	    	ForgeRegistries.ITEMS.register(mecah);
	    	ForgeRegistries.ITEMS.register(mecac);
	    	ForgeRegistries.ITEMS.register(mecal);
	    	ForgeRegistries.ITEMS.register(mecab);

	    	ForgeRegistries.ITEMS.register(flare);
//	    	ForgeRegistries.ITEMS.register(test);

	    	ForgeRegistries.BLOCKS.register(flareB);

	    	if(event.getSide().isClient()) {

	    		ModelLoader.setCustomModelResourceLocation(twin5, 0, new ModelResourceLocation("mecamod:maincanon/twin5"));
	    		ModelLoader.setCustomModelResourceLocation(single10, 0, new ModelResourceLocation("mecamod:maincanon/single10"));
	    		ModelLoader.setCustomModelResourceLocation(twin10, 0, new ModelResourceLocation("mecamod:maincanon/twin10"));
	    		ModelLoader.setCustomModelResourceLocation(single15, 0, new ModelResourceLocation("mecamod:maincanon/single15"));
	    		ModelLoader.setCustomModelResourceLocation(twin20, 0, new ModelResourceLocation("mecamod:maincanon/twin20"));
	    		ModelLoader.setCustomModelResourceLocation(single30, 0, new ModelResourceLocation("mecamod:maincanon/single30"));
	    		ModelLoader.setCustomModelResourceLocation(single40, 0, new ModelResourceLocation("mecamod:maincanon/single40"));
	    		ModelLoader.setCustomModelResourceLocation(highsub5, 0, new ModelResourceLocation("mecamod:subcanon/highsub5"));
	    		ModelLoader.setCustomModelResourceLocation(highsub15, 0, new ModelResourceLocation("mecamod:subcanon/highsub15"));
	    		ModelLoader.setCustomModelResourceLocation(sub15, 0, new ModelResourceLocation("mecamod:subcanon/sub15"));
	    		ModelLoader.setCustomModelResourceLocation(highsub20, 0, new ModelResourceLocation("mecamod:subcanon/highsub20"));
	    		ModelLoader.setCustomModelResourceLocation(mecah, 0, new ModelResourceLocation("mecamod:armor/mecahel"));
	    		ModelLoader.setCustomModelResourceLocation(mecac, 0, new ModelResourceLocation("mecamod:armor/mecaches"));
	    		ModelLoader.setCustomModelResourceLocation(mecal, 0, new ModelResourceLocation("mecamod:armor/mecaleg"));
	    		ModelLoader.setCustomModelResourceLocation(mecab, 0, new ModelResourceLocation("mecamod:armor/mecaboo"));
	    		ModelLoader.setCustomModelResourceLocation(flare, 0, new ModelResourceLocation("mecamod:other/flare"));


	    		RenderingRegistry.registerEntityRenderingHandler(EntityMainBullet.class, new IRenderFactory<EntityMainBullet>() {
	    			@Override
	    			public Render<? super EntityMainBullet> createRenderFor(RenderManager manager){
	    				return new RenderMainBullet(manager,new ModelMainBullet(),0.3f);

	    			}
	    		});

	    		RenderingRegistry.registerEntityRenderingHandler(EntitySubBullet.class, new IRenderFactory<EntitySubBullet>() {
	    			@Override
	    			public Render<? super EntitySubBullet> createRenderFor(RenderManager manager){
	    				return new RenderMainBullet(manager,new ModelMainBullet(),0.3f);

	    			}
	    		});

	    		RenderingRegistry.registerEntityRenderingHandler(EntityFlare.class, new IRenderFactory<EntityFlare>() {
	    			@Override
	    			public Render<? super EntityFlare> createRenderFor(RenderManager manager){
	    				return new RenderFlare(manager,new ModelFlare(),0.3f);

	    			}
	    		});

	    		RenderingRegistry.registerEntityRenderingHandler(EntityFlareInTheSky.class, new IRenderFactory<EntityFlareInTheSky>() {
	    			@Override
	    			public Render<? super EntityFlareInTheSky> createRenderFor(RenderManager manager){
	    				return new RenderFlare2(manager,new ModelFlare2(),0.3f);

	    			}
	    		});

	    	}

	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	EntityRegistry.registerModEntity(new ResourceLocation("mainbullet"), EntityMainBullet.class, "mainbullet", 0, this, 1000, 1, true, 1000, 22);
	    	EntityRegistry.registerModEntity(new ResourceLocation("subbullet"), EntitySubBullet.class, "subbullet", 1, this, 1000, 1, true, 1000, 22);
	    	EntityRegistry.registerModEntity(new ResourceLocation("flare"), EntityFlare.class, "flare", 2, this, 50, 1, true, 1000, 22);
	    	EntityRegistry.registerModEntity(new ResourceLocation("flare2"), EntityFlareInTheSky.class, "flamebullet", 3, this, 500, 1, true, 1000, 22);
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerModels() {

	    }




}
