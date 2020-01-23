/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blswa
 */
public class TechnicalStaff extends Employee{ //subclass of the Employee class
    
    //default constructor
    public TechnicalStaff() {
        super (); //calls the Employee default constructor
    }
    
    //constructor
    public TechnicalStaff(String n, double base) {
        super(n,base); //calls the Employee constructor
    }
    
    //password must have to following to be valid.
    //The password must be 8 or more characters, have at least one number, at least one letter, 
    //and can only contain numbers and letters. Return true if s meets the criteria otherwise false.
    //Note the password criteria is unique to the TechnicalStaff.
    public boolean checkPassword(String s) {
        int passwordLength = s.length();
        boolean alphanumericFlag = false;
        boolean letterFlag = false;
        boolean numberFlag = false;
        char ch;
        
        if (s.matches("[a-zA-Z0-9]*$")) { //check is the string is alphanumeric
            alphanumericFlag = true;
        }
        for (int i = 0; i < passwordLength; i++){ //transverse through the string
            ch = s.charAt(i); //change to character
            if (Character.isDigit(ch)) { //check if the character is a digit
                numberFlag = true;
            }
            else if (Character.isLetter(ch)){ //check if the character is a letter, whether upper or lower case
                letterFlag = true;
            }
        }
        return (passwordLength>=8 && alphanumericFlag && letterFlag && numberFlag);
    }
    
    //return the base salary
    public double getSalary() {
        return getBaseSalary();
    }
}
