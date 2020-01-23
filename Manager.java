/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blswa
 */
public class Manager extends Employee{  //subclass of the class Employee
    private double bonus;
    
    //default constructor
    public Manager (){
        super(); //calls the Employee default constructor 
        bonus = 0; //initialize bonus to 0
    }
    
    //constructor
    public Manager (double b, String n, double base){
        super(n, base); //calls the Employee constructor
        bonus = b;    //sets bonus to b
    }
    
    //check if the password is valid. Password must be 10 or more characters,
    //have atleast one small letter, atleast one capital letter, and can only
    //contain numbers and letters.
    public boolean checkPassword (String s){
        int passwordLength = s.length();
        boolean alphanumericFlag = false;
        boolean lowerFlag = false;
        boolean upperFlag = false;
        boolean numberFlag = false;
        char ch;
        
        if (s.matches("[a-zA-Z0-9]*$")) {  //if string is alphanumeric
            alphanumericFlag = true;
        }
        for (int i = 0; i < passwordLength; i++){  //transverse through the string
            ch = s.charAt(i); //change to character
            if (Character.isDigit(ch)) {  //check if the character is a digit
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)){ //check if the character is an upper case letter
                upperFlag = true;
            }
            else if (Character.isLowerCase(ch)){ //check if the character is a lower case letter
                lowerFlag = true;
            }
        }
        return (passwordLength>=10 && alphanumericFlag && lowerFlag && upperFlag && numberFlag);
    }
    
    //return the addition of the base salary and the bonus
    public double getSalary () {
        return getBaseSalary() + bonus;  //add the bonus to the base salary 
    }
}
