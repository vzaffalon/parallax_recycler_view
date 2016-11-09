package com.yimobile.teste.model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.yimobile.teste.R;
import com.yimobile.teste.controllers.Beer;
import com.yimobile.teste.webservice.WebService;
import java.util.ArrayList;
import java.util.List;

public class BeerListActivity extends AppCompatActivity {

    private List<Beer> beers;
    private RecyclerView recyclerView;
    private WebService webService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_list);
        webService = new WebService(getApplicationContext());
        beers = new ArrayList<>();
        setUpRecyclerView();
        loadDataFromApi();
    }

    private void loadDataFromApi(){
        FutureCallback callback = new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                if(result != null) {
                    Gson gson = new Gson();
                    beers = gson.fromJson(result.get("data"), new TypeToken<List<Beer>>() {
                    }.getType());
                    setUpListAdapter();
                }else{
                    Toast.makeText(getApplicationContext(),"Falha na busca de dados",Toast.LENGTH_SHORT).show();
                }
            }
        };
        webService.getDataFromApi(callback);
    }

    private void setUpRecyclerView(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void setUpListAdapter(){
        BeerListAdapter listaVagasAdapter = new BeerListAdapter(getApplicationContext(),beers,onClickList());
        recyclerView.setAdapter(listaVagasAdapter);
    }

    private BeerListAdapter.ListOnClickListener onClickList(){
        return new BeerListAdapter.ListOnClickListener(){
            @Override
            public void onClickList(View view, int idx) {
                Toast.makeText(getApplicationContext(),"Clicou em" + beers.get(idx).getName(),Toast.LENGTH_SHORT).show();
            }
        };
    }
}
