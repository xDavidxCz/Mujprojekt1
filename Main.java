package MojeVlastniPrace;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Faktura za odběr zboží");

        String item,item2,item3,item4;

        item = "Boty Nike";
        item2 = "Kalhoty Puma";
        item3 = "Tričko Puma";
        item4 = "Mikina Under Armour";

        int pricePerPiece = 780;
        int pricePerPiece1 = 620;
        int pricePerPiece2 = 450;
        int pricePerPiece3 = 900;

        int celkem = (780 + 620 + 450 + 900);


        BigDecimal pricePerPieceitem, pricePerPieceitem2, pricePerPieceitem3, pricePerPieceitem4;



        pricePerPieceitem = BigDecimal.valueOf(780);
        System.out.println(item + " stojí " + pricePerPieceitem);
        pricePerPieceitem2 = BigDecimal.valueOf(620);
        System.out.println( item2 + " stojí " + pricePerPieceitem2);
        pricePerPieceitem3 = BigDecimal.valueOf(450);
        System.out.println(item3 + " stojí " + pricePerPieceitem3);
        pricePerPieceitem4 = BigDecimal.valueOf(900);
        System.out.println(item4 + " stojí " + pricePerPieceitem4);



        System.out.println("Celková částka k úhradě činní " + celkem );

        LocalDate date = LocalDate.of(2022,4,15);







    }







    }
