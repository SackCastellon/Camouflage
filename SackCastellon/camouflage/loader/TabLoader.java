package SackCastellon.camouflage.loader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabLoader {

	public static CreativeTabs CamouflageTab;

	public static void init() {
		
		CamouflageTab = new CreativeTabs("Camouflage")
		{
			@Override
			@SideOnly(Side.CLIENT)
		    public int getTabIconItemIndex()
		    {
		        return BlockLoader.CamouflageBlock.blockID;
		    }
		};
	}
}