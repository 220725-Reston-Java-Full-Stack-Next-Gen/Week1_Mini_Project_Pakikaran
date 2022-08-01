package com.pakikaran.code;

import java.util.Arrays;

public class Themometer {

	private int  degreesF;
	private int degreesC;
	private String name;
	private int []tempReading= new int [3];
	
//	public Themometer(int degreesF, int degreesC, String name, int[] tempReading) {
//		//super();
//		this.degreesF = degreesF;
//		this.degreesC = degreesC;
//		this.name = name;
//		this.tempReading = tempReading;
//	}
//	
//	public Themometer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public int getDegreesF() {
		return degreesF;
	}
	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}
	public int getDegreesC() {
		return degreesC;
	}
	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTempReading() {
		return tempReading;
	}
	public void setTempReading(int[] tempReading) {
		this.tempReading = tempReading;
	}
	@Override
	public String toString() {
		return "Themometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReading="
				+ Arrays.toString(tempReading) + "]";
	}
	
	
	public static int convertToFahrenheit(int c) {
		int C;
		C=c*9/5+32;
		return C;
	}
	public static int convertToCelsius(int f) {
		int F;
		F=(f-32)*5/9;
		return F;
	}
	public static void calculateAvgTemp(int[] temps) {
		int sum=0;
		for(int i=0;i<temps.length;i++) {
			sum=sum+temps[i];
		}
		System.out.println("Average temperature value is : "+sum/temps.length);
	}

}
