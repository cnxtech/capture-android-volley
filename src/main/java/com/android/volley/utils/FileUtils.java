package com.android.volley.utils;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * User: paveldolgov
 * Date: 1/30/14
 */
public class FileUtils {


    public static String getMimeTypeForFilePath(String filePath) {
        String type = "";
        String extension = MimeTypeMap.getFileExtensionFromUrl(filePath);
        if (extension != null && !extension.isEmpty()) {
            MimeTypeMap mime = MimeTypeMap.getSingleton();
            type = mime.getMimeTypeFromExtension(extension);
        }
        return type;
    }


    public static byte[] loadFileAsBytes(String filePath) {
        byte[] bytes = new byte[0];
        InputStream inputStream = null;
        try {
            File file = new File(filePath);
            if (file.exists() && file.length() != 0) {
                inputStream = new FileInputStream(file);
                bytes = IOUtils.toByteArray(inputStream);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return bytes;
    }


    public static String getFilePath(String uri) {
        String filePath = uri;
        if (uri.startsWith("file")) {
            filePath = Uri.parse(uri).getPath();
        }
        return filePath;
    }
}
