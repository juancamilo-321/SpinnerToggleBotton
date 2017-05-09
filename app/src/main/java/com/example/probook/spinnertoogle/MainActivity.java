package com.example.probook.spinnertoogle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner nombres;
    Spinner apellidos;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = (Spinner)findViewById(R.id.nombres);
        List list = new ArrayList();
        list.add("Jhonny");
        list.add("Mauricio");
        list.add("Juan Pablo");
        list.add("Andres Felipe");
        list.add("Diego");
        list.add("Isabel");
        list.add("Camilo");
        list.add("Juan Camilo");
        list.add("Diego Andres");
        list.add("Edward");
        list.add("David");
        list.add("Johana");
        list.add("Erika");
        list.add("Juan Gabriel");
        list.add("Jhonatan");
        list.add("Hector");

        apellidos = (Spinner) findViewById(R.id.apellidos);
        List list1 = new ArrayList();
        list1.add("Ospina");
        list1.add("Zuluaga");
        list1.add("Ocampo");
        list1.add("Montoya");
        list1.add("Londoño");
        list1.add("Zapata");
        list1.add("Quintero");
        list1.add("Salinas");
        list1.add("Londoño");
        list1.add("Salazar");
        list1.add("Montoya");
        list1.add("Tangarife");
        list1.add("Garcia");
        list1.add("Herrera");
        list1.add("Alzate");
        list1.add("Alzate");

        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter arr = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Oprimido", Toast.LENGTH_SHORT).show();
                    nombres.setAdapter(arrayAdapter);
                }else{
                    Toast.makeText(MainActivity.this, "No Oprimido", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
