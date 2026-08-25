package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes3.dex */
public class EnigmaUtils {
    private static final java.lang.String HEX = "0123456789abcdef";
    private static final char[] HEX_ARRAY = null;
    private static final int[] data = null;

    static {
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [65, 67, 122, 80, 111, 79, 78, 115, 76, 68, 75, 100, 104, 119, 120, 53, 77, 119, 99, 122, 63, 84, 84, 73, 101, 74, 75, 104, 70, 122, 65, 71} // fill-array
            com.flextv.livestore.utils.EnigmaUtils.data = r0
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            com.flextv.livestore.utils.EnigmaUtils.HEX_ARRAY = r0
            return
    }

    public EnigmaUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String bytesToHex(byte[] r7) {
            int r0 = r7.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.length
            if (r2 >= r3) goto L23
            r3 = r7[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 * 2
            char[] r5 = com.flextv.livestore.utils.EnigmaUtils.HEX_ARRAY
            int r6 = r3 >>> 4
            char r6 = r5[r6]
            r0[r4] = r6
            int r4 = r4 + 1
            r3 = r3 & 15
            char r3 = r5[r3]
            r0[r4] = r3
            int r2 = r2 + 1
            goto L7
        L23:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            r0 = 14
            java.lang.String r7 = r7.substring(r1, r0)
            return r7
    }

    public static java.lang.String enigmatization(byte[] r1) {
            int[] r0 = com.flextv.livestore.utils.EnigmaUtils.data     // Catch: java.lang.Exception -> L10
            byte[] r0 = keyToBytes(r0)     // Catch: java.lang.Exception -> L10
            byte[] r1 = com.flextv.livestore.utils.Security.decrypt(r0, r1)     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L10
            r0.<init>(r1)     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
            return r1
    }

    public static byte[] keyToBytes(int[] r4) {
            int r0 = r4.length
            int r0 = r0 / 16
            int r0 = r0 * 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            char r3 = (char) r3
            r1.append(r3)
            int r2 = r2 + 1
            goto Lb
        L16:
            java.lang.String r4 = r1.toString()
            byte[] r4 = r4.getBytes()
            return r4
    }
}
