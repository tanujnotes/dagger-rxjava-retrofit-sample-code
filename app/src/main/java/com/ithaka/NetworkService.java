package com.ithaka;

import com.ithaka.models.CartModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface NetworkService {

    @GET("cart/")
    Observable<CartModel> getCartActivities(@QueryMap Map<String, Object> queries);

}
