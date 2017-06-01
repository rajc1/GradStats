/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradestatics;

import java.util.Scanner;

/**
 *
 * @author CrJ
 */
public class GradeStatics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the number of students and then thier grades ");
        Scanner sc = new Scanner(System.in);
        stats st = new stats();
         for (int i = 0; i < stats.grades.length; i++) {
        
        stats.grades[i] = sc.nextInt();
                  
            
            
    
    }
       //10
       st.average();
       st.printArray();
        System.out.println((st.minimum(stats.grades)));
        
        System.out.println((st.maximum(stats.grades)));
       st.median(stats.grades);
       st.standardDeviation(stats.grades);
       
    }
        
    }
    

