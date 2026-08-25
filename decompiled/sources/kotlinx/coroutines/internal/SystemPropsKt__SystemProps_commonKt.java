package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final int systemProp(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, int r9, int r10) {
            long r1 = (long) r8
            long r3 = (long) r9
            long r5 = (long) r10
            r0 = r7
            long r7 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r3, r5)
            int r8 = (int) r7
            return r8
    }

    public static final long systemProp(@org.jetbrains.annotations.NotNull java.lang.String r4, long r5, long r7, long r9) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r4)
            if (r0 != 0) goto L7
            return r5
        L7:
            java.lang.Long r5 = kotlin.text.StringsKt.toLongOrNull(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L56
            long r2 = r5.longValue()
            r5 = 0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L1f
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L1f
            r5 = 1
        L1f:
            if (r5 == 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' should be in range "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ".."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", but is '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final boolean systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0, boolean r1) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0)
            if (r0 != 0) goto L7
            goto Lb
        L7:
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        Lb:
            return r1
    }

    public static /* synthetic */ int systemProp$default(java.lang.String r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 4
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 8
            if (r4 == 0) goto Lc
            r3 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long systemProp$default(java.lang.String r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto L6
            r10 = 1
        L6:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L10
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            r5 = r12
            r0 = r7
            r1 = r8
            long r7 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r3, r5)
            return r7
    }
}
