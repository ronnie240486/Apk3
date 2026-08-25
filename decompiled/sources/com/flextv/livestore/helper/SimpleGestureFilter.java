package com.flextv.livestore.helper;

/* JADX INFO: loaded from: classes.dex */
public class SimpleGestureFilter extends android.view.GestureDetector.SimpleOnGestureListener {
    private static final int ACTION_FAKE = -13;
    public static final int MODE_DYNAMIC = 2;
    public static final int MODE_SOLID = 1;
    public static final int MODE_TRANSPARENT = 0;
    public static final int SWIPE_DOWN = 2;
    public static final int SWIPE_LEFT = 3;
    public static final int SWIPE_RIGHT = 4;
    public static final int SWIPE_UP = 1;
    private android.app.Activity context;
    private android.view.GestureDetector detector;
    private com.flextv.livestore.helper.SimpleGestureFilter.SimpleGestureListener listener;
    private int mode;
    private boolean running;
    private int swipe_Max_Distance;
    private int swipe_Min_Distance;
    private int swipe_Min_Velocity;
    private boolean tapIndicator;

    /* JADX INFO: loaded from: classes2.dex */
    public interface SimpleGestureListener {
        void onDoubleTap();

        void onSwipe(int r1);
    }

    public SimpleGestureFilter(android.app.Activity r2, com.flextv.livestore.helper.SimpleGestureFilter.SimpleGestureListener r3) {
            r1 = this;
            r1.<init>()
            r0 = 100
            r1.swipe_Min_Distance = r0
            r0 = 350(0x15e, float:4.9E-43)
            r1.swipe_Max_Distance = r0
            r0 = 50
            r1.swipe_Min_Velocity = r0
            r0 = 2
            r1.mode = r0
            r0 = 1
            r1.running = r0
            r0 = 0
            r1.tapIndicator = r0
            r1.context = r2
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r2, r1)
            r1.detector = r0
            r1.listener = r3
            return
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    public int getSwipeMaxDistance() {
            r1 = this;
            int r0 = r1.swipe_Max_Distance
            return r0
    }

    public int getSwipeMinDistance() {
            r1 = this;
            int r0 = r1.swipe_Min_Distance
            return r0
    }

    public int getSwipeMinVelocity() {
            r1 = this;
            int r0 = r1.swipe_Min_Velocity
            return r0
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent r1) {
            r0 = this;
            com.flextv.livestore.helper.SimpleGestureFilter$SimpleGestureListener r1 = r0.listener
            r1.onDoubleTap()
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
            r6 = this;
            float r0 = r7.getX()
            float r1 = r8.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r7.getY()
            float r2 = r8.getY()
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = r6.swipe_Max_Distance
            float r3 = (float) r2
            r4 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L7f
            float r2 = (float) r2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L28
            goto L7f
        L28:
            float r9 = java.lang.Math.abs(r9)
            float r10 = java.lang.Math.abs(r10)
            int r2 = r6.swipe_Min_Velocity
            float r3 = (float) r2
            r5 = 1
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L5a
            int r9 = r6.swipe_Min_Distance
            float r9 = (float) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 <= 0) goto L5a
            float r7 = r7.getX()
            float r8 = r8.getX()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L52
            com.flextv.livestore.helper.SimpleGestureFilter$SimpleGestureListener r7 = r6.listener
            r8 = 3
            r7.onSwipe(r8)
            goto L58
        L52:
            com.flextv.livestore.helper.SimpleGestureFilter$SimpleGestureListener r7 = r6.listener
            r8 = 4
            r7.onSwipe(r8)
        L58:
            r4 = 1
            goto L7f
        L5a:
            float r9 = (float) r2
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L7f
            int r9 = r6.swipe_Min_Distance
            float r9 = (float) r9
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L7f
            float r7 = r7.getY()
            float r8 = r8.getY()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L78
            com.flextv.livestore.helper.SimpleGestureFilter$SimpleGestureListener r7 = r6.listener
            r7.onSwipe(r5)
            goto L58
        L78:
            com.flextv.livestore.helper.SimpleGestureFilter$SimpleGestureListener r7 = r6.listener
            r8 = 2
            r7.onSwipe(r8)
            goto L58
        L7f:
            return r4
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r2.mode
            r1 = 2
            if (r0 != r1) goto Lf
            r0 = -13
            r3.setAction(r0)
            android.app.Activity r0 = r2.context
            r0.dispatchTouchEvent(r3)
        Lf:
            r3 = 0
            return r3
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 1
            r0.tapIndicator = r1
            r1 = 0
            return r1
    }

    public void onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.running
            if (r0 != 0) goto L5
            return
        L5:
            android.view.GestureDetector r0 = r5.detector
            boolean r0 = r0.onTouchEvent(r6)
            int r1 = r5.mode
            r2 = 3
            r3 = 1
            if (r1 != r3) goto L15
            r6.setAction(r2)
            goto L34
        L15:
            r4 = 2
            if (r1 != r4) goto L34
            int r1 = r6.getAction()
            r4 = -13
            if (r1 != r4) goto L24
            r6.setAction(r3)
            goto L34
        L24:
            if (r0 == 0) goto L2a
            r6.setAction(r2)
            goto L34
        L2a:
            boolean r0 = r5.tapIndicator
            if (r0 == 0) goto L34
            r0 = 0
            r6.setAction(r0)
            r5.tapIndicator = r0
        L34:
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.running = r1
            return
    }

    public void setMode(int r1) {
            r0 = this;
            r0.mode = r1
            return
    }

    public void setSwipeMaxDistance(int r1) {
            r0 = this;
            r0.swipe_Max_Distance = r1
            return
    }

    public void setSwipeMinDistance(int r1) {
            r0 = this;
            r0.swipe_Min_Distance = r1
            return
    }

    public void setSwipeMinVelocity(int r1) {
            r0 = this;
            r0.swipe_Min_Velocity = r1
            return
    }
}
