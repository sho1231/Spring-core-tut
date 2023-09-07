package org.example.pojos;

import com.sun.net.httpserver.HttpServer;

public class Student {
  private int id;
  private String name;
  private String grade;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public Student(){
    super();
  }
  public Student(int id,String name,String grade){
    super();
    this.id=id;
    this.name=name;
    this.grade=grade;
  }
  @Override
  public String toString(){
    return "id:"+id+" || "+"name:"+name+" || "+"grade:"+grade;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
