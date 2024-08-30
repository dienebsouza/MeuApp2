/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle3;

/**
 *
 * @author laboratorio
 */
public class Dados {
    private int idade;
    int maior;
    int soma;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if(this.idade > maior){
            //maior recebe cada resposta nova e verifica se ela é maior que a anterior.
            maior = this.idade;      
        }
        //soma cada novo valor ao anterior e guarda o resultado nela mesma
        soma += this.idade;
    }
    
    public int respMaior(){
        return maior;
    }
    
    public int respSoma(){
        return soma;
    }
}

