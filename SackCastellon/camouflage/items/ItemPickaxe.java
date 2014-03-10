package SackCastellon.camouflage.items;

import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe
{
	@SideOnly(Side.CLIENT)
	private Icon invisibleIcon;
	
	public ItemPickaxe(int id, EnumToolMaterial material)
	{
		super(id, material);
		
		this.setUnlocalizedName("camo_pickaxe");
		this.setCreativeTab(TabLoader.CamouflageTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.invisibleIcon = iconRegister.registerIcon(Reference.TexturePath + "invisible");
		
		this.itemIcon = iconRegister.registerIcon(Reference.TexturePath + this.getUnlocalizedName().substring(5));
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
}