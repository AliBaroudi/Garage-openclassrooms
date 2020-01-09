package option;

import java.io.Serializable;

public  class GPS implements Option, Serializable {

    @Override
    public Double getPrix() {
        return 150.20;
    }

    @Override
    public String toString() {
        return "GPS (" + getPrix() + "€)";
    }

}
