package option;

import java.io.Serializable;

public  class BarreDeToit implements Option, Serializable {

    @Override
    public Double getPrix() {
        return 105.10;
    }

    @Override
    public String toString() {
        return "BarreDeToit (" + getPrix() + "€)";
    }
}
