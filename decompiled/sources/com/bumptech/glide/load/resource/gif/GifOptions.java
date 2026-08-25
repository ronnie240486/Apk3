package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public final class GifOptions {
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> DECODE_FORMAT = null;
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> DISABLE_ANIMATION = null;

    static {
            com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.DEFAULT
            java.lang.String r1 = "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.gif.GifOptions.DECODE_FORMAT = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.gif.GifOptions.DISABLE_ANIMATION = r0
            return
    }

    private GifOptions() {
            r0 = this;
            r0.<init>()
            return
    }
}
