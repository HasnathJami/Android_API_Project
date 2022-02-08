package com.example.apicall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.getDataId);
        tv=findViewById(R.id.textId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Methods methods=RetrofitClient.getRetrofitInstance().create(Methods.class);
                Call<ArrayList<Model>> call=methods.getAllData();



                       // Model d=new Model();
                        //d.setText(response.body().getText());
                        //String email="";
                       // ArrayList<Model>md;

                       // for(Model d: data)
                       // {
                        //   email=email+d.getEmail()+"\n";

                       // }

                       // tv.setText(email);
                       // tv.setText(d.getText());


                   call.enqueue(new Callback<ArrayList<Model>>() {
                       @Override
                       public void onResponse(Call<ArrayList<Model>> call, Response<ArrayList<Model>> response) {
                           Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                           ArrayList<Model> m;
                           m=response.body();

                           String store="";

                           Float dd = null;
                           for(Model mode:m)
                           {
                              // tv.setText(mode.getTitle());
                              // store=store+mode.getBody()+"\n";
                              // tv.setText(mode.getBody());
                               dd=mode.getId();
                           }
                          // tv.setText(store);
                           //String i = (String) id;

                           tv.setText(dd.toString());




                       }

                       @Override
                       public void onFailure(Call<ArrayList<Model>> call, Throwable t) {

                       }
                   });


            }
        });
    }
}