package io.realm;

/* JADX INFO: loaded from: classes3.dex */
class ProxyUtils {
    public ProxyUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void throwWrongElementType(@javax.annotation.Nullable java.lang.Class r4) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "Element type '%s' is not handled."
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }
}
