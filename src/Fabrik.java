
public class Fabrik {

    private  Produkt[] arrayOfProdukts;

    private Produkt[] a=new Produkt[3];
    private Produkt[] b=new Produkt[3];
    private Produkt[] c=new Produkt[3];
    int index1=0;
    int index2=0;
    int index3=0;

    public Fabrik(Produkt[] arrayOfProdukts) {
        this.arrayOfProdukts = arrayOfProdukts;
    }

    /**
     *  ubung 1, sortiert die liste von produkte aus der fabrik, in function von ihrer durschnitt von nachfrage
     * @return a sorted array
     */
    public  Produkt[] sortiereProdukte()
    {
        boolean sortiert=false;
        Produkt temp;
        while(!sortiert) {
            sortiert = true;
            for (int i = 0; i < this.arrayOfProdukts.length - 1; i++) {
                if(this.arrayOfProdukts[i].getDurchschnittNachfrage()>this.arrayOfProdukts[i+1].getDurchschnittNachfrage())
                {
                    temp=this.arrayOfProdukts[i];
                    this.arrayOfProdukts[i]=this.arrayOfProdukts[i+1];
                    this.arrayOfProdukts[i+1]=temp;
                    sortiert=false;
                }

            }
        }

        return this.arrayOfProdukts;

    }

    /**
     * ubung 2 , ordnet in funktion von kategorien zu, mithilfe von 3 HilfsIndexes*
     *
     */
    public void zuordnungKategorie()
    {
        for(Produkt produkt:arrayOfProdukts)
        {
            if(produkt.getTotalNachfrage()==1) {
                a[index1] = produkt;
                index1++;
            }
            else if (produkt.getTotalNachfrage()==2) {
                b[index2] =produkt;
                index2++;
            }
            else
            {
                c[index3]=produkt;
                index3++;
            }
        }

        System.out.println("Array:");
        if(index3>0) {
            for (Produkt produkt : c) {
                produkt.toStr();
            }
        }
        if(index2>0)
            for (Produkt produkt:b)
            {
                produkt.toStr();
            }
        if(index1>0)
            for(Produkt produkt: a)
            {
                produkt.toStr();
            }

    }

    /**
     * Liefert die optimaleZahl fur jedes Produkt;
     */
    public void lieferungOptimaleZahlAufScreen()
    {
        for(Produkt produkt:arrayOfProdukts)
        {
            System.out.println(produkt.optimaleProduktionszahlberechnen());
        }
    }



}
