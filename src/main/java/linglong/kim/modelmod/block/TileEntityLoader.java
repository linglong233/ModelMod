package linglong.kim.modelmod.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityLoader {
	public static void init() {
		registerTileEntity(TEOne.class, "One");
	}

	private static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id) {
		GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation("modelmod", id));
	}
}

