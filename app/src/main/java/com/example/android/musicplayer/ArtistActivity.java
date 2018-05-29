package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        /** Create a list of Artists */
        final ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("A Perfect Circle", R.drawable.aperfectcircle));
        artists.add(new Artist("The Cure", R.drawable.thecure));
        artists.add(new Artist("alt-J", R.drawable.altj));
        artists.add(new Artist("Bon Iver", R.drawable.boniver));
        artists.add(new Artist("Puscifer", R.drawable.puscifer));
        artists.add(new Artist("Depeche Mode", R.drawable.depechemode));

        /** Link gridView and Apply adapter */
        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);

        /** Added onClickListener for artists ArrayList & started and pushed data to SongActivity */
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artist selectedArtist = artists.get(position);
                Intent intent = new Intent(ArtistActivity.this, SongActivity.class);
                intent.putExtra("ARTIST_NAME", selectedArtist.getArtistName());
                startActivity(intent);
            }
        });
    }
}
