package com.example.json_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button bt;
    Call<content> call;
    content c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button) findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView2);
        ApiClient apiClient;
        Api api= ApiClient.getRetrofitInstance().create(Api.class);
        call=api.getJson();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               call.enqueue(new Callback<content>() {
                   @Override
                   public void onResponse(Call<content> call, Response<content> response) {
                       c=(content) response.body();
                       tv.setText(c.getType());
                   }

                   @Override
                   public void onFailure(Call<content> call, Throwable throwable) {
                       Toast.makeText(MainActivity.this,"FAILED",Toast.LENGTH_SHORT).show();
                   }
               });
            }
        });


    }
}
