package com.hadimusthafa.ui;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UI12 extends AppCompatActivity {
    private UI12_RecyclerAdapter UI12RecyclerAdapter;
    private RecyclerView rv;
    FloatingActionButton add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i12);
        rv = findViewById(R.id.rv);
        fetchFiles();
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent);
            }
        });

    }

    public void fetchFiles() {
        ArrayList<UI12_ModelRecycler> UI12ModelRecyclerArrayList = new ArrayList<>();

        String JSONaa ="[\n" +
                "  {\n" +
                "    \"name\": \"Hadi Musthafa\",\n" +
                "    \"image\": \"c1\",\n" +
                "    \"mobile\": \"9544881999\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Ron\",\n" +
                "    \"image\": \"c2\",\n" +
                "    \"mobile\": \"7064368722\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Nooh\",\n" +
                "    \"image\": \"c3\",\n" +
                "    \"mobile\": \"7060174411\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Radwa\",\n" +
                "    \"image\": \"c4\",\n" +
                "    \"mobile\": \"7612904523\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Rana\",\n" +
                "    \"image\": \"c5\",\n" +
                "    \"mobile\": \"7845238911\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Riya\",\n" +
                "    \"image\": \"c6\",\n" +
                "    \"mobile\": \"8028512278\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Hilal\",\n" +
                "    \"image\": \"c7\",\n" +
                "    \"mobile\": \"8912092376\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Shifana\",\n" +
                "    \"image\": \"c8\",\n" +
                "    \"mobile\": \"9827150357\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Jaseem\",\n" +
                "    \"image\": \"c9\",\n" +
                "    \"mobile\": \"9973482341\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Abi\",\n" +
                "    \"image\": \"c10\",\n" +
                "    \"mobile\": \"9834852267\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Jinu\",\n" +
                "    \"image\": \"c11\",\n" +
                "    \"mobile\": \"7845763351\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Hadi\",\n" +
                "    \"image\": \"c12\",\n" +
                "    \"mobile\": \"9544813999\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Sam\",\n" +
                "    \"image\": \"c13\",\n" +
                "    \"mobile\": \"9544238859\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Basim\",\n" +
                "    \"image\": \"c14\",\n" +
                "    \"mobile\": \"7994466100\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Nihal\",\n" +
                "    \"image\": \"c15\",\n" +
                "    \"mobile\": \"9834673278\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Rambo\",\n" +
                "    \"image\": \"c16\",\n" +
                "    \"mobile\": \"7034761233\"\n" +
                "  }\n" +
                "]";
        try {
            JSONArray jsonArray = new JSONArray(JSONaa);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                UI12_ModelRecycler UI12ModelRecycler = new UI12_ModelRecycler();
                UI12ModelRecycler.setName(jsonObject.getString("name"));
                UI12ModelRecycler.setMobile(jsonObject.getString("mobile"));
                UI12ModelRecycler.setImage(jsonObject.getString("image"));

                UI12ModelRecyclerArrayList.add(UI12ModelRecycler);
            }

            UI12RecyclerAdapter = new UI12_RecyclerAdapter(getApplicationContext(), UI12ModelRecyclerArrayList);
            rv.setAdapter(UI12RecyclerAdapter);
            rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
            //recyclerViewS.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
