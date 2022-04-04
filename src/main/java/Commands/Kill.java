package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 0){
                player.setHealth(0.0);
                player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You have just killed your self!");
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    target.setHealth(0.0);
                    target.sendMessage(ChatColor.AQUA + "You have been Killed by " + ChatColor.BOLD + player.getDisplayName());
                    player.sendMessage(ChatColor.GREEN + "Successfully  killed " + ChatColor.BOLD + target.getDisplayName());

                }else{
                    player.sendMessage(ChatColor.RED + "That Player does not exist! You put: " + ChatColor.BOLD + args[0]);
                }

            }
        }



        return false;
    }
}
