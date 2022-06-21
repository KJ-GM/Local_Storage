package com.example.localstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car1 = new Car();
        car1.setName("BMW");
        car1.setEngine(23.2F);
        car1.setYear(2022);

        Car car2 = new Car();
        car2.setName("Fiat");
        car2.setEngine(13.2F);
        car2.setYear(2020);

        App.getInstance().getAppDatabase().getCarDao().insert(car1,car2);

        List<Car> allCars = App.getInstance().getAppDatabase().getCarDao().getAllCars();

        for (int i = 0; i <allCars.size() ; i++) {
            Log.d("My Cars", allCars.get(i).toString());
        }


    }


}