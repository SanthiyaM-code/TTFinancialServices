package com.finance.ttfinance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton login;
    SliderView sliderView;
    Button home,book,dollar,car,build,women;




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
        sliderView.startAutoCycle();
        sliderView.setAutoCycle(true);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);

        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.ic_baseline_home_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("CONTACT", R.drawable.ic_baseline_contact_support_24));

        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:07449111411"));
                startActivity(intent);
            }
            @Override
            public void onItemClick(int itemIndex, String itemName) {

               if(itemName == "CONTACT")
               {
                   Intent intent=new Intent(MainActivity.this,ContactActivity.class);
                   startActivity(intent);
                   finish();
               }
            }
            @Override
            public void onItemReselected(int itemIndex,String item) {
            }

        });

        home=findViewById(R.id.homeloangridbtn);
        book=findViewById(R.id.eduloanbtn);
        car=findViewById(R.id.vehicleloanbtn);
        build=findViewById(R.id.businessloanbtn);
        women=findViewById(R.id.womenloanbtn);
        dollar=findViewById(R.id.goldloanbtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HomeLoanActivity.class);
                startActivity(intent);
                finish();
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EducationLoanActivity.class);
                startActivity(intent);
                finish();
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,VehicleLoanActivity.class);
                startActivity(intent);
                finish();
            }
        });
        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BusinessLoanActivity.class);
                startActivity(intent);
                finish();
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GoldLoanActivity.class);
                startActivity(intent);
                finish();
            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WomenLoanActivity.class);
                startActivity(intent);
                finish();
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