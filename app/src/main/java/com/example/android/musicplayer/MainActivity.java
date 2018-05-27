package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a list of Songs.
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Package", "A Perfect Circle", "Thirteenth Step"));
        songs.add(new Song("The Noose", "A Perfect Circle", "Thirteenth Step"));
        songs.add(new Song("Pet", "A Perfect Circle", "Thirteenth Step"));
        songs.add(new Song("The Noose", "A Perfect Circle", "Thirteenth Step"));
        songs.add(new Song("The Contrarian", "A Perfect Circle", "Eat the Elephant"));
        songs.add(new Song("Hourglass", "A Perfect Circle", "Eat the Elephant"));
        songs.add(new Song("Get the Lead Out!", "A Perfect Circle", "Eat the Elephant"));
        songs.add(new Song("Pictures of You", "The Cure", "Disintegration"));
        songs.add(new Song("Lullaby", "The Cure", "Disintegration"));
        songs.add(new Song("Fascination Street", "The Cure", "Disintegration"));
        songs.add(new Song("Out of This World", "The Cure", "Blood Flowers"));
        songs.add(new Song("Maybe Someday", "The Cure", "Blood Flowers"));
        songs.add(new Song("The Loudest Sound", "The Cure", "Blood Flowers"));
        songs.add(new Song("Tessellate", "alt-J", "An Awesome Wave"));
        songs.add(new Song("Fitzpleasure", "alt-J", "An Awesome Wave"));
        songs.add(new Song("Taro", "alt-J", "An Awesome Wave"));
        songs.add(new Song("Nara", "alt-J", "This is All Yours"));
        songs.add(new Song("Hunger of the Pine", "alt-J", "This is All Yours"));
        songs.add(new Song("The Gospel of John Hurt", "alt-J", "This is All Yours"));
        songs.add(new Song("Flume", "Bon Iver", "For Emma, Forever Ago"));
        songs.add(new Song("Skinny Love", "Bon Iver", "For Emma, Forever Ago"));
        songs.add(new Song("For Emma", "Bon Iver", "For Emma, Forever Ago"));
        songs.add(new Song("Perth", "Bon Iver", "Bon Iver"));
        songs.add(new Song("Minnesota, WI", "Bon Iver", "Bon Iver"));
        songs.add(new Song("Holocene", "Bon Iver", "Bon Iver"));
        songs.add(new Song("Green Valley", "Puscifer", "Conditions of My Parole"));
        songs.add(new Song("Horizons", "Puscifer", "Conditions of My Parole"));
        songs.add(new Song("Man Overboard", "Puscifer", "Conditions of My Parole"));
        songs.add(new Song("World in My Eyes", "Depeche Mode", "Violator"));
        songs.add(new Song("Personal Jesus", "Depeche Mode", "Violator"));
        songs.add(new Song("Policy of Truth", "Depeche Mode", "Violator"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
