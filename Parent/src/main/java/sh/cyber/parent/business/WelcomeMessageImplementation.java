package sh.cyber.parent.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sh.cyber.parent.business.extension.ExtensionManager;
import sh.cyber.parent.business.extension.point.OrderQuantity;

@Component
public class WelcomeMessageImplementation implements WelcomeMessage{
	
	  @Autowired
	  private ExtensionManager extensionManager;

	@Override
	public String greet() {
		OrderQuantity orderQuantity = (OrderQuantity)
		        extensionManager.getExtensionByPointId(OrderQuantity.POINT_ID);

		    System.out.println("Returning extension point implementation.");
		return "This is from business Layer" + orderQuantity.getInfo();
	}
	
	

}
