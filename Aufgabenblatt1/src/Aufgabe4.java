/*
    Aufgabe 4) CodeDraw Bibliothek und Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe4 {

    public static void main(String[] args) {
        AufgabeA();
    }

    public static void AufgabeA(){
        int pixelWidth = 500;
        int pixelHeight = 500;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);

        int numLinesQuadrant = 5;

        for (int i = 1; i <= numLinesQuadrant; i++) {
            //CYAN quadrant (top left)
            myDrawObj.setColor(Palette.CYAN);
            myDrawObj.drawLine(i * (pixelWidth / 2.0 / numLinesQuadrant), 0, 0, pixelHeight / 2.0 - ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant)));

            //TODO: Implement MAGENTA quadrant (bottom left) herew2a!
            myDrawObj.setColor(Palette.MAGENTA);
            myDrawObj.drawLine((250 + (i-1) * (pixelWidth / 2.0 / numLinesQuadrant)), 0, 500,  ((i  * (pixelHeight / 2.0 / numLinesQuadrant))));


            //TODO: Implement the GREEN quadrant (top right) here
            myDrawObj.setColor(Palette.GREEN);
            myDrawObj.drawLine(500, (250 + (i-1) * (pixelHeight / 2.0 / numLinesQuadrant)),pixelWidth  - ((i) * (pixelWidth / 2.0 / numLinesQuadrant)) , 500);

            //TODO: Implement the ORANGE quadrant (bottom right) here
            myDrawObj.setColor(Palette.ORANGE);
            myDrawObj.drawLine(pixelWidth/2 - ((i-1) * (pixelWidth / 2.0 / numLinesQuadrant)), 500,0 , pixelWidth  - ((i) * (pixelWidth / 2.0 / numLinesQuadrant)));

        }

        myDrawObj.setLineWidth(2);
        myDrawObj.setColor(Palette.BLACK);
        myDrawObj.drawLine(pixelWidth / 2.0, 0, pixelWidth / 2.0, pixelHeight);//vertical line
        myDrawObj.drawLine(0, pixelHeight / 2.0, pixelWidth, pixelHeight / 2.0);//horizontal line

        myDrawObj.show();
    }
}
