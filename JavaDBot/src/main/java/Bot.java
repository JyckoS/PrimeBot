import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter {

	public static void main(String[] args) throws LoginException, InterruptedException {
		// TODO Auto-generated method stub
		JDA jda = new JDABuilder("NTc4NzYzMDIwOTYwNzkyNTc3.XN4VIQ.G_wiRoDsYj2_ttTGX2uriP5cLcU").addEventListener(new Bot()).build();
	}
	@Override
	public void onReady(ReadyEvent e) {
		System.out.println("DonateCraft bot is ready!");
	}
	@Override
	public void onMessageReceived(MessageReceivedEvent e) {
		System.out.println("Someone sent a message.");
	}
}
