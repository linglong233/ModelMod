package linglong.kim.modelmod;

import linglong.kim.modelmod.block.BlockLoader;
import linglong.kim.modelmod.block.TileEntityLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	new CreativeTabsLoader(event);
		TileEntityLoader.init();
		new BlockLoader();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}