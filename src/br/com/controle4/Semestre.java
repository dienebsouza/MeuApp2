/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle4;

/**
 *
 * @author laboratorio
 */
public class Semestre {
    private double nota1;
    private double nota2;
    private double media;
    double menor = 11;
    double total;
    int qtd = 0;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
        //poderia ser no setNota1 ou setNota2
        this.media = (this.nota1+this.nota2)/2;
        if(this.media < menor){
            menor = this.media;
        }
        total+=this.media;
        qtd++;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public double respMenor(){
        this.media = (total/qtd);
        return menor;
    }
    
    
    
}
        
