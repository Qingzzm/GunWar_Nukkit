package cn.lanink.gunwar.event;

import cn.lanink.gunwar.room.Room;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

public class GunWarRoomRoundEndEvent extends GunWarRoomEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private int victory;

    public static HandlerList getHandlers() {
        return handlers;
    }

    public GunWarRoomRoundEndEvent(Room room, int victory) {
        this.room = room;
        this.victory = victory;
    }

    public int getVictory() {
        return this.victory;
    }
}
