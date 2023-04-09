public class Porto {
    private PostoBarca[] postiBarca;
    private Barca[] barche;
    private int postiOccupati;

    public Porto() {

        this.postiBarca = new PostoBarca[15];
        this.barche = new Barca[15];
        for (int i = 0; i < 15; i++) {
            this.postiBarca[i] = new PostoBarca(i);
        }
        this.postiOccupati = 0;
    }

    public void assegnaPosto(Barca b) {

        if (this.postiOccupati == 15) {
            System.out.println("Non ci sono posti disponibili!");
            return;
        }

        int i = 0;
        while (i < 15 && this.postiBarca[i].isOccupato()) {
            i++;
        }

        this.postiBarca[i].setOccupato(true);
        this.barche[i] = b;
        this.postiOccupati++;
        System.out.println("Posto assegnato alla barca " + b.getNome() + " al posto " + i);
    }

    public void liberaPosto(int i, int giorniSosta) {

        if (i < 0 || i >= 15) {
            System.out.println("Il posto specificato non esiste!");
            return;
        }

        if (!this.postiBarca[i].isOccupato()) {
            System.out.println("Il posto specificato non è occupato!");
            return;
        }

        Barca b = this.barche[i];
        double costo;
        if (b.getTipologia().equals("vela")) {
            costo = giorniSosta * b.getLunghezza() * 10;
        } else {
            costo = giorniSosta * b.getStazza() * 20;
        }

        this.postiBarca[i].setOccupato(false);
        this.barche[i] = null;
        this.postiOccupati--;
        System.out.println("Posto liberato. Costo dell'affitto: " + costo + " €");
    }

    public void cercaBarca(int i) {

        if (i < 0 || i >= 15) {
            System.out.println("Il posto specificato non esiste!");
            return;
        }

        if (!this.postiBarca[i].isOccupato()) {
            System.out.println("Il posto specificato non è occupato!");
            return;
        }

        Barca b = this.barche[i];
        System.out.println("Nome: " + b.getNome());
        System.out.println(" Nazionalità: " + b.getNazionalita());
        System.out.println(" Lunghezza: " + b.getLunghezza());
        System.out.println(" Stazza: " + b.getStazza());
        System.out.println(" Tipologia: " + b.getTipologia());
    }

    public int contaPosti() {
        return this.postiOccupati;
    }

    public void stampaLista(String nazionalita) {
        System.out.println("Elenco delle barche di nazionalità " + nazionalita + ":");
        for (int i = 0; i < 15; i++) {
            if (this.postiBarca[i].isOccupato() && this.barche[i].getNazionalita().equals(nazionalita)) {
                System.out.println(this.barche[i].getNome() + " (posto " + i + ")");
            }
        }
    }
}