package de.dopebrot.dpu;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryHelper {


    // fills the chest with itemStack
    public void fill(Inventory inventory, ItemStack itemStack) {
        if (inventory != null) {
            if (inventory.getType() == InventoryType.CHEST || inventory.getType() == InventoryType.PLAYER) {
                for (int i = 0; i < inventory.getSize(); i++) {
                    inventory.setItem(i, itemStack);
                }
            }
        }
    }

    public void fillBackground(Inventory inventory, ItemStack itemStack) {
        if (inventory != null) {
            if (inventory.getType() == InventoryType.CHEST || inventory.getType() == InventoryType.PLAYER) {
                for (int i = 0; i < inventory.getSize(); i++) {
                    if (inventory.getItem(i) == null) {
                        inventory.setItem(i, itemStack);
                    }
                }
            }
        }
    }


}
