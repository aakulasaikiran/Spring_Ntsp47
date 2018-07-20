package com.nt.beans;

import java.util.Properties;

public class FruitStore{
 private Properties fruitColors;
 public void setFruitColors(Properties fruitColors ){
    this.fruitColors=fruitColors;
   }
 //toString
@Override
public String toString() {
	return "FruitStore [fruitColors=" + fruitColors + "]";
}
 
 }