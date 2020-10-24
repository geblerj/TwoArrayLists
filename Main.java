//package com.james;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<String> flavors = new ArrayList<>();
    List<String> redFruits = new ArrayList<>();
    flavors.add("Grape");
    flavors.add("Banana");
    flavors.add("Watermelon");
    flavors.add("Brussel Sprout");
    System.out.println(flavors);
    redFruits.add("Cherry");
    redFruits.add("Apple");
    redFruits.add("Strawberry");
    flavors.addAll(1, redFruits);
    System.out.println(flavors);
    flavors.remove(1);
    System.out.println(flavors);
    System.out.println(flavors.get(3));
    flavors.set(0, "Black Currant");
    System.out.println(flavors);
  }
}
