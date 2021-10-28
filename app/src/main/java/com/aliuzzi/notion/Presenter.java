package com.aliuzzi.notion;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aliuzzi.notion.api.models.DatabaseQuery;
import com.aliuzzi.notion.api.models.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter {

    private NotionRetrofitClient notionRetrofitClient;
    private ListView listView;
    private TextView textViewDebugger;


    public Presenter(ListView listView, TextView textViewDebugger) {
        this.notionRetrofitClient = new NotionRetrofitClient();
        this.listView = listView;
        this.textViewDebugger = textViewDebugger;


        loadFromNetwork();
    }

    public void loadFromNetwork() {

        notionRetrofitClient.makeDatabaseQueryRequest(
            new Callback<DatabaseQuery>() {  //enqueue so that we dont crash by executing on the main thread, enqueue runs on background thread
                @Override
                public void onResponse(Call<DatabaseQuery> call, Response<DatabaseQuery> response) {
                    if (!response.isSuccessful()) {
                        textViewDebugger.setText("Code: " + response.code()); //return http response code somewhere between 200-300
                        return;  //null
                    } else {
                        textViewDebugger.setText(null);
                    }
                    renderListData(response);
                }

                @Override
                public void onFailure(Call<DatabaseQuery> call, Throwable t) {
                    textViewDebugger.setText(t.getMessage());
                }
            }
        );
    }

    private void renderListData(Response<DatabaseQuery> response) {
        List<String> names = new ArrayList<>();
        DatabaseQuery databaseQuery = response.body();
        for(Result result: databaseQuery.results){

            String name;
            try {
                name = result.properties.name.title.get(0).text.content;
            } catch (Exception e){
                name = "(No title)";
            }
            names.add(name);

        }
        listView.setAdapter(new ArrayAdapter<String>(listView.getContext(), R.layout.list_view_row, R.id.database_name, names));
    }
}
