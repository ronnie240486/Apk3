package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class TouchTracker extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, com.google.android.exoplayer2.video.spherical.OrientationListener.Listener {
    private final android.graphics.PointF accumulatedTouchOffsetDegrees;
    private final android.view.GestureDetector gestureDetector;
    private final com.google.android.exoplayer2.video.spherical.TouchTracker.Listener listener;
    private final android.graphics.PointF previousTouchPointPx;
    private final float pxPerDegrees;
    private volatile float roll;

    public interface Listener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.TouchTracker$Listener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static boolean $default$onSingleTapUp(com.google.android.exoplayer2.video.spherical.TouchTracker.Listener r0, android.view.MotionEvent r1) {
                    r0 = 0
                    return r0
            }
        }

        void onScrollChange(android.graphics.PointF r1);

        boolean onSingleTapUp(android.view.MotionEvent r1);
    }

    public TouchTracker(android.content.Context r2, com.google.android.exoplayer2.video.spherical.TouchTracker.Listener r3, float r4) {
            r1 = this;
            r1.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.previousTouchPointPx = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.accumulatedTouchOffsetDegrees = r0
            r1.listener = r3
            r1.pxPerDegrees = r4
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r2, r1)
            r1.gestureDetector = r3
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            r1.roll = r2
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent r3) {
            r2 = this;
            android.graphics.PointF r0 = r2.previousTouchPointPx
            float r1 = r3.getX()
            float r3 = r3.getY()
            r0.set(r1, r3)
            r3 = 1
            return r3
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    @androidx.annotation.BinderThread
    public void onOrientationChange(float[] r1, float r2) {
            r0 = this;
            float r1 = -r2
            r0.roll = r1
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent r5, android.view.MotionEvent r6, float r7, float r8) {
            r4 = this;
            float r5 = r6.getX()
            android.graphics.PointF r7 = r4.previousTouchPointPx
            float r7 = r7.x
            float r5 = r5 - r7
            float r7 = r4.pxPerDegrees
            float r5 = r5 / r7
            float r7 = r6.getY()
            android.graphics.PointF r8 = r4.previousTouchPointPx
            float r0 = r8.y
            float r7 = r7 - r0
            float r0 = r4.pxPerDegrees
            float r7 = r7 / r0
            float r0 = r6.getX()
            float r6 = r6.getY()
            r8.set(r0, r6)
            float r6 = r4.roll
            double r0 = (double) r6
            double r2 = java.lang.Math.cos(r0)
            float r6 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            float r8 = (float) r0
            android.graphics.PointF r0 = r4.accumulatedTouchOffsetDegrees
            float r1 = r0.x
            float r2 = r6 * r5
            float r3 = r8 * r7
            float r2 = r2 - r3
            float r1 = r1 - r2
            r0.x = r1
            float r1 = r0.y
            float r8 = r8 * r5
            float r6 = r6 * r7
            float r6 = r6 + r8
            float r6 = r6 + r1
            r0.y = r6
            r5 = 1110704128(0x42340000, float:45.0)
            float r5 = java.lang.Math.min(r5, r6)
            r6 = -1036779520(0xffffffffc2340000, float:-45.0)
            float r5 = java.lang.Math.max(r6, r5)
            r0.y = r5
            com.google.android.exoplayer2.video.spherical.TouchTracker$Listener r5 = r4.listener
            android.graphics.PointF r6 = r4.accumulatedTouchOffsetDegrees
            r5.onScrollChange(r6)
            r5 = 1
            return r5
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.TouchTracker$Listener r0 = r1.listener
            boolean r2 = r0.onSingleTapUp(r2)
            return r2
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            android.view.GestureDetector r1 = r0.gestureDetector
            boolean r1 = r1.onTouchEvent(r2)
            return r1
    }
}
