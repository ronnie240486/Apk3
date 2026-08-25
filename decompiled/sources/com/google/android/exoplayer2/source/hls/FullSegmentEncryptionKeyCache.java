package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
final class FullSegmentEncryptionKeyCache {
    private final java.util.LinkedHashMap<android.net.Uri, byte[]> backingMap;


    public FullSegmentEncryptionKeyCache(int r3) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache$1 r0 = new com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache$1
            int r1 = r3 + 1
            r0.<init>(r1, r3)
            r2.backingMap = r0
            return
    }

    public boolean containsUri(android.net.Uri r2) {
            r1 = this;
            java.util.LinkedHashMap<android.net.Uri, byte[]> r0 = r1.backingMap
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public byte[] get(@androidx.annotation.Nullable android.net.Uri r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.LinkedHashMap<android.net.Uri, byte[]> r0 = r1.backingMap
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            return r2
    }

    @androidx.annotation.Nullable
    public byte[] put(android.net.Uri r2, byte[] r3) {
            r1 = this;
            java.util.LinkedHashMap<android.net.Uri, byte[]> r0 = r1.backingMap
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            java.lang.Object r2 = r0.put(r2, r3)
            byte[] r2 = (byte[]) r2
            return r2
    }

    @androidx.annotation.Nullable
    public byte[] remove(android.net.Uri r2) {
            r1 = this;
            java.util.LinkedHashMap<android.net.Uri, byte[]> r0 = r1.backingMap
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.Object r2 = r0.remove(r2)
            byte[] r2 = (byte[]) r2
            return r2
    }
}
