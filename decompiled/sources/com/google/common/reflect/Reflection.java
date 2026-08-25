package com.google.common.reflect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class Reflection {
    private Reflection() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getPackageName(java.lang.Class<?> r0) {
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.String r2) {
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 >= 0) goto Lb
            java.lang.String r2 = ""
            goto L10
        Lb:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L10:
            return r2
    }

    public static void initialize(java.lang.Class<?>... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1c
            r2 = r5[r1]
            java.lang.String r3 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L15
            r4 = 1
            java.lang.Class.forName(r3, r4, r2)     // Catch: java.lang.ClassNotFoundException -> L15
            int r1 = r1 + 1
            goto L2
        L15:
            r5 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r5)
            throw r0
        L1c:
            return
    }

    public static <T> T newProxy(java.lang.Class<T> r3, java.lang.reflect.InvocationHandler r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r3.isInterface()
            java.lang.String r1 = "%s is not an interface"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            java.lang.ClassLoader r0 = r3.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r4)
            java.lang.Object r3 = r3.cast(r4)
            return r3
    }
}
