package party.lemons.arcaneworld.crafting;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import party.lemons.arcaneworld.ArcaneWorld;
import party.lemons.arcaneworld.item.ArcaneWorldItems;

/**
 * Created by Sam on 9/09/2018.
 */
public class ArcaneWorldTab extends CreativeTabs
{
	public static final ArcaneWorldTab INSTANCE = new ArcaneWorldTab();

	public ArcaneWorldTab()
	{
		super(ArcaneWorld.MODID);
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ArcaneWorldItems.GLOWING_CHORUS);
	}
}
