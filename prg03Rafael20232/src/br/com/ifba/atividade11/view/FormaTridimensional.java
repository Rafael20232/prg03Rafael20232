
package br.com.ifba.atividade11.view;

public abstract class FormaTridimensional extends Forma{
    
    public abstract void obterVolume();
    
    @Override
    public String toString() {
        return "Forma Tridimensional";
    }
}