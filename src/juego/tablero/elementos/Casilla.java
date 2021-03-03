package juego.tablero.elementos;

public interface Casilla<T>
{

    void setMarcador(T contenido);
    T getMarcador();

}
