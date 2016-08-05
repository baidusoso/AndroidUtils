package com.baidusoso.androidutils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by baidusoso on 16/6/29.
 */
public class FileUtils {

    private FileUtils() {

    }

    /**
     * Close stream or reader
     */
    public static void close(Closeable is) {
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] readFileToBytes(String file) throws IOException {
        return readStreamToBytes(new FileInputStream(file));
    }

    /**
     * get byte array data from InputStream
     */
    public static byte[] readStreamToBytes(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte[] buffer = new byte[1024 * 10];
            int length = -1;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
            out.flush();
            return out.toByteArray();
        } finally {
            close(out);
            close(in);
        }
    }

    /**
     * Get data from InputStream and write it into file.
     */
    public static void writeFile(InputStream in, File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("The file parameter can't be null!");
        }
        if (!file.getParentFile().exists())
            file.getParentFile().mkdirs();

        if (file.exists())
            file.delete();

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            byte[] buffer = new byte[1024 * 10];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            out.flush();
        } finally {
            close(out);
            close(in);
        }
    }
}
