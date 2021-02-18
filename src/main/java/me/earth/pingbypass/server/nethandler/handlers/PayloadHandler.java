package me.earth.pingbypass.server.nethandler.handlers;

import com.github.steveice10.mc.protocol.packet.ingame.client.ClientPluginMessagePacket;
import me.earth.pingbypass.PingBypass;
import me.earth.pingbypass.server.managers.PayloadManager;
import me.earth.pingbypass.server.nethandler.IHandler;
import net.minecraft.network.play.client.CPacketCustomPayload;

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
            try
            {
                manager.onPacket(packet);
            }
            catch (Throwable throwable)
            {
                PingBypass.logger.error("An error occurred while reading a CustomPayloadPacket.");
                throwable.printStackTrace();
            }

            return false;
        }

        return true;
    }

}
