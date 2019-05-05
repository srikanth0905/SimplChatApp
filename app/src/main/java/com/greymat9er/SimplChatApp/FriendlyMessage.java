package com.greymat9er.SimplChatApp;

public class FriendlyMessage {

    private String text;
    private String name;
    private String photoURL;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoURL) {
        this.text = text;
        this.name = name;
        this.photoURL = photoURL;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
