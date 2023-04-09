import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Porto Test = new Porto();
        Scanner scanner = new Scanner(System.in);

        int scelta;

        do{
            System.out.println("\n1. Assegna posto a una barca");
            System.out.println("2. Libera posto e calcola affitto");
            System.out.println("3. Cerca informazioni sulla barca in un posto");
            System.out.println("4. Conta i posti barca occupati");
            System.out.println("5. Stampa elenco delle barche di una certa nazionalità");
            System.out.println("0. Esci dal programma");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("\nInserisci il nome della barca: ");
                    String nome = scanner.next();
                    System.out.print("\nInserisci la nazionalità della barca: ");
                    String nazionalita = scanner.next();
                    System.out.print("\nInserisci la lunghezza della barca (in metri): ");
                    double lunghezza = scanner.nextDouble();
                    System.out.print("\nInserisci la stazza della barca (in tonnellate): ");
                    double stazza = scanner.nextDouble();
                    System.out.print("\nInserisci la tipologia della barca (vela o motore): ");
                    String tipologia = scanner.next();
                    Barca b = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);
                    Test.assegnaPosto(b);

                    break;

                case 2:
                    System.out.print("\nInserisci il numero del posto da liberare: ");
                    int posto = scanner.nextInt();
                    System.out.print("\nInserisci il numero di giorni di sosta: ");
                    int giorni = scanner.nextInt();
                    Test.liberaPosto(posto, giorni);

                    break;

                case 3:
                    System.out.print("\nInserisci il numero del posto da cercare: ");
                    posto = scanner.nextInt();
                    Test.cercaBarca(posto);

                    break;

                case 4:
                    int postiOccupati = Test.contaPosti();
                    System.out.println("\nPosti barca occupati: " + postiOccupati);

                    break;

                case 5:
                    System.out.print("\nInserisci la nazionalità delle barche da cercare: ");
                    nazionalita = scanner.next();
                    Test.stampaLista(nazionalita);

                    break;

                case 0: System.out.println("\nArrivederci!");
                    break;

                default: System.out.println("\nOpzione non valida!");
                    break;

            }
        } while(scelta != 0);
    }
}