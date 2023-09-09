package org.example.pojos;

public class BDependency {
  private int num;

  public BDependency(int num) {
    super();
    this.num = num;
    System.out.println("With args");
  }
  public BDependency(){
    super();
    System.out.println("Without args");
  }

  public void display(){
    System.out.println("Inside B");
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    System.out.println("setter");
    this.num = num;
  }
  public void init(){
    System.out.println("Init");
  }
  public void destroy(){
    System.out.println("Destroy");
  }
}
