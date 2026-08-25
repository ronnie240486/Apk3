package com.google.android.exoplayer2.metadata.emsg;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageDecoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    public EventMessageDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r4, java.nio.ByteBuffer r5) {
            r3 = this;
            com.google.android.exoplayer2.metadata.Metadata r4 = new com.google.android.exoplayer2.metadata.Metadata
            r0 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r2 = r5.array()
            int r5 = r5.limit()
            r1.<init>(r2, r5)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r5 = r3.decode(r1)
            r1 = 0
            r0[r1] = r5
            r4.<init>(r0)
            return r4
    }

    public com.google.android.exoplayer2.metadata.emsg.EventMessage decode(com.google.android.exoplayer2.util.ParsableByteArray r10) {
            r9 = this;
            java.lang.String r0 = r10.readNullTerminatedString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r10.readNullTerminatedString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            long r4 = r10.readLong()
            long r6 = r10.readLong()
            byte[] r0 = r10.getData()
            int r1 = r10.getPosition()
            int r10 = r10.limit()
            byte[] r8 = java.util.Arrays.copyOfRange(r0, r1, r10)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r10 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }
}
