package me.earth.pingbypass.server.managers.util;

import net.minecraft.network.PacketBuffer;

public interface PayloadReader
{
    void read(PacketBuffer buffer);

    default PayloadReader compose(PayloadReader reader)
    {
        return buffer ->
        {
            this.read(buffer);
            buffer.resetReaderIndex();
            reader.read(buffer);
        };
    }

}
