
package net.mcreator.aurorasmpnew.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.aurorasmpnew.world.inventory.ItensModularesGUIMenu;
import net.mcreator.aurorasmpnew.procedures.ItensmodularesprocedureProcedure;
import net.mcreator.aurorasmpnew.procedures.Itensmodulares4Procedure;
import net.mcreator.aurorasmpnew.procedures.Itensmodulares3Procedure;
import net.mcreator.aurorasmpnew.procedures.Itensmodulares2Procedure;
import net.mcreator.aurorasmpnew.procedures.Itensmodulares1Procedure;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItensModularesGUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public ItensModularesGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public ItensModularesGUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(ItensModularesGUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(ItensModularesGUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = ItensModularesGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 0 && changeType == 0) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 0 && changeType == 1) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 0 && changeType == 2) {
			int amount = meta;

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 1 && changeType == 0) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 1 && changeType == 1) {

			Itensmodulares1Procedure.execute(entity);
		}
		if (slotID == 1 && changeType == 2) {
			int amount = meta;

			Itensmodulares1Procedure.execute(entity);
		}
		if (slotID == 2 && changeType == 0) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 2 && changeType == 1) {

			Itensmodulares3Procedure.execute(entity);
		}
		if (slotID == 2 && changeType == 2) {
			int amount = meta;

			Itensmodulares3Procedure.execute(entity);
		}
		if (slotID == 3 && changeType == 0) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 3 && changeType == 1) {

			Itensmodulares4Procedure.execute(entity);
		}
		if (slotID == 3 && changeType == 2) {
			int amount = meta;

			Itensmodulares4Procedure.execute(entity);
		}
		if (slotID == 4 && changeType == 0) {

			ItensmodularesprocedureProcedure.execute(entity);
		}
		if (slotID == 4 && changeType == 1) {

			Itensmodulares2Procedure.execute(entity);
		}
		if (slotID == 4 && changeType == 2) {
			int amount = meta;

			Itensmodulares2Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AurorasmpnewMod.addNetworkMessage(ItensModularesGUISlotMessage.class, ItensModularesGUISlotMessage::buffer, ItensModularesGUISlotMessage::new, ItensModularesGUISlotMessage::handler);
	}
}
