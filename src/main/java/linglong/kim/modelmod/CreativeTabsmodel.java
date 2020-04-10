package linglong.kim.modelmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsmodel extends CreativeTabs{
    public CreativeTabsmodel()
    {
        super("modelmod");
    }

	@Override
	public ItemStack getTabIconItem() {
		return ItemStack.EMPTY;
	}
}