package sh.cyber.parent.business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class WelcomeMessageCustom implements WelcomeMessage{

	public String greet() {
		return "Oh Yaa, this is a custom message";
	}


}
