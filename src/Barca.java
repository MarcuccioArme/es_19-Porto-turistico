public class Barca {
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza;
    private String tipologia;

    public Barca(String nome, String nazionalita, double lunghezza, double stazza, String tipologia) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNazionalita() {
        return this.nazionalita;
    }

    public double getLunghezza() {
        return this.lunghezza;
    }

    public double getStazza() {
        return this.stazza;
    }

    public String getTipologia() {
        return this.tipologia;
    }
}