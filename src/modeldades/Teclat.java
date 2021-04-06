package modeldades;

public class Teclat {

    //Les variables del meu objecte
    private String marca;
    private String model;
    private String llenguatje;
    private int num_tecles;
    private double preu;
    private boolean illuminacio;
    private boolean inalambric;

    //El constructor
    public Teclat(String marca, String model, String llenguatje, int num_tecles, int preu, boolean illuminacio, boolean inalambric) {
        this.marca = marca;
        this.model = model;
        this.llenguatje = llenguatje;
        this.num_tecles = num_tecles;
        this.preu = preu;
        this.illuminacio = illuminacio;
        this.inalambric = inalambric;
    }

    public Teclat() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLlenguatje() {
        return llenguatje;
    }

    public void setLlenguatje(String llenguatje) {
        this.llenguatje = llenguatje;
    }

    public int getNum_tecles() {
        return num_tecles;
    }

    public void setNum_tecles(int num_tecles) {
        this.num_tecles = num_tecles;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public boolean isIlluminacio() {
        return illuminacio;
    }

    public void setIlluminacio(boolean illuminacio) {
        this.illuminacio = illuminacio;
    }

    public boolean isInalambric() {
        return inalambric;
    }

    public void setInalambric(boolean inalambric) {
        this.inalambric = inalambric;
    }
}
