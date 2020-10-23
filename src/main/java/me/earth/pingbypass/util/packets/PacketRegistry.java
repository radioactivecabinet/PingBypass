package me.earth.pingbypass.util.packets;

import com.github.steveice10.mc.protocol.packet.handshake.client.HandshakePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientChatPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientKeepAlivePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientPluginMessagePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientRequestPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientResourcePackStatusPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientSettingsPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientTabCompletePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerAbilitiesPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerActionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerChangeHeldItemPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerInteractEntityPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerMovementPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPlaceBlockPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPositionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPositionRotationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerRotationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerStatePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerSwingArmPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerUseItemPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientAdvancementTabPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientCloseWindowPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientConfirmTransactionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientCraftingBookDataPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientCreativeInventoryActionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientEnchantItemPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientPrepareCraftingGridPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.ClientWindowActionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientSpectatePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientSteerBoatPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientSteerVehiclePacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientTeleportConfirmPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientUpdateSignPacket;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientVehicleMovePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerAdvancementTabPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerAdvancementsPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerBossBarPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerChatPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerCombatPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerDifficultyPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerDisconnectPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerJoinGamePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerKeepAlivePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerPlayerListDataPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerPlayerListEntryPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerPluginMessagePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerResourcePackSendPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerRespawnPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerSetCooldownPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerStatisticsPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerSwitchCameraPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerTabCompletePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerTitlePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerUnlockRecipesPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityAnimationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityAttachPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityCollectItemPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityDestroyPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityEffectPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityEquipmentPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityHeadLookPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityMetadataPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityMovementPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityPositionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityPositionRotationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityPropertiesPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityRemoveEffectPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityRotationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntitySetPassengersPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityStatusPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityTeleportPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerEntityVelocityPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.ServerVehicleMovePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerAbilitiesPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerChangeHeldItemPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerHealthPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerPositionRotationPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerSetExperiencePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerUseBedPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnExpOrbPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnGlobalEntityPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnMobPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnObjectPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnPaintingPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.ServerSpawnPlayerPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerDisplayScoreboardPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerScoreboardObjectivePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerTeamPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerUpdateScorePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerCloseWindowPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerConfirmTransactionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerOpenWindowPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerPreparedCraftingGridPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerSetSlotPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerWindowItemsPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.ServerWindowPropertyPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerBlockBreakAnimPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerBlockChangePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerBlockValuePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerChunkDataPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerExplosionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerMapDataPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerMultiBlockChangePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerNotifyClientPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerOpenTileEntityEditorPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerPlayBuiltinSoundPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerPlayEffectPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerPlaySoundPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerSpawnParticlePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerSpawnPositionPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerUnloadChunkPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerUpdateTileEntityPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerUpdateTimePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerWorldBorderPacket;
import com.github.steveice10.mc.protocol.packet.login.client.EncryptionResponsePacket;
import com.github.steveice10.mc.protocol.packet.login.client.LoginStartPacket;
import com.github.steveice10.mc.protocol.packet.login.server.EncryptionRequestPacket;
import com.github.steveice10.mc.protocol.packet.login.server.LoginDisconnectPacket;
import com.github.steveice10.mc.protocol.packet.login.server.LoginSetCompressionPacket;
import com.github.steveice10.mc.protocol.packet.login.server.LoginSuccessPacket;
import com.github.steveice10.mc.protocol.packet.status.client.StatusPingPacket;
import com.github.steveice10.mc.protocol.packet.status.client.StatusQueryPacket;
import com.github.steveice10.mc.protocol.packet.status.server.StatusPongPacket;
import com.github.steveice10.mc.protocol.packet.status.server.StatusResponsePacket;
import com.github.steveice10.packetlib.packet.Packet;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.login.client.CPacketEncryptionResponse;
import net.minecraft.network.login.client.CPacketLoginStart;
import net.minecraft.network.login.server.SPacketDisconnect;
import net.minecraft.network.login.server.SPacketEnableCompression;
import net.minecraft.network.login.server.SPacketEncryptionRequest;
import net.minecraft.network.login.server.SPacketLoginSuccess;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketClientSettings;
import net.minecraft.network.play.client.CPacketClientStatus;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketConfirmTransaction;
import net.minecraft.network.play.client.CPacketCreativeInventoryAction;
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.network.play.client.CPacketEnchantItem;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketKeepAlive;
import net.minecraft.network.play.client.CPacketPlaceRecipe;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerAbilities;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketRecipeInfo;
import net.minecraft.network.play.client.CPacketResourcePackStatus;
import net.minecraft.network.play.client.CPacketSeenAdvancements;
import net.minecraft.network.play.client.CPacketSpectate;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketVehicleMove;
import net.minecraft.network.play.server.SPacketAdvancementInfo;
import net.minecraft.network.play.server.SPacketAnimation;
import net.minecraft.network.play.server.SPacketBlockAction;
import net.minecraft.network.play.server.SPacketBlockBreakAnim;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketCamera;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.network.play.server.SPacketCloseWindow;
import net.minecraft.network.play.server.SPacketCollectItem;
import net.minecraft.network.play.server.SPacketCombatEvent;
import net.minecraft.network.play.server.SPacketConfirmTransaction;
import net.minecraft.network.play.server.SPacketCooldown;
import net.minecraft.network.play.server.SPacketCustomPayload;
import net.minecraft.network.play.server.SPacketCustomSound;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.network.play.server.SPacketDisplayObjective;
import net.minecraft.network.play.server.SPacketEffect;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.network.play.server.SPacketEntityAttach;
import net.minecraft.network.play.server.SPacketEntityEffect;
import net.minecraft.network.play.server.SPacketEntityEquipment;
import net.minecraft.network.play.server.SPacketEntityHeadLook;
import net.minecraft.network.play.server.SPacketEntityMetadata;
import net.minecraft.network.play.server.SPacketEntityProperties;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityTeleport;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.network.play.server.SPacketHeldItemChange;
import net.minecraft.network.play.server.SPacketJoinGame;
import net.minecraft.network.play.server.SPacketKeepAlive;
import net.minecraft.network.play.server.SPacketMaps;
import net.minecraft.network.play.server.SPacketMoveVehicle;
import net.minecraft.network.play.server.SPacketMultiBlockChange;
import net.minecraft.network.play.server.SPacketOpenWindow;
import net.minecraft.network.play.server.SPacketParticles;
import net.minecraft.network.play.server.SPacketPlaceGhostRecipe;
import net.minecraft.network.play.server.SPacketPlayerAbilities;
import net.minecraft.network.play.server.SPacketPlayerListHeaderFooter;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.network.play.server.SPacketRecipeBook;
import net.minecraft.network.play.server.SPacketRemoveEntityEffect;
import net.minecraft.network.play.server.SPacketResourcePackSend;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.network.play.server.SPacketScoreboardObjective;
import net.minecraft.network.play.server.SPacketSelectAdvancementsTab;
import net.minecraft.network.play.server.SPacketServerDifficulty;
import net.minecraft.network.play.server.SPacketSetExperience;
import net.minecraft.network.play.server.SPacketSetPassengers;
import net.minecraft.network.play.server.SPacketSetSlot;
import net.minecraft.network.play.server.SPacketSignEditorOpen;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.network.play.server.SPacketSpawnExperienceOrb;
import net.minecraft.network.play.server.SPacketSpawnGlobalEntity;
import net.minecraft.network.play.server.SPacketSpawnMob;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.network.play.server.SPacketSpawnPainting;
import net.minecraft.network.play.server.SPacketSpawnPlayer;
import net.minecraft.network.play.server.SPacketSpawnPosition;
import net.minecraft.network.play.server.SPacketStatistics;
import net.minecraft.network.play.server.SPacketTabComplete;
import net.minecraft.network.play.server.SPacketTeams;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.network.play.server.SPacketTitle;
import net.minecraft.network.play.server.SPacketUnloadChunk;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraft.network.play.server.SPacketUpdateHealth;
import net.minecraft.network.play.server.SPacketUpdateScore;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.network.play.server.SPacketUseBed;
import net.minecraft.network.play.server.SPacketWindowItems;
import net.minecraft.network.play.server.SPacketWindowProperty;
import net.minecraft.network.play.server.SPacketWorldBorder;
import net.minecraft.network.status.client.CPacketPing;
import net.minecraft.network.status.client.CPacketServerQuery;
import net.minecraft.network.status.server.SPacketPong;
import net.minecraft.network.status.server.SPacketServerInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains all MCP packets mapped to their
 * counterparts from Steveice10's MCProtocolLib.
 */
