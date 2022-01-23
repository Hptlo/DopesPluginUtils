package de.dopebrot.dpu;

import de.dopebrot.dpu.bukkit.InventoryUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


// Main stuff is here lal

public class Main extends JavaPlugin {

    private static Main instance;

    public Main() {
        instance = this;
    }


    @Override
    public void onEnable() {
        getCommand("help").setExecutor(this);
        Listener listener = new InventoryUI() {};
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("dpu.help")) {
                sender.sendMessage("this plugin is only a api for other plugins!");
            }
        } else {
            System.out.println("this plugin is only a api for other plugins!");
        }
        return false;
    }

    @Override
    public void onDisable() {
        System.out.println("DPU-API Stopped");
    }

    public static Main getInstance() {
        return instance;
    }
}
