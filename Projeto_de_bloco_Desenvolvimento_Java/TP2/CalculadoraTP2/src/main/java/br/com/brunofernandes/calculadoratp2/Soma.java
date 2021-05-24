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
public class Soma {
    private Number number1;
    private Number number2;
    
    public Soma() {}
    public Soma(Number number1, Number number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public double somar(double number1, double number2) {
        return number1 + number2;
    }
}