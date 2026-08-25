package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes2.dex */
public class UnitTranscoder<Z> implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, Z> {
    private static final com.bumptech.glide.load.resource.transcode.UnitTranscoder<?> UNIT_TRANSCODER = null;

    static {
            com.bumptech.glide.load.resource.transcode.UnitTranscoder r0 = new com.bumptech.glide.load.resource.transcode.UnitTranscoder
            r0.<init>()
            com.bumptech.glide.load.resource.transcode.UnitTranscoder.UNIT_TRANSCODER = r0
            return
    }

    public UnitTranscoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <Z> com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, Z> get() {
            com.bumptech.glide.load.resource.transcode.UnitTranscoder<?> r0 = com.bumptech.glide.load.resource.transcode.UnitTranscoder.UNIT_TRANSCODER
            return r0
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<Z> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<Z> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            return r1
    }
}
