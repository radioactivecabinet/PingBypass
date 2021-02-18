package me.earth.pingbypass.server.managers.util;

import net.minecraft.network.PacketBuffer;

import java.util.function.Function;

public interface PayloadReader
{
    void read(PacketBuffer buffer);

    static PayloadReader compose(PayloadReader reader, PayloadReader next)
    {
        return buffer ->
        {
            reader.read(buffer);
            buffer.resetReaderIndex();
            next.read(buffer);
        };
    }

}
