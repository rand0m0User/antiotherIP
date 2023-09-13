package net.main;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    //I ❤ BOILERPLATE
    //I ❤ BOILERPLATE
    //I ❤ BOILERPLATE
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this); //anti tor node or whatever
    }
    //I ❤ BOILERPLATE
    //I ❤ BOILERPLATE
    //I ❤ BOILERPLATE

}
