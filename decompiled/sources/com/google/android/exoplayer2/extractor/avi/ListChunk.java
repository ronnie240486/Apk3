package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class ListChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> children;
    private final int type;

    private ListChunk(int r1, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.children = r2
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.avi.AviChunk createBox(int r0, int r1, com.google.android.exoplayer2.util.ParsableByteArray r2) {
            switch(r0) {
                case 1718776947: goto L14;
                case 1751742049: goto Lf;
                case 1752331379: goto La;
                case 1852994675: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.android.exoplayer2.extractor.avi.StreamNameChunk r0 = com.google.android.exoplayer2.extractor.avi.StreamNameChunk.parseFrom(r2)
            return r0
        La:
            com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk r0 = com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk.parseFrom(r2)
            return r0
        Lf:
            com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk r0 = com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk.parseFrom(r2)
            return r0
        L14:
            com.google.android.exoplayer2.extractor.avi.AviChunk r0 = com.google.android.exoplayer2.extractor.avi.StreamFormatChunk.parseFrom(r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.extractor.avi.ListChunk parseFrom(int r7, com.google.android.exoplayer2.util.ParsableByteArray r8) {
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            int r1 = r8.limit()
            r2 = -2
        La:
            int r3 = r8.bytesLeft()
            r4 = 8
            if (r3 <= r4) goto L50
            int r3 = r8.readLittleEndianInt()
            int r4 = r8.readLittleEndianInt()
            int r5 = r8.getPosition()
            int r5 = r5 + r4
            r8.setLimit(r5)
            r4 = 1414744396(0x5453494c, float:3.6298713E12)
            if (r3 != r4) goto L30
            int r3 = r8.readLittleEndianInt()
            com.google.android.exoplayer2.extractor.avi.ListChunk r3 = parseFrom(r3, r8)
            goto L34
        L30:
            com.google.android.exoplayer2.extractor.avi.AviChunk r3 = createBox(r3, r2, r8)
        L34:
            if (r3 == 0) goto L49
            int r4 = r3.getType()
            r6 = 1752331379(0x68727473, float:4.5798432E24)
            if (r4 != r6) goto L46
            r2 = r3
            com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk r2 = (com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk) r2
            int r2 = r2.getTrackType()
        L46:
            r0.add(r3)
        L49:
            r8.setPosition(r5)
            r8.setLimit(r1)
            goto La
        L50:
            com.google.android.exoplayer2.extractor.avi.ListChunk r8 = new com.google.android.exoplayer2.extractor.avi.ListChunk
            com.google.common.collect.ImmutableList r0 = r0.build()
            r8.<init>(r7, r0)
            return r8
    }

    @androidx.annotation.Nullable
    public <T extends com.google.android.exoplayer2.extractor.avi.AviChunk> T getChild(java.lang.Class<T> r4) {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> r0 = r3.children
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.extractor.avi.AviChunk r1 = (com.google.android.exoplayer2.extractor.avi.AviChunk) r1
            java.lang.Class r2 = r1.getClass()
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
