/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computation.of.grade;
import java.util.*;
/**
 * Java class DLCompute 
 * This class computes for the average grade 
 * and outputs whether the user is qualified 
 * for the dean's list
 * 
 * @author ProgAppsLecGroup
 * @version 8.2, 05 Nov 2017
 */
public class ComputationOfGrade {

    /**
 * This class allows the user to input values for 
 * each variable such as subjects, final grade, and
 * number of units required to complete the evaluation 
 * 
 * @param args receives inputs 
 */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scan = new Scanner (System.in);
    	
    	double grade = 0;
        double units = 0; 
        double finGrade, ave;
    	double totalUnits = 0;
        double totalGrades = 0;
    	
    	System.out.print("Enter how many subjects you have: ");
    	int s = scan.nextInt();
    	
    	for (int x = 1; x <= s; x++){
            System.out.print("Enter final grade: ");
            grade = scan.nextDouble();
            System.out.print("Enter units: ");
            units = scan.nextDouble();
            System.out.println();
            
            finGrade = computeFinalGrade(grade, units);
            totalGrades = computeTotalGrades(totalGrades, finGrade);
            totalUnits = computeTotalUnits(totalUnits, units);
    	}              
        
    	ave = computeAverage(totalGrades, totalUnits);    	        
    	result(ave);
    }
    /**
     * This method outputs the results whether the user
     * qualifies or not
     * 
     * @param ave to be used for a condition
     */
    public static void result(double ave) {
    System.out.println("Your average is " + ave);
    if(ave >= 85)
    System.out.println("Congratulations! You're qualified for the Dean's List");
    else
    System.out.println("Sorry you're not qualified for the Dean's List");
    }
    /**
     * This method divides total grade and total 
     * units and returns the average grade
     * 
     * @param totalGrades to be divided with totalUnits
     * @param totalUnits to be divided with totalGrade
     * @return returns the computed average grade
     */
    public static double computeAverage(double totalGrades, double totalUnits) {
        double ave;
        ave = totalGrades / totalUnits;
        return ave;
    }
    /**
     * This method adds units and total units
     * and returns the computed total units
     * 
     * @param totalUnits required for computation
     * @param units required for computation
     * @return returns totalUnits
     */
    public static double computeTotalUnits(double totalUnits, double units) {
        totalUnits = units + totalUnits;
        return totalUnits;
    }
    /**
     * This method returns the total grade
     * 
     * @param totalGrades required for computation
     * @param finGrade required for computation
     * @return returns the total Grade
     */
    public static double computeTotalGrades(double totalGrades, double finGrade) {
        totalGrades = computeTotalUnits(totalGrades, finGrade);
        return totalGrades;
    }
    /**
     * This method multiplies grade and units
     * and returns the final grade
     * 
     * @param grade required to compute for the final grade
     * @param units to be multiplied to grade 
     * @return returns the computed final grade
     */
    public static double computeFinalGrade(double grade, double units) {
        double finGrade;
        finGrade = grade * units;
        return finGrade;
    }        
    }
    

