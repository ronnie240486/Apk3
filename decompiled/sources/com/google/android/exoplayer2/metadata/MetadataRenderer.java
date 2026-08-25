package com.google.android.exoplayer2.metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataRenderer extends com.google.android.exoplayer2.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final java.lang.String TAG = "MetadataRenderer";
    private final com.google.android.exoplayer2.metadata.MetadataInputBuffer buffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.MetadataDecoder decoder;
    private final com.google.android.exoplayer2.metadata.MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final com.google.android.exoplayer2.metadata.MetadataOutput output;

    @androidx.annotation.Nullable
    private final android.os.Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.Metadata pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput r2, @androidx.annotation.Nullable android.os.Looper r3) {
            r1 = this;
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r0 = com.google.android.exoplayer2.metadata.MetadataDecoderFactory.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput r2, @androidx.annotation.Nullable android.os.Looper r3, com.google.android.exoplayer2.metadata.MetadataDecoderFactory r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput r2, @androidx.annotation.Nullable android.os.Looper r3, com.google.android.exoplayer2.metadata.MetadataDecoderFactory r4, boolean r5) {
            r1 = this;
            r0 = 5
            r1.<init>(r0)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.metadata.MetadataOutput r2 = (com.google.android.exoplayer2.metadata.MetadataOutput) r2
            r1.output = r2
            if (r3 != 0) goto L10
            r2 = 0
            goto L14
        L10:
            android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandler(r3, r1)
        L14:
            r1.outputHandler = r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r2 = (com.google.android.exoplayer2.metadata.MetadataDecoderFactory) r2
            r1.decoderFactory = r2
            r1.outputMetadataEarly = r5
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r2 = new com.google.android.exoplayer2.metadata.MetadataInputBuffer
            r2.<init>()
            r1.buffer = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.outputStreamOffsetUs = r2
            return
    }

    private void decodeWrappedMetadata(com.google.android.exoplayer2.metadata.Metadata r6, java.util.List<com.google.android.exoplayer2.metadata.Metadata.Entry> r7) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length()
            if (r0 >= r1) goto L60
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = r6.get(r0)
            com.google.android.exoplayer2.Format r1 = r1.getWrappedMetadataFormat()
            if (r1 == 0) goto L56
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r2 = r5.decoderFactory
            boolean r2 = r2.supportsFormat(r1)
            if (r2 == 0) goto L56
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r2 = r5.decoderFactory
            com.google.android.exoplayer2.metadata.MetadataDecoder r1 = r2.createDecoder(r1)
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r6.get(r0)
            byte[] r2 = r2.getWrappedMetadataBytes()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r3 = r5.buffer
            r3.clear()
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r3 = r5.buffer
            int r4 = r2.length
            r3.ensureSpaceForWrite(r4)
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r3 = r5.buffer
            java.nio.ByteBuffer r3 = r3.data
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r3.put(r2)
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r2 = r5.buffer
            r2.flip()
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r2 = r5.buffer
            com.google.android.exoplayer2.metadata.Metadata r1 = r1.decode(r2)
            if (r1 == 0) goto L5d
            r5.decodeWrappedMetadata(r1, r7)
            goto L5d
        L56:
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = r6.get(r0)
            r7.add(r1)
        L5d:
            int r0 = r0 + 1
            goto L1
        L60:
            return
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long r8) {
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            long r4 = r7.outputStreamOffsetUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r7.outputStreamOffsetUs
            long r8 = r8 - r0
            return r8
    }

    private void invokeRenderer(com.google.android.exoplayer2.metadata.Metadata r3) {
            r2 = this;
            android.os.Handler r0 = r2.outputHandler
            if (r0 == 0) goto Ld
            r1 = 0
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            goto L10
        Ld:
            r2.invokeRendererInternal(r3)
        L10:
            return
    }

    private void invokeRendererInternal(com.google.android.exoplayer2.metadata.Metadata r2) {
            r1 = this;
            com.google.android.exoplayer2.metadata.MetadataOutput r0 = r1.output
            r0.onMetadata(r2)
            return
    }

    private boolean outputMetadata(long r5) {
            r4 = this;
            com.google.android.exoplayer2.metadata.Metadata r0 = r4.pendingMetadata
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r2 = r4.outputMetadataEarly
            if (r2 != 0) goto L13
            long r2 = r0.presentationTimeUs
            long r5 = r4.getPresentationTimeUs(r5)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L1d
        L13:
            com.google.android.exoplayer2.metadata.Metadata r5 = r4.pendingMetadata
            r4.invokeRenderer(r5)
            r5 = 0
            r4.pendingMetadata = r5
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            boolean r6 = r4.inputStreamEnded
            if (r6 == 0) goto L28
            com.google.android.exoplayer2.metadata.Metadata r6 = r4.pendingMetadata
            if (r6 != 0) goto L28
            r4.outputStreamEnded = r1
        L28:
            return r5
    }

    private void readMetadata() {
            r4 = this;
            boolean r0 = r4.inputStreamEnded
            if (r0 != 0) goto L71
            com.google.android.exoplayer2.metadata.Metadata r0 = r4.pendingMetadata
            if (r0 != 0) goto L71
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
            r0.clear()
            com.google.android.exoplayer2.FormatHolder r0 = r4.getFormatHolder()
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r1 = r4.buffer
            r2 = 0
            int r1 = r4.readSource(r0, r1, r2)
            r2 = -4
            if (r1 != r2) goto L62
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L27
            r0 = 1
            r4.inputStreamEnded = r0
            goto L71
        L27:
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
            long r1 = r4.subsampleOffsetUs
            r0.subsampleOffsetUs = r1
            r0.flip()
            com.google.android.exoplayer2.metadata.MetadataDecoder r0 = r4.decoder
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.metadata.MetadataDecoder r0 = (com.google.android.exoplayer2.metadata.MetadataDecoder) r0
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r1 = r4.buffer
            com.google.android.exoplayer2.metadata.Metadata r0 = r0.decode(r1)
            if (r0 == 0) goto L71
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length()
            r1.<init>(r2)
            r4.decodeWrappedMetadata(r0, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L71
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.MetadataInputBuffer r2 = r4.buffer
            long r2 = r2.timeUs
            long r2 = r4.getPresentationTimeUs(r2)
            r0.<init>(r2, r1)
            r4.pendingMetadata = r0
            goto L71
        L62:
            r2 = -5
            if (r1 != r2) goto L71
            com.google.android.exoplayer2.Format r0 = r0.format
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            long r0 = r0.subsampleOffsetUs
            r4.subsampleOffsetUs = r0
        L71:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "MetadataRenderer"
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r2.what
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r2.obj
            com.google.android.exoplayer2.metadata.Metadata r2 = (com.google.android.exoplayer2.metadata.Metadata) r2
            r1.invokeRendererInternal(r2)
            r2 = 1
            return r2
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.outputStreamEnded
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r2 = this;
            r0 = 0
            r2.pendingMetadata = r0
            r2.decoder = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.outputStreamOffsetUs = r0
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r1, boolean r3) {
            r0 = this;
            r1 = 0
            r0.pendingMetadata = r1
            r1 = 0
            r0.inputStreamEnded = r1
            r0.outputStreamEnded = r1
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r3, long r4, long r6) {
            r2 = this;
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r4 = r2.decoderFactory
            r5 = 0
            r3 = r3[r5]
            com.google.android.exoplayer2.metadata.MetadataDecoder r3 = r4.createDecoder(r3)
            r2.decoder = r3
            com.google.android.exoplayer2.metadata.Metadata r3 = r2.pendingMetadata
            if (r3 == 0) goto L1b
            long r4 = r3.presentationTimeUs
            long r0 = r2.outputStreamOffsetUs
            long r4 = r4 + r0
            long r4 = r4 - r6
            com.google.android.exoplayer2.metadata.Metadata r3 = r3.copyWithPresentationTimeUs(r4)
            r2.pendingMetadata = r3
        L1b:
            r2.outputStreamOffsetUs = r6
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r1, long r3) {
            r0 = this;
            r3 = 1
        L1:
            if (r3 == 0) goto Lb
            r0.readMetadata()
            boolean r3 = r0.outputMetadata(r1)
            goto L1
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory r0 = r1.decoderFactory
            boolean r0 = r0.supportsFormat(r2)
            if (r0 == 0) goto L14
            int r2 = r2.cryptoType
            if (r2 != 0) goto Le
            r2 = 4
            goto Lf
        Le:
            r2 = 2
        Lf:
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r2
        L14:
            r2 = 0
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r2
    }
}
