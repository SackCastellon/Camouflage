package SackCastellon.camouflage.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCamouflageLeggings extends ItemArmor
{
	@SideOnly(Side.CLIENT)
	private Icon invisibleIcon;
	
//	private int biomeColor;

	public ItemCamouflageLeggings(int id, EnumArmorMaterial material, int renderID)
	{
		super(id, material, renderID, 2);
		
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
				return "camouflage:textures/models/armor/" + this.getUnlocalizedName().substring(5).replace("_helmet", "").replace("_chestplate", "").replace("_leggings", "").replace("_boots", "") + "_armor_2.png";
			}
		}
		
		else
		{
			return "camouflage:textures/models/armor/" + this.getUnlocalizedName().substring(5).replace("_helmet", "").replace("_chestplate", "").replace("_leggings", "").replace("_boots", "") + "_armor_2.png";
		}
	}
}