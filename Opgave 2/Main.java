// 2a. 

import java.util.Scanner;

class Main {
	
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type your name") ;
// 2.d  Declare a String variable, name and assign it the content of the scanner's call to nextLine().
        String name = scan.nextLine();
// 2.e         
        System.out.println( "Please type your age" );        
// 2.f       
        int age = (int) scan.nextInt();
// 2.g 
        System.out.println("Your name is " + " name " + " and you are " + age +" years old ");
// 2.h
        int retire = 67- age;
        System.out.println("You will retire in " + retire);                 
 
  

 }   




}

