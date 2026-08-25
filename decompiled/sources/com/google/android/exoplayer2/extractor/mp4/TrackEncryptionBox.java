package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class TrackEncryptionBox {
    private static final java.lang.String TAG = "TrackEncryptionBox";
    public final com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;

    @androidx.annotation.Nullable
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;

    @androidx.annotation.Nullable
    public final java.lang.String schemeType;

    public TrackEncryptionBox(boolean r4, @androidx.annotation.Nullable java.lang.String r5, int r6, byte[] r7, int r8, int r9, @androidx.annotation.Nullable byte[] r10) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r10 != 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            r0 = r0 ^ r2
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r3.isEncrypted = r4
            r3.schemeType = r5
            r3.perSampleIvSize = r6
            r3.defaultInitializationVector = r10
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r4 = new com.google.android.exoplayer2.extractor.TrackOutput$CryptoData
            int r5 = schemeToCryptoMode(r5)
            r4.<init>(r5, r7, r8, r9)
            r3.cryptoData = r4
            return
    }

    private static int schemeToCryptoMode(@androidx.annotation.Nullable java.lang.String r4) {
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 2
            switch(r2) {
                case 3046605: goto L2f;
                case 3046671: goto L24;
                case 3049879: goto L19;
                case 3049895: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L39
        Le:
            java.lang.String r2 = "cens"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L17
            goto L39
        L17:
            r1 = 3
            goto L39
        L19:
            java.lang.String r2 = "cenc"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L22
            goto L39
        L22:
            r1 = 2
            goto L39
        L24:
            java.lang.String r2 = "cbcs"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L2d
            goto L39
        L2d:
            r1 = 1
            goto L39
        L2f:
            java.lang.String r2 = "cbc1"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            switch(r1) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L57;
                case 3: goto L57;
                default: goto L3c;
            }
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported protection scheme type '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'. Assuming AES-CTR crypto mode."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "TrackEncryptionBox"
            com.google.android.exoplayer2.util.Log.w(r1, r4)
        L57:
            return r0
        L58:
            return r3
    }
}
