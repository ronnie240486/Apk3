package com.bumptech.glide.signature;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptySignature implements com.bumptech.glide.load.Key {
    private static final com.bumptech.glide.signature.EmptySignature EMPTY_KEY = null;

    static {
            com.bumptech.glide.signature.EmptySignature r0 = new com.bumptech.glide.signature.EmptySignature
            r0.<init>()
            com.bumptech.glide.signature.EmptySignature.EMPTY_KEY = r0
            return
    }

    private EmptySignature() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.signature.EmptySignature obtain() {
            com.bumptech.glide.signature.EmptySignature r0 = com.bumptech.glide.signature.EmptySignature.EMPTY_KEY
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptySignature"
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r1) {
            r0 = this;
            return
    }
}
