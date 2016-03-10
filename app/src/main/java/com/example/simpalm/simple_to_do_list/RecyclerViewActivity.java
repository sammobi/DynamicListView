package com.example.simpalm.simple_to_do_list;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.simpalm.simple_to_do_list.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<MovieModel> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        recyclerView = (RecyclerView) findViewById(R.id.sample_rcv);

        mAdapter = new RecyclerViewAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new MovieModel("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new MovieModel("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
