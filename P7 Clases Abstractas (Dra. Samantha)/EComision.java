public class EComision extends Empleado{

    private static double salario_Constante=750;
    private double salario_Comision;
    private double monto_Cliente;
    private int numero_Cliente;

    public EComision(int num_Trabajador,String nombre,String apellidos,int anio_Ingreso,double monto_Cliente,int numero_Cliente)
    {
        setNum_Trabajador(num_Trabajador);
        setNombre(nombre);
        setApellidos(apellidos);
        setAnio_Ingreso(anio_Ingreso);
        setMonto_Cliente(monto_Cliente);
        setNumero_Cliente(numero_Cliente);
        setSalario_Comision();

    }

    public EComision(){}

    public void imprimir()
    {
        System.out.println("No Trabajador: "+getNum_Trabajador()+" Nombre: "+getNombre()+" Apellido: "+getApellidos()+" Anio Ingreso: "+getAnio_Ingreso());
        System.out.println(" Sueldo Comision: "+obtener_Salario());
    }


    public double obtener_Salario() {
        return salario_Comision;
    }

    public double getMonto_Cliente() {
        return monto_Cliente;
    }

    public int getNumero_Cliente() {
        return numero_Cliente;
    }

    public void setSalario_Comision() {
        this.salario_Comision = salario_Constante + monto_Cliente*numero_Cliente;
    }

    public void setMonto_Cliente(double monto_Cliente) {
        this.monto_Cliente = monto_Cliente;
    }

    public void setNumero_Cliente(int numero_Cliente) {
        this.numero_Cliente = numero_Cliente;
    }
}