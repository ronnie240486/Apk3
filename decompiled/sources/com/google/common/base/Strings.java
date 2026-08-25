package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String commonPrefix(java.lang.CharSequence r5, java.lang.CharSequence r6) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.base.Preconditions.checkNotNull(r6)
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 0
        L14:
            if (r2 >= r0) goto L23
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            if (r3 != r4) goto L23
            int r2 = r2 + 1
            goto L14
        L23:
            int r0 = r2 + (-1)
            boolean r3 = validSurrogatePairAt(r5, r0)
            if (r3 != 0) goto L31
            boolean r6 = validSurrogatePairAt(r6, r0)
            if (r6 == 0) goto L33
        L31:
            int r2 = r2 + (-1)
        L33:
            java.lang.CharSequence r5 = r5.subSequence(r1, r2)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static java.lang.String commonSuffix(java.lang.CharSequence r4, java.lang.CharSequence r5) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r4.length()
            int r1 = r5.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        L13:
            if (r1 >= r0) goto L30
            int r2 = r4.length()
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            char r2 = r4.charAt(r2)
            int r3 = r5.length()
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            char r3 = r5.charAt(r3)
            if (r2 != r3) goto L30
            int r1 = r1 + 1
            goto L13
        L30:
            int r0 = r4.length()
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            boolean r0 = validSurrogatePairAt(r4, r0)
            if (r0 != 0) goto L4a
            int r0 = r5.length()
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            boolean r5 = validSurrogatePairAt(r5, r0)
            if (r5 == 0) goto L4c
        L4a:
            int r1 = r1 + (-1)
        L4c:
            int r5 = r4.length()
            int r5 = r5 - r1
            int r0 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r5, r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    @javax.annotation.CheckForNull
    public static java.lang.String emptyToNull(@javax.annotation.CheckForNull java.lang.String r1) {
            int r0 = com.google.common.base.Platform.$r8$clinit
            if (r1 == 0) goto Ld
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            if (r0 == 0) goto L11
            r1 = 0
        L11:
            return r1
    }

    public static boolean isNullOrEmpty(@javax.annotation.CheckForNull java.lang.String r1) {
            int r0 = com.google.common.base.Platform.$r8$clinit
            if (r1 == 0) goto Ld
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    public static java.lang.String lenientFormat(@javax.annotation.CheckForNull java.lang.String r6, @javax.annotation.CheckForNull java.lang.Object... r7) {
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0 = 0
            if (r7 != 0) goto Lf
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r1 = "(Object[])null"
            r7[r0] = r1
            goto L1e
        Lf:
            r1 = 0
        L10:
            int r2 = r7.length
            if (r1 >= r2) goto L1e
            r2 = r7[r1]
            java.lang.String r2 = lenientToString(r2)
            r7[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r6.length()
            int r3 = r7.length
            int r3 = r3 * 16
            int r3 = r3 + r2
            r1.<init>(r3)
            r2 = 0
        L2c:
            int r3 = r7.length
            if (r0 >= r3) goto L49
            java.lang.String r3 = "%s"
            int r3 = r6.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L39
            goto L49
        L39:
            r1.append(r6, r2, r3)
            int r2 = r0 + 1
            r0 = r7[r0]
            r1.append(r0)
            int r0 = r3 + 2
            r5 = r2
            r2 = r0
            r0 = r5
            goto L2c
        L49:
            int r3 = r6.length()
            r1.append(r6, r2, r3)
            int r6 = r7.length
            if (r0 >= r6) goto L75
            java.lang.String r6 = " ["
            r1.append(r6)
            int r6 = r0 + 1
            r0 = r7[r0]
            r1.append(r0)
        L5f:
            int r0 = r7.length
            if (r6 >= r0) goto L70
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r6 + 1
            r6 = r7[r6]
            r1.append(r6)
            r6 = r0
            goto L5f
        L70:
            r6 = 93
            r1.append(r6)
        L75:
            java.lang.String r6 = r1.toString()
            return r6
    }

    private static java.lang.String lenientToString(@javax.annotation.CheckForNull java.lang.Object r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            return r6
        L5:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> La
            return r6
        La:
            r0 = move-exception
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            int r2 = r1.length()
            int r2 = r2 + 1
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            r1 = 64
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r1 = "com.google.common.base.Strings"
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Exception during lenientFormat for "
            java.lang.String r4 = java.lang.String.valueOf(r6)
            int r5 = r4.length()
            if (r5 == 0) goto L52
            java.lang.String r3 = r3.concat(r4)
            goto L58
        L52:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L58:
            r1.log(r2, r3, r0)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 9
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r1)
            int r2 = r0.length()
            int r2 = r2 + r1
            java.lang.String r1 = "<"
            java.lang.String r3 = " threw "
            java.lang.StringBuilder r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r2, r1, r6, r3, r0)
            java.lang.String r0 = ">"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    public static java.lang.String nullToEmpty(@javax.annotation.CheckForNull java.lang.String r1) {
            int r0 = com.google.common.base.Platform.$r8$clinit
            if (r1 != 0) goto L6
            java.lang.String r1 = ""
        L6:
            return r1
    }

    public static java.lang.String padEnd(java.lang.String r1, int r2, char r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            int r0 = r1.length()
            if (r0 < r2) goto La
            return r1
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            int r1 = r1.length()
        L16:
            if (r1 >= r2) goto L1e
            r0.append(r3)
            int r1 = r1 + 1
            goto L16
        L1e:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String padStart(java.lang.String r2, int r3, char r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length()
            if (r0 < r3) goto La
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r2.length()
        L13:
            if (r1 >= r3) goto L1b
            r0.append(r4)
            int r1 = r1 + 1
            goto L13
        L1b:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String repeat(java.lang.String r7, int r8) {
            com.google.common.base.Preconditions.checkNotNull(r7)
            r0 = 1
            r1 = 0
            if (r8 > r0) goto L15
            if (r8 < 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "invalid count: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r8)
            if (r8 != 0) goto L14
            java.lang.String r7 = ""
        L14:
            return r7
        L15:
            int r0 = r7.length()
            long r2 = (long) r0
            long r4 = (long) r8
            long r2 = r2 * r4
            int r8 = (int) r2
            long r4 = (long) r8
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L3b
            char[] r2 = new char[r8]
            r7.getChars(r1, r0, r2, r1)
        L28:
            int r7 = r8 - r0
            if (r0 >= r7) goto L32
            java.lang.System.arraycopy(r2, r1, r2, r0, r0)
            int r0 = r0 << 1
            goto L28
        L32:
            java.lang.System.arraycopy(r2, r1, r2, r0, r7)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2)
            return r7
        L3b:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            r8 = 51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = "Required array size too large: "
            r0.append(r8)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    @com.google.common.annotations.VisibleForTesting
    public static boolean validSurrogatePairAt(java.lang.CharSequence r2, int r3) {
            r0 = 1
            if (r3 < 0) goto L21
            int r1 = r2.length()
            int r1 = r1 + (-2)
            if (r3 > r1) goto L21
            char r1 = r2.charAt(r3)
            boolean r1 = java.lang.Character.isHighSurrogate(r1)
            if (r1 == 0) goto L21
            int r3 = r3 + r0
            char r2 = r2.charAt(r3)
            boolean r2 = java.lang.Character.isLowSurrogate(r2)
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }
}
