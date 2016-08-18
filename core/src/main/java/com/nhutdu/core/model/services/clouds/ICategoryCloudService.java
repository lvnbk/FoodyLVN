package com.nhutdu.core.model.services.clouds;

import com.nhutdu.core.model.responses.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NhutDu on 17/08/2016.
 */
public interface ICategoryCloudService {

    @GET("/api/v1/categories")
    Call<ApiResponse> getAllCategories();
}