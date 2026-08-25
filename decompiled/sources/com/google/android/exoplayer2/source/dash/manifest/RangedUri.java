package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final java.lang.String referenceUri;
    public final long start;

    public RangedUri(@androidx.annotation.Nullable java.lang.String r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.referenceUri = r1
            r0.start = r2
            r0.length = r4
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.dash.manifest.RangedUri attemptMerge(@androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.RangedUri r14, java.lang.String r15) {
            r13 = this;
            java.lang.String r1 = r13.resolveUriString(r15)
            r0 = 0
            if (r14 == 0) goto L54
            java.lang.String r15 = r14.resolveUriString(r15)
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L12
            goto L54
        L12:
            long r2 = r13.length
            r4 = -1
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 == 0) goto L35
            long r6 = r13.start
            long r8 = r6 + r2
            long r10 = r14.start
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 != 0) goto L35
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r15 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
            long r8 = r14.length
            int r14 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r14 != 0) goto L2d
            goto L2f
        L2d:
            long r2 = r2 + r8
            r4 = r2
        L2f:
            r0 = r15
            r2 = r6
            r0.<init>(r1, r2, r4)
            return r15
        L35:
            long r6 = r14.length
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L54
            long r14 = r14.start
            long r8 = r14 + r6
            long r10 = r13.start
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L54
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r8 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L4c
            goto L4e
        L4c:
            long r6 = r6 + r2
            r4 = r6
        L4e:
            r0 = r8
            r2 = r14
            r0.<init>(r1, r2, r4)
            return r8
        L54:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L2f
            java.lang.Class<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r2 = com.google.android.exoplayer2.source.dash.manifest.RangedUri.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r8 = (com.google.android.exoplayer2.source.dash.manifest.RangedUri) r8
            long r2 = r7.start
            long r4 = r8.start
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2d
            long r2 = r7.length
            long r4 = r8.length
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2d
            java.lang.String r2 = r7.referenceUri
            java.lang.String r8 = r8.referenceUri
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hashCode
            if (r0 != 0) goto L1b
            r0 = 527(0x20f, float:7.38E-43)
            long r1 = r3.start
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.length
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r3.referenceUri
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r3.hashCode = r1
        L1b:
            int r0 = r3.hashCode
            return r0
    }

    public android.net.Uri resolveUri(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.referenceUri
            android.net.Uri r2 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r2, r0)
            return r2
    }

    public java.lang.String resolveUriString(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.referenceUri
            java.lang.String r2 = com.google.android.exoplayer2.util.UriUtil.resolve(r2, r0)
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RangedUri(referenceUri="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r3.referenceUri
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            long r1 = r3.start
            r0.append(r1)
            java.lang.String r1 = ", length="
            r0.append(r1)
            long r1 = r3.length
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
