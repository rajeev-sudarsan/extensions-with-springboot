package sh.cyber.parent.business.extension;


import org.springframework.stereotype.Component;

import sh.cyber.parent.business.extension.point.OrderQuantity;


@Component("AmcOrderQuantity")

public class AmcOrderQuantity implements OrderQuantity {

  public String getInfo() {
    return "I am extended method";
  }
}