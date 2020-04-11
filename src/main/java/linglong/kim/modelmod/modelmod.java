package linglong.kim.modelmod;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
//mod主类
@Mod(modid = modelmod.MODID, name = modelmod.NAME, version = modelmod.VERSION)
public class modelmod
{
	public static Map<String, String> map;
    public static final String MODID = "modelmod";
    public static final String NAME = "modelmod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Instance(modelmod.MODID)
    public static modelmod instance;
    @SidedProxy(clientSide = "linglong.kim.modelmod.ClientProxy", 
            serverSide = "linglong.kim.modelmod.CommonProxy")
    public static CommonProxy proxy;
    public static final String PacketChannel = "modelmod";
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {  
    proxy.preInit(event);
    OBJLoader.INSTANCE.addDomain(MODID);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
//    @SubscribeEvent
//    public void onobj(ModelRegistryEvent event) {
//    	OBJLoader.INSTANCE.addDomain(MODID);
//    	System.out.println("objloader加载");
//    }
//    @SubscribeEvent
//    public static void on(ModelBakeEvent event)
//    {
//      ModelsStock.onBake();
//      System.out.println("onbakeloaderok");
//    }
}
