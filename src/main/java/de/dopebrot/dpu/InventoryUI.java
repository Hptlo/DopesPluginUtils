package de.dopebrot.dpu;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.plugin.Plugin;

public abstract class InventoryUI implements Listener {

    // this is the main where every function is "stored"

    public InventoryUI() {
        Plugin main = Main.getInstance();
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    public String pluginPrefix = "§c§lUI > §r";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
    }

    @EventHandler
    public void onInventoryMoveItem(InventoryMoveItemEvent e) {
    }

    @EventHandler
    public void onInventoryPickupItem(InventoryPickupItemEvent e) {
    }

    @EventHandler
    public void onInventoryCreative(InventoryCreativeEvent e) {
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent e) {
    }

}
