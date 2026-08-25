package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadTarget<Z> extends com.bumptech.glide.request.target.CustomTarget<Z> {
    private static final android.os.Handler HANDLER = null;
    private static final int MESSAGE_CLEAR = 1;
    private final com.bumptech.glide.RequestManager requestManager;


    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.bumptech.glide.request.target.PreloadTarget$1 r2 = new com.bumptech.glide.request.target.PreloadTarget$1
            r2.<init>()
            r0.<init>(r1, r2)
            com.bumptech.glide.request.target.PreloadTarget.HANDLER = r0
            return
    }

    private PreloadTarget(com.bumptech.glide.RequestManager r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.requestManager = r1
            return
    }

    public static <Z> com.bumptech.glide.request.target.PreloadTarget<Z> obtain(com.bumptech.glide.RequestManager r1, int r2, int r3) {
            com.bumptech.glide.request.target.PreloadTarget r0 = new com.bumptech.glide.request.target.PreloadTarget
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final void clear() {
            r1 = this;
            com.bumptech.glide.RequestManager r0 = r1.requestManager
            r0.clear(r1)
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@androidx.annotation.NonNull Z r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super Z> r2) {
            r0 = this;
            android.os.Handler r1 = com.bumptech.glide.request.target.PreloadTarget.HANDLER
            r2 = 1
            android.os.Message r1 = r1.obtainMessage(r2, r0)
            r1.sendToTarget()
            return
    }
}
