package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public class SystemClock implements com.google.android.exoplayer2.util.Clock {
    public SystemClock() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.Clock
    public com.google.android.exoplayer2.util.HandlerWrapper createHandler(android.os.Looper r3, @androidx.annotation.Nullable android.os.Handler.Callback r4) {
            r2 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper r0 = new com.google.android.exoplayer2.util.SystemHandlerWrapper
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r3, r4)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.util.Clock
    public long currentTimeMillis() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    @Override // com.google.android.exoplayer2.util.Clock
    public long elapsedRealtime() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }

    @Override // com.google.android.exoplayer2.util.Clock
    public void onThreadBlocked() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.util.Clock
    public long uptimeMillis() {
            r2 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            return r0
    }
}
