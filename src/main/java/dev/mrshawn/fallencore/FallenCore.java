package dev.mrshawn.fallencore;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallenCore extends JavaPlugin {

	@Getter
	private static FallenCore instance;

	@Override
	public void onEnable() {
		instance = this;

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
