package org.example.pojos;

public class Address {
  private String city;
  private String street;

  public void setStreet(String street) {
    this.street = street;
  }

  public String getAddress() {
    return street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }
  public Address(){
    super();
  }
  public Address(String city,String street){
    super();
    this.city=city;
    this.street=street;
  }
  @Override
  public String toString(){
    return String.format("City: %s Street: %s",city,street);
  }
}
