package io.realm.internal.android;

/* JADX INFO: loaded from: classes2.dex */
public class TypeUtils {
    public TypeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] convertNonPrimitiveBinaryToPrimitive(java.lang.Byte[] r3) {
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L1e
            r2 = r3[r1]
            if (r2 == 0) goto L16
            r2 = r3[r1]
            byte r2 = r2.byteValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Byte arrays cannot contain null values."
            r3.<init>(r0)
            throw r3
        L1e:
            return r0
    }

    public static java.lang.Byte[] convertPrimitiveBinaryToNonPrimitive(byte[] r3) {
            int r0 = r3.length
            java.lang.Byte[] r0 = new java.lang.Byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }
}
