package com.company;

/**
 * Created by marina on 20.04.15.
 * Реализовать класс строка
 * Реализоватькласс строка
 String {
 char[]
 .replace
 .find
 .remove
 .append
 }
 *
 *
 */


public class _String {
 char[] symbols;

 public _String(String s) {
  this.symbols = s.toCharArray();
 }

 @Override
 public String toString() {
  String outString = "";
  for (int i = 0; i <symbols.length ; i++) {
   outString = outString + symbols[i];
  }
  return outString;
 }

 public void replace(char preSymbol, char afterSymbol) {
  for (int i = 0; i <this.symbols.length; i++) {
     if (preSymbol == this.symbols[i]){
      this.symbols[i] = afterSymbol;
     }
  }
 }

 public int find(char findSymbol ){
  for (int i = 0; i < symbols.length ; i++) {
   if (findSymbol == symbols[i]){
    return i;
   }
  }
  return -1;
 }

 public void append (char newSymbol){
  char [] newSymbolsArray = new char[this.symbols.length + 1];
  for (int i = 0; i < this.symbols.length ; i++) {
   newSymbolsArray[i] = this.symbols[i];
  }
  newSymbolsArray[this.symbols.length] = newSymbol;
  this.symbols = newSymbolsArray;
 }

 public void remove(char removeSymbol){
  _String someString = new _String("");
  for (int i = 0; i <this.symbols.length ; i++) {
   if (removeSymbol != this.symbols[i]){
    someString.append(this.symbols[i]);
   }
  }
  this.symbols = someString.symbols;
 }

}