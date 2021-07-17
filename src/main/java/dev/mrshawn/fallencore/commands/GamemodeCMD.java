package dev.mrshawn.fallencore.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import dev.mrshawn.fallencore.utils.Chat;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("gamemode|gm")
public class GamemodeCMD extends BaseCommand {

	@Subcommand("survival|s|0")
	@Description("Sets your or another player's gamemode to survival")
	public void onSurvival(CommandSender sender, String[] args) {
		if (args.length == 0) {
			if (sender instanceof Player) {
				((Player) sender).setGameMode(GameMode.SURVIVAL);
				Chat.tell(sender, "&aYour gamemode has been updated!");
			} else {
				Chat.tell(sender, "&cUsage");
			}
		}
	}

}
