package io.github.thecinfiniteteam.practicalplus.practicalplus.handler;

import io.github.thecinfiniteteam.practicalplus.practicalplus.PracticalPlus;
import org.bukkit.plugin.Plugin;

public class PluginHandler {
    public static Plugin getPlugin() {
        return PracticalPlus.getPlugin(PracticalPlus.class);
    }

    public static String getLoadLogo() {
        return "\n" +
                "   ////////\n" +
                "  ///\n" +
                " ///\n" +
                "////////\n" +
                "©TheCinfiniteTeamStudio 2020 - ∞\n" +
                "TheCinfiniteTeamStudio honor product";
    }
}
