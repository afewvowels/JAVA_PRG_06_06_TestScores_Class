/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_06_testscores_class;

/**
 *
 * @author aeiou
 */
public class TestScores {
    private double dblScore1;
    private double dblScore2;
    private double dblScore3;
    
    public TestScores(double score1, double score2, double score 3) {
        dblScore1 = score1;
        dblScore2 = score2;
        dblScore3 = score3;
    }
    
    public TestScores() {
        dblScore1 = 0.0;
        dblScore2 = 0.0;
        dblScore3 = 0.0;
    }
    
    public void SetScore1(double score) {
        dblScore1 = score;
    }
    
    public void SetScore2(double score) {
        dblScore2 = score;
    }
    
    public void SetScore3(double score) {
        dblScore3 = score;
    }
    
    public double AverageScore() {
        return (dblScore1 + dblScore2 + dblScore3) / 3.0;
    }
}
