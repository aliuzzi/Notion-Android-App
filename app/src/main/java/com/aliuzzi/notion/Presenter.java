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
            new Callback<DatabaseQuery>() {
                @Override
                public void onResponse(Call<DatabaseQuery> call, Response<DatabaseQuery> response) {
                    if (!response.isSuccessful()) {
                        textViewDebugger.setText("Code: " + response.code());
                        return;
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

        listView.setAdapter(new DatabaseQueryArrayAdapter(listView.getContext(), response.body().results));
    }
}
