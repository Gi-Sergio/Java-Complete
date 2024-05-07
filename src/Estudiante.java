public class Estudiante extends Persona implements Trabajador{
    private Integer grado;

    public Estudiante(String nombre, Integer edad, Integer fechaNacimiento, Integer grado) {
        super(nombre, edad, fechaNacimiento);
        this.grado = grado;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.grado);
    }

    public void realizarTarea(){
        System.out.println("Realizando tarea escolar");
    }

}
