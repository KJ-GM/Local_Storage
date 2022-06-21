package com.example.localstorage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Car {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "CAR_ID")
    private Long id;

    @ColumnInfo(name = "CAR_ENGINE")
    private Float engine;

    @ColumnInfo(name = "CAR_NAME")
    private String name;

    @ColumnInfo(name = "CAR_YEAR")
    private Integer year;


    public Car() {

    }


    public Car(Long id, Float engine, String name, Integer year) {
        this.id = id;
        this.engine = engine;
        this.name = name;
        this.year = year;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getEngine() {
        return engine;
    }

    public void setEngine(Float engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
