public class Trabajador extends Persona{

    private int num_Empleado;
    private String RFC;

    public Trabajador()
    {
        
    }
    public int getNum_Empleado() {
        return num_Empleado;
    }


    public String getRFC() {
        return RFC;
    }


    public void setNum_Empleado(int num_Empleado) {
        this.num_Empleado = num_Empleado;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}