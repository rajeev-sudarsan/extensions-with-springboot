package sh.cyber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import sh.cyber.parent.business.WelcomeMessage;
import sh.cyber.parent.business.WelcomeMessageCustom;

@Configuration
public class Config {
	@Bean
	public WelcomeMessage welomeMessage() {
		System.out.println("Getting me configured");
        return new WelcomeMessageCustom();
    }
}
