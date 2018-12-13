public class Estructura{

    int coordenada[]=new int[2];
    String tamano;
    String material;
    int resistencia;

    public Estructura(int coordenada[],String tamano,String material)
    {
        this.coordenada=coordenada;
        this.tamano=tamano;
        this.material=material;
        verificar_Estructura(tamano);
    }

    void verificar_Estructura(String tamano)
    {
        if(tamano.equalsIgnoreCase("grande"))
        {
            this.resistencia=100;
        }else if(tamano.equalsIgnoreCase("mediano"))
        {
            this.resistencia=50;
        }else if(tamano.equalsIgnoreCase("chico"))
        {
            this.resistencia=30;
        }else
        {
            this.resistencia=60;
        }
    }
}