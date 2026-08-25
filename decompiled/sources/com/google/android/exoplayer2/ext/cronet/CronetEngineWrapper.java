package com.google.android.exoplayer2.ext.cronet;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class CronetEngineWrapper {

    @androidx.annotation.Nullable
    private final org.chromium.net.CronetEngine cronetEngine;

    public CronetEngineWrapper(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public CronetEngineWrapper(android.content.Context r1, @androidx.annotation.Nullable java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            org.chromium.net.CronetEngine r1 = com.google.android.exoplayer2.ext.cronet.CronetUtil.buildCronetEngine(r1, r2, r3)
            r0.cronetEngine = r1
            return
    }

    public CronetEngineWrapper(org.chromium.net.CronetEngine r1) {
            r0 = this;
            r0.<init>()
            r0.cronetEngine = r1
            return
    }

    @androidx.annotation.Nullable
    public final org.chromium.net.CronetEngine getCronetEngine() {
            r1 = this;
            org.chromium.net.CronetEngine r0 = r1.cronetEngine
            return r0
    }
}
