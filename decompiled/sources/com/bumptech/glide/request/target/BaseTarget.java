package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class BaseTarget<Z> implements com.bumptech.glide.request.target.Target<Z> {
    private com.bumptech.glide.request.Request request;

    public BaseTarget() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    @androidx.annotation.Nullable
    public com.bumptech.glide.request.Request getRequest() {
            r1 = this;
            com.bumptech.glide.request.Request r0 = r1.request
            return r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
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
    public void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1) {
            r0 = this;
            r0.request = r1
            return
    }
}
