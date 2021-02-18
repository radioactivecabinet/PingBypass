package me.earth.pingbypass.server.nethandler.handlers;

import com.github.steveice10.mc.protocol.packet.ingame.client.ClientPluginMessagePacket;
import me.earth.pingbypass.server.managers.PayloadManager;
import me.earth.pingbypass.server.nethandler.IHandler;

public class PayloadHandler implements IHandler<ClientPluginMessagePacket>
{
    private final PayloadManager manager;

    public PayloadHandler(PayloadManager manager)
    {
        this.manager = manager;
    }

    @Override
    public boolean handle(ClientPluginMessagePacket packet)
    {
        if (packet.getChannel().equalsIgnoreCase("PingBypass"))
        {
            manager.onPacket(packet);
            return false;
        }

        return true;
    }

}
