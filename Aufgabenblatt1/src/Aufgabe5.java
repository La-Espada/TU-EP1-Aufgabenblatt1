/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des CodeDraw-Fensters
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe5 {

    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        Aufgabe(5);
    }

    public static void Aufgabe(int n){
        CodeDraw myDrawObj = new CodeDraw(300, 300);
        if(n >= 5 && n <= 19 && (n % 2)!=0){
            float numSquareRed = 300/n;
            float numSquareBlue = 300/n;

            for(int i = 0; i<n-1; i++){
                myDrawObj.setColor(Palette.RED);
                myDrawObj.setLineWidth(4);
                myDrawObj.drawSquare(0+i*numSquareRed,1,numSquareRed);
            }

            int middle = Math.round(n/2);
            myDrawObj.setColor(Palette.RED);
            myDrawObj.setLineWidth(4);
            myDrawObj.drawSquare(middle*numSquareRed,300-numSquareRed, numSquareRed);


            /*
            for(int i = 0; i < n-3; i++){

                    myDrawObj.setColor(Palette.RED);
                    myDrawObj.setLineWidth(4);
                    myDrawObj.drawSquare(middle*numSquareRed-numSquareRed,300-numSquareRed, numSquareRed);

                    myDrawObj.setColor(Palette.RED);
                    myDrawObj.setLineWidth(4);
                    myDrawObj.drawSquare(middle*numSquareRed,300-i*numSquareRed, numSquareRed);

            }

             */

            /*
            for(int i = 0; i <n; i++){
                myDrawObj.setColor(Palette.BLUE);
                myDrawObj.setLineWidth(2);
                myDrawObj.drawSquare(300-(i+1)*numSquareBlue,0+i*numSquareBlue, numSquareBlue);
            }

             */



        }
        myDrawObj.show();

    }

}
