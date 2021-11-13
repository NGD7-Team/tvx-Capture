package com.android.gles3jni;

import android.graphics.Bitmap;

public interface IWebcam {
    public Bitmap getFrame();
    public void stop();
    public boolean isAttached();
}
