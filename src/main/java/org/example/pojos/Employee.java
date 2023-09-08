package org.example.pojos;

import java.util.List;
import java.util.Map;

public class Employee {
  private String name;
  private List<String> phNo;
  private Map<String,String> courses;
  public Employee(){
    super();
  }

  public Employee(String name, List<String> phNo, Map<String, String> courses) {
    super();
    this.name = name;
    this.phNo = phNo;
    this.courses = courses;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getPhNo() {
    return phNo;
  }

  public void setPhNo(List<String> phNo) {
    this.phNo = phNo;
  }

  public Map<String, String> getCourses() {
    return courses;
  }

  public void setCourses(Map<String, String> courses) {
    this.courses = courses;
  }
  @Override
  public String toString(){
    return "name:"+name+" || phNo:"+phNo+" || courses:"+courses;
  }
}
