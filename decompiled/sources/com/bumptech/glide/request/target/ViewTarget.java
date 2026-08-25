package com.bumptech.glide.request.target;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public abstract class ViewTarget<T extends android.view.View, Z> extends com.bumptech.glide.request.target.BaseTarget<Z> {
    private static final java.lang.String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce;
    private static int tagId;

    @androidx.annotation.Nullable
    private android.view.View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final com.bumptech.glide.request.target.ViewTarget.SizeDeterminer sizeDeterminer;
    public final T view;


    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static final class SizeDeterminer {
        private static final int PENDING_SIZE = 0;

        @androidx.annotation.Nullable
        @androidx.annotation.VisibleForTesting
        public static java.lang.Integer maxDisplayLength;
        private final java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> cbs;

        @androidx.annotation.Nullable
        private com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.SizeDeterminerLayoutListener layoutListener;
        private final android.view.View view;
        public boolean waitForLayout;

        public static final class SizeDeterminerLayoutListener implements android.view.ViewTreeObserver.OnPreDrawListener {
            private final java.lang.ref.WeakReference<com.bumptech.glide.request.target.ViewTarget.SizeDeterminer> sizeDeterminerRef;

            public SizeDeterminerLayoutListener(@androidx.annotation.NonNull com.bumptech.glide.request.target.ViewTarget.SizeDeterminer r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.sizeDeterminerRef = r0
                    return
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                    r3 = this;
                    java.lang.String r0 = "ViewTarget"
                    r1 = 2
                    boolean r1 = android.util.Log.isLoggable(r0, r1)
                    if (r1 == 0) goto L1d
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "OnGlobalLayoutListener called attachStateListener="
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r0, r1)
                L1d:
                    java.lang.ref.WeakReference<com.bumptech.glide.request.target.ViewTarget$SizeDeterminer> r0 = r3.sizeDeterminerRef
                    java.lang.Object r0 = r0.get()
                    com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r0 = (com.bumptech.glide.request.target.ViewTarget.SizeDeterminer) r0
                    if (r0 == 0) goto L2a
                    r0.checkCurrentDimens()
                L2a:
                    r0 = 1
                    return r0
            }
        }

        public SizeDeterminer(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.cbs = r0
                r1.view = r2
                return
        }

        private static int getMaxDisplayLength(@androidx.annotation.NonNull android.content.Context r1) {
                java.lang.Integer r0 = com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.maxDisplayLength
                if (r0 != 0) goto L2d
                java.lang.String r0 = "window"
                java.lang.Object r1 = r1.getSystemService(r0)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                android.view.Display r1 = r1.getDefaultDisplay()
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                r1.getSize(r0)
                int r1 = r0.x
                int r0 = r0.y
                int r1 = java.lang.Math.max(r1, r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.maxDisplayLength = r1
            L2d:
                java.lang.Integer r1 = com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.maxDisplayLength
                int r1 = r1.intValue()
                return r1
        }

        private int getTargetDimen(int r3, int r4, int r5) {
                r2 = this;
                int r0 = r4 - r5
                if (r0 <= 0) goto L5
                return r0
            L5:
                boolean r0 = r2.waitForLayout
                r1 = 0
                if (r0 == 0) goto L13
                android.view.View r0 = r2.view
                boolean r0 = r0.isLayoutRequested()
                if (r0 == 0) goto L13
                return r1
            L13:
                int r3 = r3 - r5
                if (r3 <= 0) goto L17
                return r3
            L17:
                android.view.View r3 = r2.view
                boolean r3 = r3.isLayoutRequested()
                if (r3 != 0) goto L3b
                r3 = -2
                if (r4 != r3) goto L3b
                r3 = 4
                java.lang.String r4 = "ViewTarget"
                boolean r3 = android.util.Log.isLoggable(r4, r3)
                if (r3 == 0) goto L30
                java.lang.String r3 = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."
                android.util.Log.i(r4, r3)
            L30:
                android.view.View r3 = r2.view
                android.content.Context r3 = r3.getContext()
                int r3 = getMaxDisplayLength(r3)
                return r3
            L3b:
                return r1
        }

        private int getTargetHeight() {
                r3 = this;
                android.view.View r0 = r3.view
                int r0 = r0.getPaddingTop()
                android.view.View r1 = r3.view
                int r1 = r1.getPaddingBottom()
                int r1 = r1 + r0
                android.view.View r0 = r3.view
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L18
                int r0 = r0.height
                goto L19
            L18:
                r0 = 0
            L19:
                android.view.View r2 = r3.view
                int r2 = r2.getHeight()
                int r0 = r3.getTargetDimen(r2, r0, r1)
                return r0
        }

        private int getTargetWidth() {
                r3 = this;
                android.view.View r0 = r3.view
                int r0 = r0.getPaddingLeft()
                android.view.View r1 = r3.view
                int r1 = r1.getPaddingRight()
                int r1 = r1 + r0
                android.view.View r0 = r3.view
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L18
                int r0 = r0.width
                goto L19
            L18:
                r0 = 0
            L19:
                android.view.View r2 = r3.view
                int r2 = r2.getWidth()
                int r0 = r3.getTargetDimen(r2, r0, r1)
                return r0
        }

        private boolean isDimensionValid(int r2) {
                r1 = this;
                if (r2 > 0) goto L9
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto L7
                goto L9
            L7:
                r2 = 0
                goto La
            L9:
                r2 = 1
            La:
                return r2
        }

        private boolean isViewStateAndSizeValid(int r1, int r2) {
                r0 = this;
                boolean r1 = r0.isDimensionValid(r1)
                if (r1 == 0) goto Le
                boolean r1 = r0.isDimensionValid(r2)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        private void notifyCbs(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r1 = r2.cbs
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.request.target.SizeReadyCallback r1 = (com.bumptech.glide.request.target.SizeReadyCallback) r1
                r1.onSizeReady(r3, r4)
                goto Lb
            L1b:
                return
        }

        public final void checkCurrentDimens() {
                r3 = this;
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L9
                return
            L9:
                int r0 = r3.getTargetWidth()
                int r1 = r3.getTargetHeight()
                boolean r2 = r3.isViewStateAndSizeValid(r0, r1)
                if (r2 != 0) goto L18
                return
            L18:
                r3.notifyCbs(r0, r1)
                r3.clearCallbacksAndListener()
                return
        }

        public final void clearCallbacksAndListener() {
                r2 = this;
                android.view.View r0 = r2.view
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                boolean r1 = r0.isAlive()
                if (r1 == 0) goto L11
                com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r1 = r2.layoutListener
                r0.removeOnPreDrawListener(r1)
            L11:
                r0 = 0
                r2.layoutListener = r0
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r2.cbs
                r0.clear()
                return
        }

        public final void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r4) {
                r3 = this;
                int r0 = r3.getTargetWidth()
                int r1 = r3.getTargetHeight()
                boolean r2 = r3.isViewStateAndSizeValid(r0, r1)
                if (r2 == 0) goto L12
                r4.onSizeReady(r0, r1)
                return
            L12:
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto L1f
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                r0.add(r4)
            L1f:
                com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r4 = r3.layoutListener
                if (r4 != 0) goto L33
                android.view.View r4 = r3.view
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r0 = new com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
                r0.<init>(r3)
                r3.layoutListener = r0
                r4.addOnPreDrawListener(r0)
            L33:
                return
        }

        public final void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r1.cbs
                r0.remove(r2)
                return
        }
    }

    static {
            int r0 = com.bumptech.glide.R.id.glide_custom_view_target_tag
            com.bumptech.glide.request.target.ViewTarget.tagId = r0
            return
    }

    public ViewTarget(@androidx.annotation.NonNull T r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            android.view.View r0 = (android.view.View) r0
            r1.view = r0
            com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r0 = new com.bumptech.glide.request.target.ViewTarget$SizeDeterminer
            r0.<init>(r2)
            r1.sizeDeterminer = r0
            return
    }

    @java.lang.Deprecated
    public ViewTarget(@androidx.annotation.NonNull T r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.waitForLayout()
        L8:
            return
    }

    @androidx.annotation.Nullable
    private java.lang.Object getTag() {
            r2 = this;
            T extends android.view.View r0 = r2.view
            int r1 = com.bumptech.glide.request.target.ViewTarget.tagId
            java.lang.Object r0 = r0.getTag(r1)
            return r0
    }

    private void maybeAddAttachStateListener() {
            r2 = this;
            android.view.View$OnAttachStateChangeListener r0 = r2.attachStateListener
            if (r0 == 0) goto L11
            boolean r1 = r2.isAttachStateListenerAdded
            if (r1 == 0) goto L9
            goto L11
        L9:
            T extends android.view.View r1 = r2.view
            r1.addOnAttachStateChangeListener(r0)
            r0 = 1
            r2.isAttachStateListenerAdded = r0
        L11:
            return
    }

    private void maybeRemoveAttachStateListener() {
            r2 = this;
            android.view.View$OnAttachStateChangeListener r0 = r2.attachStateListener
            if (r0 == 0) goto L11
            boolean r1 = r2.isAttachStateListenerAdded
            if (r1 != 0) goto L9
            goto L11
        L9:
            T extends android.view.View r1 = r2.view
            r1.removeOnAttachStateChangeListener(r0)
            r0 = 0
            r2.isAttachStateListenerAdded = r0
        L11:
            return
    }

    private void setTag(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            r0 = 1
            com.bumptech.glide.request.target.ViewTarget.isTagUsedAtLeastOnce = r0
            T extends android.view.View r0 = r2.view
            int r1 = com.bumptech.glide.request.target.ViewTarget.tagId
            r0.setTag(r1, r3)
            return
    }

    @java.lang.Deprecated
    public static void setTagId(int r1) {
            boolean r0 = com.bumptech.glide.request.target.ViewTarget.isTagUsedAtLeastOnce
            if (r0 != 0) goto L7
            com.bumptech.glide.request.target.ViewTarget.tagId = r1
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot set the tag id more than once or change the tag id after the first request has been made"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.request.target.ViewTarget<T, Z> clearOnDetach() {
            r1 = this;
            android.view.View$OnAttachStateChangeListener r0 = r1.attachStateListener
            if (r0 == 0) goto L5
            return r1
        L5:
            com.bumptech.glide.request.target.ViewTarget$1 r0 = new com.bumptech.glide.request.target.ViewTarget$1
            r0.<init>(r1)
            r1.attachStateListener = r0
            r1.maybeAddAttachStateListener()
            return r1
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @androidx.annotation.Nullable
    public com.bumptech.glide.request.Request getRequest() {
            r2 = this;
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L15
            boolean r1 = r0 instanceof com.bumptech.glide.request.Request
            if (r1 == 0) goto Ld
            com.bumptech.glide.request.Request r0 = (com.bumptech.glide.request.Request) r0
            goto L16
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must not call setTag() on a view Glide is targeting"
            r0.<init>(r1)
            throw r0
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // com.bumptech.glide.request.target.Target
    @androidx.annotation.CallSuper
    public void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r2) {
            r1 = this;
            com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r0 = r1.sizeDeterminer
            r0.getSize(r2)
            return
    }

    @androidx.annotation.NonNull
    public T getView() {
            r1 = this;
            T extends android.view.View r0 = r1.view
            return r0
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @androidx.annotation.CallSuper
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.onLoadCleared(r1)
            com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r1 = r0.sizeDeterminer
            r1.clearCallbacksAndListener()
            boolean r1 = r0.isClearedByUs
            if (r1 != 0) goto Lf
            r0.maybeRemoveAttachStateListener()
        Lf:
            return
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @androidx.annotation.CallSuper
    public void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.onLoadStarted(r1)
            r0.maybeAddAttachStateListener()
            return
    }

    public final void pauseMyRequest() {
            r2 = this;
            com.bumptech.glide.request.Request r0 = r2.getRequest()
            if (r0 == 0) goto Lf
            r1 = 1
            r2.isClearedByUs = r1
            r0.clear()
            r0 = 0
            r2.isClearedByUs = r0
        Lf:
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    @androidx.annotation.CallSuper
    public void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r2) {
            r1 = this;
            com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r0 = r1.sizeDeterminer
            r0.removeCallback(r2)
            return
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1) {
            r0 = this;
            r0.setTag(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Target for: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            T extends android.view.View r1 = r2.view
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.request.target.ViewTarget<T, Z> waitForLayout() {
            r2 = this;
            com.bumptech.glide.request.target.ViewTarget$SizeDeterminer r0 = r2.sizeDeterminer
            r1 = 1
            r0.waitForLayout = r1
            return r2
    }
}
