package org.bson.assertions;

/* JADX INFO: loaded from: classes3.dex */
public final class Assertions {
    private Assertions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T convertToType(java.lang.Class<T> r1, java.lang.Object r2, java.lang.String r3) {
            java.lang.Class r0 = r2.getClass()
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
    }

    public static void isTrue(java.lang.String r1, boolean r2) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "state should be: "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            r2.<init>(r1)
            throw r2
    }

    public static <T> T isTrueArgument(java.lang.String r0, T r1, boolean r2) {
            if (r2 == 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "state should be: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    public static void isTrueArgument(java.lang.String r1, boolean r2) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "state should be: "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            r2.<init>(r1)
            throw r2
    }

    public static <T> T notNull(java.lang.String r1, T r2) {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = " can not be null"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r2.<init>(r1)
            throw r2
    }
}
