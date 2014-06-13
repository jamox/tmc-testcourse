
import matopeli.Matopeli;
import java.util.ArrayList;
import matopeli.Pala;

public class Matoaly {

    public String annaSiirto(Matopeli matopeli) {
        // vaihtoehtoja ovat: YLOS, ALAS, VASEN, OIKEA
        
        int[][] pelialue = matopeli.annaAlusta();
        // voit käyttää allaolevaa tulostusta pelialueen tulostamiseen konsoliin
//        for (int y = pelialue[0].length - 1; y >= 0; y--) {
//            for (int x = 0; x < pelialue.length; x++) {
//                if(pelialue[x][y] >= 0) {
//                    System.out.print(" ");
//                }
//                System.out.print(pelialue[x][y]);
//            }
//            
//            System.out.println("");
//        }
//        System.out.println("");
        
        // STUB: return "YLOS";
        
        // BEGIN SOLUTION
        int matoX = matopeli.matoX();
        int matoY = matopeli.matoY();

        // yritetään mennä ensin omenaa kohti vaakatasossa
        int omenaX = matopeli.omenaX();
        if (matoX < omenaX && pelialue[matoX + 1][matoY] >= 0) {
            return "OIKEA";
        }

        if (matoX > omenaX && pelialue[matoX - 1][matoY] >= 0) {
            return "VASEN";
        }

        // sitten pystytasossa
        int omenaY = matopeli.omenaY();
        if (matoY < omenaY && pelialue[matoX][matoY + 1] >= 0) {
            return "YLOS";
        }

        if (matoY > omenaY && pelialue[matoX][matoY - 1] >= 0) {
            return "ALAS";
        }

        // omenaa kohti liikkuminen ei onnistunut, etsitään suunta mitä
        // kohti voidaan liikkua
        if (matoX + 1 < pelialue.length && pelialue[matoX + 1][matoY] >= 0) {
            return "OIKEA";
        }

        if (matoX - 1 >= 0 && pelialue[matoX - 1][matoY] >= 0) {
            return "VASEN";
        }

        if (matoX + 1 < pelialue[matoY].length && pelialue[matoX][matoY + 1] >= 0) {
            return "YLOS";
        }

        if (matoY - 1 >= 0 && pelialue[matoX][matoY - 1] >= 0) {
            return "ALAS";
        }

        // jos suuntaa ei löydy, mennään ylös
        return "YLOS";
        // END SOLUTION
    }
}
