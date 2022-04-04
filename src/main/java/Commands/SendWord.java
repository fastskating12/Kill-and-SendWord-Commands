package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SendWord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;
            if(args.length > 0){
                if(args[0].equalsIgnoreCase("gay")){
                    player.sendMessage("You are Gay");



                }else{
                    player.sendMessage(args[0]);
                }



            }else{
                player.sendMessage(ChatColor.RED + "HELP");
                player.sendMessage(ChatColor.AQUA + "/SendWord [Word]");
            }



        }else{
            System.out.println("This is only for player's!!");
        }


        return false;
    }
}
