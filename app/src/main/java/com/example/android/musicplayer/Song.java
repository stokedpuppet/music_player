package com.example.android.musicplayer;

public class Song {
    /** Song title */
    private String mTitle;

    /** Song artist */
    private  String mArtist;

    /** Song album name */
    private String mAlbum;


    /**
     * * Create a new Song object.
     *
     * @param  title the name of the song
     *
     * @param artist the artist of the song
     *
     * @param album the album name of the song
     */
    public Song(String title, String artist, String album) {
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
    }

    /**
     * Get song title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get song artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get song's album name
     */
    public String getAlbum() {
        return mAlbum;
    }
}
