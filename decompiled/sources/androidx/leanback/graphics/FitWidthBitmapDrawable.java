package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes.dex */
public class FitWidthBitmapDrawable extends android.graphics.drawable.Drawable {
    public static final android.util.Property<androidx.leanback.graphics.FitWidthBitmapDrawable, java.lang.Integer> PROPERTY_VERTICAL_OFFSET = null;
    public androidx.leanback.graphics.FitWidthBitmapDrawable.BitmapState mBitmapState;
    public final android.graphics.Rect mDest;
    public boolean mMutated;



    /* JADX INFO: loaded from: classes2.dex */
    public static class BitmapState extends android.graphics.drawable.Drawable.ConstantState {
        public android.graphics.Bitmap mBitmap;
        public final android.graphics.Rect mDefaultSource;
        public int mOffset;
        public android.graphics.Paint mPaint;
        public android.graphics.Rect mSource;

        public BitmapState() {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mDefaultSource = r0
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r1.mPaint = r0
                return
        }

        public BitmapState(androidx.leanback.graphics.FitWidthBitmapDrawable.BitmapState r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r3.mDefaultSource = r0
                android.graphics.Bitmap r1 = r4.mBitmap
                r3.mBitmap = r1
                android.graphics.Paint r1 = new android.graphics.Paint
                android.graphics.Paint r2 = r4.mPaint
                r1.<init>(r2)
                r3.mPaint = r1
                android.graphics.Rect r1 = r4.mSource
                if (r1 == 0) goto L23
                android.graphics.Rect r1 = new android.graphics.Rect
                android.graphics.Rect r2 = r4.mSource
                r1.<init>(r2)
                goto L24
            L23:
                r1 = 0
            L24:
                r3.mSource = r1
                android.graphics.Rect r1 = r4.mDefaultSource
                r0.set(r1)
                int r4 = r4.mOffset
                r3.mOffset = r4
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
                androidx.leanback.graphics.FitWidthBitmapDrawable r0 = new androidx.leanback.graphics.FitWidthBitmapDrawable
                r0.<init>(r1)
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Le
            androidx.leanback.graphics.FitWidthBitmapDrawable$2 r0 = new androidx.leanback.graphics.FitWidthBitmapDrawable$2
            r0.<init>()
            androidx.leanback.graphics.FitWidthBitmapDrawable.PROPERTY_VERTICAL_OFFSET = r0
            goto L15
        Le:
            androidx.leanback.graphics.FitWidthBitmapDrawable$1 r0 = new androidx.leanback.graphics.FitWidthBitmapDrawable$1
            r0.<init>()
            androidx.leanback.graphics.FitWidthBitmapDrawable.PROPERTY_VERTICAL_OFFSET = r0
        L15:
            return
    }

    public FitWidthBitmapDrawable() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDest = r0
            r0 = 0
            r1.mMutated = r0
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = new androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState
            r0.<init>()
            r1.mBitmapState = r0
            return
    }

    public FitWidthBitmapDrawable(androidx.leanback.graphics.FitWidthBitmapDrawable.BitmapState r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDest = r0
            r0 = 0
            r1.mMutated = r0
            r1.mBitmapState = r2
            return
    }

    private android.graphics.Rect validateSource() {
            r2 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r2.mBitmapState
            android.graphics.Rect r1 = r0.mSource
            if (r1 != 0) goto L9
            android.graphics.Rect r0 = r0.mDefaultSource
            return r0
        L9:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r7) {
            r6 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r6.mBitmapState
            android.graphics.Bitmap r0 = r0.mBitmap
            if (r0 == 0) goto L4e
            android.graphics.Rect r0 = r6.getBounds()
            android.graphics.Rect r1 = r6.mDest
            r2 = 0
            r1.left = r2
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r2 = r6.mBitmapState
            int r2 = r2.mOffset
            r1.top = r2
            int r2 = r0.width()
            r1.right = r2
            android.graphics.Rect r1 = r6.validateSource()
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r1.width()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.graphics.Rect r3 = r6.mDest
            int r4 = r3.top
            int r5 = r1.height()
            float r5 = (float) r5
            float r5 = r5 * r2
            int r2 = (int) r5
            int r4 = r4 + r2
            r3.bottom = r4
            int r2 = r7.save()
            r7.clipRect(r0)
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r6.mBitmapState
            android.graphics.Bitmap r3 = r0.mBitmap
            android.graphics.Rect r4 = r6.mDest
            android.graphics.Paint r0 = r0.mPaint
            r7.drawBitmap(r3, r1, r4, r0)
            r7.restoreToCount(r2)
        L4e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Paint r0 = r0.mPaint
            int r0 = r0.getAlpha()
            return r0
    }

    public android.graphics.Bitmap getBitmap() {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Bitmap r0 = r0.mBitmap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r2 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r2.mBitmapState
            android.graphics.Bitmap r0 = r0.mBitmap
            if (r0 == 0) goto L1b
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L1b
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r2.mBitmapState
            android.graphics.Paint r0 = r0.mPaint
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L19
            goto L1b
        L19:
            r0 = -1
            goto L1c
        L1b:
            r0 = -3
        L1c:
            return r0
    }

    public android.graphics.Rect getSource() {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Rect r0 = r0.mSource
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            int r0 = r0.mOffset
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.mMutated
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L16
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = new androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r1 = r2.mBitmapState
            r0.<init>(r1)
            r2.mBitmapState = r0
            r0 = 1
            r2.mMutated = r0
        L16:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Paint r0 = r0.mPaint
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L14
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Paint r0 = r0.mPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L14:
            return
    }

    public void setBitmap(android.graphics.Bitmap r4) {
            r3 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r3.mBitmapState
            r0.mBitmap = r4
            r1 = 0
            if (r4 == 0) goto L15
            android.graphics.Rect r0 = r0.mDefaultSource
            int r2 = r4.getWidth()
            int r4 = r4.getHeight()
            r0.set(r1, r1, r2, r4)
            goto L1a
        L15:
            android.graphics.Rect r4 = r0.mDefaultSource
            r4.set(r1, r1, r1, r1)
        L1a:
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r4 = r3.mBitmapState
            r0 = 0
            r4.mSource = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            android.graphics.Paint r0 = r0.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setSource(android.graphics.Rect r2) {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            r0.mSource = r2
            return
    }

    public void setVerticalOffset(int r2) {
            r1 = this;
            androidx.leanback.graphics.FitWidthBitmapDrawable$BitmapState r0 = r1.mBitmapState
            r0.mOffset = r2
            r1.invalidateSelf()
            return
    }
}
