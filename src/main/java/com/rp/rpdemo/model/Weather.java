package com.rp.model;

public class Weather {

    private int id;
    private Geolocation geolocation;

    private int temp;
    private int chill;
    private int humidity;

    public Weather() {
    }

    public Weather(int id, Geolocation geolocation, int temp, int chill, int humidity) {
        this.id = id;
        this.geolocation = geolocation;
        this.temp = temp;
        this.chill = chill;
        this.humidity = humidity;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setChill(int chill) {
        this.chill = chill;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getId() {
        return id;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public int getTemp() {
        return temp;
    }

    public int getChill() {
        return chill;
    }

    public int getHumidity() {
        return humidity;
    }
}
