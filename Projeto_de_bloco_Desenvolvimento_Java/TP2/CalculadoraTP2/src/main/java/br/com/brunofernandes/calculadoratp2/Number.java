/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunofernandes.calculadoratp2;

/**
 *
 * @author Bwendel
 */
public class Number {
    private double number;
    
    public Number() {}
    public Number(double number1, double number2) {
        this.number = number;
    }
    
    public double getNumber() {
        return this.number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
}
