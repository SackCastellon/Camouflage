package SackCastellon.camouflage.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import SackCastellon.camouflage.loader.ItemLoader;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class ItemCamouflageHelmet extends ItemArmor
{
	@SideOnly(Side.CLIENT)
	private Icon invisibleIcon;
	
//	private int biomeColor;

	public ItemCamouflageHelmet(int id, EnumArmorMaterial material, int renderID)
	{
		super(id, material, renderID, 0);
		
		this.setCreativeTab(TabLoader.CamouflageTab);
	}

	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
	{		
		if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null)
        {
        	ItemStack helmet = player.getCurrentItemOrArmor(4);
        	ItemStack plate = player.getCurrentItemOrArmor(3);
        	ItemStack legs = player.getCurrentItemOrArmor(2);
        	ItemStack boots = player.getCurrentItemOrArmor(1);
        	
        	// Basic
        	
            if (helmet.getItem() == ItemLoader.CamouflageHelmet && plate.getItem() == ItemLoader.CamouflageChestplate && legs.getItem() == ItemLoader.CamouflageLeggings && boots.getItem() == ItemLoader.CamouflageBoots && player.isSneaking())
            {
            	for(int meta = 0; meta < 16; ++meta)
            	if((world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.forest ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.forestHills ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.swampland ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.jungle ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.jungleHills) && (
            				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.grass.blockID || (
            				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.leaves.blockID &&
            				world.getBlockMetadata((int)player.posX, (int)player.posY - 1, (int)player.posZ) == meta)))
            	{
            		player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
            	}
    		}
            
            
            // Dirt
            
            else if (helmet.getItem() == ItemLoader.DirtCamouflageHelmet && plate.getItem() == ItemLoader.DirtCamouflageChestplate && legs.getItem() == ItemLoader.DirtCamouflageLeggings && boots.getItem() == ItemLoader.DirtCamouflageBoots && player.isSneaking())
            {
            	if(world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.plains &&
        				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.dirt.blockID)
        		{
        			player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
        		}
    		}
            
            
            // Stone
            
            else if (helmet.getItem() == ItemLoader.StoneCamouflageHelmet && plate.getItem() == ItemLoader.StoneCamouflageChestplate && legs.getItem() == ItemLoader.StoneCamouflageLeggings && boots.getItem() == ItemLoader.StoneCamouflageBoots && player.isSneaking())
            {
            	if((world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.extremeHills ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.desertHills ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.forestHills ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.taigaHills ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.extremeHillsEdge ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.jungleHills) &&
            			world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.stone.blockID)
            	{
            		player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
            	}
    		}
            
            
            // Ocean
            
            else if (helmet.getItem() == ItemLoader.OceanCamouflageHelmet && plate.getItem() == ItemLoader.OceanCamouflageChestplate && legs.getItem() == ItemLoader.OceanCamouflageLeggings && boots.getItem() == ItemLoader.OceanCamouflageBoots && player.isSneaking())
            {
            	if((world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.ocean ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.river ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.beach ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.swampland) && (
            			world.getBlockId((int)player.posX, (int)player.posY, (int)player.posZ) == Block.waterStill.blockID ||
            			world.getBlockId((int)player.posX, (int)player.posY, (int)player.posZ) == Block.waterMoving.blockID))
            	{
            		player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
            	}
    		}
            
            // Desert
            
            else if (helmet.getItem() == ItemLoader.DesertCamouflageHelmet && plate.getItem() == ItemLoader.DesertCamouflageChestplate && legs.getItem() == ItemLoader.DesertCamouflageLeggings && boots.getItem() == ItemLoader.DesertCamouflageBoots && player.isSneaking())
            {
            	if((world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.desert) && (
        				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.sand.blockID ||
        				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.sandStone.blockID || (
        				world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.stoneDoubleSlab.blockID &&
        				world.getBlockMetadata((int)player.posX, (int)player.posY - 1, (int)player.posZ) == 1) || (
        				world.getBlockId((int)player.posX, (int)(player.posY - 0.5D), (int)player.posZ) == Block.stoneSingleSlab.blockID && (
        				world.getBlockMetadata((int)player.posX, (int)(player.posY - 0.5D), (int)player.posZ) == 1) || 
        				world.getBlockMetadata((int)player.posX, (int)(player.posY - 0.5D), (int)player.posZ) == 9)))            		
        		{
        			player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
        		}
    		}
            
            // Ice
            
            else if (helmet.getItem() == ItemLoader.IceCamouflageHelmet && plate.getItem() == ItemLoader.IceCamouflageChestplate && legs.getItem() == ItemLoader.IceCamouflageLeggings && boots.getItem() == ItemLoader.IceCamouflageBoots && player.isSneaking())
            {
            	if((world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.frozenOcean ||
            			world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.frozenRiver) && (
            			world.getBlockId((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Block.ice.blockID))
            	{
            		player.addPotionEffect((new PotionEffect(Potion.invisibility.id, 2, 0)));
            	}
    		}
        }
		
//		this.biomeColor = world.getBiomeGenForCoords((int)player.posX, (int)player.posZ).getBiomeFoliageColor();
	}

	@Override
	public void registerIcons(IconRegister iconRegister)
	{		
		this.itemIcon = iconRegister.registerIcon(Reference.TexturePath + this.getUnlocalizedName().substring(5));
		
		this.invisibleIcon = iconRegister.registerIcon(Reference.TexturePath + "invisible");
	}
	
	@Override
	public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(player.isInvisible())
		{
			return this.invisibleIcon;
		}
		
		else
		{
			return this.itemIcon;
		}
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		String path;
		
		if(entity instanceof EntityPlayer)
		{
			if(entity.isInvisible())
			{
				return "camouflage:textures/models/armor/invisible_camo_armor.png";
			}
			
			else
			{
				return "camouflage:textures/models/armor/" + this.getUnlocalizedName().substring(5).replace("_helmet", "").replace("_chestplate", "").replace("_leggings", "").replace("_boots", "") + "_armor_1.png";
			}
		}
		
		else
		{
			return "camouflage:textures/models/armor/" + this.getUnlocalizedName().substring(5).replace("_helmet", "").replace("_chestplate", "").replace("_leggings", "").replace("_boots", "") + "_armor_1.png";
		}
	}
	/*
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack itemStack, int pass)
	{
		if(this.camoType != 0)
		{
			return 16777215;
		}
		
		else
		{
			return this.biomeColor;
		}
	}

	@Override
	public boolean hasColor(ItemStack itemStack)
	{
		return true;
	}

	@Override
	public int getColor(ItemStack itemStack)
	{
		if(this.camoType == 0)
		{
			return this.biomeColor;	
		}
		
		return 16777215;
	}
	*/
}