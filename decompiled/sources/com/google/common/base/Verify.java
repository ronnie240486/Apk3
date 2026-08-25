package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void verify(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            r0.<init>()
            throw r0
    }

    public static void verify(boolean r2, java.lang.String r3, char r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, char r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, char r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, char r4, long r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, char r4, @javax.annotation.CheckForNull java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, int r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, int r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, int r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, int r4, long r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, int r4, @javax.annotation.CheckForNull java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, long r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, long r4, char r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Character r5 = java.lang.Character.valueOf(r6)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, long r4, int r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, long r4, long r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, long r4, @javax.annotation.CheckForNull java.lang.Object r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            r0[r4] = r6
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, long r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, @javax.annotation.CheckForNull java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, @javax.annotation.CheckForNull java.lang.Object r5, @javax.annotation.CheckForNull java.lang.Object r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4, @javax.annotation.CheckForNull java.lang.Object r5, @javax.annotation.CheckForNull java.lang.Object r6, @javax.annotation.CheckForNull java.lang.Object r7) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            r4 = 3
            r0[r4] = r7
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r0, java.lang.String r1, @javax.annotation.CheckForNull java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            java.lang.String r1 = com.google.common.base.Strings.lenientFormat(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> T verifyNotNull(@javax.annotation.CheckForNull T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "expected a non-null reference"
            java.lang.Object r2 = verifyNotNull(r2, r1, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> T verifyNotNull(@javax.annotation.CheckForNull T r0, java.lang.String r1, @javax.annotation.CheckForNull java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return r0
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            java.lang.String r1 = com.google.common.base.Strings.lenientFormat(r1, r2)
            r0.<init>(r1)
            throw r0
    }
}
