package com.example.taruc.lab33vnavigationdrawer;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static android.app.Activity.RESULT_OK;

public class GalleryFragment extends Fragment {
    private ImageView imageViewPhoto;
    public static final int REQUEST_PICK = 1;

    public GalleryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        imageViewPhoto = (ImageView)v.findViewById(R.id.imageViewPhoto);

        Button buttonGetFile = (Button)v.findViewById(R.id.buttonGetFile);
        buttonGetFile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select picture"), REQUEST_PICK);
            }
        });
        return v;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_PICK && resultCode == RESULT_OK){
            Uri uri = null;
            if(data!= null){
                uri = data.getData();
                imageViewPhoto.setImageURI(uri);
            }
        }
    }
}
