package com.picodiploma.mhabib.submission2made;

import java.util.ArrayList;

public class MoviesData {
    public static String[][] arrayMovies = new String[][]{
            {"https://icon-icons.com/icons2/2000/PNG/128/cool_smiley_sunglasses_icon_123402.png", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
            {"https://icon-icons.com/icons2/2000/PNG/128/heart_love_smiley_icon_123396.pn", "2", "3", "4", "5","6"},
    };

    public static ArrayList<Movies> getListMovies(){
        ArrayList<Movies> listMovie = new ArrayList<>();
        for (String[] aData :arrayMovies){
            Movies movies = new Movies(  );
            movies.setTitleMovie( aData[0] );
            movies.setGenreMovie( aData[1] );
            movies.setRatingMovie( aData[2] );
            movies.setDescMovie( aData[3] );
            movies.setReleaseDateMovie( aData[4] );
            movies.setImgMovie( aData[5] );

            listMovie.add( movies );

        }
        return listMovie;
    }
}
