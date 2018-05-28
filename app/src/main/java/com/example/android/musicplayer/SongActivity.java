package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        // Create a list of Songs.
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Package", "A Perfect Circle",
                "Thirteenth Step", R.drawable.aperfectcircle_thirteenthstep));
        songs.add(new Song("The Noose", "A Perfect Circle",
                "Thirteenth Step", R.drawable.aperfectcircle_thirteenthstep));
        songs.add(new Song("Pet", "A Perfect Circle",
                "Thirteenth Step", R.drawable.aperfectcircle_thirteenthstep));
        songs.add(new Song("The Contrarian", "A Perfect Circle",
                "Eat the Elephant", R.drawable.aperfectcircle_eattheelephant));
        songs.add(new Song("Hourglass", "A Perfect Circle",
                "Eat the Elephant", R.drawable.aperfectcircle_eattheelephant));
        songs.add(new Song("Get the Lead Out!", "A Perfect Circle",
                "Eat the Elephant", R.drawable.aperfectcircle_eattheelephant));
        songs.add(new Song("Pictures of You", "The Cure",
                "Disintegration", R.drawable.thecure_disintegration));
        songs.add(new Song("Lullaby", "The Cure",
                "Disintegration", R.drawable.thecure_disintegration));
        songs.add(new Song("Fascination Street", "The Cure",
                "Disintegration", R.drawable.thecure_disintegration));
        songs.add(new Song("Out of This World", "The Cure",
                "Blood Flowers", R.drawable.thecure_bloodflowers));
        songs.add(new Song("Maybe Someday", "The Cure",
                "Blood Flowers", R.drawable.thecure_bloodflowers));
        songs.add(new Song("The Loudest Sound", "The Cure",
                "Blood Flowers", R.drawable.thecure_bloodflowers));
        songs.add(new Song("Tessellate", "alt-J",
                "An Awesome Wave", R.drawable.altj_anawesomewave));
        songs.add(new Song("Fitzpleasure", "alt-J",
                "An Awesome Wave", R.drawable.altj_anawesomewave));
        songs.add(new Song("Taro", "alt-J",
                "An Awesome Wave", R.drawable.altj_anawesomewave));
        songs.add(new Song("Nara", "alt-J",
                "This is All Yours", R.drawable.altj_thisisallyours));
        songs.add(new Song("Hunger of the Pine", "alt-J",
                "This is All Yours", R.drawable.altj_thisisallyours));
        songs.add(new Song("The Gospel of John Hurt", "alt-J",
                "This is All Yours", R.drawable.altj_thisisallyours));
        songs.add(new Song("Flume", "Bon Iver",
                "For Emma, Forever Ago", R.drawable.boniver_foremmaforeverago));
        songs.add(new Song("Skinny Love", "Bon Iver",
                "For Emma, Forever Ago", R.drawable.boniver_foremmaforeverago));
        songs.add(new Song("For Emma", "Bon Iver",
                "For Emma, Forever Ago", R.drawable.boniver_foremmaforeverago));
        songs.add(new Song("Perth", "Bon Iver",
                "Bon Iver", R.drawable.boniver_boniverboniver));
        songs.add(new Song("Minnesota, WI", "Bon Iver",
                "Bon Iver", R.drawable.boniver_boniverboniver));
        songs.add(new Song("Holocene", "Bon Iver",
                "Bon Iver", R.drawable.boniver_boniverboniver));
        songs.add(new Song("Green Valley", "Puscifer",
                "Conditions of My Parole", R.drawable.puscifer_conditionsofmyparole));
        songs.add(new Song("Horizons", "Puscifer",
                "Conditions of My Parole", R.drawable.puscifer_conditionsofmyparole));
        songs.add(new Song("Man Overboard", "Puscifer",
                "Conditions of My Parole", R.drawable.puscifer_conditionsofmyparole));
        songs.add(new Song("World in My Eyes", "Depeche Mode",
                "Violator", R.drawable.depechemode_violator));
        songs.add(new Song("Personal Jesus", "Depeche Mode",
                "Violator", R.drawable.depechemode_violator));
        songs.add(new Song("Policy of Truth", "Depeche Mode",
                "Violator", R.drawable.depechemode_violator));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);







    }
}
