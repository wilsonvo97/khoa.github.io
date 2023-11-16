package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.Adapter.OptionsAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import android.app.DatePickerDialog;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Flight extends AppCompatActivity{
    private Spinner selected;
    private OptionsAdapter Adapter;
    BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigation);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight);

}
}