package com.damio.unionmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class ExistingUserActivity extends AppCompatActivity {

    ImageView optionsImage;
    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_user);
        loginFragment = new LoginFragment();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), loginFragment, R.id.content_frame);
    }
}