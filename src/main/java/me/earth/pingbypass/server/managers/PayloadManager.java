package me.earth.pingbypass.server.managers;

import com.github.steveice10.mc.protocol.packet.ingame.client.ClientPluginMessagePacket;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import me.earth.pingbypass.PingBypass;
import me.earth.pingbypass.server.managers.util.PayloadReader;
import net.minecraft.network.PacketBuffer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayloadManager
{
    private final Map<Short, PayloadReader> readers = new ConcurrentHashMap<>();

    public void onPacket(ClientPluginMessagePacket packet)
    {
        PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());

        short id = buffer.readShort();
        PayloadReader reader = readers.get(id);
        if (reader == null)
        {
            PingBypass.logger.error("Couldn't find PayloadReader for ID: " + id);
            return;
        }

        reader.read(buffer);

        // buffer.release for local variables? probably important that readers
        // dont store references
    }

    public void register(short id, PayloadReader reader)
    {
        if (readers.containsKey(id))
        {
            // TODO: multiple readers? reset reader index everytime we read
            //  the buffer.
            throw new IllegalStateException(
                    "Tried to register the same id (" + id + ") twice.");
        }

        readers.put(id, reader);
    }

}
