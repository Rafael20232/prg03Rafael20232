
package br.com.ifba.atividade11.view;

public class Piramide extends FormaTridimensional {

    private final double areaBase;
    private final double altura;
    private final double areaLateral;

    public Piramide(double areaBase, double altura, double areaLateral) {
        this.areaBase = areaBase;
        this.altura = altura;
        this.areaLateral = areaLateral;
    }
    
    //volume da pirâmide
    @Override
    public void obterVolume() {
        System.out.printf("Volume da piramide: %.2f%n", (getAreaBase() * getAltura()) / 3);
    }

    //área da pirâmide
    @Override
    public void obterArea() {
        System.out.printf("Area da piramide: %.2f%n", getAreaBase() + getAreaLateral());    
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getAltura() {
        return altura;
    }

    private double getAreaLateral() {
        return areaLateral;
    }
    
}