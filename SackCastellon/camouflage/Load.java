package SackCastellon.camouflage;

import SackCastellon.camouflage.handler.ConfigHandler;
import SackCastellon.camouflage.helper.LogHelper;
import SackCastellon.camouflage.loader.BlockLoader;
import SackCastellon.camouflage.loader.BlockRegister;
import SackCastellon.camouflage.loader.ItemLoader;
import SackCastellon.camouflage.loader.ItemRegister;
import SackCastellon.camouflage.loader.RecipeLoader;
import SackCastellon.camouflage.loader.TabLoader;
import SackCastellon.camouflage.reference.Reference;

public class Load {
	
	protected static void preInit()
	{
		TabLoader.init();
		
		// Items
		ItemLoader.init();
    	ItemRegister.init();
		try
		{
	    	LogHelper.info(Reference.ID, "Loading items.");
	    	
	    	
		}
		
		catch(Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load items");
		}
		
		finally
		{
			LogHelper.info(Reference.ID, "Items succesfully loaded");
		}
		
		// Blocks
		BlockLoader.init();
    	BlockRegister.init();
		try
		{
	    	LogHelper.info(Reference.ID, "Loading blocks.");
	    	
	    	
		}
		
		catch(Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load blocks");
		}
		
		finally
		{
			LogHelper.info(Reference.ID, "Blocks succesfully loaded");
		}
	}

	protected static void init()
	{
		// Recipes
		RecipeLoader.init();
		try
		{
	    	LogHelper.info(Reference.ID, "Loading recipes.");
	    	
	    	
		}
		
		catch(Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load recipes");
		}
		
		finally
		{
			LogHelper.info(Reference.ID, "Recipes succesfully loaded");
		}
	}
}