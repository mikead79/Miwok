package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mihai on 09/03/2017.
 * The override of the ArrayAdapter to allow using a View, not just a TextView
 */

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> duoWord = new ArrayList<>();
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok word from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmiwokTranslation());
        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the english word from the current Word object and
        // set this text on the name TextView
        englishTextView.setText(currentWord.getDefaultTranslation());
        // Find the TextView in the list_item.xml layout with the ID miwok_word
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Get the miwok word from the current Word object and
        // set this text on the name TextView
        imageView.setImageResource(currentWord.getImageID());
        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> miwokWords) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, miwokWords);
    }
}
