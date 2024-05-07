public class Rectangulo extends FiguraGeometrica{
    private Integer base;
    private Integer altura;

    public Rectangulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
}
