package meca;

import meca.Entities.Bullet1.EntityBullet;
import meca.Entities.Bullet1.ModelBullet;
import meca.Entities.Bullet1.RenderBullet;
import meca.Items.WeaponUnits.MCsingle10;
import meca.Items.WeaponUnits.MCsingle15;
import meca.Items.WeaponUnits.MCsingle30;
import meca.Items.WeaponUnits.MCtwin10;
import meca.Items.WeaponUnits.MCtwin20;
import meca.Items.WeaponUnits.MCtwin5;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
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

	    public static Item twin5 = new MCtwin5();
	    public static Item single10=new MCsingle10();
	    public static Item twin10=new MCtwin10();
	    public static Item single15=new MCsingle15();
	    public static Item twin20=new MCtwin20();
	    public static Item single30=new MCsingle30();

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

	    	if(event.getSide().isClient()) {

	    		ModelLoader.setCustomModelResourceLocation(twin5, 0, new ModelResourceLocation("mecamod:maincanon/twin5"));
	    		ModelLoader.setCustomModelResourceLocation(single10, 0, new ModelResourceLocation("mecamod:maincanon/single10"));
	    		ModelLoader.setCustomModelResourceLocation(twin10, 0, new ModelResourceLocation("mecamod:maincanon/twin10"));
	    		ModelLoader.setCustomModelResourceLocation(single15, 0, new ModelResourceLocation("mecamod:maincanon/single15"));
	    		ModelLoader.setCustomModelResourceLocation(twin20, 0, new ModelResourceLocation("mecamod:maincanon/twin20"));
	    		ModelLoader.setCustomModelResourceLocation(single30, 0, new ModelResourceLocation("mecamod:maincanon/single30"));


	    		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new IRenderFactory<EntityBullet>() {
	    			@Override
	    			public Render<? super EntityBullet> createRenderFor(RenderManager manager){
	    				return new RenderBullet(manager,new ModelBullet(),0.3f);

	    			}
	    		});
	    	}

	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	EntityRegistry.registerModEntity(new ResourceLocation("bullet"), EntityBullet.class, "bullet", 0, this, 50, 1, true, 1000, 22);
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerModels() {

	    }




}
