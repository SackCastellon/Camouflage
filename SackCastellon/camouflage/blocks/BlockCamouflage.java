package SackCastellon.camouflage.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import SackCastellon.camouflage.loader.BlockLoader;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCamouflage extends Block
{
	private int renderType = 0;
	
	private final Block blockBasedOn;

	public BlockCamouflage(int id, Block blockBasedOn)
	{
		super(id, Material.leaves);
		
		this.blockBasedOn = blockBasedOn;
		
		this.setUnlocalizedName("camo");
		this.setCreativeTab(TabLoader.CamouflageTab);
		this.setHardness(0.0F);
		this.setLightOpacity(1);
		this.setStepSound(soundGrassFootstep);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{		
		if(entity instanceof EntityPlayer)
		{
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 2, 0, true));
		}
	}

	private boolean isBlockACamouflage(int id)
	{
		if(	id == BlockLoader.IceCamouflageBlock.blockID ||
			id == BlockLoader.DesertCamouflageBlock.blockID ||
			id == BlockLoader.OceanCamouflageBlock.blockID ||
			id == BlockLoader.DirtCamouflageBlock.blockID ||
			id == BlockLoader.StoneCamouflageBlock.blockID)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess block, int x, int y, int z, int side)
	{
		boolean flag = this.isBlockACamouflage(block.getBlockId(x, y, z));
		
		if(flag)
		{
			if(block.getBlockId(x, y, z) != BlockLoader.OceanCamouflageBlock.blockID)
			{
				return false;
			}
			
			else
			{
				if(!(side == 1 && block.getBlockId(x, y, z) == BlockLoader.OceanCamouflageBlock.blockID))
				{
					if(side == 2 || side == 3 || side == 4 || side == 5)
					{
						if(block.getBlockId(x, y, z) == BlockLoader.OceanCamouflageBlock.blockID && this.blockID == BlockLoader.OceanCamouflageBlock.blockID)
						{
							if(block.getBlockId(x, y + 1, z) == BlockLoader.OceanCamouflageBlock.blockID && this.blockID == BlockLoader.OceanCamouflageBlock.blockID)
							{
								return false;
							}
							
							else if(block.isAirBlock(x, y + 1, z) && this.blockID == BlockLoader.OceanCamouflageBlock.blockID)
							{
								return true;
							}
							
							else
							{
								return true;
							}
						}
						
						else
						{
							return true;
						}
					}
					
					else if(side == 0 || side == 1)
					{
						return false;
					}
					
					else
					{
						return true;
					}
				}
				
				else
				{
					return false;
				}
			}
		}
		
		else
		{
			return super.shouldSideBeRendered(block, x, y, z, side);
		}
	}
	
	@Override
    public void setBlockBoundsForItemRender()
    {
		float maxY = 1.0F;
		
		if(blockBasedOn == this.waterStill)
		{
			maxY = (1.0F - 1.0F / 9.0F);
		}
		
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, maxY, 1.0F);
    }
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess block, int x, int y, int z)
	{
		float maxY = 1.0F;
		
		if(blockBasedOn == this.waterStill && block.getBlockId(x, y + 1, z) != BlockLoader.OceanCamouflageBlock.blockID)
		{
			maxY = (1.0F - 1.0F / 9.0F);
		}
		
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, maxY, 1.0F);
	}

	@Override
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
		if(this.blockBasedOn == this.waterStill)
		{
			return 16777215;
		}
		
		else if(this.blockBasedOn == this.leaves)
		{
			return ColorizerFoliage.getFoliageColor(0.5, 1.0D);
		}
		
		else
		{
			return super.getBlockColor();
		}
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getRenderColor(int par1)
    {
		if(this.blockBasedOn == this.leaves)
		{
			return ColorizerFoliage.getFoliageColorBasic();
		}
		
		else
		{
			return super.getRenderColor(par1);
		}
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess block, int x, int y, int z)
    {
        if (this.blockBasedOn == this.waterStill)
        {
            int l = 0;
            int i1 = 0;
            int j1 = 0;

            for (int k1 = -1; k1 <= 1; ++k1)
            {
                for (int l1 = -1; l1 <= 1; ++l1)
                {
                    int i2 = block.getBiomeGenForCoords(x + l1, z + k1).getWaterColorMultiplier();
                    l += (i2 & 16711680) >> 16;
                    i1 += (i2 & 65280) >> 8;
                    j1 += i2 & 255;
                }
            }

            return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
        }
        
        else if(this.blockBasedOn == this.leaves)
        {
        	int i1 = 0;
            int j1 = 0;
            int k1 = 0;

            for (int l1 = -1; l1 <= 1; ++l1)
            {
                for (int i2 = -1; i2 <= 1; ++i2)
                {
                    int j2 =block.getBiomeGenForCoords(x + i2, y + l1).getBiomeFoliageColor();
                    i1 += (j2 & 16711680) >> 16;
                    j1 += (j2 & 65280) >> 8;
                    k1 += j2 & 255;
                }
            }

            return (i1 / 9 & 255) << 16 | (j1 / 9 & 255) << 8 | k1 / 9 & 255;
        }
        
        else
        {
        	return super.colorMultiplier(block, x, y, z);
        }
    }

    @Override
	public String getUnlocalizedName()
    {
		return super.getUnlocalizedName() + "_" + this.blockBasedOn.getUnlocalizedName().substring(5);
    }

	@Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
    
    @Override
    public int getRenderBlockPass()
    {
        return this.blockBasedOn.getRenderBlockPass();
    }

	@Override
	public Icon getIcon(int side, int metadata)
	{
		return this.blockBasedOn.getIcon(side, metadata);
	}
}