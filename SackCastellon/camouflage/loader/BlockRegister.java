package SackCastellon.camouflage.loader;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister
{
	private static void registerBlock(Block block)
    {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }
	
	public static void init()
	{
		registerBlock(BlockLoader.CamouflageBlock);
		
//		registerBlock(BlockLoader.OakCamouflageBlock);
//		registerBlock(BlockLoader.SpruceCamouflageBlock);
//		registerBlock(BlockLoader.BirchCamouflageBlock);
//		registerBlock(BlockLoader.JungleCamouflageBlock);
		
		registerBlock(BlockLoader.DirtCamouflageBlock);
		registerBlock(BlockLoader.StoneCamouflageBlock);
		registerBlock(BlockLoader.DesertCamouflageBlock);
		registerBlock(BlockLoader.OceanCamouflageBlock);
		registerBlock(BlockLoader.IceCamouflageBlock);
	}
}