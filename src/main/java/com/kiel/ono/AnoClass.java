package com.kiel.ono;

public class AnoClass {
    private String heya;

    private String nonono;

    public AnoClass(){

    }
    public AnoClass(String heya, String nonono) {
        this.heya = heya;
        this.nonono = nonono;
    }

    @Override
    public String toString() {
        return "AnoClass{" +
                "heya='" + heya + '\'' +
                ", nonono='" + nonono + '\'' +
                '}';
    }
}
