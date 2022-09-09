package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
//main class
//main method
  public static void main(String[] args) {

    //create instances(objects) of com.entertainment.Television class getters and setters
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(120);

    tv1.turnOn();
    tv1.turnOff();

    System.out.println(tv1);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 89);

    //tv2.setBrand("Sony");
    //tv2.setVolume(50);

    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv2);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());



    System.out.println(new Television("LG"));
    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv = new Television("Sony", 99, DisplayType.CRT);
    System.out.println(tv);
  }

}
