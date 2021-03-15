package com.childsplay.emory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    ImageView card00, card01, card02, card03,
            card10, card11, card12, card13,
            card20, card21, card22, card23;
    //Array for the images
    Integer[] cardArray = {100, 101, 102, 103, 210, 211, 212, 213, 320, 321, 322, 323};

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

        //Shuffle images
        Collections.shuffle(Arrays.asList(cardArray));

        card00.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card00, theCard);

            }
        });
        card01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card01, theCard);

            }
        });
        card02.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card02, theCard);

            }
        });
        card03.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card03, theCard);
            }
        });
        card10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card10, theCard);

            }
        });
        card11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card11, theCard);

            }
        });
        card12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card12, theCard);

            }
        });
        card13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card13, theCard);

            }
        });
        card20.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card20, theCard);

            }
        });
        card21.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card21, theCard);

            }
        });
        card22.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card22, theCard);

            }
        });
        card23.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(card23, theCard);

            }
        });
    }

    private void doStuff(ImageView imageView, int card){

        //setting the correct image for imageview

        if(cardArray[card] == 100){
            imageView.setImageResource(img00);
        }
        else if(cardArray[card] == 101){
            imageView.setImageResource(img01);
        }
        else if(cardArray[card] == 102){
            imageView.setImageResource(img02);
        }
        else if(cardArray[card] == 103){
            imageView.setImageResource(img03);
        }

        else if(cardArray[card] == 210){
            imageView.setImageResource(img10);
        }
        else if(cardArray[card] == 211){
            imageView.setImageResource(img11);
        }
        else if(cardArray[card] == 212){
            imageView.setImageResource(img12);
        }
        else if(cardArray[card] == 213){
            imageView.setImageResource(img13);
        }

        else if(cardArray[card] == 320){
            imageView.setImageResource(img20);
        }
        else if(cardArray[card] == 321){
            imageView.setImageResource(img21);
        }
        else if(cardArray[card] == 322){
            imageView.setImageResource(img22);
        }
        else if(cardArray[card] == 323){
            imageView.setImageResource(img23);
        }


        //check which image is selected and save it to temporary variable

        if(cardNumber == 1){

            firstCard = cardArray[card];
            clickedFirst = card;
            cardNumber = 2;
        }else if(cardNumber == 2){
            clickedSecond = card;
            cardNumber = 1;


            card00.setEnabled(false);
            card01.setEnabled(false);
            card02.setEnabled(false);
            card03.setEnabled(false);

            card10.setEnabled(false);
            card11.setEnabled(false);
            card12.setEnabled(false);
            card13.setEnabled(false);

            card20.setEnabled(false);
            card21.setEnabled(false);
            card22.setEnabled(false);
            card23.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // checking if the images match
                    calculate();
                }
            }, 1000);
        }



    }

    private void calculate(){

        //TODO: TRANSFORM CARDS TO ARRAYS IN ORDER TO DO COMPARISON WITH LOOPS, MUCH MORE EASIER AND BETTER FOR PERFORMANCE ETC..

        //If images are equal, remove them from game.
        if(firstCard % 2 == 0) {
            if (firstCard +1 == secondCard){

                if(clickedFirst == 100){
                    card00.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 101){
                    card01.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 102){
                    card02.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 103){
                    card03.setVisibility(View.INVISIBLE);

                }else if(clickedFirst == 200){
                    card10.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 201){
                    card11.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 202){
                    card12.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 203){
                    card13.setVisibility(View.INVISIBLE);

                }else if(clickedFirst == 300){
                    card20.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 301){
                    card21.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 302){
                    card22.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 303){
                    card23.setVisibility(View.INVISIBLE);
                }
                if(clickedSecond == 100){
                    card00.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 101){
                    card01.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 102){
                    card02.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 103){
                    card03.setVisibility(View.INVISIBLE);

                }else if(clickedSecond == 200){
                    card10.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 201){
                    card11.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 202){
                    card12.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 203){
                    card13.setVisibility(View.INVISIBLE);

                }else if(clickedSecond == 300){
                    card20.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 301){
                    card21.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 302){
                    card22.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 303){
                    card23.setVisibility(View.INVISIBLE);
                }

            }
        }else if(firstCard % 2 == 1){
            if(firstCard -1 == secondCard){
                if(clickedFirst == 100){
                    card00.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 101){
                    card01.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 102){
                    card02.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 103){
                    card03.setVisibility(View.INVISIBLE);

                }else if(clickedFirst == 200){
                    card10.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 201){
                    card11.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 202){
                    card12.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 203){
                    card13.setVisibility(View.INVISIBLE);

                }else if(clickedFirst == 300){
                    card20.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 301){
                    card21.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 302){
                    card22.setVisibility(View.INVISIBLE);
                }else if(clickedFirst == 303){
                    card23.setVisibility(View.INVISIBLE);
                }
                if(clickedSecond == 100){
                    card00.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 101){
                    card01.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 102){
                    card02.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 103){
                    card03.setVisibility(View.INVISIBLE);

                }else if(clickedSecond == 200){
                    card10.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 201){
                    card11.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 202){
                    card12.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 203){
                    card13.setVisibility(View.INVISIBLE);

                }else if(clickedSecond == 300){
                    card20.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 301){
                    card21.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 302){
                    card22.setVisibility(View.INVISIBLE);
                }else if(clickedSecond == 303){
                    card23.setVisibility(View.INVISIBLE);
                }
            }
        }else{
            card00.setImageResource(R.drawable.card);
            card01.setImageResource(R.drawable.card);
            card02.setImageResource(R.drawable.card);
            card03.setImageResource(R.drawable.card);

            card10.setImageResource(R.drawable.card);
            card11.setImageResource(R.drawable.card);
            card12.setImageResource(R.drawable.card);
            card13.setImageResource(R.drawable.card);

            card20.setImageResource(R.drawable.card);
            card21.setImageResource(R.drawable.card);
            card22.setImageResource(R.drawable.card);
            card23.setImageResource(R.drawable.card);
        }

        card00.setEnabled(true);
        card01.setEnabled(true);
        card02.setEnabled(true);
        card03.setEnabled(true);

        card10.setEnabled(true);
        card11.setEnabled(true);
        card12.setEnabled(true);
        card13.setEnabled(true);

        card20.setEnabled(true);
        card21.setEnabled(true);
        card22.setEnabled(true);
        card23.setEnabled(true);

        //Check if game is over
        checkEnd();
    }

    private void checkEnd(){

        if(card00.getVisibility() == View.INVISIBLE &&
                card01.getVisibility() == View.INVISIBLE &&
                card02.getVisibility() == View.INVISIBLE &&
                card03.getVisibility() == View.INVISIBLE &&

                card10.getVisibility() == View.INVISIBLE &&
                card11.getVisibility() == View.INVISIBLE &&
                card12.getVisibility() == View.INVISIBLE &&
                card13.getVisibility() == View.INVISIBLE &&

                card20.getVisibility() == View.INVISIBLE &&
                card21.getVisibility() == View.INVISIBLE &&
                card22.getVisibility() == View.INVISIBLE &&
                card23.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("GAME OVER!").setCancelable(false).setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }

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