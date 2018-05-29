package com.example.android.musicplayer;

public class Artist {

    /** Name of Artist */
    private String mArtistName;

    /** Artwork for artist */
    private int mArtistImg;

    /**
     * Create a new artist object
     *
     * @param artistName the name of the artist
     *
     * @param artistImg the artwork for the artist
     */
    public Artist(String artistName, int artistImg) {
        mArtistName = artistName;
        mArtistImg = artistImg;
    }

    /** Get artist name */
    public String getArtistName() {
        return mArtistName;
    }

    /** Get artist artwork */
    public int getArtistImg() {
        return mArtistImg;
    }
}
