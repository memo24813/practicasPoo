public class Persona{

    private String primer_Nombre;
    private String segundo_Nombre;
    private String apellido_Paterno;
    private String apellido_Materno;
    private String fecha;


    public Persona()
    {
        this.primer_Nombre="xxxxxxxxxx";
        this.segundo_Nombre="xxxxxxxxxx";
        this.apellido_Paterno="xxxxxxxx";
        this.apellido_Materno="xxxxxxxx";
        this.fecha="12345678";
    }
    public String getPrimer_Nombre() {
        return primer_Nombre;
    }
    
    public String getSegundo_Nombre() {
        return segundo_Nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre.toUpperCase();
    }

    public void setSegundo_Nombre(String segundo_Nombre) {
        this.segundo_Nombre = segundo_Nombre.toUpperCase();
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno.toUpperCase();
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno.toUpperCase();
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}