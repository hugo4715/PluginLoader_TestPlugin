package fr.hugo4715.testplugin;

import fr.hugo4715.pluginloader.api.Plugin;
import fr.hugo4715.pluginloader.api.PluginInfo;

public class TestPlugin extends Plugin {


	public TestPlugin(PluginInfo infos) {
		super(infos);
	}

	public boolean onLoad() {
		log("This is a Plugin!");
		return true;
	} 

	public void onUnload() {
		log("The plugin is unloading.");
	}

	

}
