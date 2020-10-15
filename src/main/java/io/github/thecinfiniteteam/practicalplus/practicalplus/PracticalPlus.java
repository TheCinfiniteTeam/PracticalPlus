package io.github.thecinfiniteteam.practicalplus.practicalplus;

import io.github.thecinfiniteteam.practicalplus.practicalplus.handler.PluginHandler;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PracticalPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(PluginHandler.getLoadLogo());
        System.out.println("PracticalPlus > Enable");
        /*Config*/
        System.out.println("PracticalPlus > Load Config");
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();
        /*Event*/
        System.out.println("PracticalPlus > LoadEvent");

        System.out.println("PracticalPlus > RegistryEvent");
        /*Command*/
        System.out.println("PracticalPlus > LoadCommand");

        System.out.println("PracticalPlus > RegistryCommand");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("PracticalPlus > Disable");
    }


}
