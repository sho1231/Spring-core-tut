package org.example.pojos.annotation;

import org.example.pojos.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
  @Autowired
  private Address add;

  public void setAdd(Address add) {
    this.add = add;
  }

  public Address getAdd() {
    return add;
  }
  public Employee(){
    super();
  }
  public Employee(Address add){
    this.add=add;
  }
  @Override
  public String toString(){
    return String.format("Address from employee: %s",add);
  }
}
