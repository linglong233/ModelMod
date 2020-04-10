package linglong.kim.modelmod.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockLoader {
	public static Block one;
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		register(registry, one = new BlockOne());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registerItem(registry, one);
	}
	private static void register(IForgeRegistry<Block> registry, Block block) {
		registry.register(block);
	}
	private static void registerItem(IForgeRegistry<Item> registry, Block block) {
		registerItem(registry, new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	private static void registerItem(IForgeRegistry<Item> registry, Item item) {
		registry.register(item);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
//			registerRender(item);
		}
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);
	}
}
