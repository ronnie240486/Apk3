package org.bson;

/* JADX INFO: loaded from: classes3.dex */
final class StringUtils {
    private StringUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String join(java.lang.String r2, java.util.Collection<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L1d
            goto L21
        L1d:
            r0.append(r2)
            goto L9
        L21:
            java.lang.String r2 = r0.toString()
            return r2
    }
}
