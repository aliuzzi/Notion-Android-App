package com.aliuzzi.notion;


import android.provider.ContactsContract;

import com.aliuzzi.notion.Constants;
import com.aliuzzi.notion.api.models.DatabaseQuery;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NotionRetrofitClient {

    private Retrofit retrofit;

    public NotionRetrofitClient() {
        TokenInterceptor interceptor = new TokenInterceptor();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(Constants.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.retrofit = retrofit;
    }

    public void makeDatabaseQueryRequest(Callback<DatabaseQuery> callback){
        NotionPlaceholderAPI notionAPI = retrofit.create(NotionPlaceholderAPI.class);

        //Call = make network request
        Call<DatabaseQuery> call = notionAPI.getQuery();

        call.enqueue(callback);
    }


}
