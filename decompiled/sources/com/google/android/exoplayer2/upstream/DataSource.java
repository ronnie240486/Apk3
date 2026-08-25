package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource extends com.google.android.exoplayer2.upstream.DataReader {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.DataSource$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static java.util.Map $default$getResponseHeaders(com.google.android.exoplayer2.upstream.DataSource r0) {
                java.util.Map r0 = java.util.Collections.emptyMap()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Factory {
        com.google.android.exoplayer2.upstream.DataSource createDataSource();
    }

    void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r1);

    void close() throws java.io.IOException;

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    @androidx.annotation.Nullable
    android.net.Uri getUri();

    long open(com.google.android.exoplayer2.upstream.DataSpec r1) throws java.io.IOException;
}
