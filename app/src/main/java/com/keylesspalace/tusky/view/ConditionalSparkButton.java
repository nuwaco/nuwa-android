package com.keylesspalace.tusky.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import at.connyduck.sparkbutton.SparkButton;

public class ConditionalSparkButton extends SparkButton {

    public ConditionalSparkButtonClickListener onClickListener = (__) -> false;

    public ConditionalSparkButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ConditionalSparkButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ConditionalSparkButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onClick(View v) {
        if (!onClickListener.onClick(!this.isChecked())) {
            super.onClick(v);
        }
    }

    public void doCLick() {
        super.onClick(this);
    }


    public interface ConditionalSparkButtonClickListener {
        boolean onClick(boolean buttonStatus);
    }
}

