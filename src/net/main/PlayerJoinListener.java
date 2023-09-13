package net.main;

import static org.bukkit.Bukkit.getServer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.getAddress().getAddress().getHostAddress().contains("other")) {
            getServer().broadcastMessage(ChatColor.DARK_RED + p.getDisplayName()
                    + " tried to join with a tor node or something!");
            p.kickPlayer("groomcord lost");
        }
    }
}
