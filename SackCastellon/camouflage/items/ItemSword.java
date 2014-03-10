package SackCastellon.camouflage.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemSword extends net.minecraft.item.ItemSword
{
	@SideOnly(Side.CLIENT)
	private Icon invisibleIcon;
	
	public ItemSword(int id, EnumToolMaterial material)
	{
		super(id, material);
		
		this.setUnlocalizedName("camo_sword");
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