package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Util {
    private static final int HASH_ACCUMULATOR = 17;
    private static final int HASH_MULTIPLIER = 31;
    private static final char[] HEX_CHAR_ARRAY = null;
    private static final char[] SHA_256_CHARS = null;

    @androidx.annotation.Nullable
    private static volatile android.os.Handler mainThreadHandler;

    /* JADX INFO: renamed from: com.bumptech.glide.util.Util$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L33
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L3e
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            com.bumptech.glide.util.Util.HEX_CHAR_ARRAY = r0
            r0 = 64
            char[] r0 = new char[r0]
            com.bumptech.glide.util.Util.SHA_256_CHARS = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void assertBackgroundThread() {
            boolean r0 = isOnBackgroundThread()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call this method on a background thread"
            r0.<init>(r1)
            throw r0
    }

    public static void assertMainThread() {
            boolean r0 = isOnMainThread()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call this method on the main thread"
            r0.<init>(r1)
            throw r0
    }

    public static boolean bothModelsNullEquivalentOrEquals(@androidx.annotation.Nullable java.lang.Object r1, @androidx.annotation.Nullable java.lang.Object r2) {
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
        L8:
            boolean r0 = r1 instanceof com.bumptech.glide.load.model.Model
            if (r0 == 0) goto L13
            com.bumptech.glide.load.model.Model r1 = (com.bumptech.glide.load.model.Model) r1
            boolean r1 = r1.isEquivalentTo(r2)
            return r1
        L13:
            boolean r1 = r1.equals(r2)
            return r1
    }

    public static boolean bothNullOrEqual(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.String bytesToHex(@androidx.annotation.NonNull byte[] r5, @androidx.annotation.NonNull char[] r6) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L1d
            r1 = r5[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0 * 2
            char[] r3 = com.bumptech.glide.util.Util.HEX_CHAR_ARRAY
            int r4 = r1 >>> 4
            char r4 = r3[r4]
            r6[r2] = r4
            int r2 = r2 + 1
            r1 = r1 & 15
            char r1 = r3[r1]
            r6[r2] = r1
            int r0 = r0 + 1
            goto L1
        L1d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            return r5
    }

    @androidx.annotation.NonNull
    public static <T> java.util.Queue<T> createQueue(int r1) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r1)
            return r0
    }

    public static int getBitmapByteSize(int r0, int r1, @androidx.annotation.Nullable android.graphics.Bitmap.Config r2) {
            int r0 = r0 * r1
            int r1 = getBytesPerPixel(r2)
            int r0 = r0 * r1
            return r0
    }

    @android.annotation.TargetApi(19)
    public static int getBitmapByteSize(@androidx.annotation.NonNull android.graphics.Bitmap r3) {
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L16
            int r3 = r3.getAllocationByteCount()     // Catch: java.lang.NullPointerException -> Lb
            return r3
        Lb:
            int r0 = r3.getHeight()
            int r3 = r3.getRowBytes()
            int r3 = r3 * r0
            return r3
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot obtain size for recycled Bitmap: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static int getBytesPerPixel(@androidx.annotation.Nullable android.graphics.Bitmap.Config r3) {
            if (r3 != 0) goto L4
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L4:
            int[] r0 = com.bumptech.glide.util.Util.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 4
            r1 = 2
            r2 = 1
            if (r3 == r2) goto L1e
            if (r3 == r1) goto L1c
            r2 = 3
            if (r3 == r2) goto L1c
            if (r3 == r0) goto L19
            goto L1f
        L19:
            r0 = 8
            goto L1f
        L1c:
            r0 = 2
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @java.lang.Deprecated
    public static int getSize(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            int r0 = getBitmapByteSize(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> java.util.List<T> getSnapshot(@androidx.annotation.NonNull java.util.Collection<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L1d:
            return r0
    }

    private static android.os.Handler getUiThreadHandler() {
            android.os.Handler r0 = com.bumptech.glide.util.Util.mainThreadHandler
            if (r0 != 0) goto L1b
            java.lang.Class<com.bumptech.glide.util.Util> r0 = com.bumptech.glide.util.Util.class
            monitor-enter(r0)
            android.os.Handler r1 = com.bumptech.glide.util.Util.mainThreadHandler     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L18
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.util.Util.mainThreadHandler = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
        L1b:
            android.os.Handler r0 = com.bumptech.glide.util.Util.mainThreadHandler
            return r0
    }

    public static int hashCode(float r1) {
            r0 = 17
            int r1 = hashCode(r1, r0)
            return r1
    }

    public static int hashCode(float r0, int r1) {
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = hashCode(r0, r1)
            return r0
    }

    public static int hashCode(int r1) {
            r0 = 17
            int r1 = hashCode(r1, r0)
            return r1
    }

    public static int hashCode(int r0, int r1) {
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public static int hashCode(@androidx.annotation.Nullable java.lang.Object r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = hashCode(r0, r1)
            return r0
    }

    public static int hashCode(boolean r1) {
            r0 = 17
            int r1 = hashCode(r1, r0)
            return r1
    }

    public static int hashCode(boolean r0, int r1) {
            int r0 = hashCode(r0, r1)
            return r0
    }

    public static boolean isOnBackgroundThread() {
            boolean r0 = isOnMainThread()
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isOnMainThread() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static boolean isValidDimension(int r1) {
            if (r1 > 0) goto L9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L7
            goto L9
        L7:
            r1 = 0
            goto La
        L9:
            r1 = 1
        La:
            return r1
    }

    public static boolean isValidDimensions(int r0, int r1) {
            boolean r0 = isValidDimension(r0)
            if (r0 == 0) goto Le
            boolean r0 = isValidDimension(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static void postOnUiThread(java.lang.Runnable r1) {
            android.os.Handler r0 = getUiThreadHandler()
            r0.post(r1)
            return
    }

    public static void removeCallbacksOnUiThread(java.lang.Runnable r1) {
            android.os.Handler r0 = getUiThreadHandler()
            r0.removeCallbacks(r1)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String sha256BytesToHex(@androidx.annotation.NonNull byte[] r1) {
            char[] r0 = com.bumptech.glide.util.Util.SHA_256_CHARS
            monitor-enter(r0)
            java.lang.String r1 = bytesToHex(r1, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }
}
