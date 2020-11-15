package com.rxjava2.android.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rxjava2.android.samples.MyApplication;
import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.ui.cache.CacheExampleActivity;
import com.rxjava2.android.samples.ui.compose.ComposeOperatorExampleActivity;
import com.rxjava2.android.samples.ui.networking.NetworkingActivity;
import com.rxjava2.android.samples.ui.pagination.PaginationActivity;
import com.rxjava2.android.samples.ui.rxbus.RxBusActivity;
import com.rxjava2.android.samples.ui.search.SearchActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionActivity extends AppCompatActivity {
    private static final String TAG = "sujay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void startOperatorsActivity(View view) {
        Log.i(TAG, "startOperatorsActivity:");
        startActivity(new Intent(SelectionActivity.this, OperatorsActivity.class));
    }

    public void startNetworkingActivity(View view) {
        Log.i(TAG, "startNetworkingActivity:");
        startActivity(new Intent(SelectionActivity.this, NetworkingActivity.class));
    }

    public void startCacheActivity(View view) {
        Log.i(TAG, "startCacheActivity:");
        startActivity(new Intent(SelectionActivity.this, CacheExampleActivity.class));
    }

    public void startRxBusActivity(View view) {
        Log.i(TAG, "startRxBusActivity: ");
        ((MyApplication) getApplication()).sendAutoEvent();
        startActivity(new Intent(SelectionActivity.this, RxBusActivity.class));
    }

    public void startPaginationActivity(View view) {
        Log.i(TAG, "startPaginationActivity:");
        startActivity(new Intent(SelectionActivity.this, PaginationActivity.class));
    }

    public void startComposeOperator(View view) {
        Log.i(TAG, "startComposeOperator:");
        startActivity(new Intent(SelectionActivity.this, ComposeOperatorExampleActivity.class));
    }

    public void startSearchActivity(View view) {
        Log.i(TAG, "startSearchActivity:");
        startActivity(new Intent(SelectionActivity.this, SearchActivity.class));
    }

}
