package linglong.kim.modelmod.block;

import linglong.kim.modelmod.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOne extends Block {
	public BlockOne() {
		super(Material.ROCK);
		setRegistryName("modelmod:one");
		setUnlocalizedName("one");
		setCreativeTab(CreativeTabsLoader.tab);
	}
}

