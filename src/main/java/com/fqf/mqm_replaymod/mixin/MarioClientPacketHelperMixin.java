package com.fqf.mqm_replaymod.mixin;

import com.fqf.mario_qua_mario.packets.MarioClientPacketHelper;
import com.fqf.mario_qua_mario.packets.NastyHacksGarbage;
import com.fqf.mario_qua_mario.registries.actions.AbstractParsedAction;
import com.fqf.mqm_replaymod.MQMReplayMod;
import com.replaymod.recording.ReplayModRecording;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MarioClientPacketHelper.class, remap = false)
public class MarioClientPacketHelperMixin {
	@Inject(method = "setActionC2S", at = @At("HEAD"))
	private void uwu(AbstractParsedAction fromAction, AbstractParsedAction toAction, long seed, CallbackInfo ci) {
		MQMReplayMod.LOGGER.info("setActionC2S called!");
		ReplayModRecording.instance.getConnectionEventHandler().getPacketListener().save(ServerPlayNetworking.createS2CPacket(NastyHacksGarbage.uwu(fromAction.getIntID(), toAction.getIntID(), seed)));
	}
}
