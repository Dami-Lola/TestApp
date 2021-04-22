package com.damio.unionmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class IntroductionAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public IntroductionAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.createaccount,
            R.drawable.updateaccountdetails,
    };

    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView introImages;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.introduction_image, container, false);
        introImages = view.findViewById(R.id.introImage);
        introImages.setImageResource(slide_images[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        (container).removeView((ConstraintLayout) object);
    }

}
