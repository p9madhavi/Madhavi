package com.apps;

import com.examples.FirstProgram;

public class FirstProgramApp{

	public static void main(String[] args) {
		
		FirstProgram aProgram = new FirstProgram();
		aProgram.showValues();
		aProgram.intValue(10);
		
		long returnLong = aProgram.longValue(10L);
		System.out.println("The returnLong value Is::"+returnLong);

	}
}