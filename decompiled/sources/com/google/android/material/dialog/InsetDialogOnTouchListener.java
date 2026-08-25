package com.google.android.material.dialog;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class InsetDialogOnTouchListener implements android.view.View.OnTouchListener {

    @androidx.annotation.NonNull
    private final android.app.Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(@androidx.annotation.NonNull android.app.Dialog r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r1 = this;
            r1.<init>()
            r1.dialog = r2
            int r0 = r3.left
            r1.leftInset = r0
            int r3 = r3.top
            r1.topInset = r3
            android.content.Context r2 = r2.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledWindowTouchSlop()
            r1.prePieSlop = r2
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@androidx.annotation.NonNull android.view.View r6, @androidx.annotation.NonNull android.view.MotionEvent r7) {
            r5 = this;
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r6.findViewById(r0)
            int r1 = r5.leftInset
            int r2 = r0.getLeft()
            int r2 = r2 + r1
            int r1 = r0.getWidth()
            int r1 = r1 + r2
            int r3 = r5.topInset
            int r4 = r0.getTop()
            int r4 = r4 + r3
            int r0 = r0.getHeight()
            int r0 = r0 + r4
            android.graphics.RectF r3 = new android.graphics.RectF
            float r2 = (float) r2
            float r4 = (float) r4
            float r1 = (float) r1
            float r0 = (float) r0
            r3.<init>(r2, r4, r1, r0)
            float r0 = r7.getX()
            float r1 = r7.getY()
            boolean r0 = r3.contains(r0, r1)
            r1 = 0
            if (r0 == 0) goto L38
            return r1
        L38:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            int r7 = r7.getAction()
            r2 = 1
            if (r7 != r2) goto L47
            r7 = 4
            r0.setAction(r7)
        L47:
            int r7 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r7 >= r3) goto L5b
            r0.setAction(r1)
            int r7 = r5.prePieSlop
            int r1 = -r7
            int r1 = r1 - r2
            float r1 = (float) r1
            int r7 = -r7
            int r7 = r7 - r2
            float r7 = (float) r7
            r0.setLocation(r1, r7)
        L5b:
            r6.performClick()
            android.app.Dialog r6 = r5.dialog
            boolean r6 = r6.onTouchEvent(r0)
            return r6
    }
}