public class PacketRegistry
{
    private static final Map<Class<? extends net.minecraft.network.Packet<?>>, Class<? extends Packet>> packets = new HashMap<>();

    public static Class<? extends Packet> getCorrespondingPacket(net.minecraft.network.Packet<?> packetIn)
    {
        return packets.get(packetIn.getClass());
    }

    static
    {
        registerPacket(C00Handshake.class, HandshakePacket.class);

        registerPacket(SPacketDisconnect.class, LoginDisconnectPacket.class);
        registerPacket(SPacketEncryptionRequest.class, EncryptionRequestPacket.class);
        registerPacket(SPacketLoginSuccess.class, LoginSuccessPacket.class);
        registerPacket(SPacketEnableCompression.class, LoginSetCompressionPacket.class);

        registerPacket(CPacketLoginStart.class, LoginStartPacket.class);
        registerPacket(CPacketEncryptionResponse.class, EncryptionResponsePacket.class);

        registerPacket(CPacketConfirmTeleport.class, ClientTeleportConfirmPacket.class);
        registerPacket(CPacketTabComplete.class, ClientTabCompletePacket.class);
        registerPacket(CPacketChatMessage.class, ClientChatPacket.class);
        registerPacket(CPacketClientStatus.class, ClientRequestPacket.class);
        registerPacket(CPacketClientSettings.class, ClientSettingsPacket.class);
        registerPacket(CPacketConfirmTransaction.class, ClientConfirmTransactionPacket.class);
        registerPacket(CPacketEnchantItem.class, ClientEnchantItemPacket.class);
        registerPacket(CPacketClickWindow.class, ClientWindowActionPacket.class);
        registerPacket(CPacketCloseWindow.class, ClientCloseWindowPacket.class);
        registerPacket(CPacketCustomPayload.class, ClientPluginMessagePacket.class);
        registerPacket(CPacketUseEntity.class, ClientPlayerInteractEntityPacket.class);
        registerPacket(CPacketKeepAlive.class, ClientKeepAlivePacket.class);
        registerPacket(CPacketPlayer.class, ClientPlayerMovementPacket.class);
        registerPacket(CPacketPlayer.Position.class, ClientPlayerPositionPacket.class);
        registerPacket(CPacketPlayer.PositionRotation.class, ClientPlayerPositionRotationPacket.class);
        registerPacket(CPacketPlayer.Rotation.class, ClientPlayerRotationPacket.class);
        registerPacket(CPacketVehicleMove.class, ClientVehicleMovePacket.class);
        registerPacket(CPacketSteerBoat.class, ClientSteerBoatPacket.class);
        registerPacket(CPacketPlaceRecipe.class, ClientPrepareCraftingGridPacket.class);
        registerPacket(CPacketPlayerAbilities.class, ClientPlayerAbilitiesPacket.class);
        registerPacket(CPacketPlayerDigging.class, ClientPlayerActionPacket.class);
        registerPacket(CPacketEntityAction.class, ClientPlayerStatePacket.class);
        registerPacket(CPacketInput.class, ClientSteerVehiclePacket.class);
        registerPacket(CPacketRecipeInfo.class, ClientCraftingBookDataPacket.class);
        registerPacket(CPacketResourcePackStatus.class, ClientResourcePackStatusPacket.class);
        registerPacket(CPacketSeenAdvancements.class, ClientAdvancementTabPacket.class);
        registerPacket(CPacketHeldItemChange.class, ClientPlayerChangeHeldItemPacket.class);
        registerPacket(CPacketCreativeInventoryAction.class, ClientCreativeInventoryActionPacket.class);
        registerPacket(CPacketUpdateSign.class, ClientUpdateSignPacket.class);
        registerPacket(CPacketAnimation.class, ClientPlayerSwingArmPacket.class);
        registerPacket(CPacketSpectate.class, ClientSpectatePacket.class);
        registerPacket(CPacketPlayerTryUseItemOnBlock.class, ClientPlayerPlaceBlockPacket.class);
        registerPacket(CPacketPlayerTryUseItem.class, ClientPlayerUseItemPacket.class);

        registerPacket(SPacketSpawnObject.class, ServerSpawnObjectPacket.class);
        registerPacket(SPacketSpawnExperienceOrb.class, ServerSpawnExpOrbPacket.class);
        registerPacket(SPacketSpawnGlobalEntity.class, ServerSpawnGlobalEntityPacket.class);
        registerPacket(SPacketSpawnMob.class, ServerSpawnMobPacket.class);
        registerPacket(SPacketSpawnPainting.class, ServerSpawnPaintingPacket.class);
        registerPacket(SPacketSpawnPlayer.class, ServerSpawnPlayerPacket.class);
        registerPacket(SPacketAnimation.class, ServerEntityAnimationPacket.class);
        registerPacket(SPacketStatistics.class, ServerStatisticsPacket.class);
        registerPacket(SPacketBlockBreakAnim.class, ServerBlockBreakAnimPacket.class);
        registerPacket(SPacketUpdateTileEntity.class, ServerUpdateTileEntityPacket.class);
        registerPacket(SPacketBlockAction.class, ServerBlockValuePacket.class);
        registerPacket(SPacketBlockChange.class, ServerBlockChangePacket.class);
        registerPacket(SPacketUpdateBossInfo.class, ServerBossBarPacket.class);
        registerPacket(SPacketServerDifficulty.class, ServerDifficultyPacket.class);
        registerPacket(SPacketTabComplete.class, ServerTabCompletePacket.class);
        registerPacket(SPacketChat.class, ServerChatPacket.class);
        registerPacket(SPacketMultiBlockChange.class, ServerMultiBlockChangePacket.class);
        registerPacket(SPacketConfirmTransaction.class, ServerConfirmTransactionPacket.class);
        registerPacket(SPacketCloseWindow.class, ServerCloseWindowPacket.class);
        registerPacket(SPacketOpenWindow.class, ServerOpenWindowPacket.class);
        registerPacket(SPacketWindowItems.class, ServerWindowItemsPacket.class);
        registerPacket(SPacketWindowProperty.class, ServerWindowPropertyPacket.class);
        registerPacket(SPacketSetSlot.class, ServerSetSlotPacket.class);
        registerPacket(SPacketCooldown.class, ServerSetCooldownPacket.class);
        registerPacket(SPacketCustomPayload.class, ServerPluginMessagePacket.class);
        registerPacket(SPacketCustomSound.class, ServerPlaySoundPacket.class);
        registerPacket(net.minecraft.network.play.server.SPacketDisconnect.class, ServerDisconnectPacket.class);
        registerPacket(SPacketEntityStatus.class, ServerEntityStatusPacket.class);
        registerPacket(SPacketExplosion.class, ServerExplosionPacket.class);
        registerPacket(SPacketUnloadChunk.class, ServerUnloadChunkPacket.class);
        registerPacket(SPacketChangeGameState.class, ServerNotifyClientPacket.class); //????
        registerPacket(SPacketKeepAlive.class, ServerKeepAlivePacket.class);
        registerPacket(SPacketChunkData.class, ServerChunkDataPacket.class);
        registerPacket(SPacketEffect.class, ServerPlayEffectPacket.class);
        registerPacket(SPacketParticles.class, ServerSpawnParticlePacket.class);
        registerPacket(SPacketJoinGame.class, ServerJoinGamePacket.class);
        registerPacket(SPacketMaps.class, ServerMapDataPacket.class);
        registerPacket(SPacketEntity.class, ServerEntityMovementPacket.class);
        registerPacket(SPacketEntity.S15PacketEntityRelMove.class, ServerEntityPositionPacket.class);
        registerPacket(SPacketEntity.S17PacketEntityLookMove.class, ServerEntityPositionRotationPacket.class);
        registerPacket(SPacketEntity.S16PacketEntityLook.class, ServerEntityRotationPacket.class);
        registerPacket(SPacketMoveVehicle.class, ServerVehicleMovePacket.class);
        registerPacket(SPacketSignEditorOpen.class, ServerOpenTileEntityEditorPacket.class);
        registerPacket(SPacketPlaceGhostRecipe.class, ServerPreparedCraftingGridPacket.class);
        registerPacket(SPacketPlayerAbilities.class, ServerPlayerAbilitiesPacket.class);
        registerPacket(SPacketCombatEvent.class, ServerCombatPacket.class);
        registerPacket(SPacketPlayerListItem.class, ServerPlayerListEntryPacket.class);
        registerPacket(SPacketPlayerPosLook.class, ServerPlayerPositionRotationPacket.class);
        registerPacket(SPacketUseBed.class, ServerPlayerUseBedPacket.class);
        registerPacket(SPacketRecipeBook.class, ServerUnlockRecipesPacket.class);
        registerPacket(SPacketDestroyEntities.class, ServerEntityDestroyPacket.class);
        registerPacket(SPacketRemoveEntityEffect.class, ServerEntityRemoveEffectPacket.class);
        registerPacket(SPacketResourcePackSend.class, ServerResourcePackSendPacket.class);
        registerPacket(SPacketRespawn.class, ServerRespawnPacket.class);
        registerPacket(SPacketEntityHeadLook.class, ServerEntityHeadLookPacket.class);
        registerPacket(SPacketSelectAdvancementsTab.class, ServerAdvancementTabPacket.class);
        registerPacket(SPacketWorldBorder.class, ServerWorldBorderPacket.class);
        registerPacket(SPacketCamera.class, ServerSwitchCameraPacket.class);
        registerPacket(SPacketHeldItemChange.class, ServerPlayerChangeHeldItemPacket.class);
        registerPacket(SPacketDisplayObjective.class, ServerDisplayScoreboardPacket.class);
        registerPacket(SPacketEntityMetadata.class, ServerEntityMetadataPacket.class);
        registerPacket(SPacketEntityAttach.class, ServerEntityAttachPacket.class);
        registerPacket(SPacketEntityVelocity.class, ServerEntityVelocityPacket.class);
        registerPacket(SPacketEntityEquipment.class, ServerEntityEquipmentPacket.class);
        registerPacket(SPacketSetExperience.class, ServerPlayerSetExperiencePacket.class);
        registerPacket(SPacketUpdateHealth.class, ServerPlayerHealthPacket.class);
        registerPacket(SPacketScoreboardObjective.class, ServerScoreboardObjectivePacket.class);
        registerPacket(SPacketSetPassengers.class, ServerEntitySetPassengersPacket.class);
        registerPacket(SPacketTeams.class, ServerTeamPacket.class);
        registerPacket(SPacketUpdateScore.class, ServerUpdateScorePacket.class);
        registerPacket(SPacketSpawnPosition.class, ServerSpawnPositionPacket.class);
        registerPacket(SPacketTimeUpdate.class, ServerUpdateTimePacket.class);
        registerPacket(SPacketTitle.class, ServerTitlePacket.class);
        registerPacket(SPacketSoundEffect.class, ServerPlayBuiltinSoundPacket.class);
        registerPacket(SPacketPlayerListHeaderFooter.class, ServerPlayerListDataPacket.class);
        registerPacket(SPacketCollectItem.class, ServerEntityCollectItemPacket.class);
        registerPacket(SPacketEntityTeleport.class, ServerEntityTeleportPacket.class);
        registerPacket(SPacketAdvancementInfo.class, ServerAdvancementsPacket.class);
        registerPacket(SPacketEntityProperties.class, ServerEntityPropertiesPacket.class);
        registerPacket(SPacketEntityEffect.class, ServerEntityEffectPacket.class);

        registerPacket(SPacketServerInfo.class, StatusResponsePacket.class);
        registerPacket(SPacketPong.class, StatusPongPacket.class);

        registerPacket(CPacketServerQuery.class, StatusQueryPacket.class);
        registerPacket(CPacketPing.class, StatusPingPacket.class);
    }

    private static void registerPacket(Class<? extends net.minecraft.network.Packet<?>> mcpPacket, Class<? extends Packet> packet)
    {
        packets.put(mcpPacket, packet);
    }

}
