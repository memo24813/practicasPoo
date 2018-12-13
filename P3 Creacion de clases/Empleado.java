public class Empleado{

    String nombre_Empleado;
    String Direccion;
    String curp;
    int fecha_Nacimiento;
    String numero_seguro;
    double sueldo;
    String cargo;
    int anios_antiguedad;
    double pago=0;
    public Empleado(String nombre_Empleado,String Direccion,String curp,int fecha_Nacimiento,String numero_seguro,double sueldo,String cargo,int anios_antiguedad)
    {
        this.nombre_Empleado=nombre_Empleado;
        this.Direccion=Direccion;
        this.curp=curp;
        this.fecha_Nacimiento=fecha_Nacimiento;
        this.numero_seguro=numero_seguro;
        this.sueldo=sueldo;
        this.cargo=cargo;
        this.anios_antiguedad=anios_antiguedad;
    }

    void pagar_Empleado()
    {
        this.pago=pago+sueldo*.84;
    }

    void aumentar_Sueldo()
    {
        if(anios_antiguedad>8)
        {
            this.sueldo=sueldo*anios_antiguedad/4;
        }
    }

    void bajar_Sueldo()
    {
        this.sueldo=sueldo-(sueldo*.30);
    }

    void cambio_Cargo(String cargo)
    {
        this.cargo=cargo;
    }
    void utilidades_Empleado()
    {
        pago=pago+sueldo*anios_antiguedad/2;
    }
}