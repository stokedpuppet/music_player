package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    /**
     * Create new ArtistAdapter object
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }
        /** Get the Artist object's position in the list and populate the XML */
        Artist currentArtist = getItem(position);

        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_view);
        artistNameTextView.setText(currentArtist.getArtistName());

        ImageView artistImgView = (ImageView) listItemView.findViewById(R.id.artist_img_view);
        artistImgView.setImageResource(currentArtist.getArtistImg());

        return listItemView;
    }
}
