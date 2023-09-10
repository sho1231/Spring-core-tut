package org.example.pojos;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleUsingAnnotation {
  @PostConstruct
  public void start(){
  System.out.println("Start");
  }
  @PreDestroy
  public void end(){
    System.out.println("end");
  }
  public LifeCycleUsingAnnotation(){
    super();
    System.out.println("Without args");
  }
}
