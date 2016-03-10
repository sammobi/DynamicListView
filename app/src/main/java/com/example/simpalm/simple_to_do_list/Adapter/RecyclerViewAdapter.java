package com.example.simpalm.simple_to_do_list.Adapter;

import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.simpalm.simple_to_do_list.MovieModel;
import com.example.simpalm.simple_to_do_list.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simpalm on 3/9/16.
 */


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecycleViewHolder> {

    List<MovieModel> moviesList = new ArrayList<>();

    public RecyclerViewAdapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new RecycleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        MovieModel movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public RecycleViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


}
