package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Utf8 {
    private Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int encodedLength(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            char r2 = r5.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L12
            int r1 = r1 + 1
            goto L5
        L12:
            r2 = r0
        L13:
            if (r1 >= r0) goto L2a
            char r3 = r5.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L25:
            int r5 = encodedLengthGeneral(r5, r1)
            int r2 = r2 + r5
        L2a:
            if (r2 < r0) goto L2d
            return r2
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            long r0 = (long) r2
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            r2 = 54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "UTF-8 length does not fit in int: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.<init>(r0)
            throw r5
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L37
            char r2 = r4.charAt(r5)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L15
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            goto L34
        L15:
            int r1 = r1 + 2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r2) goto L34
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r3) goto L34
            int r3 = java.lang.Character.codePointAt(r4, r5)
            if (r3 == r2) goto L2a
            int r5 = r5 + 1
            goto L34
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = unpairedSurrogateMsg(r5)
            r4.<init>(r5)
            throw r4
        L34:
            int r5 = r5 + 1
            goto L5
        L37:
            return r1
    }

    public static boolean isWellFormed(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            boolean r2 = isWellFormed(r2, r1, r0)
            return r2
    }

    public static boolean isWellFormed(byte[] r1, int r2, int r3) {
            int r3 = r3 + r2
            int r0 = r1.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
        L5:
            if (r2 >= r3) goto L13
            r0 = r1[r2]
            if (r0 >= 0) goto L10
            boolean r1 = isWellFormedSlowPath(r1, r2, r3)
            return r1
        L10:
            int r2 = r2 + 1
            goto L5
        L13:
            r1 = 1
            return r1
    }

    private static boolean isWellFormedSlowPath(byte[] r6, int r7, int r8) {
        L0:
            if (r7 < r8) goto L4
            r6 = 1
            return r6
        L4:
            int r0 = r7 + 1
            r7 = r6[r7]
            if (r7 >= 0) goto L60
            r1 = -32
            r2 = -65
            r3 = 0
            if (r7 >= r1) goto L1f
            if (r0 != r8) goto L14
            return r3
        L14:
            r1 = -62
            if (r7 < r1) goto L1e
            int r7 = r0 + 1
            r0 = r6[r0]
            if (r0 <= r2) goto L0
        L1e:
            return r3
        L1f:
            r4 = -16
            if (r7 >= r4) goto L3f
            int r4 = r0 + 1
            if (r4 < r8) goto L28
            return r3
        L28:
            r0 = r6[r0]
            if (r0 > r2) goto L3e
            r5 = -96
            if (r7 != r1) goto L32
            if (r0 < r5) goto L3e
        L32:
            r1 = -19
            if (r7 != r1) goto L38
            if (r5 <= r0) goto L3e
        L38:
            int r7 = r4 + 1
            r0 = r6[r4]
            if (r0 <= r2) goto L0
        L3e:
            return r3
        L3f:
            int r1 = r0 + 2
            if (r1 < r8) goto L44
            return r3
        L44:
            int r1 = r0 + 1
            r0 = r6[r0]
            if (r0 > r2) goto L5f
            int r7 = r7 << 28
            int r0 = r0 + 112
            int r0 = r0 + r7
            int r7 = r0 >> 30
            if (r7 != 0) goto L5f
            int r7 = r1 + 1
            r0 = r6[r1]
            if (r0 > r2) goto L5f
            int r0 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r2) goto L60
        L5f:
            return r3
        L60:
            r7 = r0
            goto L0
    }

    private static java.lang.String unpairedSurrogateMsg(int r2) {
            r0 = 39
            java.lang.String r1 = "Unpaired surrogate at index "
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r2
    }
}
