package com.company;

public class Main {

    public static void main(String[] args) {
        _String inputString = new _String("Реализовать класс строка");
       // inputString.replace(' ', '_');
       // System.out.println(inputString.toString());
      //  int outIndex = inputString.find('с');
      //  System.out.println(outIndex);
      //  inputString.append('K');
      //  System.out.println(inputString.toString());

        inputString.remove(' ');
        System.out.println(inputString.toString());
    }
}
