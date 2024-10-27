/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;
import org.w3c.dom.ls.LSOutput;

public class Aufgabe3 {

    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        fuchsHasenSimulation(1500,2500,2);

    }

    public static void fuchsHasenSimulation(int maxCap, double numRabbits, double numFoxes){
        int dt = 1;
        double freeCap;
        double incRabbits;
        double decFoxes;
        double numContacts;
        double numRabbitsA;
        double numFoxesA;

        for (int i = 1; i <= 500; i++){
            freeCap = maxCap - numRabbits;
            incRabbits = (1.0 / maxCap) * freeCap * 0.08 * numRabbits;
            decFoxes = 0.2 * numFoxes;
            numContacts = numRabbits * numFoxes;
            numRabbitsA = numRabbits + dt * (incRabbits - 0.002 * numContacts);
            numFoxesA = numFoxes + dt * (0.0004 * numContacts - decFoxes);
            numFoxes = numFoxesA;
            numRabbits = numRabbitsA;
            System.out.format("Iteration: " + i + " freeCap: %.2f" + " numRabbits: %.2f" + " numFoxes: %.2f%n", freeCap, numRabbits, numFoxes);
            generateStar(numRabbits);
            generateHashTag(numFoxes);
        }
    }

    public static void generateStar(double numRabbits){
        double anzahlSterne = numRabbits/5;
        int roundAnzahl = (int) Math.round(anzahlSterne);
        String output = "";
        for(int i = 0; i <roundAnzahl; i++){
            output += "*";
        }
        System.out.println(output);
    }

    public static void generateHashTag(double numFoxes){
        double numHashTags = numFoxes/0.4;
        int roundNum = (int) Math.round(numHashTags);
        String output = "";
        for(int i = 0; i<roundNum; i++){
            output +='#';
        }
        System.out.println(output);

    }
}
