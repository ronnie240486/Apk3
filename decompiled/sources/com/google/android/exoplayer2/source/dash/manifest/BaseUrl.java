package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class BaseUrl {
    public static final int DEFAULT_DVB_PRIORITY = 1;
    public static final int DEFAULT_WEIGHT = 1;
    public static final int PRIORITY_UNSET = Integer.MIN_VALUE;
    public final int priority;
    public final java.lang.String serviceLocation;
    public final java.lang.String url;
    public final int weight;

    public BaseUrl(java.lang.String r3) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1
            r2.<init>(r3, r3, r0, r1)
            return
    }

    public BaseUrl(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.url = r1
            r0.serviceLocation = r2
            r0.priority = r3
            r0.weight = r4
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.source.dash.manifest.BaseUrl
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r5
            int r1 = r4.priority
            int r3 = r5.priority
            if (r1 != r3) goto L2d
            int r1 = r4.weight
            int r3 = r5.weight
            if (r1 != r3) goto L2d
            java.lang.String r1 = r4.url
            java.lang.String r3 = r5.url
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L2d
            java.lang.String r1 = r4.serviceLocation
            java.lang.String r5 = r5.serviceLocation
            boolean r5 = com.google.common.base.Objects.equal(r1, r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.url
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.serviceLocation
            r2 = 1
            r0[r2] = r1
            int r1 = r3.priority
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.weight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }
}
