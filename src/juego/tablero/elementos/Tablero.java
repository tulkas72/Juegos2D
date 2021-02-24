package juego.tablero.elementos;

public class Tablero
{
    private Casilla[][] tablero;

    public Tablero(short nfilas, short ncolumnas)
    {
        tablero=new Casilla[nfilas][ncolumnas];
    }
}
