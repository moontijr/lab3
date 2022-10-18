public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Produkt hemd=new Produkt(30,22,40,35);
        Produkt ball=new Produkt(50,49,60,60);
        Produkt[] arrayVonProdukte= new Produkt[3];
        arrayVonProdukte[0]=hemd;
        arrayVonProdukte[1]=ball;
        arrayVonProdukte[2]=hemd;
        Fabrik fabrik=new Fabrik(arrayVonProdukte);
        fabrik.sortiereProdukte();
        for(Produkt produkt:arrayVonProdukte)
            System.out.println(produkt.getDurchschnittNachfrage());

        System.out.println(" ");
        Produkt[] arrayVonProdukte1=new Produkt[3];
        arrayVonProdukte1[0]=hemd;
        arrayVonProdukte1[1]=hemd;
        arrayVonProdukte1[2]=ball;
        Fabrik fabrik1=new Fabrik(arrayVonProdukte1);

        fabrik1.lieferungOptimaleZahlAufScreen();


        fabrik1.zuordnungKategorie();

    }
}

