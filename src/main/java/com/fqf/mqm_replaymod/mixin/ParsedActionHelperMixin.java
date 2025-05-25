package com.fqf.mqm_replaymod.mixin;

import com.fqf.mario_qua_mario.mariodata.MarioMoveableData;
import com.fqf.mario_qua_mario.packets.MarioDataPackets;
import com.fqf.mario_qua_mario.registries.actions.ParsedActionHelper;
import com.fqf.mario_qua_mario.registries.actions.TransitionPhase;
import com.fqf.mqm_replaymod.MQMReplayMod;
import com.replaymod.recording.ReplayModRecording;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ParsedActionHelper.class, remap = false)
public class ParsedActionHelperMixin {
	@Inject(method = "attemptTransitions", at = @At(value = "INVOKE", target = "Lcom/fqf/mario_qua_mario/MarioClientHelperManager$ClientPacketSender;setActionC2S(Lcom/fqf/mario_qua_mario/registries/actions/AbstractParsedAction;Lcom/fqf/mario_qua_mario/registries/actions/AbstractParsedAction;J)V"))
	private static void uwu(MarioMoveableData data, TransitionPhase phase, CallbackInfo ci) {
		MQMReplayMod.LOGGER.info("Hewwwooooo?? :3");

//		ReplayModRecording.instance.getConnectionEventHandler().getPacketListener().save(new MarioDataPackets.ActionTransitionS2CPayload());
	}
}
