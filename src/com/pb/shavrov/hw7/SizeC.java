package com.pb.shavrov.hw7;

public enum SizeC {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int evroSizw;
    private String description;

    SizeC(int evroSizw, String description) {
        this.evroSizw = evroSizw;
        this.description = description;
    }

    public final String getDescription() {
        return description;
    }

    public final int getEuroSize() {
        return evroSizw;
    }

    @Override
    public String toString() {
        return "европейский размер = " + evroSizw + ", " + description;
    }
}
