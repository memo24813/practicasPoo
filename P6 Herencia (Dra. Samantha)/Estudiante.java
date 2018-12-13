public class Estudiante extends Persona{

    private int matricula;
    private double promedio;

    public Estudiante()
    {
        
    }
    public int getMatricula() {
        return matricula;
    }

    public double getPromedio() {
        return promedio;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}