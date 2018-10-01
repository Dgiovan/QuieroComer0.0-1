package com.alichis.dvpgiomov.quierocomer;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alichis.dvpgiomov.quierocomer.Adapter.AddLocation;
import com.alichis.dvpgiomov.quierocomer.Models.ModeLocations;

import java.util.ArrayList;
import java.util.List;

public class Locations extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);

        List<ModeLocations> rowListItem = getAllitems();
        linearLayoutManager = new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        final RecyclerView rView= (RecyclerView) findViewById(R.id.rvlocations);
        rView.setLayoutManager(linearLayoutManager);
        rView.setHasFixedSize(true);

        final AddLocation rcAdapter = new AddLocation(this,rowListItem);
        rView.setAdapter(rcAdapter);

        rcAdapter.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rView.getChildPosition(view)){
                    case 0:
                        Intent intent = new Intent(Locations.this,Menuseats.class);
                        startActivity(intent);
                        break;
                }

            }
        });

    }
    /*creando el metodo,tomando referencia y emviando la tipografia*/



    private List<ModeLocations> getAllitems(){
        List<ModeLocations> allItems = new ArrayList<ModeLocations>();
        allItems.add(new ModeLocations("Texcoco",R.drawable.ic_texcoco));
        allItems.add(new ModeLocations("Chiconcuac",R.drawable.ic_chiconcuac));
        allItems.add(new ModeLocations("Atenco",R.drawable.ic_atenco));
        return allItems;
    }
}
