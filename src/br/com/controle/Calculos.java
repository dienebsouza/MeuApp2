/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Calculos {
    //visib. tipo   nome
    private double valor1;
    private double valor2;

    //     tipo    valor + return -> get
    public double getValor1() {
        return valor1;
    }
    //     tipo   valor   entrada + this -> set
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double somar(){
        return this.valor1+this.valor2;
    }
    
    public double subtrair(){
        return this.valor1-this.valor2;
    }
}
