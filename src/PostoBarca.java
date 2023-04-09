public class PostoBarca {
    private int numero;
    private boolean occupato;

    public PostoBarca(int numero) {
        this.numero = numero;
        this.occupato = false;
    }

    public int getNumero() {
        return this.numero;
    }

    public boolean isOccupato() {
        return this.occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
}
