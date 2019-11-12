package me.lipsticks;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockLog implements Listener {

    @EventHandler
    public void onPlace (BlockPlaceEvent e) {

        Player p = e.getPlayer();
        Block b = e.getBlock();

        p.getServer().getConsoleSender().sendMessage(ChatColor.RED + "[BlockLog] " + p.getName() + " placed " + b.getType().name() + " at XYZ: " + b.getLocation().getX() + ", " + b.getLocation().getY() + ", " + b.getLocation().getZ() + ", " + " in world " + b.getWorld().getName());

    }

    @EventHandler
    public void onPlace (BlockBreakEvent e) {

        Player p = e.getPlayer();
        Block b = e.getBlock();

        p.getServer().getConsoleSender().sendMessage(ChatColor.RED + "[BlockLog] " + p.getName() + " broke " + b.getType().name() + " at XYZ: " + b.getLocation().getX() + ", " + b.getLocation().getY() + ", " + b.getLocation().getZ() + ", " + " in world " + b.getWorld().getName());

    }

}
