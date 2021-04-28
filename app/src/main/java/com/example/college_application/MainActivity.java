package com.example.college_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.college_application.faculty.UpdateFaculty;
import com.example.college_application.notice.DeleteNoticeActivity;
import com.example.college_application.notice.UploadNotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView uploadNotice, addGalleryImage, addEbook, faculty, deleteNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);
        deleteNotice = findViewById(R.id.deleteNotice);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.addNotice:
                startActivity(new Intent(getApplicationContext(), UploadNotice.class));
                break;
            case R.id.addGalleryImage:
                startActivity(new Intent(getApplicationContext(), UploadImage.class));
                break;
            case R.id.addEbook:
                startActivity(new Intent(getApplicationContext(), UploadPdfActivity.class));
                break;
            case R.id.faculty:
                startActivity(new Intent(getApplicationContext(), UpdateFaculty.class));
                break;
            case R.id.deleteNotice:
                startActivity(new Intent(getApplicationContext(), DeleteNoticeActivity.class));
                break;

        }
    }
}