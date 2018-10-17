package com.tungphan.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeroes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    public void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,
                        LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        initData();
        HeroesAdapter adapter = new HeroesAdapter(mHeroes, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public void initData(){
        mHeroes = new ArrayList<>();
        mHeroes.add(new Hero(R.drawable.captain_america, getString(R.string.title_one)));
        mHeroes.add(new Hero(R.drawable.black_widow, getString(R.string.title_two)));
        mHeroes.add(new Hero(R.drawable.iron_man_3, getString(R.string.title_three)));
        mHeroes.add(new Hero(R.drawable.thor, getString(R.string.title_four)));
        mHeroes.add(new Hero(R.drawable.spider_man, getString(R.string.title_five)));
        mHeroes.add(new Hero(R.drawable.scarlet_witch, getString(R.string.title_six)));
    }
}
