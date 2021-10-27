package com.aliuzzi.notion;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.media.session.MediaSession;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listViewResult = findViewById(R.id.database_list_view);
        textViewDebugger = findViewById(R.id.debug_textview);

        TokenInterceptor interceptor = new TokenInterceptor();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl("https://api.notion.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NotionPlaceholderAPI notionAPI = retrofit.create(NotionPlaceholderAPI.class);

        //Call = make network request
        Call<DatabaseQuery> call = notionAPI.getQuery();

        call.enqueue(new Callback<DatabaseQuery>() {  //enqueue so that we dont crash by executing on the main thread, enqueue runs on background thread
            @Override
            public void onResponse(Call<DatabaseQuery> call, Response<DatabaseQuery> response) {
                if (!response.isSuccessful()) {
                    textViewDebugger.setText("Code: " + response.code()); //return http response code somewhere between 200-300
                    return;  //null
                } else {
                    textViewDebugger.setText(null);
                }
                List<String> names = new ArrayList<>();
                DatabaseQuery databaseQuery = response.body();
                for(Result result: databaseQuery.results){
                    String name = result.properties.name.title.get(0).text.content;
                    names.add(name);

                }
                listViewResult.setAdapter(new ArrayAdapter<String>(MainActivity.this, R.layout.list_view_row, R.id.database_name, names));


            }

            @Override
            public void onFailure(Call<DatabaseQuery> call, Throwable t) {
               textViewDebugger.setText(t.getMessage());
            }
        });
    }


}