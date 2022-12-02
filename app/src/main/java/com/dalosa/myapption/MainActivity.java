package com.dalosa.myapption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    // Le RadioGroup
    RadioGroup rgGroupe;
    // Pour récupérer le boutton selectionné
    RadioButton rbSelected;
    // Pour affiché le résultat en texte
    TextView genreSelection;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            private Object MainActivity2;

            @Override
            public void onClick(View view) {
                button.setText("moi");
                Intent s = new Intent(getApplicationContext(button, MainActivity2));
                startActivity(s);
            }
        });




// Récupere le groupe
        rgGroupe = findViewById(R.id.rgGroupe);
// Récupere le textView
        genreSelection = findViewById(R.id.genreSelection);
// Prend le radioButton du groupe pour afficher son nom
        rbSelected = findViewById(rgGroupe.getCheckedRadioButtonId());
// Cette fonction gère le click sur un des RadioButton du groupe
        rgGroupe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.genreFemme:
                        Log.v("Vous êtes ","une : femme");
                        genreSelection.setText("Vous êtes une femme");
                        break;
                    case R.id.genreHomme:
                        Log.v("Vous êtes ","un : homme");
                        genreSelection.setText("Vous êtes un homme");
                        break;
                    case R.id.genreTrans:
                        Log.v("Vous êtes ","un.e : trans");
                        genreSelection.setText("Vous êtes une femme");
                        genreSelection.setText("Vous êtes un.e trans");
                        break;
                    case R.id.genreNongenre:
                        Log.v("Vous êtes ","non genré");
                        genreSelection.setText("Vous êtes non genré");
                        break;
                }
            }
        });
    }
}