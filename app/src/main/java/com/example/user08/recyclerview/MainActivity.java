package com.example.user08.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button generate;
    Button delete;
    Button add;
    RecyclerView recyclerView;
    List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate = (Button) findViewById(R.id.generate);
        delete = (Button) findViewById(R.id.delete);
        add = (Button) findViewById(R.id.add);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.generate:
                mList = createString(50);
                break;
            case R.id.delete:
                ;
                break;
            case R.id.add:
                ;
                break;

        }

    }

    private ArrayList<String> createString(int number){
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            array.add("String " + i + 1);
        }
        return array;
    }
}
