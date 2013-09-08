package allusion.core;

import net.minecraft.creativetab.CreativeTabs;
import allsion.lib.Reference;
import allusion.core.handler.ConnectionHandler;
import allusion.item.ModItems;
import allusion.tab.AllusionTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.modid, name = Reference.modName, version = Reference.version)

public class AllusionBase {
	public static CreativeTabs tab = new AllusionTab(CreativeTabs.getNextID(), Reference.modid);
	@Init
	public void init(FMLInitializationEvent e){
		NetworkRegistry.instance().registerConnectionHandler(new ConnectionHandler());
		ModItems.init();
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent e){
	}
}
