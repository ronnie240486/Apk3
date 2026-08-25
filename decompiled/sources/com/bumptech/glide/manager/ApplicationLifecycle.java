package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
class ApplicationLifecycle implements com.bumptech.glide.manager.Lifecycle {
    public ApplicationLifecycle() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@androidx.annotation.NonNull com.bumptech.glide.manager.LifecycleListener r1) {
            r0 = this;
            r1.onStart()
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@androidx.annotation.NonNull com.bumptech.glide.manager.LifecycleListener r1) {
            r0 = this;
            return
    }
}
