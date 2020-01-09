package option;

import java.io.Serializable;

public  class VitreElectrique implements Option, Serializable {

    public Double getPrix(){
        return 200.50;
    }


    public String toString(){
        return "Vitre Electrique (" + getPrix() + "€)";
    }
}
