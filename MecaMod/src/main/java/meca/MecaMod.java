package meca;

import meca.Entities.EntityBullet;
import meca.Entities.ModelBullet;
import meca.Entities.RenderBullet;
import meca.Items.WeaponUnits.MC5single;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
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

	//aaa

	 	public static final String MODID = "mecamod";
	    public static final String NAME = "MecaMod";
	    public static final String VERSION = "1.0";

	    public static Item Test = new TestItem(UnitBase.Small,WeaponUnit.MainCanon);
	    public static Item single5 = new MC5single();

	    @Mod.Instance(MODID)
		public static MecaMod instance;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {

	    	ForgeRegistries.ITEMS.register(Test);
	    	ForgeRegistries.ITEMS.register(single5);

	    	if(event.getSide().isClient()) {
	    		//ModelLoader.setCustomModelResourceLocation(Tomato, 0, new ModelResourceLocation(new ResourceLocation("testmod", "tomato"), "inventory"));
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
