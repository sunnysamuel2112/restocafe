package com.example.restocafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.restocafe.Adapters.MainAdapter;
import com.example.restocafe.Models.MainModel;
import com.example.restocafe.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.breakfast,"Omelette","5","beaten eggs cooked without stirring until set and served folded in half"));
        list.add(new MainModel(R.drawable.steak,"Steak","0","soft and juicy on the inside and firm on the outside"));
        list.add(new MainModel(R.drawable.salmon_zucchini,"Salmon Zucchini","35","beaten eggs cooked without stirring until set and served folded in half"));
        list.add(new MainModel(R.drawable.hero_1,"Soup","12","Thick and Creamy!"));
        list.add(new MainModel(R.drawable.hero_2,"Waffles","20","waffle,crisp raised cake baked in a waffle iron,a hinged metal griddle with a honeycombed"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}