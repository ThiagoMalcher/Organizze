package tmalcher.study.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //how to use fragments in slide bar

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_blue_light)
                .fragment(R.layout.intro_01)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_blue_light)
                .fragment(R.layout.intro_02)
                .build());


        /* how to use simple slide
        //disable buttons
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //add slide
        addSlide(new SimpleSlide.Builder()
                .title("Welcome to Orgonizze")
                .description("this app serves to organize your money in your life, change your vision about your buys, when to thing to buy wait a minute and open this app and check your finance.")
                .image(R.drawable.first)
                .background(android.R.color.holo_orange_light)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Follow instruction")
                .description("Do you like money? Control your money in your palm of your hand.")
                .image(R.drawable.second)
                .background(android.R.color.holo_orange_light)
                .build()); */

    }
}