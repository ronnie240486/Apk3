package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public class DecoderInputBuffer extends com.google.android.exoplayer2.decoder.Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final com.google.android.exoplayer2.decoder.CryptoInfo cryptoInfo;

    @androidx.annotation.Nullable
    public java.nio.ByteBuffer data;

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format format;
    private final int paddingSize;

    @androidx.annotation.Nullable
    public java.nio.ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends java.lang.IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.currentCapacity = r3
                r2.requiredCapacity = r4
                return
        }
    }

    static {
            java.lang.String r0 = "goog.exo.decoder"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    public DecoderInputBuffer(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DecoderInputBuffer(int r2, int r3) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.decoder.CryptoInfo r0 = new com.google.android.exoplayer2.decoder.CryptoInfo
            r0.<init>()
            r1.cryptoInfo = r0
            r1.bufferReplacementMode = r2
            r1.paddingSize = r3
            return
    }

    private java.nio.ByteBuffer createReplacementByteBuffer(int r3) {
            r2 = this;
            int r0 = r2.bufferReplacementMode
            r1 = 1
            if (r0 != r1) goto La
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            return r3
        La:
            r1 = 2
            if (r0 != r1) goto L12
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            return r3
        L12:
            java.nio.ByteBuffer r0 = r2.data
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            int r0 = r0.capacity()
        L1c:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException r1 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException
            r1.<init>(r0, r3)
            throw r1
    }

    public static com.google.android.exoplayer2.decoder.DecoderInputBuffer newNoDataInstance() {
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
            r1 = this;
            super.clear()
            java.nio.ByteBuffer r0 = r1.data
            if (r0 == 0) goto La
            r0.clear()
        La:
            java.nio.ByteBuffer r0 = r1.supplementalData
            if (r0 == 0) goto L11
            r0.clear()
        L11:
            r0 = 0
            r1.waitingForKeys = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int r4) {
            r3 = this;
            int r0 = r3.paddingSize
            int r4 = r4 + r0
            java.nio.ByteBuffer r0 = r3.data
            if (r0 != 0) goto Le
            java.nio.ByteBuffer r4 = r3.createReplacementByteBuffer(r4)
            r3.data = r4
            return
        Le:
            int r1 = r0.capacity()
            int r2 = r0.position()
            int r4 = r4 + r2
            if (r1 < r4) goto L1c
            r3.data = r0
            return
        L1c:
            java.nio.ByteBuffer r4 = r3.createReplacementByteBuffer(r4)
            java.nio.ByteOrder r1 = r0.order()
            r4.order(r1)
            if (r2 <= 0) goto L2f
            r0.flip()
            r4.put(r0)
        L2f:
            r3.data = r4
            return
    }

    public final void flip() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            if (r0 == 0) goto L7
            r0.flip()
        L7:
            java.nio.ByteBuffer r0 = r1.supplementalData
            if (r0 == 0) goto Le
            r0.flip()
        Le:
            return
    }

    public final boolean isEncrypted() {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.supplementalData
            if (r0 == 0) goto L11
            int r0 = r0.capacity()
            if (r0 >= r2) goto Lb
            goto L11
        Lb:
            java.nio.ByteBuffer r2 = r1.supplementalData
            r2.clear()
            goto L17
        L11:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.supplementalData = r2
        L17:
            return
    }
}
