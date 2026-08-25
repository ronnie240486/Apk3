package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
final class GifViewUtils {
    public static final java.util.List<java.lang.String> SUPPORTED_RESOURCE_TYPE_NAMES = null;

    public static class GifImageViewAttributes extends pl.droidsonroids.gif.GifViewUtils.GifViewAttributes {
        public final int mBackgroundResId;
        public final int mSourceResId;

        public GifImageViewAttributes() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mSourceResId = r0
                r1.mBackgroundResId = r0
                return
        }

        public GifImageViewAttributes(android.widget.ImageView r1, android.util.AttributeSet r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r3 = 1
                int r3 = getResourceId(r1, r2, r3)
                r0.mSourceResId = r3
                r3 = 0
                int r1 = getResourceId(r1, r2, r3)
                r0.mBackgroundResId = r1
                return
        }

        private static int getResourceId(android.widget.ImageView r3, android.util.AttributeSet r4, boolean r5) {
                if (r5 == 0) goto L6
                java.lang.String r0 = "src"
                goto L8
            L6:
                java.lang.String r0 = "background"
            L8:
                java.lang.String r1 = "http://schemas.android.com/apk/res/android"
                r2 = 0
                int r4 = r4.getAttributeResourceValue(r1, r0, r2)
                if (r4 <= 0) goto L28
                android.content.res.Resources r0 = r3.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r4)
                java.util.List<java.lang.String> r1 = pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES
                boolean r0 = r1.contains(r0)
                if (r0 == 0) goto L28
                boolean r3 = pl.droidsonroids.gif.GifViewUtils.setResource(r3, r5, r4)
                if (r3 != 0) goto L28
                return r4
            L28:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class GifViewAttributes {
        public boolean freezesAnimation;
        public final int mLoopCount;

        public GifViewAttributes() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.freezesAnimation = r0
                r0 = -1
                r1.mLoopCount = r0
                return
        }

        public GifViewAttributes(android.view.View r2, android.util.AttributeSet r3, int r4, int r5) {
                r1 = this;
                r1.<init>()
                android.content.Context r2 = r2.getContext()
                int[] r0 = pl.droidsonroids.gif.R.styleable.GifView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
                int r3 = pl.droidsonroids.gif.R.styleable.GifView_freezesAnimation
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r1.freezesAnimation = r3
                int r3 = pl.droidsonroids.gif.R.styleable.GifView_loopCount
                r4 = -1
                int r3 = r2.getInt(r3, r4)
                r1.mLoopCount = r3
                r2.recycle()
                return
        }
    }

    static {
            java.lang.String r0 = "raw"
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "mipmap"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES = r0
            return
    }

    private GifViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyLoopCount(int r1, android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof pl.droidsonroids.gif.GifDrawable
            if (r0 == 0) goto L9
            pl.droidsonroids.gif.GifDrawable r2 = (pl.droidsonroids.gif.GifDrawable) r2
            r2.setLoopCount(r1)
        L9:
            return
    }

    public static pl.droidsonroids.gif.GifViewUtils.GifImageViewAttributes initImageView(android.widget.ImageView r1, android.util.AttributeSet r2, int r3, int r4) {
            if (r2 == 0) goto L20
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L20
            pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes r0 = new pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes
            r0.<init>(r1, r2, r3, r4)
            int r2 = r0.mLoopCount
            if (r2 < 0) goto L1f
            android.graphics.drawable.Drawable r3 = r1.getDrawable()
            applyLoopCount(r2, r3)
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            applyLoopCount(r2, r1)
        L1f:
            return r0
        L20:
            pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes r1 = new pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes
            r1.<init>()
            return r1
    }

    public static boolean setGifImageUri(android.widget.ImageView r2, android.net.Uri r3) {
            if (r3 == 0) goto L14
            pl.droidsonroids.gif.GifDrawable r0 = new pl.droidsonroids.gif.GifDrawable     // Catch: java.io.IOException -> L14
            android.content.Context r1 = r2.getContext()     // Catch: java.io.IOException -> L14
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L14
            r0.<init>(r1, r3)     // Catch: java.io.IOException -> L14
            r2.setImageDrawable(r0)     // Catch: java.io.IOException -> L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static boolean setResource(android.widget.ImageView r4, boolean r5, int r6) {
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.String r2 = r0.getResourceTypeName(r6)     // Catch: java.lang.Throwable -> L24
            java.util.List<java.lang.String> r3 = pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.contains(r2)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L14
            return r1
        L14:
            pl.droidsonroids.gif.GifDrawable r2 = new pl.droidsonroids.gif.GifDrawable     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0, r6)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L1f
            r4.setImageDrawable(r2)     // Catch: java.lang.Throwable -> L24
            goto L22
        L1f:
            r4.setBackground(r2)     // Catch: java.lang.Throwable -> L24
        L22:
            r4 = 1
            return r4
        L24:
            return r1
    }
}
