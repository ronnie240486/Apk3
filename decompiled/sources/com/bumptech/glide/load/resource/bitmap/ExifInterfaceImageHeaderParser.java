package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(27)
public final class ExifInterfaceImageHeaderParser implements com.bumptech.glide.load.ImageHeaderParser {
    public ExifInterfaceImageHeaderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface r3 = new androidx.exifinterface.media.ExifInterface
            r3.<init>(r2)
            java.lang.String r2 = "Orientation"
            r0 = 1
            int r2 = r3.getAttributeInt(r2, r0)
            if (r2 != 0) goto Lf
            r2 = -1
        Lf:
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = com.bumptech.glide.util.ByteBufferUtil.toStream(r1)
            int r1 = r0.getOrientation(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.io.InputStream r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.nio.ByteBuffer r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }
}
