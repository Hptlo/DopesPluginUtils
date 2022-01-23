package de.dopebrot.dpu.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import java.util.Set;

public class ScoreboardHelper {

    private Scoreboard scoreboard;

    public ScoreboardHelper() {
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
    }


    // adds a new Scoreboard Objective
    // this is like the whole Scoreboard on this Object (Scoreboard) you can add scores they will be shown where you want them
    // if you dont set an type it will be an dummy
    public void create(String objectName) {
        scoreboard.registerNewObjective(objectName, "dummy");
    }

    public void create(String objectName, String type) {
        scoreboard.registerNewObjective(objectName, type);
    }

    public void setDisplayType(String objectName, DisplaySlot displaySlot) {
        scoreboard.getObjective(objectName).setDisplaySlot(displaySlot);
    }

    public void setScore(String objectName, String scoreName, int id) {
        if (scoreboard.getObjective(objectName) != null) {
            scoreboard.getObjective(objectName).getScore(scoreName).setScore(id);
        }
    }

    public void setPlayer(Player player) {
        player.setScoreboard(scoreboard);
    }

    public Set<Objective> getObjectives() {
        return scoreboard.getObjectives();
    }


}
