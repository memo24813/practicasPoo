public class EAsalariado extends Empleado{

    private double sueldo_Fijo;
    private double porcentaje_Adicional;
    private static int anio_actual=2018;
    public EAsalariado(int num_Trabajador,String nombre,String apellidos,int anio_Ingreso,double sueldo_Fijo)
    {
        setNum_Trabajador(num_Trabajador);
        setNombre(nombre);
        setApellidos(apellidos);
        setAnio_Ingreso(anio_Ingreso);
        setPorcentaje_Adicional(anio_Ingreso);
        setSueldo_Fijo(sueldo_Fijo);
    }

    public EAsalariado(){}

    public void imprimir()
    {
        System.out.println("No Trabajador: "+getNum_Trabajador()+" Nombre: "+getNombre()+" Apellido: "+getApellidos()+" Anio Ingreso: "+getAnio_Ingreso());
        System.out.println("Sueldo Fijo: "+obtener_Salario());
    }

    public double obtener_Salario() {
        return sueldo_Fijo;
    }

    public double getPorcentaje_Adicional() {
        return porcentaje_Adicional;
    }

    public void setPorcentaje_Adicional(int anios_Ingreso) {
        
        if((anio_actual-anios_Ingreso)<2){ this.porcentaje_Adicional=1;}
        if((anio_actual-anios_Ingreso)>=2 && (anio_actual-anios_Ingreso)<=3){this.porcentaje_Adicional=1.05;} //aplicamos el 5%
        if((anio_actual-anios_Ingreso)>=4 && (anio_actual-anios_Ingreso)<=7){this.porcentaje_Adicional=1.10;} //aplicamos el 10%
        if((anio_actual-anios_Ingreso)>=8 && (anio_actual-anios_Ingreso)<=15){this.porcentaje_Adicional=1.15;}//aplicamos el 15%
        if((anio_actual-anios_Ingreso)>=15){this.porcentaje_Adicional=1.20;}                    //aplicamos el 20%
    }

    public void setSueldo_Fijo(double sueldo_Fijo) {
        this.sueldo_Fijo = sueldo_Fijo*this.porcentaje_Adicional;
    }

}