package com.example.plugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logger {
    public static void log(Level level, String message) {
        if (message == null) return;

        switch(level) {
            case INFO:
                Bukkit.getConsoleSender().sendMessage("[PLUGIN: INFO] " + message);
                break;
            case WARN:
                Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "[PLUGIN: WARN] " + message);
                break;
            case ERROR:
                Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[PLUGIN: ERROR] " + message);
                break;
        }
    }
    public enum Level {INFO,WARN,ERROR}
}