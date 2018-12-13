public class Resortera{

    int coordenada[]=new int[2];
    String tamano;
    double tension;
    double angulo_resortera;
    boolean cargar;
    double velocidad;

    public Resortera(int coordenada[],String tamano,double tension,double angulo_resortera,boolean cargar,double velocidad)
    {
        this.coordenada=coordenada;
        this.tamano=tamano;
        this.tension=tension;
        this.angulo_resortera=angulo_resortera;
        this.cargar=cargar;
        this.velocidad=velocidad;
    }

    void lanzar(Ave jugador)
    {
        if(this.cargar==false)
        {
            this.cargar=true;
            jugador.coordenada[0]=tension+((velocidad+jugador.velocidad)/2)/2;
            jugador.coordenada[1]=angulo+((velocidad+jugador.velocidad)/2)/2;
            this.carga=false;
        }
    }
    void setAngulo(double angulo)
    {
        this.angulo_resortera=angulo;
    }

    void setTension(double tension)
    {
        this.tension=tension;
    }
}