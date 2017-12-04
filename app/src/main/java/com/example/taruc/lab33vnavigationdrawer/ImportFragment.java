package com.example.taruc.lab33vnavigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ImportFragment extends Fragment {
    private TextView textViewMessage;

    public ImportFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        //define main class viw, v
        View v = inflater.inflate(R.layout.fragment_import, container, false);
        textViewMessage = (TextView)v.findViewById(R.id.textViewMessage);

        //event handler of button
        Button buttonShowMessage = (Button)v.findViewById(R.id.buttonMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Your message here");
            }
        });

        return v;
    }

}
