package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Faiq on 03-Jun-17.
 */

public class WordAdapter  extends ArrayAdapter<Word>{

    private int colorid;

    public WordAdapter(Activity context, ArrayList<Word> words, int mcolorid) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        colorid = mcolorid;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }

    // Get the {@link AndroidFlavor} object located at this position in the list
    Word currentAndroidFlavor = getItem(position);

    // Find the TextView in the list_item.xml layout with the ID version_name
    TextView nameTextView = (TextView) listItemView.findViewById(R.id.miw);
    // Get the version name from the current AndroidFlavor object and
    // set this text on the name TextView
    nameTextView.setText(currentAndroidFlavor.getMtrans());

    // Find the TextView in the list_item.xml layout with the ID version_number
    TextView numberTextView = (TextView) listItemView.findViewById(R.id.eng);
    // Get the version number from the current AndroidFlavor object and
    // set this text on the number TextView
    numberTextView.setText(currentAndroidFlavor.getdtrans());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imgs);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
if (currentAndroidFlavor.getpic()){
    iconView.setImageResource(currentAndroidFlavor.getimage());
    iconView.setVisibility(View.VISIBLE);
}
        else {
    iconView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.lt);
          // Find the color that the resource ID maps to
                        int color = ContextCompat.getColor(getContext(), colorid);
          // Set the background color of the text container View
                     textContainer.setBackgroundColor(color);
    return listItemView;
}
}
