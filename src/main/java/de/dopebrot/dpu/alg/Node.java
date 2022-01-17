package de.dopebrot.dpu.alg;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.util.NumberConversions;

public class Node {

    private final double x;
    private final double y;
    private final double z;
    private final ENodes nodeType;

    public Node(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nodeType = ENodes.NORMAL;
    }

    public Node(double x, double y, double z, ENodes nodeType) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nodeType = nodeType;
    }

    public double distance(Node nodeB) {
        return NumberConversions.square(x - nodeB.x) + NumberConversions.square(y - nodeB.y) + NumberConversions.square(z - nodeB.z);
    }

    public double distanceSqrd(Node nodeB) {
        return Math.sqrt(distance(nodeB));
    }



}
