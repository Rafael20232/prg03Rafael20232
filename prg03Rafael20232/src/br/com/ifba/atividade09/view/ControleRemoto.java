/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;


public class ControleRemoto {
    private int volume;
    private Boolean ligado;
    
    public void ligar (){
        this.setLigado(true);
    }
    
    public void desligar () {
        this.setLigado(false);
    }
    
    public void abrirMenu () {
        
    }
    
    public void fecharMenu() {
        
    }
    
    public void maisVolume () {
        
    }
    
    public void menosVolume () {
       
    }
    
    public void ligarMudo () {
       
    }
    
    public void desligarMudo () {
        
    }
    
    public void play () {
        
    }
    
    public void pause () {
        
    }
    
    private int getVolume () {
        return this.volume;
    }
    
    private void setVolume (int volume) {
        this.volume = volume;
    }
    
    private Boolean getligado () {
        return this.ligado;
    }
    
    private void setLigado(Boolean ligado){
        this.ligado = ligado;
    }
}
