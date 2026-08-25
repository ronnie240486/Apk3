package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class SplitCompatApplication extends android.app.Application {
    public SplitCompatApplication() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            com.google.android.play.core.splitcompat.SplitCompat.install(r0)
            return
    }
}
