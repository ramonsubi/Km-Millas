package edu.upc.eseiaat.pma.km_milles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e_km = (EditText) findViewById(R.id.t_km);
        final EditText e_mi = (EditText) findViewById(R.id.t_mi);

        e_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_km = e_km.getText().toString();
                float f_km = Float.parseFloat(s_km);
                float f_mi = f_km/1.609f;
                String s_mi = String.format("%f", f_mi);
                e_mi.setText(s_mi);
            }
        });
        e_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_mi = e_mi.getText().toString();
                float f_m = Float.parseFloat(s_mi);
                float f_km = f_m*1.609f;
                String s_km = String.format("%f", f_km);
                e_km.setText(s_km);
            }
        });

    }
}
