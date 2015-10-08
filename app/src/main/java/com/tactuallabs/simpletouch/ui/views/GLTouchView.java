package com.tactuallabs.simpletouch.ui.views;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLTouchView extends GLSurfaceView {

    private TouchViewRenderer mRenderer;

    public GLTouchView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mRenderer = new TouchViewRenderer();
        setRenderer(mRenderer);
    }

    private class TouchViewRenderer implements GLSurfaceView.Renderer {

        private final float[] COLOR_WHITE = new float[] {1, 1, 1, 1};
        private final float[] COLOR_BLACK = new float[] {0, 0, 0, 1};

        private float[] mColor;

        public TouchViewRenderer() {
            mColor = COLOR_BLACK;
        }

        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {

        }

        @Override
        public void onDrawFrame(GL10 gl) {

        }
    }
}
