package vanillatweaks;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(
		modid = VanillaTweaks.MODID,
		name = VanillaTweaks.NAME,
		version = VanillaTweaks.VERSION,
		dependencies = "required-after:Forge@[12.16.1.1887,)",
		acceptedMinecraftVersions = "1.9",
		//certificateFingerprint = "",
		updateJSON = "https://raw.githubusercontent.com/jriwanek/VanillaTweaks/master/update.json")
public class VanillaTweaks
{
    public static VanillaTweaks INSTANCE = null;
    public static final String MODID = "vanillatweaks";
    public static final String NAME = "Vanilla Tweaks";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		INSTANCE = this;
		// load config
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	config.save();

		if(event.getSide() == Side.CLIENT){
			clientPreInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverPreInit(event);
		}
    }

    @SideOnly(Side.CLIENT)
	private void clientPreInit(FMLPreInitializationEvent event){
		// client-only code
	}
	@SideOnly(Side.SERVER)
	private void serverPreInit(FMLPreInitializationEvent event){
		// server-only code
	}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		vanillatweaks.init.Recipes.init();
		
		if(event.getSide() == Side.CLIENT){
			clientInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverInit(event);
		}
    }

	@SideOnly(Side.CLIENT)
	private void clientInit(FMLInitializationEvent event){
		// client-only code
	}
	@SideOnly(Side.SERVER)
	private void serverInit(FMLInitializationEvent event){
		// server-only code
	}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		if(event.getSide() == Side.CLIENT){
			clientPostInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverPostInit(event);
		}
    }

	@SideOnly(Side.CLIENT)
	private void clientPostInit(FMLPostInitializationEvent event){
		// client-only code
	}
	@SideOnly(Side.SERVER)
	private void serverPostInit(FMLPostInitializationEvent event){
		// server-only code
	}
}
