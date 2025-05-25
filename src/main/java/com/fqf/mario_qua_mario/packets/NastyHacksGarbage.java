package com.fqf.mario_qua_mario.packets;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.CustomPayload;

public class NastyHacksGarbage {

	public static CustomPayload uwu(int fromAction, int toAction, long seed) {
		assert MinecraftClient.getInstance().player != null;
		return new MarioDataPackets.ActionTransitionS2CPayload(MinecraftClient.getInstance().player.getId(), fromAction, toAction, seed);
	}
}
