package com.skyhope.materialtagview.model;

/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 3/18/2019 at 3:45 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md Tariqul Islam on 3/18/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

public class TagModel {
    private String tagText;
    private boolean isFromList;

    public TagModel() {}

    public TagModel(String text, boolean fromList) {
        tagText = text;
        isFromList = fromList;
    }

    public String getTagText() {
        return tagText;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
    }

    public boolean isFromList() {
        return isFromList;
    }

    public void setFromList(boolean fromList) {
        isFromList = fromList;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (tagText == null)
            return false; // don't care about nulls, just for safety
        if (o instanceof TagModel) {
            TagModel tm = (TagModel) o;
            return isFromList == tm.isFromList && tagText.equals(tm.tagText);
        }
        return false;
    }
}
