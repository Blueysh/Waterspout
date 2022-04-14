package com.example.plugin.commands;

import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

@CommandInfo(name = "hello", playerOnly = true)
public class HelloCommand extends Command {
    @Override
    public void onCommand(CommandSender sender, String[] strings) {
        Player p = (Player) sender;
        p.sendMessage(ChatColor.AQUA + "Hello there, *!".replace("*", p.getName()));
    }
}