package juego.tablero.elementos;

public interface Casilla<T>
{

    void setContenido(T contenido);
    T getContenido();

}
