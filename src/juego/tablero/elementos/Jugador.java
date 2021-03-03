package juego.tablero.elementos;

public abstract class Jugador
{
    private String name;
    private long puntos;

    public Jugador(String name)
    {    this.name = name;    }

    public String getName()
    {    return name;    }

    public long getPuntos()
    {    return puntos;    }

    public void incrementaPuntos(long puntos)
    {    puntos+=puntos;    }

    public abstract void jugada();
}
