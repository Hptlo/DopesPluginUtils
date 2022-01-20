# DopesPluginUtils
This is an Libary for bukkit and normal Java stuff.

# How to install
Installing is very easy, just add the files to a local Maven dependencie and its should work.
when you build stuff for bukkit youll need to build this project and add it in the plugins folder.


# Use

```java
    public Inventory rainbowInventory() {
        ItemBuilder ib = new ItemBuilder();
        MathHelper mh = new MathHelper();
        Inventory inventory = Bukkit.createInventory(null,6*9,"§cRainbow Inventory");
        inventory.setItem(0,ib.getDye(Material.WOOL, EColor.BLOCK_RED));
        inventory.setItem(1,ib.getDye(Material.WOOL, EColor.BLOCK_GREEN));
        inventory.setItem(2,ib.getDye(Material.WOOL, EColor.BLOCK_BLUE));
        inventory.setItem(15,ib.getPlayerSkull("DopeBrot", "§ccrazy guy who made this lol"));
        for (int i = 16; i < 24; i++) {
            inventory.setItem(i,ib.getItem(Material.LOG,(int) mh.max(i-16,15),"LOG Type test"));
        }
        return inventory;
 ```
