package juego.tablero.elementos;

public class Casilla3enRaya<T> implements Casilla
{
    String contenido;
    Casilla3enRaya()
    {
        super();
    }

    @Override
    public void setContenido(Object contenido)
    {
        if(contenido instanceof String)
            contenido=(String)
    }

    @Override
    public Object getContenido() {
        return contenido;
    }

}
