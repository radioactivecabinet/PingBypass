package me.earth.pingbypass.server.managers.util;

import io.netty.buffer.Unpooled;
import me.earth.earthhack.api.util.Globals;
import me.earth.pingbypass.server.PhobosServer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SPacketCustomPayload;

public class PayloadUtil implements Globals
{
    public static final short NAME = 0;

    public static void sendNamePacket(PhobosServer client)
    {
        PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());
        buffer.writeShort(NAME);
        buffer.writeString(mc.getSession().getUsername());

        SPacketCustomPayload packet =
                new SPacketCustomPayload("PingBypass", buffer);

        client.sendToClient(packet);
    }

}
