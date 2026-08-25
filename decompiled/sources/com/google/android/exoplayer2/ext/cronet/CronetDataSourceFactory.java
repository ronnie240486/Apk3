package com.google.android.exoplayer2.ext.cronet;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class CronetDataSourceFactory extends com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private final int connectTimeoutMs;
    private final com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper cronetEngineWrapper;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.exoplayer2.upstream.HttpDataSource.Factory fallbackFactory;
    private final int readTimeoutMs;
    private final boolean resetTimeoutOnRedirects;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.TransferListener transferListener;

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, int r11, int r12, boolean r13, com.google.android.exoplayer2.upstream.HttpDataSource.Factory r14) {
            r8 = this;
            r3 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, int r11, int r12, boolean r13, @androidx.annotation.Nullable java.lang.String r14) {
            r8 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r14 = r0.setUserAgent(r14)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r14 = r14.setConnectTimeoutMs(r11)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r7 = r14.setReadTimeoutMs(r12)
            r3 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, com.google.android.exoplayer2.upstream.HttpDataSource.Factory r11) {
            r8 = this;
            r3 = 0
            r4 = 8000(0x1f40, float:1.121E-41)
            r5 = 8000(0x1f40, float:1.121E-41)
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r2, java.util.concurrent.Executor r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r1, java.util.concurrent.Executor r2, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3, int r4, int r5, boolean r6, com.google.android.exoplayer2.upstream.HttpDataSource.Factory r7) {
            r0 = this;
            r0.<init>()
            r0.cronetEngineWrapper = r1
            r0.executor = r2
            r0.transferListener = r3
            r0.connectTimeoutMs = r4
            r0.readTimeoutMs = r5
            r0.resetTimeoutOnRedirects = r6
            r0.fallbackFactory = r7
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r11, int r12, int r13, boolean r14, @androidx.annotation.Nullable java.lang.String r15) {
            r8 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r15 = r0.setUserAgent(r15)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r15 = r15.setTransferListener(r11)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r15 = r15.setConnectTimeoutMs(r12)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r7 = r15.setReadTimeoutMs(r13)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r11, com.google.android.exoplayer2.upstream.HttpDataSource.Factory r12) {
            r8 = this;
            r4 = 8000(0x1f40, float:1.121E-41)
            r5 = 8000(0x1f40, float:1.121E-41)
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r9, java.util.concurrent.Executor r10, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r11, @androidx.annotation.Nullable java.lang.String r12) {
            r8 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r12 = r0.setUserAgent(r12)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r7 = r12.setTransferListener(r11)
            r4 = 8000(0x1f40, float:1.121E-41)
            r5 = 8000(0x1f40, float:1.121E-41)
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CronetDataSourceFactory(com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r10, java.util.concurrent.Executor r11, @androidx.annotation.Nullable java.lang.String r12) {
            r9 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r8 = r0.setUserAgent(r12)
            r4 = 0
            r5 = 8000(0x1f40, float:1.121E-41)
            r6 = 8000(0x1f40, float:1.121E-41)
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
    public final com.google.android.exoplayer2.upstream.HttpDataSource createDataSourceInternal(com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r14) {
            r13 = this;
            com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper r0 = r13.cronetEngineWrapper
            org.chromium.net.CronetEngine r2 = r0.getCronetEngine()
            if (r2 != 0) goto Lf
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r14 = r13.fallbackFactory
            com.google.android.exoplayer2.upstream.HttpDataSource r14 = r14.createDataSource()
            return r14
        Lf:
            com.google.android.exoplayer2.ext.cronet.CronetDataSource r0 = new com.google.android.exoplayer2.ext.cronet.CronetDataSource
            java.util.concurrent.Executor r3 = r13.executor
            r4 = 3
            int r5 = r13.connectTimeoutMs
            int r6 = r13.readTimeoutMs
            boolean r7 = r13.resetTimeoutOnRedirects
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r1 = r0
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.google.android.exoplayer2.upstream.TransferListener r14 = r13.transferListener
            if (r14 == 0) goto L2a
            r0.addTransferListener(r14)
        L2a:
            return r0
    }
}
