package allusion.core;

import allsion.lib.Reference;
import allusion.core.handler.ConnectionHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.modid, name = Reference.modName, version = Reference.version)

public class AllusionBase {
	@Init
	public void init(){
		NetworkRegistry.instance().registerConnectionHandler(new ConnectionHandler());
	}
	@PostInit
	public void postInit(){
		
	}
}
