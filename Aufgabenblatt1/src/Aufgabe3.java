/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe3 {

    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        fuchsHasenSimulation(1500,2500,2);
    }

    public static void fuchsHasenSimulation(int maxCap, int numRabbits, int numFoxes){
        int dt = 1;
        double freeCap;
        double incRabbits;
        double decFoxes;
        double numContacts;
        double numRabbitsA;
        double numFoxesA;

        for (int i = 0; i < 500; i++){
            freeCap = maxCap - numRabbits;
            incRabbits = (1.0 / maxCap) * freeCap * 0.08 * numRabbits;
            decFoxes = 0.2 * numFoxes;
            numContacts = numRabbits * numFoxes;
            numRabbitsA = numRabbits + dt * (incRabbits - 0.002 * numContacts);
            numFoxesA = numFoxes + dt * (0.0004 * numContacts - decFoxes);
            System.out.println("Iteration: " + i + " freeCap: " + freeCap + " numRabbits: " + numRabbitsA + " numFoxes: " + numFoxesA);
        }
    }

    public static void generateStar(double hasenAnzahl){

    }

    public static void generateHashTag(){

    }
}
