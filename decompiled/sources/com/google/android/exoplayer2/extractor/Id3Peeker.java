package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Peeker {
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;

    public Id3Peeker() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2.scratch = r0
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.metadata.Metadata peekId3Data(com.google.android.exoplayer2.extractor.ExtractorInput r8, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r9) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r7.scratch     // Catch: java.io.EOFException -> L4c
            byte[] r3 = r3.getData()     // Catch: java.io.EOFException -> L4c
            r4 = 10
            r8.peekFully(r3, r0, r4)     // Catch: java.io.EOFException -> L4c
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r7.scratch
            r3.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r7.scratch
            int r3 = r3.readUnsignedInt24()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r3 == r5) goto L1f
            goto L4c
        L1f:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r7.scratch
            r5 = 3
            r3.skipBytes(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r7.scratch
            int r3 = r3.readSynchSafeInt()
            int r5 = r3 + 10
            if (r1 != 0) goto L47
            byte[] r1 = new byte[r5]
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r7.scratch
            byte[] r6 = r6.getData()
            java.lang.System.arraycopy(r6, r0, r1, r0, r4)
            r8.peekFully(r1, r4, r3)
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r3 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder
            r3.<init>(r9)
            com.google.android.exoplayer2.metadata.Metadata r1 = r3.decode(r1, r5)
            goto L4a
        L47:
            r8.advancePeekPosition(r3)
        L4a:
            int r2 = r2 + r5
            goto L3
        L4c:
            r8.resetPeekPosition()
            r8.advancePeekPosition(r2)
            return r1
    }
}
