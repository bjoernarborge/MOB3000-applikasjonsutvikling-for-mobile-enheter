package com.example.recipeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class About extends AppCompatActivity implements View.OnClickListener {

    private TextView emoji, about, about2, about3, copyright;
    private MaterialButton contact_btn;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        /**
         Legge inn tittel på siden.
         */
        this.setTitle(getResources().getString(R.string.activity_about));

        /**
         * Aktivere tilbake knapp i action bar.
         */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Legge til emoji og tekst på about siden.
         */
        emoji = findViewById(R.id.txtAbout);
        emoji.setText(getResources().getString(R.string.txtAbout));

        about = findViewById(R.id.txtAbout1);
        about.setText(getResources().getString(R.string.txtAbout1));

        about2 = findViewById(R.id.txtAbout2);
        about2.setText(getResources().getString(R.string.txtAbout2));

        about3 = findViewById(R.id.txtAbout3);
        about3.setText(getResources().getString(R.string.txtAbout3));

        copyright = findViewById(R.id.txtCopyrightAbout);
        copyright.setText(getResources().getString(R.string.txtCopyrightAbout));

        image = findViewById(R.id.logo);
        image.setOnClickListener(this);
    }

    /**
     * Kode for å aktivere tilbake knappen i appen.
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    /**
     * method for going back to profileview
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logo:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
        }
    }

    public void contactButton(View view) {
        contact_btn = findViewById(R.id.contact);
        contact_btn.setText(getResources().getString(R.string.btnContact_us));
        startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto: " + ")")));
    }
}