package com.alex700.AWeather;

/**
 * Created by Алексей on 30.11.2014.
 */
public class City {
    private int id;
    private String name;
    private long updateDate;

    public City(int id, String name, long updateDate) {
        this.id = id;
        this.name = name;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getUpdateDate() {
        return updateDate;
    }
}
