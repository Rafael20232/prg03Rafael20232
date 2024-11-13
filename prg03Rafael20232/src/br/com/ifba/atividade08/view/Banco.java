/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Erio
 */
public class Banco {
    //Atributos.
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados.
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String c){
        this.setTipo(c);
        this.setStatus(true);
        if (c == "CC"){
            this.saldo = 50;
        }else{
            if (c == "CP"){
                this.saldo = 150;
            }
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.print("Conta não pode ser criada, há saldo");
        }else{
            if (this.getSaldo() < 0){
            System.out.print("Conta não pode ser criada, vc está negativado");
        }else{
            this.setStatus(false);
            System.out.println("Conta criada");
            }
        }
    }
    
    public void depositar(float num){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + num);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Primeiro abra uma conta!");
        }
    }
    
    public void sacar(float sac){
        if(this.getStatus()){
            if(this.getSaldo() >= sac){
                this.setSaldo(this.getSaldo() - sac);
                System.out.println("Saque realizado na conta de" + this.getDono());
            }else{
                System.out.println("Saldo insulficiente");
            }
        }else{
            System.out.println("primeiro abra sua conta");
        }
    }
    
    public void pagamentoMensal(){
        int num = 0;
        if(this.getTipo() == "CC"){
            num = 12;
        }else{
            if(this.getTipo() == "CP"){
                num = 20;
            }
            if(this.getStatus()){
                this.setSaldo(this.getSaldo() - num);
                System.out.println("Pago com sucesso " + this.getDono());
            }else{
                 System.out.println("Primeiro abra uma conta!");
            }
        }
    }
    
    //Metodos.
    public void Construtor(){
        saldo = 0;
        status = false;
    }
    
    public void setNumConta(int cont){
        numConta = cont;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public void setTipo(String tip){
        tipo = tip;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setDono(String don){
        dono = don;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(float sal){
        saldo = sal;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean sta){
        status = sta;
    }
    public boolean getStatus(){
        return status;
    }
    
}
