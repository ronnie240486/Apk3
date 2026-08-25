package com.google.android.exoplayer2.metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleMetadataDecoder implements com.google.android.exoplayer2.metadata.MetadataDecoder {
    public SimpleMetadataDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r3.data
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r0.position()
            if (r1 != 0) goto L1c
            boolean r1 = r0.hasArray()
            if (r1 == 0) goto L1c
            int r1 = r0.arrayOffset()
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            boolean r1 = r3.isDecodeOnly()
            if (r1 == 0) goto L28
            r3 = 0
            goto L2c
        L28:
            com.google.android.exoplayer2.metadata.Metadata r3 = r2.decode(r3, r0)
        L2c:
            return r3
    }

    @androidx.annotation.Nullable
    public abstract com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r1, java.nio.ByteBuffer r2);
}
