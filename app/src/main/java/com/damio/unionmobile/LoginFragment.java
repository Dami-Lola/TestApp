package com.damio.unionmobile;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.customview.widget.ViewDragHelper;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.pedrovgs.DraggablePanel;


public class LoginFragment extends Fragment {
    public LoginFragment() {
        // Required empty public constructor
    }
    DraggablePanel draggablePanel;
    LoginFragment loginFragment;
    MoreFragment moreFragment;
    ImageView options;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        loginFragment = new LoginFragment();
        moreFragment = new MoreFragment();
        options = root.findViewById(R.id.optionsImage);
        draggablePanel = root.findViewById(R.id.draggable_panel);

        initializeDraggablePanel();
        return root;
    }

    private void initializeDraggablePanel() throws Resources.NotFoundException {
        draggablePanel.setFragmentManager(getActivity().getSupportFragmentManager());
        draggablePanel.setTopFragment(loginFragment);
        draggablePanel.setBottomFragment(moreFragment);
        draggablePanel.initializeView();
    }
}