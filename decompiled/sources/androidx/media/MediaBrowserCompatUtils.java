package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areSameOptions(android.os.Bundle r6, android.os.Bundle r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r2 = "android.media.browse.extra.PAGE_SIZE"
            java.lang.String r3 = "android.media.browse.extra.PAGE"
            r4 = -1
            if (r6 != 0) goto L1b
            int r6 = r7.getInt(r3, r4)
            if (r6 != r4) goto L19
            int r6 = r7.getInt(r2, r4)
            if (r6 != r4) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            if (r7 != 0) goto L2c
            int r7 = r6.getInt(r3, r4)
            if (r7 != r4) goto L2a
            int r6 = r6.getInt(r2, r4)
            if (r6 != r4) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
        L2c:
            int r5 = r6.getInt(r3, r4)
            int r3 = r7.getInt(r3, r4)
            if (r5 != r3) goto L41
            int r6 = r6.getInt(r2, r4)
            int r7 = r7.getInt(r2, r4)
            if (r6 != r7) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
    }

    public static boolean hasDuplicatedItems(android.os.Bundle r6, android.os.Bundle r7) {
            java.lang.String r0 = "android.media.browse.extra.PAGE"
            r1 = -1
            if (r6 != 0) goto L7
            r2 = -1
            goto Lb
        L7:
            int r2 = r6.getInt(r0, r1)
        Lb:
            if (r7 != 0) goto Lf
            r0 = -1
            goto L13
        Lf:
            int r0 = r7.getInt(r0, r1)
        L13:
            java.lang.String r3 = "android.media.browse.extra.PAGE_SIZE"
            if (r6 != 0) goto L19
            r6 = -1
            goto L1d
        L19:
            int r6 = r6.getInt(r3, r1)
        L1d:
            if (r7 != 0) goto L21
            r7 = -1
            goto L25
        L21:
            int r7 = r7.getInt(r3, r1)
        L25:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1
            r5 = 0
            if (r2 == r1) goto L34
            if (r6 != r1) goto L2f
            goto L34
        L2f:
            int r2 = r2 * r6
            int r6 = r6 + r2
            int r6 = r6 - r4
            goto L38
        L34:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
        L38:
            if (r0 == r1) goto L43
            if (r7 != r1) goto L3d
            goto L43
        L3d:
            int r0 = r0 * r7
            int r7 = r7 + r0
            int r3 = r7 + (-1)
            goto L44
        L43:
            r0 = 0
        L44:
            if (r6 < r0) goto L49
            if (r3 < r2) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            return r4
    }
}
