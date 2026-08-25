package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public final class UtcTimingElement {
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;

    public UtcTimingElement(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.schemeIdUri = r1
            r0.value = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.schemeIdUri
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = r2.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
