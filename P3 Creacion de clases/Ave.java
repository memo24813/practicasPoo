public class Ave{
    String nombre;
    double velocidad;
    int coordenada[]=new int[2];
    double peso;
    String habilidad;
    String color;
    String tamano;

    public Ave(String nombre,double velocidad,int coordenada[],double peso,String habilidad,String color,String tamano)
    {
        this.nombre=nombre;
        this.velocidad=velocidad;
        this.coordenada=coordenada;
        this.peso=peso;
        this.habilidad=habilidad;
        this.color=color;
        this.tamano=tamano;
    }

    public usar_Habilidad(String habilidad)
    {
        if(habilidad.equalsIgnoreCase("velocidad"))
        {
            velocidad=velocidad*15;
        }else if(habilidad.equalsIgnoreCase("grande"))
        {
                peso=peso*10;
        }else if(habilidad.equalsIgnoreCase("enojo"))
        {
            velocidad=velocidad*7;
            peso=peso*7;   
        }else
        {
            velocidad=velocidad+10;
            peso=peso+10;
        }
    }
    void colision(Estructura nivel)
    {
        if(nivel.coordenada[0]==coordenada[0] && nivel.coordenada[1]==coordenada[1])
        {
            nivel.resistencia-=tension+velocidad/peso;
        }
    }
}