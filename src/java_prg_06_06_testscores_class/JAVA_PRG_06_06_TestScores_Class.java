/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_06_testscores_class;

import java.util.Scanner;
/**
 *
 * @author aeiou
 */
public class JAVA_PRG_06_06_TestScores_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strTemp;
        
        TestScores scores = new TestScores();
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.println("Please enter test score 1: ");
        strTemp = scrKeyboard.nextLine();
        scores.SetScore1(Double.parseDouble(strTemp));
        
        System.out.println("Please enter test score 2: ");
        strTemp = scrKeyboard.nextLine();
        scores.SetScore2(Double.parseDouble(strTemp));
        
        System.out.println("Please enter test score 3: ");
        strTemp = scrKeyboard.nextLine();
        scores.SetScore3(Double.parseDouble(strTemp));
        
        System.out.println("The average test score is " + scores.AverageScore());
    }
    
}
