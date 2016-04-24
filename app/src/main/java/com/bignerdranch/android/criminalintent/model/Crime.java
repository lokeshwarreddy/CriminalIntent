package com.bignerdranch.android.criminalintent.model;

import java.util.UUID;

/**
 * Created by lokeshwar on 4/23/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
