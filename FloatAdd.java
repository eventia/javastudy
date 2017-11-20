package com.javastudy.helloworld;

public class FloatAdd {

	public static void main(String[] args) {


		double num1 = 0.1;
		double num2 = 0.2;
		double sum = num1 + num2;
		System.out.println("0.1+0.2 = "+sum);
		System.out.printf("0.1+0.2 = %.60f\n",sum);
			
		
		
		float sumf = (float)num1 + (float)num2;

		System.out.printf("0.1+0.2 = %.60f\n",sumf);

	}

}
