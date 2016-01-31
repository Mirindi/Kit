package com.davidhan.KitTest;

import android.os.Bundle;
import android.view.View;

import com.davidhan.kit.activities.ToolbarActivity;
import com.davidhan.kit.views.InlineItem;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AnimShowcaseActivity extends ToolbarActivity implements View.OnClickListener {

    @Bind(R.id.anim_target)
    View animTarget;
    @Bind(R.id.anim_enter_bot)
    InlineItem animEnterBot;
    @Bind(R.id.anim_expand_out)
    InlineItem animExpandOut;
    @Bind(R.id.anim_shake)
    InlineItem animShake;
    @Bind(R.id.anim_fade_up)
    InlineItem animFadeUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_anim_showcase);
        ButterKnife.bind(this);
        animEnterBot.setOnClickListener(this);
        animExpandOut.setOnClickListener(this);
        animShake.setOnClickListener(this);
        animFadeUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == animEnterBot){

        }
        if(v == animExpandOut){

        }
        if(v == animShake){

        }
        if(v == animFadeUp){

        }
    }
}
