package org.example.demo8.Model;

public enum Quality {
    low(360), medium(720), high(1080);

    final int quality;

    public int getQuality() {return quality;}

    Quality(int quality) {
        this.quality = quality;
    }
}
