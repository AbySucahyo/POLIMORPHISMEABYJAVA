/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Aby
 */
public class Result{
    public static void main(String[] args) {
       Rect result1 = new Rect(1,1,4,4);
       Rect result2 = new Rect(2,3,5,6);
       
       System.out.println("<2,3> is Inside the Union ");
       System.out.println(result1+"Union "+result2+" = "+result1.union(result2));
       System.out.println(result1+"intersect"+result2+ " = "+result1.intersection(result2));
    }
}
