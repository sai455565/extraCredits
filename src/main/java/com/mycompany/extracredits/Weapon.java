/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.extracredits;

/**
 *
 * @author saitejadabala
 */
public class Weapon {
    
//name is the name of weapon . example: sword, shield
   //type is the type such as attack or defence
   String name, type;
  
   //attack is the damage caused by the weapon and cost is the cost to buy it
   int attack, cost;
  
   //getters and setters for name, type, attack cost

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public int getAttack() {
       return attack;
   }

   public void setAttack(int attack) {
       this.attack = attack;
   }

   public int getCost() {
       return cost;
   }

   public void setCost(int cost) {
       this.cost = cost;
   }
  
   //Default COnstructor

   public Weapon() {
      
       name = "";
       type = "";
       attack = 0;
       cost = 0;
   }
  
   //Argument constructor
   public Weapon(String name, String type, int attack, int cost) {
       this.name = name;
       this.type = type;
       this.attack = attack;
       this.cost = cost;
   }
  
   //This is the extra method to sharp your weapon and increase its attack to double
  
   public void doubleWeaponAttack()
   {
       attack = attack*2;
   }
  
  
}
