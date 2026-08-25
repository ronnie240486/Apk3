package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPeriodId {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final int nextAdGroupIndex;
    public final java.lang.Object periodUid;
    public final long windowSequenceNumber;

    public MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = r3.periodUid
            r2.periodUid = r0
            int r0 = r3.adGroupIndex
            r2.adGroupIndex = r0
            int r0 = r3.adIndexInAdGroup
            r2.adIndexInAdGroup = r0
            long r0 = r3.windowSequenceNumber
            r2.windowSequenceNumber = r0
            int r3 = r3.nextAdGroupIndex
            r2.nextAdGroupIndex = r3
            return
    }

    public MediaPeriodId(java.lang.Object r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r3, r0)
            return
    }

    public MediaPeriodId(java.lang.Object r8, int r9, int r10, long r11) {
            r7 = this;
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    private MediaPeriodId(java.lang.Object r1, int r2, int r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.periodUid = r1
            r0.adGroupIndex = r2
            r0.adIndexInAdGroup = r3
            r0.windowSequenceNumber = r4
            r0.nextAdGroupIndex = r6
            return
    }

    public MediaPeriodId(java.lang.Object r8, long r9) {
            r7 = this;
            r2 = -1
            r3 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    public MediaPeriodId(java.lang.Object r8, long r9, int r11) {
            r7 = this;
            r2 = -1
            r3 = -1
            r0 = r7
            r1 = r8
            r4 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    public com.google.android.exoplayer2.source.MediaPeriodId copyWithPeriodUid(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.periodUid
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto La
            r0 = r8
            goto L19
        La:
            com.google.android.exoplayer2.source.MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaPeriodId
            int r3 = r8.adGroupIndex
            int r4 = r8.adIndexInAdGroup
            long r5 = r8.windowSequenceNumber
            int r7 = r8.nextAdGroupIndex
            r1 = r0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r7)
        L19:
            return r0
    }

    public com.google.android.exoplayer2.source.MediaPeriodId copyWithWindowSequenceNumber(long r11) {
            r10 = this;
            long r0 = r10.windowSequenceNumber
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L8
            r0 = r10
            goto L17
        L8:
            com.google.android.exoplayer2.source.MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaPeriodId
            java.lang.Object r4 = r10.periodUid
            int r5 = r10.adGroupIndex
            int r6 = r10.adIndexInAdGroup
            int r9 = r10.nextAdGroupIndex
            r3 = r0
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r9)
        L17:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.exoplayer2.source.MediaPeriodId
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.source.MediaPeriodId r8 = (com.google.android.exoplayer2.source.MediaPeriodId) r8
            java.lang.Object r1 = r7.periodUid
            java.lang.Object r3 = r8.periodUid
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L31
            int r1 = r7.adGroupIndex
            int r3 = r8.adGroupIndex
            if (r1 != r3) goto L31
            int r1 = r7.adIndexInAdGroup
            int r3 = r8.adIndexInAdGroup
            if (r1 != r3) goto L31
            long r3 = r7.windowSequenceNumber
            long r5 = r8.windowSequenceNumber
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L31
            int r1 = r7.nextAdGroupIndex
            int r8 = r8.nextAdGroupIndex
            if (r1 != r8) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.periodUid
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r3.adGroupIndex
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.adIndexInAdGroup
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.windowSequenceNumber
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.nextAdGroupIndex
            int r0 = r0 + r1
            return r0
    }

    public boolean isAd() {
            r2 = this;
            int r0 = r2.adGroupIndex
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
