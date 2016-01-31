package com.davidhan.KitTest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.davidhan.kit.activities.ToolbarActivity;
import com.davidhan.kit.utils.CommonDialogs;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends ToolbarActivity {
    @Bind(R.id.popup_button)
    Button mPopupButton;
    @Bind(R.id.main_activity_open_multi_button)
    Button mOpenMulti;
    @Bind(R.id.main_open_animations)
    Button mOpenAnims;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        mPopupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonDialogs.getConfirmDialog(MainActivity.this, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setTitle("Confirm?").setMessage("This is a test dialog").show();
            }
        });
        mOpenMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, SlideDeckTestActvitiy.class));
            }
        });
        mOpenAnims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AnimShowcaseActivity.class));
            }
        });
    }


}
