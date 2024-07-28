package com.simon.androiddemo002;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setButton(view);
        //LOL LOL
    }
    protected void setButton(View view){
        Button button = view.findViewById(R.id.next_id);
        button.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new Fragment2()).commit());
    }
}
