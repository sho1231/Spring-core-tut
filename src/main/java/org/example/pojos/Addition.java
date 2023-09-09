package org.example.pojos;

public class Addition {
  private int a;
  private int b;
  public Addition(){

  }

  public Addition(int a, int b) {
    this.a = a;
    this.b = b;
    System.out.println("int,int");
  }
  public Addition(double a,double b){
    this.a=(int) a;
    this.b=(int) b;
    System.out.println("double,double");
  }
  public Addition(int a,double b){
    this.a=a;
    this.b=(int) b;
    System.out.println("int,double");
  }
  public Addition(double a,int b){
    this.a=(int)a;
    this.b=b;
    System.out.println("double,int");
  }
  public Addition(double a,String c){
    System.out.println("double,String");
  }
}
