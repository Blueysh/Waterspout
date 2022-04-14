package com.example.plugin;

import games.negative.framework.BasePlugin;
import lombok.Getter;
import lombok.Setter;
import com.example.plugin.utils.Logger;
import com.example.plugin.commands.*;
import com.example.plugin.listeners.*;

public class Plugin extends BasePlugin {
    @Getter
    @Setter
    public static Plugin instance;

    @Override
    public void onEnable() {
        // The startup logic for the plugin. The template starts with getting startup time 
        long start = System.currentTimeMillis();

        setInstance(this);

        // Write startup logic here

        long finish = System.currentTimeMillis();
        long startupTime = finish - start;
        Logger.log(Logger.Level.INFO, "Plugin loaded in *ms.".replace("*", String.valueOf(startupTime)));
    }

    @Override
    public void onDisable() {
        // Write disable logic here
    }

    private void registerComponents() {
        // This function registers the components for the plugin, like listeners and commands.
        registerCommands(
            new HelloCommand()
        );

        registerListeners(
            new PlayerListener()
        );
    }
}