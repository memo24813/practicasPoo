public abstract class Empleado{
    
    private int num_Trabajador;
    private String nombre;
    private String apellidos;
    private int anio_Ingreso;

    public abstract void imprimir();
    public abstract double obtener_Salario();

    public static void sueldoMayor(Empleado empleados[])
    {
        int i,j;
        Empleado aux;
            for(i=0; i<empleados.length-1; i++)
            {
                for(j=i+1; j<empleados.length; j++)
                {
                    if(empleados[i].obtener_Salario()<empleados[j].obtener_Salario())
                    {
                        aux=empleados[i];
                        empleados[i]=empleados[j];
                        empleados[j]=aux;
                    }
                }
            }
            System.out.println("\tEl trabajador con mayor sueldo.\n");
                empleados[0].imprimir();
                System.out.println();

    }
    public static void mostrarTodos(Empleado empleados[])
    {
        int i;
        System.out.println("\t\tTodos los Empleados.");
        for(i=0; i<empleados.length; i++)
        {
            empleados[i].imprimir();
        }
    }
    /*GETTERS */
    public int getNum_Trabajador() {
        return num_Trabajador;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnio_Ingreso() {
        return anio_Ingreso;
    }
    /*SETTERS */
    public void setNum_Trabajador(int num_Trabajador) {
        this.num_Trabajador = num_Trabajador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAnio_Ingreso(int anio_Ingreso) {
        this.anio_Ingreso = anio_Ingreso;
    }

}