package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSource implements com.google.android.exoplayer2.upstream.DataSource {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> listeners;

    public BaseDataSource(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.isNetwork = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 1
            r2.<init>(r0)
            r1.listeners = r2
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r0 = r1.listeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L16
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r0 = r1.listeners
            r0.add(r2)
            int r2 = r1.listenerCount
            int r2 = r2 + 1
            r1.listenerCount = r2
        L16:
            return
    }

    public final void bytesTransferred(int r5) {
            r4 = this;
            com.google.android.exoplayer2.upstream.DataSpec r0 = r4.dataSpec
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.DataSpec r0 = (com.google.android.exoplayer2.upstream.DataSpec) r0
            r1 = 0
        L9:
            int r2 = r4.listenerCount
            if (r1 >= r2) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r2 = r4.listeners
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.upstream.TransferListener r2 = (com.google.android.exoplayer2.upstream.TransferListener) r2
            boolean r3 = r4.isNetwork
            r2.onBytesTransferred(r4, r0, r3, r5)
            int r1 = r1 + 1
            goto L9
        L1d:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public /* synthetic */ java.util.Map getResponseHeaders() {
            r1 = this;
            java.util.Map r0 = com.google.android.exoplayer2.upstream.DataSource.CC.$default$getResponseHeaders(r1)
            return r0
    }

    public final void transferEnded() {
            r4 = this;
            com.google.android.exoplayer2.upstream.DataSpec r0 = r4.dataSpec
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.DataSpec r0 = (com.google.android.exoplayer2.upstream.DataSpec) r0
            r1 = 0
        L9:
            int r2 = r4.listenerCount
            if (r1 >= r2) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r2 = r4.listeners
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.upstream.TransferListener r2 = (com.google.android.exoplayer2.upstream.TransferListener) r2
            boolean r3 = r4.isNetwork
            r2.onTransferEnd(r4, r0, r3)
            int r1 = r1 + 1
            goto L9
        L1d:
            r0 = 0
            r4.dataSpec = r0
            return
    }

    public final void transferInitializing(com.google.android.exoplayer2.upstream.DataSpec r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.listenerCount
            if (r0 >= r1) goto L15
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r1 = r3.listeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.upstream.TransferListener r1 = (com.google.android.exoplayer2.upstream.TransferListener) r1
            boolean r2 = r3.isNetwork
            r1.onTransferInitializing(r3, r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    public final void transferStarted(com.google.android.exoplayer2.upstream.DataSpec r4) {
            r3 = this;
            r3.dataSpec = r4
            r0 = 0
        L3:
            int r1 = r3.listenerCount
            if (r0 >= r1) goto L17
            java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> r1 = r3.listeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.upstream.TransferListener r1 = (com.google.android.exoplayer2.upstream.TransferListener) r1
            boolean r2 = r3.isNetwork
            r1.onTransferStart(r3, r4, r2)
            int r0 = r0 + 1
            goto L3
        L17:
            return
    }
}
