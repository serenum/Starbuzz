package com.serenum.android.starbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Serenum on 05.04.2017.
 */

public class DrinkActivity extends AppCompatActivity {

    public static final String DRINK_NO = "drinkno";

    @Override
    public void onCreate(Bundle savedOnInstanceState) {
        super.onCreate(savedOnInstanceState);
        setContentView(R.layout.drink_activity_layout);

        ImageView image = (ImageView) findViewById(R.id.beverage_image);
        TextView name = (TextView) findViewById(R.id.beverage_name);
        TextView description = (TextView) findViewById(R.id.beverage_description);

        int drinkno = (Integer)getIntent().getExtras().get(DRINK_NO);
        Drink drink = Drink.drinks[drinkno];

        image.setImageResource(drink.getImageSourceID());
        image.setContentDescription(drink.getName());
        name.setText(drink.getName());
        description.setText(drink.getDescription());
    }
}
