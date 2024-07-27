package joserodpt.realscoreboard.api.events;

/*
 *   ____            _ ____                     _                         _
 *  |  _ \ ___  __ _| / ___|  ___ ___  _ __ ___| |__   ___   __ _ _ __ __| |
 *  | |_) / _ \/ _` | \___ \ / __/ _ \| '__/ _ \ '_ \ / _ \ / _` | '__/ _` |
 *  |  _ <  __/ (_| | |___) | (_| (_) | | |  __/ |_) | (_) | (_| | | | (_| |
 *  |_| \_\___|\__,_|_|____/ \___\___/|_|  \___|_.__/ \___/ \__,_|_|  \__,_|
 *
 *
 * Licensed under the MIT License
 * @author José Rodrigues © 2016-2024
 * @link https://github.com/joserodpt/RealScoreboard
 */

import joserodpt.realscoreboard.api.config.PlayerData;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when scoreboard status change
 */
public class ScoreboardToggleEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private final PlayerData playerData;
    private boolean cancelled;

    public ScoreboardToggleEvent(PlayerData playerData) {
        this.playerData = playerData;
    }

    /**
     * Gets playerdata related to this event
     *
     * @return the playerdata instance
     */
    @SuppressWarnings("unused")
    public PlayerData getPlayerData() {
        return playerData;
    }

    /**
     * Checks if event is cancelled
     *
     * @return true/false if event is cancelled
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Cancels this event
     *
     * @param cancelled boolean state
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}