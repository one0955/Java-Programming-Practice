package java1;

import java.util.Random;

import java.util.Scanner;

public class mathGame
{

    public static void Problem(){

    Scanner input = new Scanner(System.in);

    int num1=0, num2=0, answer = 0, checkAnswer = 0;

    double dblnum1 = 0.0, dblnum2= 0.0;

    Random r = new Random();

    dblnum1 = r.nextInt(10);

    num1 = (int)dblnum1;

    dblnum2 = r.nextInt(10);

    num2 = (int)dblnum2;

    answer = num1*num2;

    System.out.println("How much is " + num1 + " times " + num2 + "?");

    checkAnswer=input.nextInt();

    if(checkAnswer == answer){

    	System.out.println("Very Good!");

    	Problem();

    }
    else
    {

    	while(checkAnswer != answer){

    		System.out.println("No, please try again");

    		checkAnswer=input.nextInt();

    	}

    	Problem();

    }
}
    


    public static void main(String[] args) {

Problem();

    }
}
    
