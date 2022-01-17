package de.dopebrot.dpu.schematic;

import de.dopebrot.dpu.array.Java3D;
import de.dopebrot.dpu.config.ConfigHelper;
import de.dopebrot.dpu.math.Switcher;
import org.bukkit.Location;
import org.bukkit.World;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Schematic {

    public Schematic(Location blockA, Location blockB) throws IOException {
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

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(dtf);

        configHelper.createFile("Schematic-" + date);
        for (int i = 0; i < blockType.size(); i++) {
            for (int x = 0; x < blockType.size(); x++) {
                for (int y = 0; y < blockType.size(); y++) {
                    for (int z = 0; z < blockType.size(); z++) {
                        configHelper.setInteger("plugins/DPU/schematic", "schem." + i + ".x", x);
                        configHelper.setInteger("plugins/DPU/schematic", "schem." + i + ".y", y);
                        configHelper.setInteger("plugins/DPU/schematic", "schem." + i + ".z", z);
                        configHelper.setString("plugins/DPU/schematic", "schem." + i + ".type", blockType.get(x, y, z).toString());
                        configHelper.setString("plugins/DPU/schematic", "schem." + i + ".state", blockState.get(x, y, z).toString());
                        configHelper.setString("plugins/DPU/schematic", "schem." + i + ".data", blockData.get(x, y, z).toString());
                    }
                }
            }
        }


    }


}
