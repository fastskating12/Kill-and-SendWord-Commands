package me.fast.commandargs;

import Commands.Kill;
import Commands.SendWord;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commandargs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("SendWord").setExecutor(new SendWord());
        getCommand( "kill").setExecutor(new Kill());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
