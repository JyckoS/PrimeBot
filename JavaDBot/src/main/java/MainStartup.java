import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class MainStartup {

	public static void main(String[] args) throws LoginException, InterruptedException {
		// TODO Auto-generated method stub
		JDA jda = new JDABuilder("NTc4NzYzMDIwOTYwNzkyNTc3.XN4VIQ.G_wiRoDsYj2_ttTGX2uriP5cLcU").addEventListener(new Bot()).build();
	}
}
