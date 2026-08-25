package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public final class Header {
    private final java.lang.String mName;
    private final java.lang.String mValue;

    public Header(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mValue = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<com.android.volley.Header> r2 = com.android.volley.Header.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.android.volley.Header r5 = (com.android.volley.Header) r5
            java.lang.String r2 = r4.mName
            java.lang.String r3 = r5.mName
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L27
            java.lang.String r2 = r4.mValue
            java.lang.String r5 = r5.mValue
            boolean r5 = android.text.TextUtils.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.mValue
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.mName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.mValue
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Header[name="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r3.mName
            r0.append(r1)
            java.lang.String r1 = ",value="
            r0.append(r1)
            java.lang.String r1 = r3.mValue
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
