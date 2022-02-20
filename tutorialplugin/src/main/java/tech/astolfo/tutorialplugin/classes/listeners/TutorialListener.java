package tech.astolfo.tutorialplugin.classes.listeners;

//Imports
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class TutorialListener implements Listener {
  
    @EventHandler // Do NOT forget to add @EventHandler or it won't be called when the event is run
    public void onDropItem(PlayerDropItemEvent e) { // The method name is not important, only the parameter data type is.
    
        Player p = e.getPlayer(); // This gets the Player interface of the player involved in the event
        
        p.sendMessage("soz u cant drop this"); // Sends an in-game chat message to the player (no other players will see this)
        
        e.setCancelled(true); // Cancels the event, in this case it prevents the player from dropping the item
    }
}