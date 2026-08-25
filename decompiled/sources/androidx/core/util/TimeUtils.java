package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TimeUtils {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final java.lang.Object sFormatSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.util.TimeUtils.sFormatSync = r0
            r0 = 24
            char[] r0 = new char[r0]
            androidx.core.util.TimeUtils.sFormatStr = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int accumField(int r2, int r3, boolean r4, int r5) {
            r0 = 3
            r1 = 99
            if (r2 > r1) goto L20
            if (r4 == 0) goto La
            if (r5 < r0) goto La
            goto L20
        La:
            r0 = 9
            r1 = 2
            if (r2 > r0) goto L1e
            if (r4 == 0) goto L14
            if (r5 < r1) goto L14
            goto L1e
        L14:
            if (r4 != 0) goto L1b
            if (r2 <= 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            int r3 = r3 + 1
            return r3
        L1e:
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = r3 + r0
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r3, long r5, java.io.PrintWriter r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            java.lang.String r3 = "--"
            r7.print(r3)
            return
        Lc:
            long r3 = r3 - r5
            r5 = 0
            formatDuration(r3, r7, r5)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r1, java.io.PrintWriter r3) {
            r0 = 0
            formatDuration(r1, r3, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r2, java.io.PrintWriter r4, int r5) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            int r2 = formatDurationLocked(r2, r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            char[] r5 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r3.<init>(r5, r1, r2)     // Catch: java.lang.Throwable -> L14
            r4.print(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long r2, java.lang.StringBuilder r4) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            r1 = 0
            int r2 = formatDurationLocked(r2, r1)     // Catch: java.lang.Throwable -> Lf
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> Lf
            r4.append(r3, r1, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static int formatDurationLocked(long r17, int r19) {
            r0 = r17
            r2 = r19
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            int r3 = r3.length
            if (r3 >= r2) goto Ld
            char[] r3 = new char[r2]
            androidx.core.util.TimeUtils.sFormatStr = r3
        Ld:
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            r4 = 0
            r6 = 32
            r10 = 1
            r11 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L25
            int r0 = r2 + (-1)
        L1b:
            if (r0 <= 0) goto L20
            r3[r11] = r6
            goto L1b
        L20:
            r0 = 48
            r3[r11] = r0
            return r10
        L25:
            if (r7 <= 0) goto L2a
            r4 = 43
            goto L2d
        L2a:
            r4 = 45
            long r0 = -r0
        L2d:
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r0 % r7
            int r13 = (int) r12
            long r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r1 = 86400(0x15180, float:1.21072E-40)
            if (r0 <= r1) goto L44
            int r5 = r0 / r1
            int r1 = r1 * r5
            int r0 = r0 - r1
            goto L45
        L44:
            r5 = 0
        L45:
            r1 = 3600(0xe10, float:5.045E-42)
            if (r0 <= r1) goto L4f
            int r1 = r0 / 3600
            int r7 = r1 * 3600
            int r0 = r0 - r7
            goto L50
        L4f:
            r1 = 0
        L50:
            r7 = 60
            if (r0 <= r7) goto L5c
            int r7 = r0 / 60
            int r8 = r7 * 60
            int r0 = r0 - r8
            r12 = r0
            r0 = r7
            goto L5e
        L5c:
            r12 = r0
            r0 = 0
        L5e:
            r14 = 3
            r15 = 2
            if (r2 == 0) goto L99
            int r7 = accumField(r5, r10, r11, r11)
            if (r7 <= 0) goto L6a
            r8 = 1
            goto L6b
        L6a:
            r8 = 0
        L6b:
            int r8 = accumField(r1, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L74
            r8 = 1
            goto L75
        L74:
            r8 = 0
        L75:
            int r8 = accumField(r0, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L7e
            r8 = 1
            goto L7f
        L7e:
            r8 = 0
        L7f:
            int r8 = accumField(r12, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L88
            r8 = 3
            goto L89
        L88:
            r8 = 0
        L89:
            int r8 = accumField(r13, r15, r10, r8)
            int r8 = r8 + r10
            int r8 = r8 + r7
            r7 = 0
        L90:
            if (r8 >= r2) goto L9a
            r3[r7] = r6
            int r7 = r7 + 1
            int r8 = r8 + 1
            goto L90
        L99:
            r7 = 0
        L9a:
            r3[r7] = r4
            int r9 = r7 + 1
            if (r2 == 0) goto La2
            r2 = 1
            goto La3
        La2:
            r2 = 0
        La3:
            r6 = 100
            r8 = 0
            r16 = 0
            r4 = r3
            r7 = r9
            r11 = r9
            r9 = r16
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 104(0x68, float:1.46E-43)
            if (r7 == r11) goto Lb7
            r8 = 1
            goto Lb8
        Lb7:
            r8 = 0
        Lb8:
            if (r2 == 0) goto Lbc
            r9 = 2
            goto Lbd
        Lbc:
            r9 = 0
        Lbd:
            r4 = r3
            r5 = r1
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 109(0x6d, float:1.53E-43)
            if (r7 == r11) goto Lc9
            r8 = 1
            goto Lca
        Lc9:
            r8 = 0
        Lca:
            if (r2 == 0) goto Lce
            r9 = 2
            goto Lcf
        Lce:
            r9 = 0
        Lcf:
            r4 = r3
            r5 = r0
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 115(0x73, float:1.61E-43)
            if (r7 == r11) goto Ldb
            r8 = 1
            goto Ldc
        Ldb:
            r8 = 0
        Ldc:
            if (r2 == 0) goto Le0
            r9 = 2
            goto Le1
        Le0:
            r9 = 0
        Le1:
            r4 = r3
            r5 = r12
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 109(0x6d, float:1.53E-43)
            r8 = 1
            if (r2 == 0) goto Lf0
            if (r7 == r11) goto Lf0
            r9 = 3
            goto Lf1
        Lf0:
            r9 = 0
        Lf1:
            r4 = r3
            r5 = r13
            int r0 = printField(r4, r5, r6, r7, r8, r9)
            r1 = 115(0x73, float:1.61E-43)
            r3[r0] = r1
            int r0 = r0 + r10
            return r0
    }

    private static int printField(char[] r2, int r3, char r4, int r5, boolean r6, int r7) {
            if (r6 != 0) goto L4
            if (r3 <= 0) goto L3d
        L4:
            if (r6 == 0) goto L9
            r0 = 3
            if (r7 >= r0) goto Ld
        L9:
            r0 = 99
            if (r3 <= r0) goto L1a
        Ld:
            int r0 = r3 / 100
            int r1 = r0 + 48
            char r1 = (char) r1
            r2[r5] = r1
            int r1 = r5 + 1
            int r0 = r0 * 100
            int r3 = r3 - r0
            goto L1b
        L1a:
            r1 = r5
        L1b:
            if (r6 == 0) goto L20
            r6 = 2
            if (r7 >= r6) goto L26
        L20:
            r6 = 9
            if (r3 > r6) goto L26
            if (r5 == r1) goto L32
        L26:
            int r5 = r3 / 10
            int r6 = r5 + 48
            char r6 = (char) r6
            r2[r1] = r6
            int r1 = r1 + 1
            int r5 = r5 * 10
            int r3 = r3 - r5
        L32:
            int r3 = r3 + 48
            char r3 = (char) r3
            r2[r1] = r3
            int r1 = r1 + 1
            r2[r1] = r4
            int r5 = r1 + 1
        L3d:
            return r5
    }
}
