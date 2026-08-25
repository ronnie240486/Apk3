package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomTarget<T> implements com.bumptech.glide.request.target.Target<T> {
    private final int height;

    @androidx.annotation.Nullable
    private com.bumptech.glide.request.Request request;
    private final int width;

    public CustomTarget() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.<init>(r0, r0)
            return
    }

    public CustomTarget(int r4, int r5) {
            r3 = this;
            r3.<init>()
            boolean r0 = com.bumptech.glide.util.Util.isValidDimensions(r4, r5)
            if (r0 == 0) goto Le
            r3.width = r4
            r3.height = r5
            return
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "
            java.lang.String r2 = " and height: "
            java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r4, r2, r5)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.bumptech.glide.request.target.Target
    @androidx.annotation.Nullable
    public final com.bumptech.glide.request.Request getRequest() {
            r1 = this;
            com.bumptech.glide.request.Request r0 = r1.request
            return r0
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r3) {
            r2 = this;
            int r0 = r2.width
            int r1 = r2.height
            r3.onSizeReady(r0, r1)
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1) {
            r0 = this;
            r0.request = r1
            return
    }
}
