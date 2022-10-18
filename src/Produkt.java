public class Produkt {
    private int produzierteJahr1;
    private int verkaufteJahr1;
    private int produzierteJahr2;
    private int verkaufteJahr2;

    public Produkt(int produzierteJahr1, int verkaufteJahr1, int produzierteJahr2, int verkaufteJahr2) {
        this.produzierteJahr1 = produzierteJahr1;
        this.verkaufteJahr1 = verkaufteJahr1;
        this.produzierteJahr2 = produzierteJahr2;
        this.verkaufteJahr2 = verkaufteJahr2;
    }

    public int getProduzierteJahr1() {
        return produzierteJahr1;
    }

    public void setProduzierteJahr1(int produzierteJahr1) {
        this.produzierteJahr1 = produzierteJahr1;
    }

    public int getVerkaufteJahr1() {
        return verkaufteJahr1;
    }

    public void setVerkaufteJahr1(int verkaufteJahr1) {
        this.verkaufteJahr1 = verkaufteJahr1;
    }

    public int getProduzierteJahr2() {
        return produzierteJahr2;
    }

    public void setProduzierteJahr2(int produzierteJahr2) {
        this.produzierteJahr2 = produzierteJahr2;
    }

    public int getVerkaufteJahr2() {
        return verkaufteJahr2;
    }

    public void setVerkaufteJahr2(int verkaufteJahr2) {
        this.verkaufteJahr2 = verkaufteJahr2;
    }
    public double getNachfrageJahr1()
    {
        double verkaufte1=this.verkaufteJahr1;
        double produzierte1=this.produzierteJahr1;
        return (produzierte1/verkaufte1)*100;
    }
    public double getNachfrageJahr2()
    {
        double verkaufte2=this.verkaufteJahr2;
        double produzierte2=this.produzierteJahr2;
        return (produzierte2/verkaufte2)*100;
    }


    /**
     * Hilfsfunktion fur die 3 falle a b c fur 1 produkt
     * @return int
     */
    public int getTotalNachfrage()
    {
        if(this.getNachfrageJahr2()>this.getNachfrageJahr1())
            return 1; //FALL a
        else if (this.getNachfrageJahr2()==this.getNachfrageJahr1()) {
            return 2; //FALL b
        }
        else
        {
            return 3; //FALL c
        }
    }


    /**
     * Es nimmt das Durschnitt der Nachfrage
     * @return ein double
     */
    public double getDurchschnittNachfrage()
    {
        return this.getNachfrageJahr1()/this.getNachfrageJahr2();
    }

    /**
     * ubung 3, berechnet die optimale produktionszahl fur das nachste jahr
     * @return double
     */
    public double optimaleProduktionszahlberechnen()
    {
        double optimal;
        if(this.getTotalNachfrage()==1)
        {
            optimal=this.verkaufteJahr2 + 0.5 * this.verkaufteJahr2;
        }
        else if (this.getTotalNachfrage()==2) {
            optimal=this.verkaufteJahr2 + 0.1 * this.verkaufteJahr2;
        }
        else
        {
            optimal = this.verkaufteJahr2 - 0.1 * this.verkaufteJahr2;
        }
        return optimal;

    }

    public void toStr()
    {
        System.out.println("Produs ");
    }






}
