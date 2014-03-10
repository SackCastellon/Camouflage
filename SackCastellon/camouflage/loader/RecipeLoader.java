package SackCastellon.camouflage.loader;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader {

	public static void init()
	{
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.OakCamouflageBlock, 4), " A ", "B B", " A ", 'A', new ItemStack(Block.wood, 1, 0), 'B', new ItemStack(Block.leaves, 1, 0));
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.OakCamouflageBlock, 4), " A ", "B B", " A ", 'B', new ItemStack(Block.wood, 1, 0), 'A', new ItemStack(Block.leaves, 1, 0));
		
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.SpruceCamouflageBlock, 4), " A ", "B B", " A ", 'A', new ItemStack(Block.wood, 1, 1), 'B', new ItemStack(Block.leaves, 1, 1));
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.SpruceCamouflageBlock, 4), " A ", "B B", " A ", 'B', new ItemStack(Block.wood, 1, 1), 'A', new ItemStack(Block.leaves, 1, 1));
		
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.BirchCamouflageBlock, 4), " A ", "B B", " A ", 'A', new ItemStack(Block.wood, 1, 2), 'B', new ItemStack(Block.leaves, 1, 2));
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.BirchCamouflageBlock, 4), " A ", "B B", " A ", 'B', new ItemStack(Block.wood, 1, 2), 'A', new ItemStack(Block.leaves, 1, 2));
		
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.JungleCamouflageBlock, 4), " A ", "B B", " A ", 'A', new ItemStack(Block.wood, 1, 3), 'B', new ItemStack(Block.leaves, 1, 3));
//		GameRegistry.addRecipe(new ItemStack(BlockLoader.JungleCamouflageBlock, 4), " A ", "B B", " A ", 'B', new ItemStack(Block.wood, 1, 3), 'A', new ItemStack(Block.leaves, 1, 3));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockLoader.CamouflageBlock, 4), new Object[] {" A ", "A A", " A ", 'A', "treeLeaves"}));
		
		GameRegistry.addRecipe(new ItemStack(BlockLoader.DirtCamouflageBlock, 4), new Object[] {" A ", "AxA", " A ", 'A', new ItemStack(Block.dirt), 'x', new ItemStack(BlockLoader.CamouflageBlock)});
		
		GameRegistry.addRecipe(new ItemStack(BlockLoader.StoneCamouflageBlock, 4), new Object[] {" A ", "AxA", " A ", 'A', new ItemStack(Block.stone), 'x', new ItemStack(BlockLoader.CamouflageBlock)});
		
		GameRegistry.addRecipe(new ItemStack(BlockLoader.IceCamouflageBlock, 4), new Object[] {" A ", "AxA", " A ", 'A', new ItemStack(Block.ice), 'x', new ItemStack(BlockLoader.CamouflageBlock)});
		
		GameRegistry.addRecipe(new ItemStack(BlockLoader.DesertCamouflageBlock, 4), new Object[] {" A ", "AxA", " A ", 'A', new ItemStack(Block.sand), 'x', new ItemStack(BlockLoader.CamouflageBlock)});
		
		GameRegistry.addRecipe(new ItemStack(BlockLoader.OceanCamouflageBlock, 4), new Object[] {" A ", "AxA", " A ", 'A', new ItemStack(Item.bucketWater), 'x', new ItemStack(BlockLoader.CamouflageBlock)});
		
		// Items
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.CamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.CamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.CamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.CamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.CamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.CamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.CamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.CamouflageBlock});
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DirtCamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.DirtCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DirtCamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.DirtCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DirtCamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.DirtCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DirtCamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.DirtCamouflageBlock});
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.StoneCamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.StoneCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.StoneCamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.StoneCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.StoneCamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.StoneCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.StoneCamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.StoneCamouflageBlock});
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DesertCamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.DesertCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DesertCamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.DesertCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DesertCamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.DesertCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DesertCamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.DesertCamouflageBlock});
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.OceanCamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.OceanCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.OceanCamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.OceanCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.OceanCamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.OceanCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.OceanCamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.OceanCamouflageBlock});
		
		GameRegistry.addRecipe(new ItemStack(ItemLoader.IceCamouflageHelmet), new Object[] {"xxx", "x x", 'x', BlockLoader.IceCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.IceCamouflageChestplate), new Object[] {"x x", "xxx", "xxx", 'x', BlockLoader.IceCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.IceCamouflageLeggings), new Object[] {"xxx", "x x", "x x", 'x', BlockLoader.IceCamouflageBlock});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.IceCamouflageBoots), new Object[] {"x x", "x x", 'x', BlockLoader.IceCamouflageBlock});
		
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.CamouflageSword), new Object[] {"x", "x", "s", 'x', BlockLoader.CamouflageBlock, 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.CamouflageShovel), new Object[] {"x", "s", "s", 'x', BlockLoader.CamouflageBlock, 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.CamouflagePickaxe), new Object[] {"xxx", " s ", " s ", 'x', BlockLoader.CamouflageBlock, 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.CamouflageAxe), new Object[] {"xx", "xs", " s", 'x', BlockLoader.CamouflageBlock, 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.CamouflageHoe), new Object[] {"xx", " s", " s", 'x', BlockLoader.CamouflageBlock, 's', "stickWood"}));
	}

}
