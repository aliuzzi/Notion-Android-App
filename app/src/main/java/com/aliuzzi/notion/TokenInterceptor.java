package com.aliuzzi.notion;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request newRequest = chain.request().newBuilder()
                .header("Authorization", "Bearer " + "secret_Pz8TyjZH5j12M5dTRSroPLupY6RcH1kcNt5IUzKkopo")
                .header("Notion-Version", "2021-08-16")
                .build();
        return chain.proceed(newRequest);
    }
}
