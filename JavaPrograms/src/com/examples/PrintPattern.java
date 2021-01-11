package com.examples;

import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;

abstract public class PrintPattern{

        abstract public void printStarTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber;
      	abstract public void printNumberTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber;
      	abstract public void printStarPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber;
      	abstract public void printNumberPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber;
    }