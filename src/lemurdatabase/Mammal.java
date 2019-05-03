/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author dalut3278
 */
public class Mammal {
    
  private int itsAge;
  private double itsWeight;
  private String itsBreed, itsLocation, itsClassification, itsCoat, itsFood, itsColour, itsGender, itsPack;

  public Mammal() {
    itsAge = 2;
    itsWeight = 5;
  }

  public int getAge() {
    return itsAge;
  }

  public double getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String newBreed) {
    breed = newBreed;
  }
  
  public void setLocation () {
  }
  
 public void setClassification () {
  }
 
 public void setCoat() {
  }
 
  public void setFood() {
  }
  
   public void setColour() {
  }
   
  public void setGender() {
  }
    
  public void setPack() {
  }
   
 
  public void speak() {
    //will be overwritten by Dog class and Cat class
  }
}
