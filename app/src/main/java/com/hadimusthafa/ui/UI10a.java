package com.hadimusthafa.ui;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UI10a extends AppCompatActivity {
    private UI10_RecyclerAdapter UI10RecyclerAdapter;
    RecyclerAdapterS recyclerAdapterS;
    private RecyclerView recyclerView, recyclerViewS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i10);
        recyclerView = findViewById(R.id.recycler);
        recyclerViewS = findViewById(R.id.recyclerS);
        fetchfiles();
        fetchfiles1();
    }

    public void fetchfiles1() {
        ArrayList<UI10_ModelRecycler> UI10ModelRecyclerArrayList1 = new ArrayList<>();

        String JSONaa = "[\n" +
                "  {\n" +
                "    \"name\": \"Daniel William\",\n" +
                "    \"message\": \"Hey! How can i change course?\",\n" +
                "    \"image\": \"g1\",\n" +
                "    \"time\": \"1:00 PM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Kevin Doyle Ben\",\n" +
                "    \"message\": \"Sound good to me!\",\n" +
                "    \"image\": \"g2\",\n" +
                "    \"time\": \"3:05 PM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Dino Waelchi\",\n" +
                "    \"message\": \"Can i participates new physics test?\",\n" +
                "    \"image\": \"g3\",\n" +
                "    \"time\": \"6:00 AM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Victor Black\",\n" +
                "    \"message\": \"Which kind of package &amp; offers provide?\",\n" +
                "    \"image\": \"b11\",\n" +
                "    \"time\": \"8:05 AM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Ben Jhonson\",\n" +
                "    \"message\": \"Hi Mike, what is subscription plan?\",\n" +
                "    \"image\": \"b22\",\n" +
                "    \"time\": \"9:40 AM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"William\",\n" +
                "    \"message\": \"Can i change password?\",\n" +
                "    \"image\": \"h1\",\n" +
                "    \"time\": \"2:00 PM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Sam\",\n" +
                "    \"message\": \"Course id 32\",\n" +
                "    \"image\": \"h2\",\n" +
                "    \"time\": \"6:20 PM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Shelby\",\n" +
                "    \"message\": \"Which page?\",\n" +
                "    \"image\": \"ba1\",\n" +
                "    \"time\": \"3:00 PM\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Edward Kelly\",\n" +
                "    \"message\": \"When will i do next course?\",\n" +
                "    \"image\": \"b3\",\n" +
                "    \"time\": \"7:55 AM\"\n" +
                "  }\n" +
                "]";
        try {
            JSONArray jsonArray = new JSONArray(JSONaa);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                UI10_ModelRecycler UI10ModelRecycler = new UI10_ModelRecycler();
                UI10ModelRecycler.setName(jsonObject.getString("name"));
                UI10ModelRecycler.setMessage(jsonObject.getString("message"));
                UI10ModelRecycler.setImage(jsonObject.getString("image"));
                UI10ModelRecycler.setTime(jsonObject.getString("time"));
                UI10ModelRecyclerArrayList1.add(UI10ModelRecycler);
            }

            UI10RecyclerAdapter = new UI10_RecyclerAdapter(getApplicationContext(), UI10ModelRecyclerArrayList1);
            recyclerView.setAdapter(UI10RecyclerAdapter);
//            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void fetchfiles() {
        ArrayList<UI10_ModelRecycler> UI10ModelRecyclerArrayList = new ArrayList<>();

        String JSONaa ="[\n" +
                "  {\n" +
                "    \"name\": \"Mike West\",\n" +
                "    \"image\": \"ga1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Edward Kelly\",\n" +
                "    \"image\": \"ba3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Ben Jhonson\",\n" +
                "    \"image\": \"ba1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Victor Blac\",\n" +
                "    \"image\": \"ba3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Ron\",\n" +
                "    \"image\": \"b5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Kevin Doyle Ben\",\n" +
                "    \"image\": \"ga4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"DanielWilliam\",\n" +
                "    \"image\": \"ga6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Thomas\",\n" +
                "    \"image\": \"ba5\"\n" +
                "  }\n" +
                "]";
        try {
            JSONArray jsonArray = new JSONArray(JSONaa);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                UI10_ModelRecycler UI10ModelRecycler = new UI10_ModelRecycler();
                UI10ModelRecycler.setImageS(jsonObject.getString("image"));
                UI10ModelRecycler.setNameS(jsonObject.getString("name"));
                UI10ModelRecyclerArrayList.add(UI10ModelRecycler);
            }

            recyclerAdapterS = new RecyclerAdapterS(getApplicationContext(), UI10ModelRecyclerArrayList);
            recyclerViewS.setAdapter(recyclerAdapterS);
            recyclerViewS.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
            //recyclerViewS.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
