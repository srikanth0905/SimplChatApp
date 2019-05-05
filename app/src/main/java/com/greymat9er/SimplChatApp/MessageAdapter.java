package com.greymat9er.SimplChatApp;

import android.app.Activity;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

class MessageAdapter extends ArrayAdapter<FriendlyMessage> {

    public MessageAdapter(Context context, int resource, List<FriendlyMessage> object){
        super(context, resource, object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null)
            convertView = ((Activity)getContext()).
                    getLayoutInflater().inflate(R.layout.item_message, parent, false);

        ImageView photoImageView = convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = convertView.findViewById(R.id.nameTextView);

        FriendlyMessage message = getItem(position);

        boolean isPhoto = message.getPhotoURL() != null;
        if (isPhoto){
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(message.getPhotoURL())
                    .into(photoImageView);
        }

        else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(message.getText());
        }

        authorTextView.setText(message.getName());

        return convertView;
    }
}
