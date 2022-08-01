package com.pakikaran.code;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your name : ");
		String s = sc.nextLine();
		Themometer t = new Themometer();
		t.setName(s);
		System.out.println("Hi user, thanks for using "+t.getName()+" today!");
		System.out.println("Enter the Fahrenheit value");
		int f = sc.nextInt();
		t.setDegreesF(f);
		System.out.println("Enter the Celsius value ");
		int c = sc.nextInt();
		t.setDegreesC(c);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Conversion for Fahrenheit -> Celsius: " + t.convertToCelsius(t.getDegreesF()));
        System.out.println("Conversion for Celsius -> Fahrenheit: " + t.convertToFahrenheit(t.getDegreesC()));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        
        System.out.println("Enter three integer values that represent recent temperature readings : ");
        int[] Readings = new int[3];
        for(int i = 0; i < Readings.length; i++){
            Readings[i]= sc.nextInt();
        }
        t.setTempReading(Readings);
        
        t.calculateAvgTemp(t.getTempReading());
        System.out.println("Good bye>>");
        sc.close();
	}

}
