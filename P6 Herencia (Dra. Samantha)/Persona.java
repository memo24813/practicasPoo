public class Persona
{
    private String nombre;
    private int edad;
    private int num_Seguro;

    public Persona()
    {

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNum_Seguro() {
        return num_Seguro;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNum_Seguro(int num_Seguro) {
        this.num_Seguro = num_Seguro;
    }
}