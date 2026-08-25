package com.google.android.exoplayer2.metadata.icy;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyDecoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    private static final java.util.regex.Pattern METADATA_ELEMENT = null;
    private static final java.lang.String STREAM_KEY_NAME = "streamtitle";
    private static final java.lang.String STREAM_KEY_URL = "streamurl";
    private final java.nio.charset.CharsetDecoder iso88591Decoder;
    private final java.nio.charset.CharsetDecoder utf8Decoder;

    static {
            java.lang.String r0 = "(.+?)='(.*?)';"
            r1 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.exoplayer2.metadata.icy.IcyDecoder.METADATA_ELEMENT = r0
            return
    }

    public IcyDecoder() {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r1.utf8Decoder = r0
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.ISO_8859_1
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r1.iso88591Decoder = r0
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String decodeToString(java.nio.ByteBuffer r3) {
            r2 = this;
            java.nio.charset.CharsetDecoder r0 = r2.utf8Decoder     // Catch: java.lang.Throwable -> L13 java.nio.charset.CharacterCodingException -> L1d
            java.nio.CharBuffer r0 = r0.decode(r3)     // Catch: java.lang.Throwable -> L13 java.nio.charset.CharacterCodingException -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13 java.nio.charset.CharacterCodingException -> L1d
            java.nio.charset.CharsetDecoder r1 = r2.utf8Decoder
            r1.reset()
            r3.rewind()
            return r0
        L13:
            r0 = move-exception
            java.nio.charset.CharsetDecoder r1 = r2.utf8Decoder
            r1.reset()
            r3.rewind()
            throw r0
        L1d:
            java.nio.charset.CharsetDecoder r0 = r2.utf8Decoder
            r0.reset()
            r3.rewind()
            java.nio.charset.CharsetDecoder r0 = r2.iso88591Decoder     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L42
            java.nio.CharBuffer r0 = r0.decode(r3)     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L42
            java.nio.charset.CharsetDecoder r1 = r2.iso88591Decoder
            r1.reset()
            r3.rewind()
            return r0
        L38:
            r0 = move-exception
            java.nio.charset.CharsetDecoder r1 = r2.iso88591Decoder
            r1.reset()
            r3.rewind()
            throw r0
        L42:
            r0 = 0
            java.nio.charset.CharsetDecoder r1 = r2.iso88591Decoder
            r1.reset()
            r3.rewind()
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r8, java.nio.ByteBuffer r9) {
            r7 = this;
            java.lang.String r8 = r7.decodeToString(r9)
            int r0 = r9.limit()
            byte[] r0 = new byte[r0]
            r9.get(r0)
            r9 = 0
            r1 = 1
            r2 = 0
            if (r8 != 0) goto L21
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            com.google.android.exoplayer2.metadata.icy.IcyInfo r3 = new com.google.android.exoplayer2.metadata.icy.IcyInfo
            r3.<init>(r0, r2, r2)
            r1[r9] = r3
            r8.<init>(r1)
            return r8
        L21:
            java.util.regex.Pattern r3 = com.google.android.exoplayer2.metadata.icy.IcyDecoder.METADATA_ELEMENT
            java.util.regex.Matcher r8 = r3.matcher(r8)
            r3 = r2
            r4 = 0
        L29:
            boolean r4 = r8.find(r4)
            if (r4 == 0) goto L5c
            java.lang.String r4 = r8.group(r1)
            r5 = 2
            java.lang.String r5 = r8.group(r5)
            if (r4 == 0) goto L57
            java.lang.String r4 = com.google.common.base.Ascii.toLowerCase(r4)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r6 = "streamurl"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L56
            java.lang.String r6 = "streamtitle"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L54
            goto L57
        L54:
            r2 = r5
            goto L57
        L56:
            r3 = r5
        L57:
            int r4 = r8.end()
            goto L29
        L5c:
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            com.google.android.exoplayer2.metadata.icy.IcyInfo r4 = new com.google.android.exoplayer2.metadata.icy.IcyInfo
            r4.<init>(r0, r2, r3)
            r1[r9] = r4
            r8.<init>(r1)
            return r8
    }
}
