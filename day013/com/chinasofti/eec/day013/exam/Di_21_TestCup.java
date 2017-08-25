/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_21_TestCup.java
* Copyright 2017-02-17 By Gnosis. Allright reserved.
* Time: обнГ1:41:15
*/
package com.chinasofti.eec.day013.exam;

class Cup {
}
class PoisonCup extends Cup {
 public void takeCup(Cup c) {
  if (c instanceof PoisonCup) {
   System.out.println("Inconceivable!");
  } else if (c instanceof Cup) {
   System.out.println("Dizzying intellect!");
  } else {
   System.exit(0);
  }
 }
}
public class Di_21_TestCup {
 public static void main(String[] args) {
  Cup cup = new PoisonCup();
  PoisonCup poison=new PoisonCup();
  poison.takeCup(cup);
 }
}