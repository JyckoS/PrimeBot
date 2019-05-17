import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter {
	@Override
	public void onReady(ReadyEvent e) {
		System.out.println("DonateCraft bot is ready!");
	}
	@Override
	public void onMessageReceived(MessageReceivedEvent e) {
		System.out.println("Someone sent a message.");
		e.getChannel().sendMessage("wweeww");
		System.out.println("" + e.getMessageId() + e.getMessage());
	}
}
