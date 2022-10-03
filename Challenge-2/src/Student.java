/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kornelius Rhesa Valdis S. (2100150) - 3A PSTI
 */
import java.util.Scanner;
import java.lang.Math;
public class Student {
    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double midTermEX;
    private double finalEX;
    private double totalScore;
    private char letterGrade;
    private String nameStudent;
    private Scanner input;
    private String scoreIndicator;
    
    //COSTRUCT CLASS: Student
    public Student(){
        quiz1=0;
        quiz2=0;
        quiz3=0;
        midTermEX=0;
        finalEX=0;
        input = new Scanner(System.in);    
    }
    //Method For Input
    public void readInput()
    {
        System.out.println();
        System.out.print("Enter Student's Name: ");
        nameStudent = input.next();
        
        System.out.println("Enter a score for Quiz 1 (0-10 points): ");
        quiz1 = input.nextDouble();
        
        while (quiz1<0 || quiz1>10){
            System.out.println("Enter A Valid Score for Quiz 1!: ");
            quiz1 = input.nextDouble();
        }
        
        System.out.println("Enter a score for Quiz 2 (0-10 points): ");
        quiz2 = input.nextDouble();
        
        while (quiz2<0 || quiz2>10){
            System.out.println("Enter A Valid Score for Quiz 2!: ");
            quiz2 = input.nextDouble();
        }
        
        System.out.println("Enter a score for Quiz 3 (0-10 points): ");
        quiz3 = input.nextDouble();
        
        while (quiz3<0 || quiz3>10){
            System.out.println("Enter A Valid Score for Quiz 3!: ");
            quiz3 = input.nextDouble();
        }
        
        
        System.out.println("Enter a score for Mid Term Exam (0-100 points): ");
        midTermEX = input.nextDouble();
        
        while (midTermEX<0 || midTermEX>100){
            System.out.println("Enter A Valid Score for Mid Term Exam!: ");
            midTermEX = input.nextDouble();
        }
        
        System.out.println("Enter a score for Final Exam (0-100 points): ");
        finalEX = input.nextDouble();
        
        while (finalEX<0 || finalEX>100){
            System.out.println("Enter A Valid Score for Final Exam!: ");
            finalEX = input.nextDouble();
        } 
    } 
    public void calculateAllGrade(){
        double quizGrade = ((quiz1+quiz2+quiz3)/30*100)*0.25;
        double midTermGrade = midTermEX * 0.35;
        double finalGrade = finalEX * 0.40;
        
        totalScore = quizGrade + midTermGrade + finalGrade;
        totalScore = Math.round(totalScore*100.00)/100.00;
        
        if(totalScore>=90) {
            letterGrade = 'A';
            scoreIndicator = "Super";
        }else if (totalScore>=80&&totalScore<90){
            letterGrade = 'B';
            scoreIndicator = "Good";
        }else if (totalScore>=70&&totalScore<80){
            letterGrade = 'C';
            scoreIndicator = "Fair";
        }else if (totalScore>=60&&totalScore<70){
            letterGrade = 'D';
            scoreIndicator = "Poor";
        }else if (totalScore>=0&&totalScore<60){
            letterGrade = 'F';
            scoreIndicator = "Bad";
        }
    }
    
    public void writeOutput(){
        System.out.println();
        System.out.println("Student Record");
        System.out.println("================");
        System.out.println("Name: "+nameStudent);
        System.out.println("Scores --->");
        System.out.println("Quiz 1: "+quiz1);
        System.out.println("Quiz 2: "+quiz2);
        System.out.println("Quiz 3: "+quiz3);
        System.out.println("Mid Term Exam: "+midTermEX);
        System.out.println("Final Exam: "+finalEX);
        System.out.println("======================");
        System.out.println("Total Score: "+totalScore);
        System.out.println("Letter Grade: "+letterGrade);
        System.out.println("Score Indicator: "+scoreIndicator);
        System.out.println("==================================");
        
    }
}

