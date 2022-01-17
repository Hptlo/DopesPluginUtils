package de.dopebrot.dpu.math;

import org.bukkit.Location;

import java.util.ArrayList;

public class Switcher {

    // switches if a is bigger than b in field x y z
    public ArrayList<Location> switcher(Location a, Location b) {
        double temp;
        ArrayList<Location> output = new ArrayList<>();
        if (a.getWorld().equals(b.getWorld())) {
            double ax = a.getX();
            double ay = a.getY();
            double az = a.getZ();
            double bx = b.getX();
            double by = b.getY();
            double bz = b.getZ();
            if (ax > bx) {
                temp = ax;
                bx = ax;
                ax = temp;
            }

            if (ay > by) {
                temp = ay;
                by = ay;
                ay = temp;
            }

            if (az > bz) {
                temp = az;
                bz = az;
                az = temp;
            }
            output.add(new Location(a.getWorld(), ax, ay, az));
            output.add(new Location(a.getWorld(), bx, by, bz));
        }
        return output;
    }


}
