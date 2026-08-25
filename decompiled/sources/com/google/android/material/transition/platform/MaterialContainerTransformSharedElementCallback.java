package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends android.app.SharedElementCallback {

    @androidx.annotation.Nullable
    private static java.lang.ref.WeakReference<android.view.View> capturedSharedElement;
    private boolean entering;

    @androidx.annotation.Nullable
    private android.graphics.Rect returnEndBounds;

    @androidx.annotation.Nullable
    private com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider shapeProvider;
    private boolean sharedElementReenterTransitionEnabled;
    private boolean transparentWindowBackgroundEnabled;




    public interface ShapeProvider {
        @androidx.annotation.Nullable
        com.google.android.material.shape.ShapeAppearanceModel provideShape(@androidx.annotation.NonNull android.view.View r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ShapeableViewShapeProvider implements com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider {
        public ShapeableViewShapeProvider() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @androidx.annotation.Nullable
        public com.google.android.material.shape.ShapeAppearanceModel provideShape(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.shape.Shapeable
                if (r0 == 0) goto Lb
                com.google.android.material.shape.Shapeable r2 = (com.google.android.material.shape.Shapeable) r2
                com.google.android.material.shape.ShapeAppearanceModel r2 = r2.getShapeAppearanceModel()
                goto Lc
            Lb:
                r2 = 0
            Lc:
                return r2
        }
    }

    public MaterialContainerTransformSharedElementCallback() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.entering = r0
            r1.transparentWindowBackgroundEnabled = r0
            r0 = 0
            r1.sharedElementReenterTransitionEnabled = r0
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider r0 = new com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider
            r0.<init>()
            r1.shapeProvider = r0
            return
    }

    public static /* synthetic */ void access$000(android.view.Window r0) {
            removeWindowBackground(r0)
            return
    }

    public static /* synthetic */ void access$100(android.view.Window r0) {
            restoreWindowBackground(r0)
            return
    }

    public static /* synthetic */ java.lang.ref.WeakReference access$200() {
            java.lang.ref.WeakReference<android.view.View> r0 = com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement
            return r0
    }

    public static /* synthetic */ void access$202() {
            r0 = 0
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement = r0
            return
    }

    @androidx.annotation.Nullable
    private static android.graphics.drawable.Drawable getWindowBackground(android.view.Window r0) {
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    private static void removeWindowBackground(android.view.Window r2) {
            android.graphics.drawable.Drawable r2 = getWindowBackground(r2)
            if (r2 != 0) goto L7
            return
        L7:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r0 = 0
            androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.CLEAR
            android.graphics.ColorFilter r0 = androidx.core.graphics.BlendModeColorFilterCompat.createBlendModeColorFilterCompat(r0, r1)
            r2.setColorFilter(r0)
            return
    }

    private static void restoreWindowBackground(android.view.Window r0) {
            android.graphics.drawable.Drawable r0 = getWindowBackground(r0)
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.clearColorFilter()
            return
    }

    private void setUpEnterTransform(android.view.Window r3) {
            r2 = this;
            android.transition.Transition r0 = r3.getSharedElementEnterTransition()
            boolean r1 = r0 instanceof com.google.android.material.transition.platform.MaterialContainerTransform
            if (r1 == 0) goto L21
            com.google.android.material.transition.platform.MaterialContainerTransform r0 = (com.google.android.material.transition.platform.MaterialContainerTransform) r0
            boolean r1 = r2.sharedElementReenterTransitionEnabled
            if (r1 != 0) goto L12
            r1 = 0
            r3.setSharedElementReenterTransition(r1)
        L12:
            boolean r1 = r2.transparentWindowBackgroundEnabled
            if (r1 == 0) goto L21
            updateBackgroundFadeDuration(r3, r0)
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1 r1 = new com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1
            r1.<init>(r3)
            r0.addListener(r1)
        L21:
            return
    }

    private void setUpReturnTransform(android.app.Activity r3, android.view.Window r4) {
            r2 = this;
            android.transition.Transition r0 = r4.getSharedElementReturnTransition()
            boolean r1 = r0 instanceof com.google.android.material.transition.platform.MaterialContainerTransform
            if (r1 == 0) goto L25
            com.google.android.material.transition.platform.MaterialContainerTransform r0 = (com.google.android.material.transition.platform.MaterialContainerTransform) r0
            r1 = 1
            r0.setHoldAtEndEnabled(r1)
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$2 r1 = new com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$2
            r1.<init>(r3)
            r0.addListener(r1)
            boolean r3 = r2.transparentWindowBackgroundEnabled
            if (r3 == 0) goto L25
            updateBackgroundFadeDuration(r4, r0)
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3 r3 = new com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3
            r3.<init>(r4)
            r0.addListener(r3)
        L25:
            return
    }

    private static void updateBackgroundFadeDuration(android.view.Window r5, com.google.android.material.transition.platform.MaterialContainerTransform r6) {
            long r0 = r6.getDuration()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            long r0 = r6.getDuration()
            r5.setTransitionBackgroundFadeDuration(r0)
        L11:
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider getShapeProvider() {
            r1 = this;
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider r0 = r1.shapeProvider
            return r0
    }

    public boolean isSharedElementReenterTransitionEnabled() {
            r1 = this;
            boolean r0 = r1.sharedElementReenterTransitionEnabled
            return r0
    }

    public boolean isTransparentWindowBackgroundEnabled() {
            r1 = this;
            boolean r0 = r1.transparentWindowBackgroundEnabled
            return r0
    }

    @Override // android.app.SharedElementCallback
    @androidx.annotation.Nullable
    public android.os.Parcelable onCaptureSharedElementSnapshot(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Matrix r3, @androidx.annotation.NonNull android.graphics.RectF r4) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement = r0
            android.os.Parcelable r2 = super.onCaptureSharedElementSnapshot(r2, r3, r4)
            return r2
    }

    @Override // android.app.SharedElementCallback
    @androidx.annotation.Nullable
    public android.view.View onCreateSnapshotView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.os.Parcelable r3) {
            r1 = this;
            android.view.View r2 = super.onCreateSnapshotView(r2, r3)
            if (r2 == 0) goto L23
            java.lang.ref.WeakReference<android.view.View> r3 = com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement
            if (r3 == 0) goto L23
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider r0 = r1.shapeProvider
            if (r0 == 0) goto L23
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L23
            com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider r0 = r1.shapeProvider
            com.google.android.material.shape.ShapeAppearanceModel r3 = r0.provideShape(r3)
            if (r3 == 0) goto L23
            int r0 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            r2.setTag(r0, r3)
        L23:
            return r2
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@androidx.annotation.NonNull java.util.List<java.lang.String> r2, @androidx.annotation.NonNull java.util.Map<java.lang.String, android.view.View> r3) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L32
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.Object r2 = r3.get(r2)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L32
            android.content.Context r2 = r2.getContext()
            android.app.Activity r2 = com.google.android.material.internal.ContextUtils.getActivity(r2)
            if (r2 == 0) goto L32
            android.view.Window r3 = r2.getWindow()
            boolean r0 = r1.entering
            if (r0 == 0) goto L2f
            r1.setUpEnterTransform(r3)
            goto L32
        L2f:
            r1.setUpReturnTransform(r2, r3)
        L32:
            return
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@androidx.annotation.NonNull java.util.List<java.lang.String> r4, @androidx.annotation.NonNull java.util.List<android.view.View> r5, @androidx.annotation.NonNull java.util.List<android.view.View> r6) {
            r3 = this;
            boolean r4 = r5.isEmpty()
            r6 = 0
            if (r4 != 0) goto L21
            java.lang.Object r4 = r5.get(r6)
            android.view.View r4 = (android.view.View) r4
            int r0 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            java.lang.Object r4 = r4.getTag(r0)
            boolean r4 = r4 instanceof android.view.View
            if (r4 == 0) goto L21
            java.lang.Object r4 = r5.get(r6)
            android.view.View r4 = (android.view.View) r4
            r1 = 0
            r4.setTag(r0, r1)
        L21:
            boolean r4 = r3.entering
            if (r4 != 0) goto L4a
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L4a
            java.lang.Object r4 = r5.get(r6)
            android.view.View r4 = (android.view.View) r4
            int r5 = com.google.android.material.transition.platform.TransitionUtils.$r8$clinit
            android.graphics.Rect r5 = new android.graphics.Rect
            int r0 = r4.getLeft()
            int r1 = r4.getTop()
            int r2 = r4.getRight()
            int r4 = r4.getBottom()
            r5.<init>(r0, r1, r2, r4)
            r3.returnEndBounds = r5
        L4a:
            r3.entering = r6
            return
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@androidx.annotation.NonNull java.util.List<java.lang.String> r3, @androidx.annotation.NonNull java.util.List<android.view.View> r4, @androidx.annotation.NonNull java.util.List<android.view.View> r5) {
            r2 = this;
            boolean r3 = r4.isEmpty()
            r0 = 0
            if (r3 != 0) goto L1c
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L1c
            java.lang.Object r3 = r4.get(r0)
            android.view.View r3 = (android.view.View) r3
            int r1 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            java.lang.Object r5 = r5.get(r0)
            r3.setTag(r1, r5)
        L1c:
            boolean r3 = r2.entering
            if (r3 != 0) goto L56
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L56
            android.graphics.Rect r3 = r2.returnEndBounds
            if (r3 == 0) goto L56
            java.lang.Object r3 = r4.get(r0)
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = r2.returnEndBounds
            int r4 = r4.width()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            android.graphics.Rect r0 = r2.returnEndBounds
            int r0 = r0.height()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r3.measure(r4, r5)
            android.graphics.Rect r4 = r2.returnEndBounds
            int r5 = r4.left
            int r0 = r4.top
            int r1 = r4.right
            int r4 = r4.bottom
            r3.layout(r5, r0, r1, r4)
        L56:
            return
    }

    public void setShapeProvider(@androidx.annotation.Nullable com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider r1) {
            r0 = this;
            r0.shapeProvider = r1
            return
    }

    public void setSharedElementReenterTransitionEnabled(boolean r1) {
            r0 = this;
            r0.sharedElementReenterTransitionEnabled = r1
            return
    }

    public void setTransparentWindowBackgroundEnabled(boolean r1) {
            r0 = this;
            r0.transparentWindowBackgroundEnabled = r1
            return
    }
}
