public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        System.out.println("El area de este circulo es de: \n" + (3.14*this.radio*this.radio) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este circulo es de: \n" + (2*3.14*this.radio) + "cm");
    }
}
