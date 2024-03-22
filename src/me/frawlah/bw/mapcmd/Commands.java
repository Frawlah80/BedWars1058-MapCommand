package me.frawlah.bw.mapcmd;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.arena.Arena;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;
            IArena arena = Arena.getArenaByPlayer(p);

            if (arena == null) {

                sender.sendMessage(ChatColor.RED + "You are not in a Bed Wars game!");

            } else if (arena.getStatus() == GameState.waiting) {

                sender.sendMessage(ChatColor.GREEN + "You are currently playing on " + ChatColor.YELLOW + arena.getDisplayName());
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);

            } else if (arena.getStatus() == GameState.playing) {

                sender.sendMessage(ChatColor.GREEN + "You are currently playing on " + ChatColor.YELLOW + arena.getDisplayName());
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);

            } else if (arena.getStatus() == GameState.starting) {

                sender.sendMessage(ChatColor.GREEN + "You are currently playing on " + ChatColor.YELLOW + arena.getDisplayName());
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);

            } else {

                return false;

            }
        }

        return true;

    }

}
