package com.pb.shavrov.hw7;

public enum Size {
    XXS (32, "Детский размер"),
    XS (34, "Взрослый размер"),
    S (36, "Взрослый размер"),
    M (38, "Взрослый размер"),
    L (40, "Взрослый размер");

    private int evroSizw;
    private String description;

    Size(int evroSizw, String description) {
        this.evroSizw = evroSizw;
        this.description = description;
    }

    public final String getDescription(){

        return null;
    }

    public final void getEuroSize(){

    }

    @Override
    public String toString() {
        return "европейский размер = " + evroSizw + ", " + description ;
    }
}
