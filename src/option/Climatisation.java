package option;

import java.io.Serializable;

public  class Climatisation implements Option, Serializable {

    @Override
    public Double getPrix() {
        return 160.77;
    }

    @Override
    public String toString() {
        return "Climatisation (" + getPrix() + "€)";
    }
}
