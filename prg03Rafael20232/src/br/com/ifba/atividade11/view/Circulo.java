
package br.com.ifba.atividade11.view;

public class Circulo extends FormaBidimensional {

    private final double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    //área do círculo
    @Override
    public void obterArea() {
        System.out.printf("Area do circulo: %.2f%n", Math.pow(getRaio(), 2) * Math.PI);
    }

    private double getRaio() {
        return raio;
    }

}