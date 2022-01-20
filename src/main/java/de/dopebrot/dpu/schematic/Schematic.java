package de.dopebrot.dpu.schematic;

import de.dopebrot.dpu.array.Java3D;
import de.dopebrot.dpu.config.ConfigHelper;
import de.dopebrot.dpu.math.Switcher;
import org.bukkit.Location;
import org.bukkit.World;

import java.io.IOException;
import java.util.ArrayList;

public class Schematic {

    Location blockA;
    Location blockB;

    public Schematic(Location blockA, Location blockB) {
        this.blockA = blockA;
        this.blockB = blockB;
    }

    public void createSchematic(Location blockA, Location blockB, String schematicName, String filePath) throws IOException {
        ConfigHelper configHelper = new ConfigHelper();
        Switcher switcher = new Switcher();
        ArrayList<Location> locations = switcher.switcher(blockA, blockB);

        Location a = locations.get(0);
        Location b = locations.get(1);

        World w = a.getWorld();
        int capacity = (int) ((a.getX() - b.getX()) + (a.getY() - b.getY()) + (a.getZ() - b.getZ()));
        Java3D blockType = new Java3D(w.getBlockAt(0, 0, 0), capacity);
        Java3D blockState = new Java3D(w.getBlockAt(0, 0, 0), capacity);
        Java3D blockData = new Java3D(w.getBlockAt(0, 0, 0), capacity);

        for (double x = a.getX(); x < b.getX(); x += 1d) {
            for (double y = a.getY(); y < b.getY(); y += 1d) {
                for (double z = a.getZ(); z < b.getZ(); z += 1d) {
                    blockType.set((int) x, (int) y, (int) z, w.getBlockAt((int) x, (int) y, (int) z).getType());
                    blockState.set((int) x, (int) y, (int) z, w.getBlockAt((int) x, (int) y, (int) z).getState());
                    blockData.set((int) x, (int) y, (int) z, w.getBlockAt((int) x, (int) y, (int) z).getData());
                }
            }
        }

        configHelper.createFile(schematicName);
        for (int i = 0; i < blockType.size(); i++) {
            for (int x = 0; x < blockType.size(); x++) {
                for (int y = 0; y < blockType.size(); y++) {
                    for (int z = 0; z < blockType.size(); z++) {
                        configHelper.setInteger("plugins/" + filePath, "schem." + i + ".x", x);
                        configHelper.setInteger("plugins/" + filePath, "schem." + i + ".y", y);
                        configHelper.setInteger("plugins/" + filePath, "schem." + i + ".z", z);
                        configHelper.setString("plugins/" + filePath, "schem." + i + ".type", blockType.get(x, y, z).toString());
                        configHelper.setString("plugins/" + filePath, "schem." + i + ".state", blockState.get(x, y, z).toString());
                        configHelper.setString("plugins/" + filePath, "schem." + i + ".data", blockData.get(x, y, z).toString());
                    }
                }
            }
        }
    }


}
