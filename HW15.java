//Trinh To, CS141, Fall 2019, Section A
//Homework Assignment 15, 11/13/19

//This program's behavior is create the necessary random numbers,
// and write them to the file indicated based on user input.

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HW15 {//open class
   public static void main(String[] args) throws FileNotFoundException
   {//open main 
	
	   
	   Scanner input = new Scanner(System.in);//scanning for user input
	   	   
	   System.out.print("How many random numbers do you want? ");
      int n = input.nextInt(); //input for n  
      
      System.out.print("What is the smallest random number? ");
      int min = input.nextInt();// input for min  
      
      System.out.print("What is the largest random number? ");
      int max = input.nextInt();  //input for max
      
      System.out.print("What filename do you want to use? ");
      String name = input.next(); //input for file name
      
      PrintStream  out = new PrintStream(new File(name));//prepare to write to the file

      Random inde = new Random();
      
      int c = 0;//declare random number
      
      
      while (n>5){//while loop for line with 5 numbers
         for (int j=0; j<5; j++){ 
            c=inde.nextInt(max-min+1)+min;//random for c
            
            if(j<4){ //first 4 numbers
               out.print(c+",");
            }else{
               out.println(c+",");//after the 5th number move to the next line
            }   
         }
         n=n-5;//update n 
      }      
      
      for (int i=1; i<=n; i++){//while loop for the last line 
         c=inde.nextInt(max-min)+min;//random c
         if(i<n){//last few numbers <5
               out.print(c+",");
            }else{
               out.print(c);//last number does not have ","
            }  
      } 
     	
	}
}
