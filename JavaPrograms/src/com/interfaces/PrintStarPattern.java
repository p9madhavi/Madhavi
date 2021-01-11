package com.interfaces;

import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;


public interface PrintStarPattern{

		public void printStarTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber;
  		public void printStarPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber;
}


