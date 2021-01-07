package HM_Project;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

public class Event implements Listener {
    @EventHandler
    public void onJoin (PlayerJoinEvent e) {

        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.GOLD + p.getName()+ ChatColor.GRAY + "님이 접속하셨습니다");

    }
    @EventHandler
    public void onQuit (PlayerQuitEvent e) {

        Player p = e.getPlayer();
        e.setQuitMessage(ChatColor.RED + p.getName() + ChatColor.GRAY + "님이 퇴장하셨습니다");
    }
    @EventHandler
    public void onPlayerDeath (PlayerDeathEvent e) {

        Player killer = e.getEntity().getKiller();
        Player p = e.getEntity();
        killer.sendMessage(  ChatColor.GOLD+ p.getDisplayName() + ChatColor.GRAY  + "님을 " + ChatColor.RED + killer.getDisplayName() + ChatColor.GRAY + "님이 죽였습니다");
        p.sendMessage(  ChatColor.GOLD+ p.getDisplayName() + ChatColor.GRAY  + "님이 " + ChatColor.RED + killer.getDisplayName() + ChatColor.GRAY + "님에게 죽었습니다");
    }
}
