package net.main;

import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender(); //I ❤ BOILERPLATE

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String ip;
        try {
            ip = p.getAddress().getAddress().getHostAddress();
        } catch (Exception ex) {
            console.sendMessage(ChatColor.YELLOW + "player connection was null (this should not happen!)");
            return;
        }
        if (ip.contains("other")) {
            getServer().broadcastMessage(ChatColor.DARK_RED + p.getDisplayName()
                    + " tried to join with a tor node or something!");
            p.kickPlayer("groomcord lost");
            console.sendMessage(ChatColor.DARK_RED + String.format("player joined with forbiden setup! (%s)", ip));
        } else {
            console.sendMessage(ChatColor.GREEN + "\"real\" player joined with correct ip info");
        }
    }
}
