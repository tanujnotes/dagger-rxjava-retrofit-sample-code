package com.ithaka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.ithaka.models.CartModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Inject
    com.ithaka.NetworkService networkService;

    private View loadingView;
    private TextView travellerCount, payableAmount;
    private CartActivitiesAdapter cartActivitiesAdapter;
    private List<CartModel.ActivityTransaction> activityTransactions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApp) getApplication()).getNetComponent().inject(this);
        setContentView(R.layout.activity_main);

        loadingView = findViewById(R.id.loading_view);
        payableAmount = findViewById(R.id.payable_amount);
        travellerCount = findViewById(R.id.traveller_count);
        cartActivitiesAdapter = new CartActivitiesAdapter(this, activityTransactions);
        RecyclerView activityRecyclerView = findViewById(R.id.activities_rv);
        activityRecyclerView.setNestedScrollingEnabled(false);
        activityRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityRecyclerView.setAdapter(cartActivitiesAdapter);

        loadingView.findViewById(R.id.tap_to_retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.findViewById(R.id.tap_to_retry).setVisibility(View.GONE);
                loadingView.findViewById(R.id.progress_bar).setVisibility(View.VISIBLE);
                getActivities();
            }
        });

        getActivities();
    }

    private void getActivities() {
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
                        loadingView.findViewById(R.id.progress_bar).setVisibility(View.GONE);
                        loadingView.findViewById(R.id.tap_to_retry).setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNext(CartModel model) {
                        loadingView.setVisibility(View.GONE);
                        payableAmount.setText(String.format(Locale.getDefault(), "Total Payable Now: ₹ %.0f", model.getAmount()));
                        travellerCount.setText(String.format("%s Adults, %s Child", model.getAdults(), model.getChild()));
                        activityTransactions.clear();
                        activityTransactions.addAll(model.getActivityTransactions());
                        cartActivitiesAdapter.notifyDataSetChanged();
                    }
                });
    }
}
