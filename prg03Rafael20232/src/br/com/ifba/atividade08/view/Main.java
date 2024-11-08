/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Erio
 */
public class Main {
    public static  void main(String[] args){
        Banco a = new Banco();
        a.setNumConta(1000);
        a.setDono("Lambisgoia");
        a.abrirConta("CC");
        
        Banco b = new Banco();
        a.setNumConta(2000);
        a.setDono("goia");
        a.abrirConta("CP");
        
        a.depositar(50);
        b.depositar(100);
        b.sacar(600);
        
        a.sacar(99);
        a.fecharConta();
        
        a.estadoAtual();
        b.estadoAtual();
    }
}
