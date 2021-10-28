package com.aliuzzi.notion;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.aliuzzi.notion.api.models.DatabaseQuery;
import com.aliuzzi.notion.api.models.Result;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listViewResult;
    private TextView textViewDebugger;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listViewResult = findViewById(R.id.database_list_view);
        textViewDebugger = findViewById(R.id.debug_textview);

        presenter = new Presenter(listViewResult, textViewDebugger);
    }




}