package com.liucong.customview;

import android.content.Context;
import android.graphics.Point;

/**
 * Created by liucong on 2017/3/12.
 */

public class DisplayUtils {

    public static Point getDisplayScreen(Context ctx){
        Point point = new Point();
        point.x = ctx.getResources().getDisplayMetrics().widthPixels;
        point.y = ctx.getResources().getDisplayMetrics().heightPixels;
        return point;
    }

    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }



}
