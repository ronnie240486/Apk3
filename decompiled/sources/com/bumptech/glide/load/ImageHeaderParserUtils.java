package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public final class ImageHeaderParserUtils {
    private static final int MARK_READ_LIMIT = 5242880;






    public interface OrientationReader {
        int getOrientation(com.bumptech.glide.load.ImageHeaderParser r1) throws java.io.IOException;
    }

    public interface TypeReader {
        com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser r1) throws java.io.IOException;
    }

    private ImageHeaderParserUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(21)
    public static int getOrientation(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            com.bumptech.glide.load.ImageHeaderParserUtils$5 r0 = new com.bumptech.glide.load.ImageHeaderParserUtils$5
            r0.<init>(r2, r3)
            int r1 = getOrientationInternal(r1, r0)
            return r1
    }

    public static int getOrientation(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            if (r2 != 0) goto L4
            r1 = -1
            return r1
        L4:
            boolean r0 = r2.markSupported()
            if (r0 != 0) goto L10
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            r0.<init>(r2, r3)
            r2 = r0
        L10:
            r0 = 5242880(0x500000, float:7.34684E-39)
            r2.mark(r0)
            com.bumptech.glide.load.ImageHeaderParserUtils$4 r0 = new com.bumptech.glide.load.ImageHeaderParserUtils$4
            r0.<init>(r2, r3)
            int r1 = getOrientationInternal(r1, r0)
            return r1
    }

    private static int getOrientationInternal(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader r5) throws java.io.IOException {
            int r0 = r4.size()
            r1 = 0
        L5:
            r2 = -1
            if (r1 >= r0) goto L18
            java.lang.Object r3 = r4.get(r1)
            com.bumptech.glide.load.ImageHeaderParser r3 = (com.bumptech.glide.load.ImageHeaderParser) r3
            int r3 = r5.getOrientation(r3)
            if (r3 == r2) goto L15
            return r3
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            com.bumptech.glide.load.ImageHeaderParserUtils$3 r0 = new com.bumptech.glide.load.ImageHeaderParserUtils$3
            r0.<init>(r2, r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = getTypeInternal(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            if (r2 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
        L5:
            boolean r0 = r2.markSupported()
            if (r0 != 0) goto L11
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            r0.<init>(r2, r3)
            r2 = r0
        L11:
            r3 = 5242880(0x500000, float:7.34684E-39)
            r2.mark(r3)
            com.bumptech.glide.load.ImageHeaderParserUtils$1 r3 = new com.bumptech.glide.load.ImageHeaderParserUtils$1
            r3.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = getTypeInternal(r1, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.nio.ByteBuffer r2) throws java.io.IOException {
            if (r2 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
        L5:
            com.bumptech.glide.load.ImageHeaderParserUtils$2 r0 = new com.bumptech.glide.load.ImageHeaderParserUtils$2
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = getTypeInternal(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.load.ImageHeaderParser.ImageType getTypeInternal(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader r5) throws java.io.IOException {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.get(r1)
            com.bumptech.glide.load.ImageHeaderParser r2 = (com.bumptech.glide.load.ImageHeaderParser) r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r5.getType(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            if (r2 == r3) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r4
    }
}
