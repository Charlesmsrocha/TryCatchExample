/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchexample;

/**
 *
 * @author Ken
 */
public class Calculator {
    
    
    /**
     * adds two integers and returns the sum
     * @param num1 the first int to add
     * @param num2 the second int to add
     * @return the sum of num1 and num2
     */
    public int add(int num1, int num2){
        
        return (num1 + num2);
    }
    
    /**
     * subtract one integer from another
     * @param num1 the first int 
     * @param num2 the int to subtract from  num1
     * @return the result of num1 - num2
     */
    public int subtract(int num1, int num2){
        
        return (num1 - num2);
    }
    
    /**
     * adds two integers and returns the product
     * @param num1 the first int to multiply
     * @param num2 the second int to multiply
     * @return the product of num1 and num2
     */
    public int mult(int num1, int num2){
        
        return (num1 + num2);
    }
    
    
    /**
     * Divides one number by another
     * @param num1 the number to divide (dividend)
     * @param num2 the number to divide by (divisor)
     * @return the result of num1 / num2
     * @throws ArithmeticException if num2 is zero because div by zero impossible
     */
    public double div(int num1, int num2) throws ArithmeticException {
        
        if (num2 == 0){
            //not allowed - cannot div by zero
            throw new ArithmeticException("Cannot divide by zero you plonker!");
        }
        else {
            //everything is OK
            
            return (num1 / (double)num2);
        }
    }
}
