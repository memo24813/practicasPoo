public class Persona{
    public String nombre;
    public int edad;

    public Persona(){}
    public Persona(String nombre)
    {
        this.nombre=nombre;
    }

    public Persona(int edad)
    {
        this.edad=edad;
    }

    public Persona(String nombre, int edad)
    {
        this.nombre=nombre;
        this.edad=edad;
    }
    public void unMetodo(int i)
    {
        System.out.println("Un metodo con argumento entero");
    }
    public void unMetodo(float i)
    {
        System.out.println("Un metodo con argumento real");
    }
}