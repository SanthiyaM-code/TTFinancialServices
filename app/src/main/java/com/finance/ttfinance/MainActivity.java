package com.finance.ttfinance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton login;
    SliderView sliderView;
    ImageButton home,book,dollar,car,build,women;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sliderView=findViewById(R.id.imageSlider);

        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.money);
        images.add(R.drawable.money2);
        images.add(R.drawable.money3);
        images.add(R.drawable.money4);
        images.add(R.drawable.money5);
        images.add(R.drawable.money6);
        images.add(R.drawable.money7);
        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.VERTICALFLIPTRANSFORMATION);
        sliderView.setAutoCycle(true);


        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.ic_baseline_home_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("CONTACT", R.drawable.ic_baseline_contact_support_24));

        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        home=findViewById(R.id.homebt);
        book=findViewById(R.id.eduic);
        car=findViewById(R.id.caric);
        build=findViewById(R.id.buildic);
        women=findViewById(R.id.womenic);
        dollar=findViewById(R.id.goldic);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Haii",Toast.LENGTH_SHORT).show();
            }
        });
        login=findViewById(R.id.login_bt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,LoginPage.class);
                startActivity(intent);
                finish();

            }
        });





    }
}