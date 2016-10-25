package com.incognietis.RTGAltTerrain;

import com.incognietis.RTGAltTerrain.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version)

public class RTGAltTerrain {
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and registering
		//Config handling
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI, and Packet Registering
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	

}
