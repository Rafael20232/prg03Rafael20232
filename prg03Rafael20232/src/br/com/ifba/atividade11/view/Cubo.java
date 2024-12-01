
package br.com.ifba.atividade11.view;

public class Cubo extends FormaTridimensional {

    private final double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }
    
    //volume do cubo
    @Override
    public void obterVolume() {
        System.out.printf("Volume do cubo: %.2f%n", Math.pow(getAresta(), 3));
    }

    //área do cubo
    @Override
    public void obterArea() {
        System.out.printf("Area do cubo: %.2f%n", 6 * Math.pow(aresta, 2));
    }

    private double getAresta() {
        return aresta;
    }
    
}