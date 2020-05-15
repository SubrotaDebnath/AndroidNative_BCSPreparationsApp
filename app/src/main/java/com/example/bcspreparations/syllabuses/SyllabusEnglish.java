package com.example.bcspreparations.syllabuses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.bcspreparations.R;

public class SyllabusEnglish extends AppCompatActivity {
    private WebView webView;
    String syllabusText = "<h1>Syllabus</h1>\n" +
            "<ol>\n"+
            "<p> <b> English Language: </b> </p>\n" +
            "<li>Parts of Speech</li>\n "+
            "<li>Idioms and Phrases</li>\n "+
            "<li>Clauses</li>\n "+
            "<li>Corrections</li>\n "+
            "<li>Sentences and Transformations</li>\n "+
            "<li>Words: Synonyms</li>\n "+
            "<li>Antonyms</li>\n "+
            "<li>spellings</li>\n "+
            "<li>Name of parts of paragraphs\\letters\\ Applications</li>\n"+
            "<li>AND English Literature </li>\n "+
            "<ol>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_english);
        setTitle("ইংরেজী সিলেবাস");
        webView = findViewById(R.id.english_syllabusId);
        webView.loadDataWithBaseURL(null,syllabusText,"text/html","utf-8",null);


    }
}
