package me.frawlah.bw.mapcmd;

import com.andrei1058.bedwars.api.BedWars;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("all")
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {

            getLogger().severe("BedWars1058 not found! Disabling plugin!");
            Bukkit.getPluginManager().disablePlugin(this);
            return;

        } else {

            getLogger().info("BedWars1058-MapCommand enabled!");
            BedWars bedwarsAPI = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();

            this.getCommand("map").setExecutor(new Commands());
            this.getCommand("wtfmap").setExecutor(new Commands());

        }

    }

    @Override
    public void onDisable() {

        getLogger().info("BedWars1058-MapCommand disabled!");

    }
}
