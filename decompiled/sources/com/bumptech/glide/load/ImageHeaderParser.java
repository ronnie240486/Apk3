package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {
    public static final int UNKNOWN_ORIENTATION = -1;

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum ImageType extends java.lang.Enum<com.bumptech.glide.load.ImageHeaderParser.ImageType> {
        private static final /* synthetic */ com.bumptech.glide.load.ImageHeaderParser.ImageType[] $VALUES = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType GIF = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType JPEG = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType PNG = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType PNG_A = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType RAW = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType UNKNOWN = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType WEBP = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType WEBP_A = null;
        private final boolean hasAlpha;

        static {
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "GIF"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r4 = "JPEG"
                r1.<init>(r4, r3, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG = r1
                com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r5 = "RAW"
                r6 = 2
                r4.<init>(r5, r6, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.RAW = r4
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r7 = "PNG_A"
                r8 = 3
                r5.<init>(r7, r8, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A = r5
                com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r9 = "PNG"
                r10 = 4
                r7.<init>(r9, r10, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG = r7
                com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r11 = "WEBP_A"
                r12 = 5
                r9.<init>(r11, r12, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A = r9
                com.bumptech.glide.load.ImageHeaderParser$ImageType r11 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r13 = "WEBP"
                r14 = 6
                r11.<init>(r13, r14, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP = r11
                com.bumptech.glide.load.ImageHeaderParser$ImageType r13 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r15 = "UNKNOWN"
                r14 = 7
                r13.<init>(r15, r14, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN = r13
                r15 = 8
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r15 = new com.bumptech.glide.load.ImageHeaderParser.ImageType[r15]
                r15[r2] = r0
                r15[r3] = r1
                r15[r6] = r4
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                com.bumptech.glide.load.ImageHeaderParser.ImageType.$VALUES = r15
                return
        }

        private ImageType(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.hasAlpha = r3
                return
        }

        public static com.bumptech.glide.load.ImageHeaderParser.ImageType valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.ImageHeaderParser$ImageType> r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = (com.bumptech.glide.load.ImageHeaderParser.ImageType) r1
                return r1
        }

        public static com.bumptech.glide.load.ImageHeaderParser.ImageType[] values() {
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = (com.bumptech.glide.load.ImageHeaderParser.ImageType[]) r0
                return r0
        }

        public boolean hasAlpha() {
                r1 = this;
                boolean r0 = r1.hasAlpha
                return r0
        }
    }

    int getOrientation(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException;

    int getOrientation(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.io.InputStream r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.nio.ByteBuffer r1) throws java.io.IOException;
}
