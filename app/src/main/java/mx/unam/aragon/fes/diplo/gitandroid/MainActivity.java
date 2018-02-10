package mx.unam.aragon.fes.diplo.gitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnMiBoton;
    private TextView txtTexto;
    private Button btnBoton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMiBoton=findViewById(R.id.button);
        txtTexto=findViewById(R.id.textView);
        btnBoton2=findViewById(R.id.button2);

        btnMiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTexto.setText("Hola Github");

            }
        });

        btnBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTexto.setText("Diplomado Android");
            }
        });
    }
}
