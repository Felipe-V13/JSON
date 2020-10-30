import java.util.Arrays;

public class Carta {
    private String[] tipo;
    private int ataque;
    private int coste;
    private String[] accion;

    public Carta() {
    }
    public Carta(String[] tipo,int ataque,int coste, String [] accion) {
        this.tipo = tipo;
        this.ataque = ataque;
        this.coste = coste;
        this.accion = accion;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String[] getAccion() {
        return accion;
    }

    public void setAccion(String[] accion) {
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tipo=" + Arrays.toString(tipo) +
                ", ataque=" + ataque +
                ", coste=" + coste +
                ", accion=" + Arrays.toString(accion) +
                '}';
    }
}

