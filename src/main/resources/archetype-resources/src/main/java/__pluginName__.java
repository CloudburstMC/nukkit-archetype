package ${groupId};

import cn.nukkit.plugin.PluginBase;

public class ${pluginName} extends PluginBase {

    @Override
    public void onLoad() {
       // Called once the plugin is LOADED.
        // The point during startup that the plugin is loaded is
        // based on the setting of the load key in the plugin.yml

    }

    @Override
    public void onEnable() {
        // Called when plugin is enabled. This is called after all plugins have been LOADED
        // If your plugin has public API that could be accessed by other plugins, you will want to
        // make sure to initialize that in onLoad instead of here

    }

    @Override
    public void onDisable() {
        // Called when plugin is disabled. This would be done by the server when it shuts down
        // so this is a good idea to save any persistant data you need.
        // May also be called if an exception is called during loading/enabling of your plugin
    }
}