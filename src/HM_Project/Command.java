package HM_Project;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (command.getName().equals("aa")){
            sender.sendMessage(ChatColor.BLUE + "test");
        }
        return false;
    }
}
