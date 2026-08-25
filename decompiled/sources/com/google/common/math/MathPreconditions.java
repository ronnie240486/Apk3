package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.GwtCompatible
final class MathPreconditions {
    private MathPreconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkInRangeForRoundingInputs(boolean r2, double r3, java.math.RoundingMode r5) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r0 = r5.length()
            int r0 = r0 + 83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "rounded value is out of range for input "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = " and rounding mode "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void checkNoOverflow(boolean r2, java.lang.String r3, int r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            int r0 = r3.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "overflow: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void checkNoOverflow(boolean r2, java.lang.String r3, long r4, long r6) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            int r0 = r3.length()
            int r0 = r0 + 54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "overflow: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    public static int checkNonNegative(java.lang.String r3, int r4) {
            if (r4 < 0) goto L3
            return r4
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.length()
            int r1 = r1 + 27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ") must be >= 0"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    public static long checkNonNegative(java.lang.String r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.length()
            int r1 = r1 + 36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ") must be >= 0"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int checkPositive(int r4) {
            if (r4 <= 0) goto L3
            return r4
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "x"
            int r2 = r1.length()
            int r2 = r2 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = " ("
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = ") must be > 0"
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
    }

    public static long checkPositive(long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "x"
            int r2 = r1.length()
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = " ("
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = ") must be > 0"
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.math.BigInteger checkPositive(java.math.BigInteger r5) {
            int r0 = r5.signum()
            if (r0 <= 0) goto L7
            return r5
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "x"
            int r2 = r1.length()
            int r2 = r2 + 15
            int r3 = r5.length()
            int r3 = r3 + r2
            java.lang.String r2 = " ("
            java.lang.String r4 = ") must be > 0"
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1, r2, r5, r4)
            r0.<init>(r5)
            throw r0
    }

    public static void checkRoundingUnnecessary(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r0)
            throw r1
    }
}
