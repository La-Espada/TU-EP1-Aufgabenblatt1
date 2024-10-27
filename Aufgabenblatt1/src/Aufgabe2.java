/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        String text = "Eine nennenswerte und geeignete Sprache.";
        String text1 = "Anzahl der Zeichen ist nicht genug!";
        System.out.println("Aufgabe A");
        AufgabeA(text,text1);
        System.out.println("Aufgabe B");
        AufgabeB(text,text1);
        System.out.println("Aufgabe C");
        AufgabeC();

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    public static void AufgabeA(String text, String text1){
        int i =0;
        int j = 0;
        String ausgabe1="";
        String ausgabe2="";
        while(i<text.length()){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o' || text.charAt(i) == 'O' ||text.charAt(i) == 'u' || text.charAt(i) == 'U'){
                ausgabe1 += "-" + text.charAt(i);
            }
            else {
                ausgabe1 += text.charAt(i);
            }
           i++;
        }
        System.out.println(ausgabe1);

        while(j<text1.length()){
            if(text1.charAt(j) == 'a' || text1.charAt(j) == 'A' || text1.charAt(j) == 'e' || text1.charAt(j) == 'E' || text1.charAt(j) == 'i' || text1.charAt(j) == 'I' || text1.charAt(j) == 'o' || text1.charAt(j) == 'O' || text1.charAt(j) == 'u' || text1.charAt(j) == 'U'){
                ausgabe2 += "-" + text1.charAt(j);
            }
            else {
                ausgabe2 += text1.charAt(j);
            }
            j++;
        }
        System.out.println(ausgabe2);
    }

    private static void AufgabeB(String text, String text1){
        int i = 0;
        int j = 0;
        String ausgabe1="";
        String ausgabe2="";

        while(i<text.length()){
            if((text.charAt(i) > 'j') && (text.charAt(i) <='z') || (text.charAt(i) >'J' && text.charAt(i)<='Z')){
                ausgabe1 += text.charAt(i);
            }
            i++;
        }
        System.out.println(ausgabe1);

        while(j<text1.length()){
            if((text1.charAt(j) > 'j') && (text1.charAt(j) <='z') || (text1.charAt(j) >'J' && text1.charAt(j)<='Z')){
                ausgabe2 += text1.charAt(j);
            }
            j++;
        }
        System.out.println(ausgabe2);
    }

    private static void AufgabeC(){
        int i = 35;
        String ausgabe = "";
        while(i<175){
            if(i%5 == 0 && i%7 == 0){
                ausgabe = ausgabe + i + " ";
            }
            i++;
        }
        System.out.println(ausgabe);
    }
}






