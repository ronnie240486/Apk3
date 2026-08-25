package androidx.leanback.util;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class MathUtil {
    private MathUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int safeLongToInt(long r4) {
            int r0 = (int) r4
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L7
            return r0
        L7:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "Input overflows int.\n"
            r4.<init>(r5)
            throw r4
    }
}
