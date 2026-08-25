package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public CollectPreconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkEntryNotNull(java.lang.Object r3, java.lang.Object r4) {
            if (r3 == 0) goto L1d
            if (r4 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            int r0 = r0 + 26
            java.lang.String r1 = "null value in entry: "
            java.lang.String r2 = "=null"
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r2)
            r4.<init>(r3)
            throw r4
        L1d:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            int r0 = r0 + 24
            java.lang.String r1 = "null key in entry: null="
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r4)
            r3.<init>(r4)
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int checkNonnegative(int r3, java.lang.String r4) {
            if (r3 < 0) goto L3
            return r3
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.length()
            int r1 = r1 + 40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r4 = " cannot be negative but was: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long checkNonnegative(long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r4
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "distance"
            int r2 = r1.length()
            int r2 = r2 + 49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = " cannot be negative but was: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
    }

    public static void checkPositive(int r3, java.lang.String r4) {
            if (r3 <= 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.length()
            int r1 = r1 + 38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r4 = " must be positive but was: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void checkRemove(boolean r1) {
            java.lang.String r0 = "no calls to next() since the last call to remove()"
            com.google.common.base.Preconditions.checkState(r1, r0)
            return
    }
}
