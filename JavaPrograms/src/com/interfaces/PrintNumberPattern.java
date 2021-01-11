package com.interfaces;

import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;

public interface PrintNumberPattern{


	public void printNumberTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber;
  	public void printNumberPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber;
}