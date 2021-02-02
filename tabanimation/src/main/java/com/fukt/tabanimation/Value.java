package com.fukt.tabanimation;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Value {


    static final int ANIMATION_STYLE_NONE = 0;
    static final int ANIMATION_STYLE_EXTEND = 1;
    static final int ANIMATION_STYLE_APPEAR = 2;
    static final int ANIMATION_STYLE_SCALE = 3;
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({ANIMATION_STYLE_NONE, ANIMATION_STYLE_EXTEND, ANIMATION_STYLE_APPEAR, ANIMATION_STYLE_SCALE})
    public @interface PreviewAnimationType {}
}
