package com.android.volley.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;

import java.io.ByteArrayOutputStream;

/**
 * User: paveldolgov
 * Date: 1/29/14
 */
public class BitmapUtils {

    public static byte[] bitmapToBytes(Bitmap bitmap) {
        byte[] bytes = new byte[0];
        if (bitmap == null) { return bytes;}
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        return outputStream.toByteArray();
    }


    public static Bitmap createThumbnailForVideo(String filePath) {
        return ThumbnailUtils.createVideoThumbnail(filePath, MediaStore.Images.Thumbnails.MINI_KIND);
    }


    public static byte[] createThumbnailForVideoAndGetBytes(String filePath) {
        return bitmapToBytes(createThumbnailForVideo(filePath));
    }
}
