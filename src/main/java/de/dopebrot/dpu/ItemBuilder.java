package de.dopebrot.dpu;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ItemBuilder {

    // here is the item builder

    public ItemStack getItem(Material material) {
        return new ItemStack(material, 1, (short) 0);
    }

    public ItemStack getItem(Material material, Integer amount) {
        return new ItemStack(material, amount, (short) 0);
    }

    public ItemStack getItem(Material material, Integer amount, short damage) {
        return new ItemStack(material, amount, damage);
    }

    public ItemStack getItem(Material material, short damage) {
        return new ItemStack(material, 1, damage);
    }

    public ItemStack getItem(Material material, Integer amount, short damage, String displayName) {
        ItemStack itemStack = new ItemStack(material, amount, damage);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, short damage, String displayName, ArrayList<String> loreList) {
        ItemStack itemStack = new ItemStack(material, amount, damage);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(loreList);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, String displayName) {
        ItemStack itemStack = new ItemStack(material, amount, (byte) 0);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, String displayName, ArrayList<String> loreList) {
        ItemStack itemStack = new ItemStack(material, amount, (byte) 0);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(loreList);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, String displayName) {
        ItemStack itemStack = new ItemStack(material, 1, (byte) 0);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, String displayName, ArrayList<String> loreList) {
        ItemStack itemStack = new ItemStack(material, 1, (byte) 0);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(loreList);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, short damage, String displayName, ArrayList<String> loreList, ArrayList<Enchantment> enchantmentList, ArrayList<Integer> enchantmentLevelList) {
        ItemStack itemStack = new ItemStack(material, amount, damage);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(loreList);
        itemStack.setItemMeta(itemMeta);
        if (enchantmentLevelList != null) {
            for (int i = 0; i < enchantmentLevelList.size(); i++) {
                itemStack.addUnsafeEnchantment(enchantmentList.get(i), enchantmentLevelList.get(i));
            }
        }
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, short damage, ArrayList<Enchantment> enchantmentList, ArrayList<Integer> enchantmentLevelList) {
        ItemStack itemStack = new ItemStack(material, amount, damage);
        if (enchantmentLevelList != null) {
            for (int i = 0; i < enchantmentLevelList.size(); i++) {
                itemStack.addUnsafeEnchantment(enchantmentList.get(i), enchantmentLevelList.get(i));
            }
        }
        return itemStack;
    }

    public ItemStack getItem(Material material, Integer amount, ArrayList<Enchantment> enchantmentList, ArrayList<Integer> enchantmentLevelList) {
        ItemStack itemStack = new ItemStack(material, amount, (byte) 0);
        if (enchantmentLevelList != null) {
            for (int i = 0; i < enchantmentLevelList.size(); i++) {
                itemStack.addUnsafeEnchantment(enchantmentList.get(i), enchantmentLevelList.get(i));
            }
        }
        return itemStack;
    }

    public ItemStack getItem(Material material, ArrayList<Enchantment> enchantmentList, ArrayList<Integer> enchantmentLevelList) {
        ItemStack itemStack = new ItemStack(material, 1, (byte) 0);
        if (enchantmentLevelList != null) {
            for (int i = 0; i < enchantmentLevelList.size(); i++) {
                itemStack.addUnsafeEnchantment(enchantmentList.get(i), enchantmentLevelList.get(i));
            }
        }
        return itemStack;
    }

    public ItemStack setAttribute(ItemStack itemStack, ItemFlag attribute) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addItemFlags(attribute);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack setAttributes(ItemStack itemStack, ArrayList<ItemFlag> attributeList) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (attributeList != null) {
            for (ItemFlag itemFlag : attributeList) {
                itemMeta.addItemFlags(itemFlag);
            }
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack removeAttribute(ItemStack itemStack, ItemFlag attribute) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.removeItemFlags(attribute);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack removeAttributes(ItemStack itemStack, ArrayList<ItemFlag> attributeList) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (attributeList != null) {
            for (ItemFlag itemFlag : attributeList) {
                itemMeta.removeItemFlags(itemFlag);
            }
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack addUnbreakable(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.spigot().setUnbreakable(true);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack removeUnbreakable(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.spigot().setUnbreakable(false);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack addEnchantment(ItemStack itemStack, Enchantment enchantment) {
        itemStack.addUnsafeEnchantment(enchantment, 1);
        return itemStack;
    }

    public ItemStack addEnchantment(ItemStack itemStack, Enchantment enchantment, Integer enchantmentLevel) {
        itemStack.addUnsafeEnchantment(enchantment, enchantmentLevel);
        return itemStack;
    }

    public ItemStack addEnchantments(ItemStack itemStack, ArrayList<Enchantment> enchantmentList, ArrayList<Integer> enchantmentLevelList) {
        if (enchantmentList != null) {
            for (int i = 0; i < enchantmentList.size(); i++) {
                itemStack.addUnsafeEnchantment(enchantmentList.get(i), enchantmentLevelList.get(i));
            }
        }
        return itemStack;
    }

    public ItemStack removeEnchantment(ItemStack itemStack, Enchantment enchantment) {
        itemStack.removeEnchantment(enchantment);
        return itemStack;
    }

    public ItemStack removeEnchantments(ItemStack itemStack, ArrayList<Enchantment> enchantments) {
        if (enchantments != null) {
            for (Enchantment enchantment : enchantments) {
                itemStack.removeEnchantment(enchantment);
            }
        }
        return itemStack;
    }

    public ItemStack getDye(Material dyeType, EColor itemColor) {
        return new ItemStack(dyeType, 1, itemColor.id);
    }

    public ItemStack getSkull(EHead headType) {
        return new ItemStack(Material.SKULL_ITEM, 1, headType.id);
    }

    public ItemStack getPlayerSkull(String playerName) {
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, 1, (byte) 0);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(playerName);
        itemStack.setItemMeta(skullMeta);
        return itemStack;
    }

    public ItemStack getPlayerSkull(String playerName, String displayName) {
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, 1, (byte) 0);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(playerName);
        itemStack.setItemMeta(skullMeta);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        return itemStack;
    }

    public ItemStack getPlayerSkull(String playerName, String displayName, ArrayList<String> loreList) {
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, 1, (byte) 0);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(playerName);
        itemStack.setItemMeta(skullMeta);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(loreList);
        return itemStack;
    }


}
