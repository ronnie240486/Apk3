package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TouchObserverFrameLayout extends android.widget.FrameLayout {

    @androidx.annotation.Nullable
    private android.view.View.OnTouchListener onTouchListener;

    public TouchObserverFrameLayout(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public TouchObserverFrameLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public TouchObserverFrameLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.onTouchListener
            if (r0 == 0) goto L7
            r0.onTouch(r1, r2)
        L7:
            boolean r2 = super.onInterceptTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public void setOnTouchListener(@androidx.annotation.Nullable android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.onTouchListener = r1
            return
    }
}
