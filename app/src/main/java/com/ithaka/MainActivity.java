package com.ithaka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ithaka.models.CartModel;

import java.util.HashMap;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Inject
    com.ithaka.NetworkService networkService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((com.ithaka.MyApp) getApplication()).getNetComponent().inject(this);
        setContentView(R.layout.activity_main);
        getPlaylistItems();
    }

    private void getPlaylistItems() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("conversationId", "-LerU3oKU84KsC6xaGWi");

        Observable<CartModel> observable = networkService.getCartActivities(map);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CartModel>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("ERROR", e.getMessage());
                    }

                    @Override
                    public void onNext(CartModel model) {
                        // You got the response model. Do whatever you want with it.
                    }
                });
    }
}
