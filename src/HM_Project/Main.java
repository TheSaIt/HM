package HM_Project;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {


    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        logger.info(ChatColor.GREEN+"플러그인 활성화됨");
        getCommand("HM").setExecutor(new Command());
        Bukkit.getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        logger.info(ChatColor.RED+"플러그인 비활성화됨");
    }
}

