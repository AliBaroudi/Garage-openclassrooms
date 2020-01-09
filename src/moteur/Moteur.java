package moteur;

public class Moteur {

    private TypeMoteur type;
    private String cylindre;
    private Double prix;

    public Moteur(TypeMoteur type, String cylindre, Double prix){
        this.type = type;
        this.cylindre = cylindre;
        this.prix = prix;
    }
    public String toString(){
        return "Moteur" + type + " "+ cylindre + "(" + prix + "€) ";
    }

    public Double getPrix(){
        return prix;
    }


    
}
