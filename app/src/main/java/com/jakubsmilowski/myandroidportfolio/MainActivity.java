package com.jakubsmilowski.myandroidportfolio;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView list = findViewById(R.id.main);


        Project[] projects = {
                new Project("Geting started application", "Created android project and run it on a virtual device. Nothing fancy just to feel how it works.",R.drawable.getting_started),
                new Project("Motivational quote app", "Created a single activity aplication with motivational quote displayed, to keep me motivated.",R.drawable.quote),
                new Project("Bmi Calculator", "Created a bmi caluclator that calculates bmi of the person based on gender, age, height and weight.",R.drawable.calculator),
                new Project("Feet to inches converter", "Created feet to inches converter that converts inches to feet upon entering value and confirming with the button.",R.drawable.tape),
                new Project("The burger concept", "Created aplication for restauration 'Burger concept' to display menu of the dishes.",R.drawable.hungry_developer),

        };

        //We instanciete our own adapter
        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);


    }





//    ArrayAdapter<Project>

}