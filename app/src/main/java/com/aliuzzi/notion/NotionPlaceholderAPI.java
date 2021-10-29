package com.aliuzzi.notion;
import com.aliuzzi.notion.api.models.DatabaseQuery;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NotionPlaceholderAPI {

    @POST("databases/314c05d0c5024d14813b2bc8fac532fa/query")
    Call<DatabaseQuery> getQuery();
}
