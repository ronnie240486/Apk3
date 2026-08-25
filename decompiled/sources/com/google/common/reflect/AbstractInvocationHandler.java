package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class AbstractInvocationHandler implements java.lang.reflect.InvocationHandler {
    private static final java.lang.Object[] NO_ARGS = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.reflect.AbstractInvocationHandler.NO_ARGS = r0
            return
    }

    public AbstractInvocationHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isProxyOfSameInterfaces(java.lang.Object r1, java.lang.Class<?> r2) {
            boolean r0 = r2.isInstance(r1)
            if (r0 != 0) goto L25
            java.lang.Class r0 = r1.getClass()
            boolean r0 = java.lang.reflect.Proxy.isProxyClass(r0)
            if (r0 == 0) goto L23
            java.lang.Class r1 = r1.getClass()
            java.lang.Class[] r1 = r1.getInterfaces()
            java.lang.Class[] r2 = r2.getInterfaces()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L23
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            return r1
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @javax.annotation.CheckForNull
    public abstract java.lang.Object handleInvocation() throws java.lang.Throwable;

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // java.lang.reflect.InvocationHandler
    @javax.annotation.CheckForNull
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, @javax.annotation.CheckForNull java.lang.Object[] r7) throws java.lang.Throwable {
            r4 = this;
            if (r7 != 0) goto L4
            java.lang.Object[] r7 = com.google.common.reflect.AbstractInvocationHandler.NO_ARGS
        L4:
            int r0 = r7.length
            if (r0 != 0) goto L1c
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            int r5 = r4.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L1c:
            int r0 = r7.length
            r1 = 1
            if (r0 != r1) goto L5e
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "equals"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5e
            java.lang.Class[] r0 = r6.getParameterTypes()
            r2 = 0
            r0 = r0[r2]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 != r3) goto L5e
            r6 = r7[r2]
            if (r6 != 0) goto L3e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3e:
            if (r5 != r6) goto L43
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L43:
            java.lang.Class r5 = r5.getClass()
            boolean r5 = isProxyOfSameInterfaces(r6, r5)
            if (r5 == 0) goto L58
            java.lang.reflect.InvocationHandler r5 = java.lang.reflect.Proxy.getInvocationHandler(r6)
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L58
            goto L59
        L58:
            r1 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L5e:
            int r5 = r7.length
            if (r5 != 0) goto L73
            java.lang.String r5 = r6.getName()
            java.lang.String r6 = "toString"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L73
            java.lang.String r5 = r4.toString()
            return r5
        L73:
            java.lang.Object r5 = r4.handleInvocation()
            return r5
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
