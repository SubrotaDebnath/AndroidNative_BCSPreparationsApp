package com.example.bcspreparations.syllabuses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.bcspreparations.R;

public class SyllabusBangla extends AppCompatActivity {
    private WebView webView;
    String syllabusText = "<h1>সিলেবাস</h1>\n" +
            "<ol>\n"+
            "<p> <b> বাংলা ভাষাঃ </b> </p>\n" +
            "<li>প্রয়োগ-অপপ্রয়োগ</li>\n "+
            "<li>বানান ও বাক্যশুদ্ধি</li>\n "+
            "<li>পরিভাষা</li>\n "+
            "<li>সমার্থক ও বিপরীতার্থক </li>\n "+
            "<li>প্রয়োগ-অপপ্রয়োগ</li>\n "+
            "<li>শব্দ,ধ্বনি,বর্ণ</li>\n "+
            "<li>বাক্য,প্রত্যয়,সন্ধি,সমাস</li>\n "+
            "<p> <b>সাহিত্যঃ</b> </p>\n" +
            "<li>প্রাচীন ও মধ্যযুগ</li>\n "+
            "<li>আধুনিক যুগ(১৮০০-বর্তমান পর্যন্ত)</li>\n "+
            "<ol>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_bangla);
        setTitle("বাংলা সিলেবাস");
        webView = findViewById(R.id.banglasyllabusId);
        webView.loadDataWithBaseURL(null,syllabusText,"text/html","utf-8",null);
    }
}
