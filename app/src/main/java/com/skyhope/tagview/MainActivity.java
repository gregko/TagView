package com.skyhope.tagview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.skyhope.materialtagview.TagView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    TagView tagView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tagView = findViewById(R.id.tag_view_test);

        tagView.setHint("Add your skill");

        //tagView.addTagSeparator(TagSeparator.AT_SEPARATOR);

        tagView.addTagLimit(5);

       // tagView.setTagBackgroundColor(Color.RED);

        String[] tagList = new String[]{"C++", "Java", "PHP", "Kotlin", "Javascript", "Dart"};
        tagView.setTagList(tagList);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void onClickTest(View v) {
        Log.d("tags", "Click!");
        tagView.addTagsFromList(Arrays.asList("C++", "Java", "Dart"));
    }
}
