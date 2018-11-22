package com.player;

public class PlayerDetails
{
  String name;
  int age;
  String qualification;
  String degree;
  String address;
  static PlayerDetails playerdetails;
 
  public PlayerDetails(String name, int age , String degree , String qualification , String address)
  {
    this.name=name;
    if(age<18)
    {
       throw new AgeException("your age is less than 18");
    }
    this.age=age;
    this.degree=degree;
    this.qualification=qualification;
    this.address=address; 
    playerdetails=this;
  }
  
  public static PlayerDetails getPlayerDetails()
  {
      return playerdetails;
  }
  
  public String getName()
  {
      return name;
  }
  
  public String getQualification()
  {
      return qualification;
  }
  
  public int getAge()
  {
      return age;
  }
  
  public String getDegree()
  {
      return degree;
  }
  
  public String getAddress()
  {
      return address;
  }
  
}
