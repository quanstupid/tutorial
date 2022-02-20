package tech.astolfo.tutorialplugin.classes.commands;

//Imports
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand implements CommandExecutor {
    /*
    The method for a command must always return a boolean.
    If you return true then the command will run as normal,
    but if you return false then it will spit out the usage
    defined in the command's entry in the plugin.yml file.
    */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender; //The sender (player which executed the command) can be cast to Player
        
        p.sendMessage("Woah! So cool."); //Only the target sees this message
        
        Bukkit.broadcastMessage("Everyone can see this!"); //Every online player will be sent this message
        
        return true; //Try not to forget this
    }
}