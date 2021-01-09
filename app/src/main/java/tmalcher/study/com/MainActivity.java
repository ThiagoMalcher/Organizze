package tmalcher.study.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import tmalcher.study.com.acitivity.LoginActivity;
import tmalcher.study.com.acitivity.SignupActivity;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // how to use fragments in slide bar
        // in this version i don't need to add .canGoBackward(true) because this functionality is ok.
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_01)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_02)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_03)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_04)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_signin)
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

    public void btSignin(View view)
    {
       startActivity(new Intent(this, LoginActivity.class));
    }

    public void btSignup(View view)
    {
        startActivity(new Intent(this, SignupActivity.class));
    }
}