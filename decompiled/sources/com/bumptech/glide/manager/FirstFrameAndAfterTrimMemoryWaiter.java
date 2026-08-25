package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(26)
final class FirstFrameAndAfterTrimMemoryWaiter implements com.bumptech.glide.manager.FrameWaiter, android.content.ComponentCallbacks2 {
    public FirstFrameAndAfterTrimMemoryWaiter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 20
            r1.onTrimMemory(r0)
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(android.app.Activity r1) {
            r0 = this;
            return
    }
}
