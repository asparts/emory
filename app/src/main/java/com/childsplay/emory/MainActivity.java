package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    ImageView card00, card01, card02, card03,
            card10, card11, card12, card13,
            card20, card21, card22, card23;
    //Array for the images
    Integer[] cardArray = {00, 01, 02, 03, 10, 11, 12, 13, 20, 21, 22, 23};

    //Images..
    int img00, img01, img02, img03, img10, img11, img12, img13, img20, img21, img22, img23;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card00 = (ImageView) findViewById(R.id.card00);
        card01 = (ImageView) findViewById(R.id.card01);
        card02 = (ImageView) findViewById(R.id.card02);
        card03 = (ImageView) findViewById(R.id.card03);

        card10 = (ImageView) findViewById(R.id.card10);
        card11 = (ImageView) findViewById(R.id.card11);
        card12 = (ImageView) findViewById(R.id.card12);
        card13 = (ImageView) findViewById(R.id.card13);

        card20 = (ImageView) findViewById(R.id.card20);
        card21 = (ImageView) findViewById(R.id.card21);
        card22 = (ImageView) findViewById(R.id.card22);
        card23 = (ImageView) findViewById(R.id.card23);

        card00.setTag("0");
        card01.setTag("1");
        card02.setTag("2");
        card03.setTag("3");

        card10.setTag("4");
        card11.setTag("5");
        card12.setTag("6");
        card13.setTag("7");

        card20.setTag("8");
        card21.setTag("9");
        card22.setTag("10");
        card23.setTag("11");

        loadImages();
        Collections.shuffle(Arrays.asList(cardArray));
    }

    private void loadImages(){

        //Images from Kenney.nl

        img00 = R.drawable.chicken00;
        img01 = R.drawable.chicken;
        img02 = R.drawable.cow02;
        img03 = R.drawable.cow;

        img10 = R.drawable.crocodile10;
        img11 = R.drawable.crocodile;
        img12 = R.drawable.elephant12;
        img13 = R.drawable.elephant;


        img20 = R.drawable.monkey20;
        img21 = R.drawable.monkey;
        img22 = R.drawable.pig22;
        img23 = R.drawable.pig;





    }

}