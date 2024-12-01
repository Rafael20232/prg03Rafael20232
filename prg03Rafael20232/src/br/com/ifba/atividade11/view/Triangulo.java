
package br.com.ifba.atividade11.view;

public class Triangulo extends FormaBidimensional{
    
    private final double base;
    private final double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void obterArea() {
        System.out.printf("Area do triangulo: %.2f%n", getBase() * getAltura() / 2);
    }

    private double getBase() {
        return base;
    }

    private double getAltura() {
        return altura;
    }
}