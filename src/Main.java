import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
           // Crea una scelta da far fare all'utente
           System.out.print("\n1) Inserisci dati nella rubrica: ");
           System.out.print("\n2) Esci");
           // Prendi in ingresso la scelta
           input = in.nextLine();

           switch (input) {
               case "1" -> {
                   // Chiedi all'utente d'inserire il nome e il cognome
                   System.out.print("Inserisci il tuo nome: ");
                   String nome = in.nextLine();
                   System.out.print("Inserisci il tuo cognome: ");
                   String cognome = in.nextLine();

                   // Crea una persona che prende i dati da inserire
                   Persona p1 = new Persona(nome, cognome);

                   // Crea un nuovo file di testo e scrivi il nome e il cognome al suo interno
                   try {
                       FileWriter fileWriter = new FileWriter("DatiPersone.txt");
                       PrintWriter printWriter = new PrintWriter(fileWriter);
                       printWriter.println(p1.getNome() + " " + p1.getCognome());
                       printWriter.close();
                       System.out.println("I tuoi dati sono stati salvati nel file DatiPersone.txt.");
                   } catch (IOException e) {
                       System.out.println("Si è verificato un errore durante la scrittura del file.");
                       e.printStackTrace();
                   }
               }
           }
        }while (!input.equals("2")) ;
    }
}