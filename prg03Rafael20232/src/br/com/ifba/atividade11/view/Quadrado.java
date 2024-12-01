
package br.com.ifba.atividade11.view;

public class Quadrado extends FormaBidimensional{

    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void obterArea() {
        System.out.printf("Area do quadrado: %.2f%n", Math.pow(getLado(), 2));
    }

    private double getLado() {
        return lado;
    }
 
}