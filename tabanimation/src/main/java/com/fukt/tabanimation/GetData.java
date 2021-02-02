package com.fukt.tabanimation;

public class GetData {
    public static int getValue(String value,
                               @Value.PreviewAnimationType int previewAnimationType) {
        return preloadToEmmers(value, previewAnimationType);
    }

    private static int preloadToEmmers(String value,
                                       @Value.PreviewAnimationType int previewAnimationType) {
        if (!value.equals(TabAnontation.isTheme)) {
            return R.style.KeyPreviewAnimationExtender;
        } else {
           return getInTheValue(value, previewAnimationType);
        }
    }

    private static int getInTheValue(String value, @Value.PreviewAnimationType int previewAnimationType) {
        switch (previewAnimationType) {
            case Value.ANIMATION_STYLE_APPEAR:
                return R.style.KeyPreviewAnimationAppear;
            case Value.ANIMATION_STYLE_SCALE:
                return R.style.KeyPreviewAnimationScale;
            case Value.ANIMATION_STYLE_NONE:
                return 0;
            case Value.ANIMATION_STYLE_EXTEND:
            default:
                return R.style.KeyPreviewAnimationExtend;
        }
    }
}
