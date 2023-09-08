package org.example.pojos;

public class ADependent {
  private BDependency b;
  public void setB(BDependency b){
    this.b=b;
  }
  public void display(){
    b.display();
    System.out.println("Inside A");
  }
}
