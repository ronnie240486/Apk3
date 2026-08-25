package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
public class FixedSizeDrawable extends android.graphics.drawable.Drawable {
    private final android.graphics.RectF bounds;
    private final android.graphics.Matrix matrix;
    private boolean mutated;
    private com.bumptech.glide.request.target.FixedSizeDrawable.State state;
    private android.graphics.drawable.Drawable wrapped;
    private final android.graphics.RectF wrappedRect;

    public static final class State extends android.graphics.drawable.Drawable.ConstantState {
        public final int height;
        public final int width;
        private final android.graphics.drawable.Drawable.ConstantState wrapped;

        public State(android.graphics.drawable.Drawable.ConstantState r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.wrapped = r1
                r0.width = r2
                r0.height = r3
                return
        }

        public State(com.bumptech.glide.request.target.FixedSizeDrawable.State r3) {
                r2 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r3.wrapped
                int r1 = r3.width
                int r3 = r3.height
                r2.<init>()
                r2.wrapped = r0
                r2.width = r1
                r2.height = r3
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
                r2 = this;
                com.bumptech.glide.request.target.FixedSizeDrawable r0 = new com.bumptech.glide.request.target.FixedSizeDrawable
                android.graphics.drawable.Drawable$ConstantState r1 = r2.wrapped
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                com.bumptech.glide.request.target.FixedSizeDrawable r0 = new com.bumptech.glide.request.target.FixedSizeDrawable
                android.graphics.drawable.Drawable$ConstantState r1 = r2.wrapped
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.<init>(r2, r3)
                return r0
        }
    }

    public FixedSizeDrawable(android.graphics.drawable.Drawable r3, int r4, int r5) {
            r2 = this;
            com.bumptech.glide.request.target.FixedSizeDrawable$State r0 = new com.bumptech.glide.request.target.FixedSizeDrawable$State
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.<init>(r1, r4, r5)
            r2.<init>(r0, r3)
            return
    }

    public FixedSizeDrawable(com.bumptech.glide.request.target.FixedSizeDrawable.State r3, android.graphics.drawable.Drawable r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.request.target.FixedSizeDrawable$State r3 = (com.bumptech.glide.request.target.FixedSizeDrawable.State) r3
            r2.state = r3
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.wrapped = r3
            int r3 = r4.getIntrinsicWidth()
            int r0 = r4.getIntrinsicHeight()
            r1 = 0
            r4.setBounds(r1, r1, r3, r0)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.matrix = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            int r0 = r4.getIntrinsicWidth()
            float r0 = (float) r0
            int r4 = r4.getIntrinsicHeight()
            float r4 = (float) r4
            r1 = 0
            r3.<init>(r1, r1, r0, r4)
            r2.wrappedRect = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.bounds = r3
            return
    }

    private void updateMatrix() {
            r4 = this;
            android.graphics.Matrix r0 = r4.matrix
            android.graphics.RectF r1 = r4.wrappedRect
            android.graphics.RectF r2 = r4.bounds
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r1, r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            r2.save()
            android.graphics.Matrix r0 = r1.matrix
            r2.concat(r0)
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.draw(r2)
            r2.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.RequiresApi(19)
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.Callback getCallback() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.bumptech.glide.request.target.FixedSizeDrawable$State r0 = r1.state
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.NonNull
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.bumptech.glide.request.target.FixedSizeDrawable$State r0 = r1.state
            int r0 = r0.height
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.bumptech.glide.request.target.FixedSizeDrawable$State r0 = r1.state
            int r0 = r0.width
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            super.invalidateSelf()
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.NonNull
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.mutated
            if (r0 != 0) goto L1e
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L1e
            android.graphics.drawable.Drawable r0 = r2.wrapped
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.wrapped = r0
            com.bumptech.glide.request.target.FixedSizeDrawable$State r0 = new com.bumptech.glide.request.target.FixedSizeDrawable$State
            com.bumptech.glide.request.target.FixedSizeDrawable$State r1 = r2.state
            r0.<init>(r1)
            r2.state = r0
            r0 = 1
            r2.mutated = r0
        L1e:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@androidx.annotation.NonNull java.lang.Runnable r2, long r3) {
            r1 = this;
            super.scheduleSelf(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.setBounds(r2, r3, r4, r5)
            android.graphics.RectF r0 = r1.bounds
            float r2 = (float) r2
            float r3 = (float) r3
            float r4 = (float) r4
            float r5 = (float) r5
            r0.set(r2, r3, r4, r5)
            r1.updateMatrix()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            super.setBounds(r2)
            android.graphics.RectF r0 = r1.bounds
            r0.set(r2)
            r1.updateMatrix()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, @androidx.annotation.NonNull android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    @java.lang.Deprecated
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.wrapped
            boolean r2 = r0.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            super.unscheduleSelf(r2)
            android.graphics.drawable.Drawable r0 = r1.wrapped
            r0.unscheduleSelf(r2)
            return
    }
}
