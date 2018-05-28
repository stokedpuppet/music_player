package com.example.android.musicplayer;

public class Artist {

    /** Name of Artist */
    private String mArtistName;

    /** Artwork for artist */
    private int mArtistArtwork;

    /**
     * Create a new artist object
     *
     * @param artistName the name of the artist
     *
     * @param artistArtwork the artwork for the artist
     */
    public Artist(String artistName, int artistArtwork) {
        mArtistName = artistName;
        mArtistArtwork = artistArtwork;
    }

    /** Get artist name */
    public String getArtistName() {
        return mArtistName;
    }

    /** Get artist artwork */
    public int getArtistArtwork() {
        return mArtistArtwork;
    }
}
