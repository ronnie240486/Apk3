package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class BackgroundFragment extends android.app.Fragment {
    private androidx.leanback.app.BackgroundManager mBackgroundManager;

    public BackgroundFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public final androidx.leanback.app.BackgroundManager getBackgroundManager() {
            r1 = this;
            androidx.leanback.app.BackgroundManager r0 = r1.mBackgroundManager
            return r0
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.leanback.app.BackgroundManager r0 = r1.mBackgroundManager
            if (r0 == 0) goto La
            r0.detach()
        La:
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.leanback.app.BackgroundManager r0 = r1.mBackgroundManager
            if (r0 == 0) goto La
            r0.postChangeRunnable()
        La:
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.leanback.app.BackgroundManager r0 = r1.mBackgroundManager
            if (r0 == 0) goto La
            r0.onActivityStart()
        La:
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r2 = this;
            androidx.leanback.app.BackgroundManager r0 = r2.mBackgroundManager
            if (r0 == 0) goto Ld
            boolean r1 = r0.isAutoReleaseOnStop()
            if (r1 == 0) goto Ld
            r0.release()
        Ld:
            super.onStop()
            return
    }

    public final void setBackgroundManager(androidx.leanback.app.BackgroundManager r1) {
            r0 = this;
            r0.mBackgroundManager = r1
            return
    }
}
