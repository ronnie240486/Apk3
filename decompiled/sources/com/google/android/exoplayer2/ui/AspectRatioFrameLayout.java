package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener;
    private final com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float r1, float r2, boolean r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class AspectRatioUpdateDispatcher implements java.lang.Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;
        public final /* synthetic */ com.google.android.exoplayer2.ui.AspectRatioFrameLayout this$0;

        private AspectRatioUpdateDispatcher(com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ AspectRatioUpdateDispatcher(com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1, com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
                r4.isScheduled = r0
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r4.this$0
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioListener r0 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.access$100(r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r4.this$0
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioListener r0 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.access$100(r0)
                float r1 = r4.targetAspectRatio
                float r2 = r4.naturalAspectRatio
                boolean r3 = r4.aspectRatioMismatch
                r0.onAspectRatioUpdated(r1, r2, r3)
                return
        }

        public void scheduleUpdate(float r1, float r2, boolean r3) {
                r0 = this;
                r0.targetAspectRatio = r1
                r0.naturalAspectRatio = r2
                r0.aspectRatioMismatch = r3
                boolean r1 = r0.isScheduled
                if (r1 != 0) goto L12
                r1 = 1
                r0.isScheduled = r1
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = r0.this$0
                r1.post(r0)
            L12:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AspectRatioFrameLayout(android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 0
            r2.resizeMode = r0
            if (r4 == 0) goto L23
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int[] r1 = com.google.android.exoplayer2.ui.R.styleable.AspectRatioFrameLayout
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r0, r0)
            int r4 = com.google.android.exoplayer2.ui.R.styleable.AspectRatioFrameLayout_resize_mode     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.getInt(r4, r0)     // Catch: java.lang.Throwable -> L1e
            r2.resizeMode = r4     // Catch: java.lang.Throwable -> L1e
            r3.recycle()
            goto L23
        L1e:
            r4 = move-exception
            r3.recycle()
            throw r4
        L23:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r3 = new com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher
            r4 = 0
            r3.<init>(r2, r4)
            r2.aspectRatioUpdateDispatcher = r3
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener access$100(com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0) {
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioListener r0 = r0.aspectRatioListener
            return r0
    }

    public int getResizeMode() {
            r1 = this;
            int r0 = r1.resizeMode
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r9, int r10) {
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.videoAspectRatio
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.videoAspectRatio
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r9 = r8.aspectRatioUpdateDispatcher
            float r10 = r8.videoAspectRatio
            r0 = 0
            r9.scheduleUpdate(r10, r3, r0)
            return
        L31:
            int r5 = r8.resizeMode
            r6 = 1
            if (r5 == 0) goto L54
            if (r5 == r6) goto L4f
            r7 = 2
            if (r5 == r7) goto L49
            r7 = 4
            if (r5 == r7) goto L3f
            goto L5e
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L46
            float r9 = r8.videoAspectRatio
            goto L4b
        L46:
            float r10 = r8.videoAspectRatio
            goto L51
        L49:
            float r9 = r8.videoAspectRatio
        L4b:
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L5e
        L4f:
            float r10 = r8.videoAspectRatio
        L51:
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L5e
        L54:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L5b
            float r10 = r8.videoAspectRatio
            goto L51
        L5b:
            float r9 = r8.videoAspectRatio
            goto L4b
        L5e:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r10 = r8.aspectRatioUpdateDispatcher
            float r1 = r8.videoAspectRatio
            r10.scheduleUpdate(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
    }

    public void setAspectRatio(float r2) {
            r1 = this;
            float r0 = r1.videoAspectRatio
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.videoAspectRatio = r2
            r1.requestLayout()
        Lb:
            return
    }

    public void setAspectRatioListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener r1) {
            r0 = this;
            r0.aspectRatioListener = r1
            return
    }

    public void setResizeMode(int r2) {
            r1 = this;
            int r0 = r1.resizeMode
            if (r0 == r2) goto L9
            r1.resizeMode = r2
            r1.requestLayout()
        L9:
            return
    }
}
