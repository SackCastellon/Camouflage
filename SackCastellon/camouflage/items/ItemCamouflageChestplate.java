package SackCastellon.camouflage.items;

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
import SackCastellon.camouflage.loader.ItemLoader;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCamouflageChestplate extends ItemArmor
{
	@SideOnly(Side.CLIENT)
	private Icon invisibleIcon;
	
//	private int biomeColor;

	public ItemCamouflageChestplate(int id, EnumArmorMaterial material, int renderID)
	{
		super(id, material, renderID, 1);
		
		this.setCreativeTab(TabLoader.CamouflageTab);
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
}