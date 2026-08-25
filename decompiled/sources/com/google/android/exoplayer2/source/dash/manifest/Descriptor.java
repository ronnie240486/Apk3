package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class Descriptor {

    @androidx.annotation.Nullable
    public final java.lang.String id;
    public final java.lang.String schemeIdUri;

    @androidx.annotation.Nullable
    public final java.lang.String value;

    public Descriptor(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.schemeIdUri = r1
            r0.value = r2
            r0.id = r3
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r2 = com.google.android.exoplayer2.source.dash.manifest.Descriptor.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r5 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r5
            java.lang.String r2 = r4.schemeIdUri
            java.lang.String r3 = r5.schemeIdUri
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.value
            java.lang.String r3 = r5.value
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.id
            java.lang.String r5 = r5.id
            boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r2, r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.schemeIdUri
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.value
            r2 = 0
            if (r1 == 0) goto L12
            int r1 = r1.hashCode()
            goto L13
        L12:
            r1 = 0
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.id
            if (r1 == 0) goto L1e
            int r2 = r1.hashCode()
        L1e:
            int r0 = r0 + r2
            return r0
    }
}
