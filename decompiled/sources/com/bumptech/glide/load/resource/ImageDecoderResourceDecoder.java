package com.bumptech.glide.load.resource;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(api = 28)
public abstract class ImageDecoderResourceDecoder<T> implements com.bumptech.glide.load.ResourceDecoder<android.graphics.ImageDecoder.Source, T> {
    private static final java.lang.String TAG = "ImageDecoder";
    public final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState;


    public ImageDecoderResourceDecoder() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r1.hardwareConfigState = r0
            return
    }

    public abstract com.bumptech.glide.load.engine.Resource<T> decode(android.graphics.ImageDecoder.Source r1, int r2, int r3, android.graphics.ImageDecoder.OnHeaderDecodedListener r4) throws java.io.IOException;

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public final com.bumptech.glide.load.engine.Resource<T> decode2(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r10, int r11, int r12, @androidx.annotation.NonNull com.bumptech.glide.load.Options r13) throws java.io.IOException {
            r9 = this;
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT
            java.lang.Object r0 = r13.get(r0)
            r6 = r0
            com.bumptech.glide.load.DecodeFormat r6 = (com.bumptech.glide.load.DecodeFormat) r6
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r0 = r13.get(r0)
            r7 = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r7 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r7
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L29
            java.lang.Object r0 = r13.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            r0 = 1
            r5 = 1
            goto L2b
        L29:
            r0 = 0
            r5 = 0
        L2b:
            com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE
            java.lang.Object r13 = r13.get(r0)
            r8 = r13
            com.bumptech.glide.load.PreferredColorSpace r8 = (com.bumptech.glide.load.PreferredColorSpace) r8
            com.bumptech.glide.load.resource.ImageDecoderResourceDecoder$1 r13 = new com.bumptech.glide.load.resource.ImageDecoderResourceDecoder$1
            r1 = r13
            r2 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.bumptech.glide.load.engine.Resource r10 = r9.decode(r10, r11, r12, r13)
            return r10
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource decode(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = (android.graphics.ImageDecoder.Source) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public final boolean handles2(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = (android.graphics.ImageDecoder.Source) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
