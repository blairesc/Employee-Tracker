/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blswa
 */
public abstract class Employee {
    private String employeeName;
    private double baseSalary;
    private String employeePassword;
    private boolean validPassword = false; //set to true if password matches condition
    
    //default constructor
    public Employee () {
        employeeName = ""; //set the employee name empty
        baseSalary = 0; //initialize the base salary to 0
    }
    
    //constructor
    public Employee (String n, double s) {
        employeeName = n; //set the employee name to n
        baseSalary = s; //set the base salary to s
    }
    
    //returns the name of the employee
    public String getName () {
        return employeeName;
    }
    
    //returns the base salary of the employee
    public double getBaseSalary () {
        return baseSalary;
    }
    
    //sets the password of the employee if it meets the correct criteria
    protected void setPW (String p) {
        if (checkPassword(p) == true) { //if the password meets its criteria respectively
            validPassword = true;   //valid password
            employeePassword = p;   //set the employee password to p 
        }
        else {
            throw new IllegalArgumentException(); //throw IllegalArgumentException if password is not valid
        }
    }
    
    //checks if a valid password has been set and s matches the employee
    //password then return true, otherwise return false.
    public boolean isPasswordMatch (String s) {
        boolean passwordMatch = false;
        if (validPassword == true && s.equals(employeePassword)) { 
            passwordMatch = true;
        }
        return passwordMatch;
    }
    
    //implemented in the Manager and TechnicalStaff classes
    //to fit each specific conditions respectively
    
    public abstract boolean checkPassword (String s); 
    
    public abstract double getSalary(); 
}

