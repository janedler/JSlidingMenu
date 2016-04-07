package com.janedler;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by janedler on 16/4/3.
 */
public class LeftFragment extends Fragment {

    private View mView;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.left_layout,null);
        return mView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        button = (Button) mView.findViewById(R.id.button_left);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menu.toggle(true);
            }
        });


    }

}
