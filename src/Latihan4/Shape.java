/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Aby
 */
public class Shape {
    //private member variabel
    private String color;
    //Constructor
    public Shape (String color){
        this.color= color;
    }
    @Override
    public String toString(){
        return "Shape[color ="+color+"]";
    }
    //All shape must have a method called getArea().
    public double getArea(){        
        //We need to return some value to compile the program
        System.err.println("Shape unknwon! Cannot compute area!");
        return 0;
    }
}
