package com.ithaka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.ithaka.models.CartModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Inject
    com.ithaka.NetworkService networkService;

    private TextView travellerCount;
    private CartActivitiesAdapter cartActivitiesAdapter;
    private List<CartModel.ActivityTransaction> activityTransactions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApp) getApplication()).getNetComponent().inject(this);
        setContentView(R.layout.activity_main);

        travellerCount = findViewById(R.id.traveller_count);
        cartActivitiesAdapter = new CartActivitiesAdapter(this, activityTransactions);
        RecyclerView activityRecyclerView = findViewById(R.id.activities_rv);
        activityRecyclerView.setNestedScrollingEnabled(false);
        activityRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityRecyclerView.setAdapter(cartActivitiesAdapter);

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
                        travellerCount.setText(String.format("%s Adults, %s Child", model.getAdults(), model.getChild()));
                        activityTransactions.clear();
                        activityTransactions.addAll(model.getActivityTransactions());
                        cartActivitiesAdapter.notifyDataSetChanged();
                    }
                });
    }
}
