package sh.cyber.parent.business.extension.point;

import org.springframework.stereotype.Component;


@Component("DefaultOrderQuantity")
public class DefaultOrderQuantity implements OrderQuantity {

  /**
   * Implementation of method defined in extension point.
   * @return String with information about invoked method.
   */
  public String getInfo() {
    return "I am default method";
  }
}