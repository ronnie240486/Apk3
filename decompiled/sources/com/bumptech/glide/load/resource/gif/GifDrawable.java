package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifDrawable extends android.graphics.drawable.Drawable implements com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback, android.graphics.drawable.Animatable, androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final int GRAVITY = 119;
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> animationCallbacks;
    private boolean applyGravity;
    private android.graphics.Rect destRect;
    private boolean isRecycled;
    private boolean isRunning;
    private boolean isStarted;
    private boolean isVisible;
    private int loopCount;
    private int maxLoopCount;
    private android.graphics.Paint paint;
    private final com.bumptech.glide.load.resource.gif.GifDrawable.GifState state;

    /* JADX INFO: loaded from: classes.dex */
    public static final class GifState extends android.graphics.drawable.Drawable.ConstantState {

        @androidx.annotation.VisibleForTesting
        public final com.bumptech.glide.load.resource.gif.GifFrameLoader frameLoader;

        public GifState(com.bumptech.glide.load.resource.gif.GifFrameLoader r1) {
                r0 = this;
                r0.<init>()
                r0.frameLoader = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.bumptech.glide.load.resource.gif.GifDrawable r0 = new com.bumptech.glide.load.resource.gif.GifDrawable
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = r0.newDrawable()
                return r1
        }
    }

    public GifDrawable(android.content.Context r10, com.bumptech.glide.gifdecoder.GifDecoder r11, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r12, int r13, int r14, android.graphics.Bitmap r15) {
            r9 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = new com.bumptech.glide.load.resource.gif.GifDrawable$GifState
            com.bumptech.glide.load.resource.gif.GifFrameLoader r8 = new com.bumptech.glide.load.resource.gif.GifFrameLoader
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.get(r10)
            r1 = r8
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r12
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8)
            r9.<init>()
            r10 = 1
            r9.isVisible = r10
            r10 = -1
            r9.maxLoopCount = r10
            java.lang.Object r10 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r10 = (com.bumptech.glide.load.resource.gif.GifDrawable.GifState) r10
            r9.state = r10
            return
    }

    @java.lang.Deprecated
    public GifDrawable(android.content.Context r8, com.bumptech.glide.gifdecoder.GifDecoder r9, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r10, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r11, int r12, int r13, android.graphics.Bitmap r14) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public GifDrawable(com.bumptech.glide.load.resource.gif.GifDrawable.GifState r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isVisible = r0
            r0 = -1
            r1.maxLoopCount = r0
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r2 = (com.bumptech.glide.load.resource.gif.GifDrawable.GifState) r2
            r1.state = r2
            return
    }

    private android.graphics.drawable.Drawable.Callback findCallback() {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
        L4:
            boolean r1 = r0 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            goto L4
        Lf:
            return r0
    }

    private android.graphics.Rect getDestRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.destRect
            if (r0 != 0) goto Lb
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.destRect = r0
        Lb:
            android.graphics.Rect r0 = r1.destRect
            return r0
    }

    private android.graphics.Paint getPaint() {
            r2 = this;
            android.graphics.Paint r0 = r2.paint
            if (r0 != 0) goto Lc
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.paint = r0
        Lc:
            android.graphics.Paint r0 = r2.paint
            return r0
    }

    private void notifyAnimationEndToListeners() {
            r3 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r3.animationCallbacks
            if (r0 == 0) goto L19
            r1 = 0
            int r0 = r0.size()
        L9:
            if (r1 >= r0) goto L19
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r2 = r3.animationCallbacks
            java.lang.Object r2 = r2.get(r1)
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r2 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r2
            r2.onAnimationEnd(r3)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    private void resetLoopCount() {
            r1 = this;
            r0 = 0
            r1.loopCount = r0
            return
    }

    private void startRunning() {
            r3 = this;
            boolean r0 = r3.isRecycled
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r2)
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r3.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getFrameCount()
            if (r0 != r1) goto L17
            r3.invalidateSelf()
            goto L27
        L17:
            boolean r0 = r3.isRunning
            if (r0 != 0) goto L27
            r3.isRunning = r1
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r3.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            r0.subscribe(r3)
            r3.invalidateSelf()
        L27:
            return
    }

    private void stopRunning() {
            r1 = this;
            r0 = 0
            r1.isRunning = r0
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            r0.unsubscribe(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.isRecycled
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.applyGravity
            if (r0 == 0) goto L21
            r0 = 119(0x77, float:1.67E-43)
            int r1 = r5.getIntrinsicWidth()
            int r2 = r5.getIntrinsicHeight()
            android.graphics.Rect r3 = r5.getBounds()
            android.graphics.Rect r4 = r5.getDestRect()
            android.view.Gravity.apply(r0, r1, r2, r3, r4)
            r0 = 0
            r5.applyGravity = r0
        L21:
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r5.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            android.graphics.Bitmap r0 = r0.getCurrentFrame()
            r1 = 0
            android.graphics.Rect r2 = r5.getDestRect()
            android.graphics.Paint r3 = r5.getPaint()
            r6.drawBitmap(r0, r1, r2, r3)
            return
    }

    public java.nio.ByteBuffer getBuffer() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            java.nio.ByteBuffer r0 = r0.getBuffer()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            return r0
    }

    public android.graphics.Bitmap getFirstFrame() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            android.graphics.Bitmap r0 = r0.getFirstFrame()
            return r0
    }

    public int getFrameCount() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getFrameCount()
            return r0
    }

    public int getFrameIndex() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getCurrentIndex()
            return r0
    }

    public com.bumptech.glide.load.Transformation<android.graphics.Bitmap> getFrameTransformation() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            com.bumptech.glide.load.Transformation r0 = r0.getFrameTransformation()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -2
            return r0
    }

    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            int r0 = r0.getSize()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.isRunning
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.applyGravity = r1
            return
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public void onFrameReady() {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.findCallback()
            if (r0 != 0) goto Ld
            r2.stop()
            r2.invalidateSelf()
            return
        Ld:
            r2.invalidateSelf()
            int r0 = r2.getFrameIndex()
            int r1 = r2.getFrameCount()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L22
            int r0 = r2.loopCount
            int r0 = r0 + 1
            r2.loopCount = r0
        L22:
            int r0 = r2.maxLoopCount
            r1 = -1
            if (r0 == r1) goto L31
            int r1 = r2.loopCount
            if (r1 < r0) goto L31
            r2.notifyAnimationEndToListeners()
            r2.stop()
        L31:
            return
    }

    public void recycle() {
            r1 = this;
            r0 = 1
            r1.isRecycled = r0
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            r0.clear()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.animationCallbacks = r0
        Le:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.add(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.getPaint()
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.getPaint()
            r0.setColorFilter(r2)
            return
    }

    public void setFrameTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            r0.setFrameTransformation(r2, r3)
            return
    }

    public void setLoopCount(int r2) {
            r1 = this;
            r0 = -1
            if (r2 > 0) goto L10
            if (r2 == r0) goto L10
            if (r2 != 0) goto L8
            goto L10
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC"
            r2.<init>(r0)
            throw r2
        L10:
            if (r2 != 0) goto L21
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r2 = r1.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r2 = r2.frameLoader
            int r2 = r2.getLoopCount()
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r1.maxLoopCount = r0
            goto L23
        L21:
            r1.maxLoopCount = r2
        L23:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.isRecycled
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility."
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
            r2.isVisible = r3
            if (r3 != 0) goto L11
            r2.stopRunning()
            goto L18
        L11:
            boolean r0 = r2.isStarted
            if (r0 == 0) goto L18
            r2.startRunning()
        L18:
            boolean r3 = super.setVisible(r3, r4)
            return r3
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            r0 = 1
            r1.isStarted = r0
            r1.resetLoopCount()
            boolean r0 = r1.isVisible
            if (r0 == 0) goto Ld
            r1.startRunning()
        Ld:
            return
    }

    public void startFromFirstFrame() {
            r2 = this;
            boolean r0 = r2.isRunning
            r0 = r0 ^ 1
            java.lang.String r1 = "You cannot restart a currently running animation."
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = r2.state
            com.bumptech.glide.load.resource.gif.GifFrameLoader r0 = r0.frameLoader
            r0.setNextStartFromFirstFrame()
            r2.start()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            r0 = 0
            r1.isStarted = r0
            r1.stopRunning()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L7
            goto Lc
        L7:
            boolean r2 = r0.remove(r2)
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
