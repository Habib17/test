package com.picodiploma.mhabib.submission2made;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private ArrayList<Movies> listMovies;

    public ListHeroAdapter(ArrayList<Movies> listMovies){
        this.listMovies = listMovies;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.item_row_movie, viewGroup, false );
        return new ListViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Movies movies = listMovies.get( position );

        Glide.with( holder.itemView.getContext() )
                .load( movies.getImgMovie() )
                .apply( new RequestOptions().override( 55, 55 ) )
                .into( holder.imgMovie );
        holder.tvTitleMovie.setText( movies.getTitleMovie() );
        holder.tvGenreMovie.setText( movies.getGenreMovie() );
        holder.tvRatingMovie.setText( movies.getRatingMovie() );
        holder.tvDescMovie.setText( movies.getDescMovie() );
        holder.tvReleaseDate.setText( movies.getReleaseDateMovie());
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMovie;
        TextView tvTitleMovie, tvGenreMovie, tvRatingMovie, tvDescMovie, tvReleaseDate;
        public ListViewHolder(@NonNull View itemView) {
            super( itemView );
            imgMovie = itemView.findViewById( R.id.img_item_movie );
            tvTitleMovie = itemView.findViewById( R.id.tv_item_title_movie );
            tvGenreMovie = itemView.findViewById( R.id.tv_item_genre_movie );
            tvRatingMovie = itemView.findViewById( R.id.tv_item_rating_movie );
            tvDescMovie = itemView.findViewById( R.id.tv_item_desc_movie );
            tvReleaseDate = itemView.findViewById( R.id.tv_item_release_date );
        }
    }
}
