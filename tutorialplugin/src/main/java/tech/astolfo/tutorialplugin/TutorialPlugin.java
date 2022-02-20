package tech.astolfo.tutorialplugin;

//Imports
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

//Listeners
import tech.astolfo.tutorialplugin.classes.listeners.TutorialListener;

//Commands
import tech.astolfo.tutorialplugin.classes.commands.TutorialCommand;

public class TutorialPlugin extends JavaPlugin {
  
    /*
    Please do not fill your main class with commands
    and listeners. It's so messy and unorganised.
    
    Try to keep them organised in seperate files and
    directories! Thanks~ :3
    */
    
    @Override
    public void onEnable() {
        /*
        When the server starts to load this plugin
        the following actions are done. This is where
        you define your commands and listeners. Startup
        messages are handled by Spigot by default so
        there is no need to log them here.
        */
        
        System.out.println("This sends a message to console!");
        getLogger().info("This also displays a msg in console!");
        
        // You must register all event listeners in your plugin or they will be ignored
        getServer().getPluginManager().registerEvents(new TutorialListener(), this);
        // The same principle applies to your commands too
        getCommand("tutorial").setExecutor(new TutorialCommand());
    }

    @Override
    public void onDisable() {
        /*
        When the server starts to shut down or when
        the plugin/server is reloaded the following
        actions are taken. Typically, you will not
        need to use this. Shutdown messages are
        handled by Spigot so there's no need to log
        them here.
        */
    }
}