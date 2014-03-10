package SackCastellon.camouflage.loader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister
{
	private static void registerItem(Item item)
    {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
	
	public static void init()
	{
		registerItem(ItemLoader.CamouflageHelmet);
		registerItem(ItemLoader.CamouflageChestplate);
		registerItem(ItemLoader.CamouflageLeggings);
		registerItem(ItemLoader.CamouflageBoots);

		registerItem(ItemLoader.DirtCamouflageHelmet);
		registerItem(ItemLoader.DirtCamouflageChestplate);
		registerItem(ItemLoader.DirtCamouflageLeggings);
		registerItem(ItemLoader.DirtCamouflageBoots);
		
		registerItem(ItemLoader.StoneCamouflageHelmet);
		registerItem(ItemLoader.StoneCamouflageChestplate);
		registerItem(ItemLoader.StoneCamouflageLeggings);
		registerItem(ItemLoader.StoneCamouflageBoots);
		
		registerItem(ItemLoader.DesertCamouflageHelmet);
		registerItem(ItemLoader.DesertCamouflageChestplate);
		registerItem(ItemLoader.DesertCamouflageLeggings);
		registerItem(ItemLoader.DesertCamouflageBoots);
		
		registerItem(ItemLoader.OceanCamouflageHelmet);
		registerItem(ItemLoader.OceanCamouflageChestplate);
		registerItem(ItemLoader.OceanCamouflageLeggings);
		registerItem(ItemLoader.OceanCamouflageBoots);
		
		registerItem(ItemLoader.IceCamouflageHelmet);
		registerItem(ItemLoader.IceCamouflageChestplate);
		registerItem(ItemLoader.IceCamouflageLeggings);
		registerItem(ItemLoader.IceCamouflageBoots);
		
		registerItem(ItemLoader.CamouflageSword);
		registerItem(ItemLoader.CamouflageShovel);
		registerItem(ItemLoader.CamouflagePickaxe);
		registerItem(ItemLoader.CamouflageAxe);
		registerItem(ItemLoader.CamouflageHoe);
	}
}
