package com.android.volley.toolbox;

import android.graphics.Bitmap;

/**
 * User: paveldolgov
 * Date: 1/17/14
 */
public interface BitmapPostProcessingTask {

    Bitmap execute(Bitmap sourceBitmap);
}
