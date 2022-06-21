package com.example.localstorage;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface CarDao {

    @Query("SELECT * FROM CAR")
    List<Car> getAllCars();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert (Car... car);

    @Delete
    void delete(Car car);

    @Query("DELETE FROM CAR")
    void deleteAll();

    @Query("Select * FROM CAR C Where C.CAR_NAME LIKE :name AND C.CAR_ENGINE > :engine LIMIT 1")
    Car getByNameAndEngine(String name, Float engine);
}
