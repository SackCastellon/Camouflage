package SackCastellon.camouflage.loader;

import cpw.mods.fml.client.registry.RenderingRegistry;
import SackCastellon.camouflage.handler.ConfigHandler;
import SackCastellon.camouflage.items.*;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.EnumHelper;

public class ItemLoader
{
	public static EnumArmorMaterial camo_material = EnumHelper.addArmorMaterial("camouflage", 5, new int[]{1, 3, 2, 1}, 15);
	public static EnumToolMaterial camo_tool_material = EnumHelper.addToolMaterial("camouflage", 2, 100, 3.0F, 0.75F, 13);
	
	public static ItemArmor CamouflageHelmet;
	public static ItemArmor CamouflageChestplate;
	public static ItemArmor CamouflageLeggings;
	public static ItemArmor CamouflageBoots;

	public static ItemArmor DirtCamouflageHelmet;
	public static ItemArmor DirtCamouflageChestplate;
	public static ItemArmor DirtCamouflageLeggings;
	public static ItemArmor DirtCamouflageBoots;
	
	public static ItemArmor StoneCamouflageHelmet;
	public static ItemArmor StoneCamouflageChestplate;
	public static ItemArmor StoneCamouflageLeggings;
	public static ItemArmor StoneCamouflageBoots;
	
	public static ItemArmor DesertCamouflageHelmet;
	public static ItemArmor DesertCamouflageChestplate;
	public static ItemArmor DesertCamouflageLeggings;
	public static ItemArmor DesertCamouflageBoots;
	
	public static ItemArmor OceanCamouflageHelmet;
	public static ItemArmor OceanCamouflageChestplate;
	public static ItemArmor OceanCamouflageLeggings;
	public static ItemArmor OceanCamouflageBoots;
	
	public static ItemArmor IceCamouflageHelmet;
	public static ItemArmor IceCamouflageChestplate;
	public static ItemArmor IceCamouflageLeggings;
	public static ItemArmor IceCamouflageBoots;
	
	public static Item CamouflageSword;
	public static Item CamouflageShovel;
	public static Item CamouflagePickaxe;
	public static Item CamouflageAxe;
	public static Item CamouflageHoe;
	
	public static void init()
	{
		CamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.CamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("camo_armor")).setUnlocalizedName("camo_helmet");
		CamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.CamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("camo_armor")).setUnlocalizedName("camo_chestplate");
		CamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.CamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("camo_armor")).setUnlocalizedName("camo_leggings");
		CamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.CamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("camo_armor")).setUnlocalizedName("camo_boots");
	
		DirtCamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.DirtCamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("dirt_camo_armor")).setUnlocalizedName("dirt_camo_helmet");
		DirtCamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.DirtCamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("dirt_camo_armor")).setUnlocalizedName("dirt_camo_chestplate");
		DirtCamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.DirtCamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("dirt_camo_armor")).setUnlocalizedName("dirt_camo_leggings");
		DirtCamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.DirtCamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("dirt_camo_armor")).setUnlocalizedName("dirt_camo_boots");
		
		StoneCamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.StoneCamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("stone_camo_armor")).setUnlocalizedName("stone_camo_helmet");
		StoneCamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.StoneCamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("stone_camo_armor")).setUnlocalizedName("stone_camo_chestplate");
		StoneCamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.StoneCamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("stone_camo_armor")).setUnlocalizedName("stone_camo_leggings");
		StoneCamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.StoneCamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("stone_camo_armor")).setUnlocalizedName("stone_camo_boots");
		
		DesertCamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.DesertCamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("desert_camo_armor")).setUnlocalizedName("desert_camo_helmet");
		DesertCamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.DesertCamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("desert_camo_armor")).setUnlocalizedName("desert_camo_chestplate");
		DesertCamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.DesertCamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("desert_camo_armor")).setUnlocalizedName("desert_camo_leggings");
		DesertCamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.DesertCamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("desert_camo_armor")).setUnlocalizedName("desert_camo_boots");
		
		OceanCamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.OceanCamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ocean_camo_armor")).setUnlocalizedName("ocean_camo_helmet");
		OceanCamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.OceanCamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ocean_camo_armor")).setUnlocalizedName("ocean_camo_chestplate");
		OceanCamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.OceanCamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ocean_camo_armor")).setUnlocalizedName("ocean_camo_leggings");
		OceanCamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.OceanCamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ocean_camo_armor")).setUnlocalizedName("ocean_camo_boots");
		
		IceCamouflageHelmet = (ItemArmor) new ItemCamouflageHelmet(ConfigHandler.IceCamouflageHelmetID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ice_camo_armor")).setUnlocalizedName("ice_camo_helmet");
		IceCamouflageChestplate = (ItemArmor) new ItemCamouflageChestplate(ConfigHandler.IceCamouflageChestplateID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ice_camo_armor")).setUnlocalizedName("ice_camo_chestplate");
		IceCamouflageLeggings = (ItemArmor) new ItemCamouflageLeggings(ConfigHandler.IceCamouflageLeggingsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ice_camo_armor")).setUnlocalizedName("ice_camo_leggings");
		IceCamouflageBoots = (ItemArmor) new ItemCamouflageBoots(ConfigHandler.IceCamouflageBootsID, camo_material, RenderingRegistry.addNewArmourRendererPrefix("ice_camo_armor")).setUnlocalizedName("ice_camo_boots");
		
		CamouflageSword = new ItemSword(ConfigHandler.CamouflageSwordID, camo_tool_material);
		CamouflageShovel = new ItemShovel(ConfigHandler.CamouflageShovelID, camo_tool_material);
		CamouflagePickaxe = new ItemPickaxe(ConfigHandler.CamouflagePickaxeID, camo_tool_material);
		CamouflageAxe = new ItemAxe(ConfigHandler.CamouflageAxeID, camo_tool_material);
		CamouflageHoe = new ItemHoe(ConfigHandler.CamouflageHoeID, camo_tool_material);
	}
}