/*
    Aufgabe 1) for-Schleifen
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        System.out.println("Aufgabe 1 a");
        AufgabeA();
        System.out.println("Aufgabe 1 b");
        AufgabeB();
        System.out.println("Aufgabe 1 c");
        AufgabeC();
        System.out.println("Aufgabe 1 d");
        AufgabeD();
    }

    public static void AufgabeA(){
        int ergebnis = 0;
        for(int i = 21; i<420; i+=21){
            System.out.println(i);
            ergebnis +=i;
        }
        System.out.println(ergebnis);
    }

    public static void AufgabeB(){
        String ergebnis =":";
        for(int i = 45; i < 135;i+=5){
            if(i % 9 !=0){
                ergebnis= ergebnis+ i +":";
            }
        }
        System.out.println(ergebnis);
    }

    public static void AufgabeC(){
        String ausgabe = "";
        for(int i = 70; i>50; i--){
            char temp = (char) i;
            if(i == 51){
                ausgabe = ausgabe + temp;
            }
            else{
                ausgabe = ausgabe + temp + ",";
            }

        }
        System.out.println(ausgabe);
    }

    public static void AufgabeD(){
        String z = "Zehn zahme Ziegen zogen ziemlich z¨ugig zehn Zentner Zucker zum Zoo!";
        int ergebnis =0;
        for(int i = 0; i<z.length();i++){
            if(z.charAt(i)=='z' || z.charAt(i)=='Z'){
                ergebnis++;
            }
        }
        System.out.println(ergebnis);
    }
}
