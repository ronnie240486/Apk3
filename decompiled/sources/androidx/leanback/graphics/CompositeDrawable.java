package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public boolean mMutated;
    public androidx.leanback.graphics.CompositeDrawable.CompositeState mState;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ChildDrawable {
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Integer> BOTTOM_ABSOLUTE = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Float> BOTTOM_FRACTION = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Integer> LEFT_ABSOLUTE = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Float> LEFT_FRACTION = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Integer> RIGHT_ABSOLUTE = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Float> RIGHT_FRACTION = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Integer> TOP_ABSOLUTE = null;
        public static final android.util.Property<androidx.leanback.graphics.CompositeDrawable.ChildDrawable, java.lang.Float> TOP_FRACTION = null;
        private final android.graphics.Rect adjustedBounds;
        private final androidx.leanback.graphics.BoundsRule mBoundsRule;
        public final android.graphics.drawable.Drawable mDrawable;
        public final androidx.leanback.graphics.CompositeDrawable mParent;









        static {
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$1 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$1
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.TOP_ABSOLUTE = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$2 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$2
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.BOTTOM_ABSOLUTE = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$3 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$3
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.LEFT_ABSOLUTE = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$4 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$4
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.RIGHT_ABSOLUTE = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$5 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$5
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.TOP_FRACTION = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$6 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$6
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.BOTTOM_FRACTION = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$7 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$7
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.LEFT_FRACTION = r0
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable$8 r0 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable$8
                r0.<init>()
                androidx.leanback.graphics.CompositeDrawable.ChildDrawable.RIGHT_FRACTION = r0
                return
        }

        public ChildDrawable(android.graphics.drawable.Drawable r2, androidx.leanback.graphics.CompositeDrawable r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.adjustedBounds = r0
                r1.mDrawable = r2
                r1.mParent = r3
                androidx.leanback.graphics.BoundsRule r0 = new androidx.leanback.graphics.BoundsRule
                r0.<init>()
                r1.mBoundsRule = r0
                r2.setCallback(r3)
                return
        }

        public ChildDrawable(androidx.leanback.graphics.CompositeDrawable.ChildDrawable r4, androidx.leanback.graphics.CompositeDrawable r5) {
                r3 = this;
                r3.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r3.adjustedBounds = r0
                android.graphics.drawable.Drawable r0 = r4.mDrawable
                if (r0 == 0) goto L2f
                android.graphics.drawable.Drawable$ConstantState r1 = r0.getConstantState()
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r1.setCallback(r5)
                int r2 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r0)
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r1, r2)
                android.graphics.Rect r2 = r0.getBounds()
                r1.setBounds(r2)
                int r0 = r0.getLevel()
                r1.setLevel(r0)
                goto L30
            L2f:
                r1 = 0
            L30:
                androidx.leanback.graphics.BoundsRule r4 = r4.mBoundsRule
                if (r4 == 0) goto L3c
                androidx.leanback.graphics.BoundsRule r0 = new androidx.leanback.graphics.BoundsRule
                r0.<init>(r4)
                r3.mBoundsRule = r0
                goto L43
            L3c:
                androidx.leanback.graphics.BoundsRule r4 = new androidx.leanback.graphics.BoundsRule
                r4.<init>()
                r3.mBoundsRule = r4
            L43:
                r3.mDrawable = r1
                r3.mParent = r5
                return
        }

        public androidx.leanback.graphics.BoundsRule getBoundsRule() {
                r1 = this;
                androidx.leanback.graphics.BoundsRule r0 = r1.mBoundsRule
                return r0
        }

        public android.graphics.drawable.Drawable getDrawable() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDrawable
                return r0
        }

        public void recomputeBounds() {
                r3 = this;
                androidx.leanback.graphics.CompositeDrawable r0 = r3.mParent
                android.graphics.Rect r0 = r0.getBounds()
                androidx.leanback.graphics.BoundsRule r1 = r3.mBoundsRule
                android.graphics.Rect r2 = r3.adjustedBounds
                r1.calculateBounds(r0, r2)
                android.graphics.drawable.Drawable r0 = r3.mDrawable
                android.graphics.Rect r1 = r3.adjustedBounds
                r0.setBounds(r1)
                return
        }

        public final void updateBounds(android.graphics.Rect r3) {
                r2 = this;
                androidx.leanback.graphics.BoundsRule r0 = r2.mBoundsRule
                android.graphics.Rect r1 = r2.adjustedBounds
                r0.calculateBounds(r3, r1)
                android.graphics.drawable.Drawable r3 = r2.mDrawable
                android.graphics.Rect r0 = r2.adjustedBounds
                r3.setBounds(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CompositeState extends android.graphics.drawable.Drawable.ConstantState {
        public final java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable.ChildDrawable> mChildren;

        public CompositeState() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mChildren = r0
                return
        }

        public CompositeState(androidx.leanback.graphics.CompositeDrawable.CompositeState r6, androidx.leanback.graphics.CompositeDrawable r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r6.mChildren
                int r0 = r0.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r5.mChildren = r1
                r1 = 0
            L11:
                if (r1 >= r0) goto L28
                java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r2 = r5.mChildren
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable r3 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable
                java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r4 = r6.mChildren
                java.lang.Object r4 = r4.get(r1)
                androidx.leanback.graphics.CompositeDrawable$ChildDrawable r4 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r4
                r3.<init>(r4, r7)
                r2.add(r3)
                int r1 = r1 + 1
                goto L11
            L28:
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
                androidx.leanback.graphics.CompositeDrawable r0 = new androidx.leanback.graphics.CompositeDrawable
                r0.<init>(r1)
                return r0
        }
    }

    public CompositeDrawable() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMutated = r0
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = new androidx.leanback.graphics.CompositeDrawable$CompositeState
            r0.<init>()
            r1.mState = r0
            return
    }

    public CompositeDrawable(androidx.leanback.graphics.CompositeDrawable.CompositeState r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMutated = r0
            r1.mState = r2
            return
    }

    public void addChildDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r2.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r1 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable
            r1.<init>(r3, r2)
            r0.add(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r4) {
            r3 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r3.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L19
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.mDrawable
            r2.draw(r4)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r4 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r4.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            java.lang.Object r3 = r0.get(r2)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r3 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.mDrawable
            if (r3 == 0) goto L16
            goto L1a
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            r3 = 0
        L1a:
            if (r3 == 0) goto L21
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r3)
            return r0
        L21:
            r0 = 255(0xff, float:3.57E-43)
            return r0
    }

    public androidx.leanback.graphics.CompositeDrawable.ChildDrawable getChildAt(int r2) {
            r1 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r1.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            return r2
    }

    public int getChildCount() {
            r1 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r1.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            int r0 = r0.size()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r1.mState
            return r0
    }

    public android.graphics.drawable.Drawable getDrawable(int r2) {
            r1 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r1.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.mDrawable
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r4 = this;
            boolean r0 = r4.mMutated
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r4) goto L2f
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = new androidx.leanback.graphics.CompositeDrawable$CompositeState
            androidx.leanback.graphics.CompositeDrawable$CompositeState r1 = r4.mState
            r0.<init>(r1, r4)
            r4.mState = r0
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
            int r2 = r0.size()
        L1a:
            if (r1 >= r2) goto L2c
            java.lang.Object r3 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r3 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.mDrawable
            if (r3 == 0) goto L29
            r3.mutate()
        L29:
            int r1 = r1 + 1
            goto L1a
        L2c:
            r0 = 1
            r4.mMutated = r0
        L2f:
            return r4
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r4) {
            r3 = this;
            super.onBoundsChange(r4)
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r3.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
        L8:
            int r2 = r0.size()
            if (r1 >= r2) goto L1a
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            r2.updateBounds(r4)
            int r1 = r1 + 1
            goto L8
        L1a:
            return
    }

    public void removeChild(int r2) {
            r1 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r1.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r0.remove(r2)
            return
    }

    public void removeDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r3.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.mDrawable
            if (r4 != r2) goto L25
            java.lang.Object r4 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r4 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.mDrawable
            r2 = 0
            r4.setCallback(r2)
            r0.remove(r1)
            return
        L25:
            int r1 = r1 + 1
            goto L5
        L28:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r4) {
            r3 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r3.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L19
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.mDrawable
            r2.setAlpha(r4)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    public void setChildDrawableAt(int r3, android.graphics.drawable.Drawable r4) {
            r2 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r2.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r1 = new androidx.leanback.graphics.CompositeDrawable$ChildDrawable
            r1.<init>(r4, r2)
            r0.set(r3, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r4) {
            r3 = this;
            androidx.leanback.graphics.CompositeDrawable$CompositeState r0 = r3.mState
            java.util.ArrayList<androidx.leanback.graphics.CompositeDrawable$ChildDrawable> r0 = r0.mChildren
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L19
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r2 = (androidx.leanback.graphics.CompositeDrawable.ChildDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.mDrawable
            r2.setColorFilter(r4)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
