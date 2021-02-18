package me.earth.pingbypass.server.managers.util;

import net.minecraft.network.PacketBuffer;

public interface PayloadReader
{
    void read(PacketBuffer buffer);

}
