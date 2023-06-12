package com.example.r6generatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final String[] Attackers = {"Sledge", "Thatcher", "Ash", "Thermite", "Montagne", "Twitch", "Blitz", "IQ", "Fuze", "Glaz", "Buck", "Blackbeard", "Capitao", "Hibana", "Jackal", "Ying", "Zofia", "Dokkaebi", "Finka", "Lion", "Maverick", "Nomad", "Gridlock", "Nokk", "Amaru", "Kali", "Iana", "Ace", "Zero", "Flores", "Osa", "Sense", "Grim", "Brava"};
    private final String[] Defenders = {"Smoke", "Mute", "Castle", "Pulse", "Rook", "Doc", "Bandit", "Jäger", "Kapkan", "Tachanka", "Frost", "Valkyrie", "Caveira", "Echo", "Mira", "Lesion", "Ela", "Vigil", "Maestro", "Alibi", "Clash", "Kaid", "Mozzie", "Warden", "Goyo", "Wamai", "Oryx", "Melusi", "Aruni", "Thunderbird", "Thorn", "Azami", "Solis", "Fenrir"};
    private Random random = new Random();
    private int index = 0;
    private String randomElement = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAttackerOnActionHandler(View v) {
        index = random.nextInt(Attackers.length);
        randomElement = Attackers[index];
        System.out.println(randomElement);
        TextView generated = findViewById(R.id.textGenerated);
        generated.setTextColor(Color.RED);
        generated.setText(randomElement);
    }

    public void btnDefenderOnActionHandler(View v) {
        index = random.nextInt(Defenders.length);
        randomElement = Defenders[index];
        TextView generated = findViewById(R.id.textGenerated);
        generated.setTextColor(Color.BLUE);
        generated.setText(randomElement);
    }

}