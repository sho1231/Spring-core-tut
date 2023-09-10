package org.example.pojos;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.security.auth.Destroyable;

public class LifeCycle implements InitializingBean, DisposableBean {
  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Initializing Bean");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Destroy bean");
  }
}
