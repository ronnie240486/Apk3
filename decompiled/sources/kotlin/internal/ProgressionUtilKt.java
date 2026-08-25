package kotlin.internal;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ProgressionUtilKt {
    private static final int differenceModulo(int r0, int r1, int r2) {
            int r0 = mod(r0, r2)
            int r1 = mod(r1, r2)
            int r0 = r0 - r1
            int r0 = mod(r0, r2)
            return r0
    }

    private static final long differenceModulo(long r0, long r2, long r4) {
            long r0 = mod(r0, r4)
            long r2 = mod(r2, r4)
            long r0 = r0 - r2
            long r0 = mod(r0, r4)
            return r0
    }

    @kotlin.PublishedApi
    public static final int getProgressionLastElement(int r0, int r1, int r2) {
            if (r2 <= 0) goto Lb
            if (r0 < r1) goto L5
            goto L16
        L5:
            int r0 = differenceModulo(r1, r0, r2)
            int r1 = r1 - r0
            goto L16
        Lb:
            if (r2 >= 0) goto L17
            if (r0 > r1) goto L10
            goto L16
        L10:
            int r2 = -r2
            int r0 = differenceModulo(r0, r1, r2)
            int r1 = r1 + r0
        L16:
            return r1
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.PublishedApi
    public static final long getProgressionLastElement(long r7, long r9, long r11) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto Lb
            goto L23
        Lb:
            r0 = r9
            r2 = r7
            r4 = r11
            long r7 = differenceModulo(r0, r2, r4)
            long r9 = r9 - r7
            goto L23
        L14:
            if (r2 >= 0) goto L24
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto L23
        L1b:
            long r5 = -r11
            r1 = r7
            r3 = r9
            long r7 = differenceModulo(r1, r3, r5)
            long r9 = r9 + r7
        L23:
            return r9
        L24:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Step is zero."
            r7.<init>(r8)
            throw r7
    }

    private static final int mod(int r0, int r1) {
            int r0 = r0 % r1
            if (r0 < 0) goto L4
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    private static final long mod(long r3, long r5) {
            long r3 = r3 % r5
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            goto L9
        L8:
            long r3 = r3 + r5
        L9:
            return r3
    }
}
