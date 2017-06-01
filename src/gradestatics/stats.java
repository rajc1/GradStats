/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradestatics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CrJ
 */
class stats {
   static Scanner sc = new Scanner(System.in);
    public static int[] grades= new int[sc.nextInt()];

    
public void printArray(){

    
    System.out.println(Arrays.toString(grades));
    

}
public double average(){
    
    float average;
    float sum = 0;
    for (int i = 0; i < grades.length; i++) {
    
        sum += grades[i];
    
    }
    average = sum/grades.length;
    
    System.out.println("Average of class grade is ="+ average);
    
    return average;
    }
public void median(int[] array){

     int median1 = 0;
     float median = 0;
     int r1 = array.length/2;
     int  l1 = (array.length/2) -1;
  
    for (int i = 0; i < grades.length; i++) {
        
        array[i] = grades[i];
        
    }
    
   Arrays.sort(array);
    
   if(array.length%2!=0){
   
   median1 = (array.length/2);
   
   median  = array[median1];
   
   
   }
   else if(array.length%2==0){
   median  =( array[r1] + array[l1]) /2;
   
    System.out.println(median);
   
        
   }
}
   public int maximum(int[] array){
       
       int maximum = 0;
   
       for (int i = 0; i < grades.length; i++) {
       
           array[i]= grades[i];
           
           
           
       }
       
       Arrays.sort(array);
       
       maximum = array[array.length-1];
       
       
       return maximum;
   
   }
   
   public int minimum(int[] array){
   
   int minimum = 0;
   
       for (int i = 0; i < grades.length; i++) {
           
           array[i] = grades[i];
           
       }
       Arrays.sort(array);
       minimum = array[0];
   return minimum;
   }
   public void standardDeviation(int[] array){
      
       int n ;
       double sum1=0 ;
       double sum=0 ;
       double sd  = 0;
       double average = 0;
       //System.out.println(grades[2]);
       System.arraycopy(grades, 0, array, 0, array.length);
       //System.out.println(array[2]);
       
       for (int i = 0; i < array.length; i++) {
           sum1 += array[i];
           
       }
      // System.out.println(sum1);
      // System.out.println(array.length);
       average =  sum1 /array.length;
      // System.out.println(average);
       
   
       n = array.length;
       
       for (int i = 0; i < array.length; i++) {
           
           sum += (( Math.pow(array[i],2)) - (Math.pow(average,2 )));
           
           
       }
       
       
       sd = Math.sqrt(sum/n);
       
       System.out.println("Standard deviation is "+ sd);
       
   
   
   }
   
   
   
    

}
 





