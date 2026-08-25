package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Throwables {

    @com.google.common.annotations.GwtIncompatible
    private static final java.lang.String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static final java.lang.reflect.Method getStackTraceDepthMethod = null;

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static final java.lang.reflect.Method getStackTraceElementMethod = null;

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static final java.lang.Object jla = null;


    static {
            java.lang.Object r0 = getJLA()
            com.google.common.base.Throwables.jla = r0
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Lf
        Lb:
            java.lang.reflect.Method r2 = getGetMethod()
        Lf:
            com.google.common.base.Throwables.getStackTraceElementMethod = r2
            if (r0 != 0) goto L14
            goto L18
        L14:
            java.lang.reflect.Method r1 = getSizeMethod(r0)
        L18:
            com.google.common.base.Throwables.getStackTraceDepthMethod = r1
            return
    }

    private Throwables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.reflect.Method access$000() {
            java.lang.reflect.Method r0 = com.google.common.base.Throwables.getStackTraceElementMethod
            return r0
    }

    public static /* synthetic */ java.lang.Object access$100() {
            java.lang.Object r0 = com.google.common.base.Throwables.jla
            return r0
    }

    public static /* synthetic */ java.lang.Object access$200(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object[] r2) {
            java.lang.Object r0 = invokeAccessibleNonThrowingMethod(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Method access$300() {
            java.lang.reflect.Method r0 = com.google.common.base.Throwables.getStackTraceDepthMethod
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r3)
            r1 = 0
            r2 = 0
            r1 = r3
        Lf:
            java.lang.Throwable r3 = r3.getCause()
            if (r3 == 0) goto L2b
            r0.add(r3)
            if (r3 == r1) goto L23
            if (r2 == 0) goto L20
            java.lang.Throwable r1 = r1.getCause()
        L20:
            r2 = r2 ^ 1
            goto Lf
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Loop in causal chain detected."
            r0.<init>(r1, r3)
            throw r0
        L2b:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    public static <X extends java.lang.Throwable> X getCauseAs(java.lang.Throwable r1, java.lang.Class<X> r2) {
            java.lang.Throwable r0 = r1.getCause()     // Catch: java.lang.ClassCastException -> Lb
            java.lang.Object r2 = r2.cast(r0)     // Catch: java.lang.ClassCastException -> Lb
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.ClassCastException -> Lb
            return r2
        Lb:
            r2 = move-exception
            r2.initCause(r1)
            throw r2
    }

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static java.lang.reflect.Method getGetMethod() {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "getStackTraceElement"
            java.lang.reflect.Method r0 = getJlaMethod(r1, r0)
            return r0
    }

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static java.lang.Object getJLA() {
            r0 = 0
            java.lang.String r1 = "sun.misc.SharedSecrets"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> L17 java.lang.ThreadDeath -> L18
            java.lang.String r3 = "getJavaLangAccess"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L17 java.lang.ThreadDeath -> L18
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L17 java.lang.ThreadDeath -> L18
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L17 java.lang.ThreadDeath -> L18
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L17 java.lang.ThreadDeath -> L18
        L17:
            return r0
        L18:
            r0 = move-exception
            throw r0
    }

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static java.lang.reflect.Method getJlaMethod(java.lang.String r3, java.lang.Class<?>... r4) throws java.lang.ThreadDeath {
            r0 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> Le java.lang.ThreadDeath -> Lf
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> Le java.lang.ThreadDeath -> Lf
            return r3
        Le:
            return r0
        Lf:
            r3 = move-exception
            throw r3
    }

    public static java.lang.Throwable getRootCause(java.lang.Throwable r3) {
            r0 = 0
            r1 = 0
            r0 = r3
        L3:
            java.lang.Throwable r2 = r3.getCause()
            if (r2 == 0) goto L1e
            if (r2 == r0) goto L16
            if (r1 == 0) goto L12
            java.lang.Throwable r3 = r0.getCause()
            r0 = r3
        L12:
            r1 = r1 ^ 1
            r3 = r2
            goto L3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Loop in causal chain detected."
            r3.<init>(r0, r2)
            throw r3
        L1e:
            return r3
    }

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    private static java.lang.reflect.Method getSizeMethod(java.lang.Object r6) {
            r0 = 0
            java.lang.String r1 = "getStackTraceDepth"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = getJlaMethod(r1, r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            r2[r5] = r3     // Catch: java.lang.Throwable -> L1f
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.lang.String getStackTraceAsString(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.lang.Object invokeAccessibleNonThrowingMethod(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> Lf
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = propagate(r0)
            throw r0
        Lf:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.util.List<java.lang.StackTraceElement> jlaStackTrace(java.lang.Throwable r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Throwables$1 r0 = new com.google.common.base.Throwables$1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable r1) {
            boolean r0 = lazyStackTraceIsLazy()
            if (r0 == 0) goto Lb
            java.util.List r1 = jlaStackTrace(r1)
            goto L17
        Lb:
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L17:
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean lazyStackTraceIsLazy() {
            java.lang.reflect.Method r0 = com.google.common.base.Throwables.getStackTraceElementMethod
            if (r0 == 0) goto La
            java.lang.reflect.Method r0 = com.google.common.base.Throwables.getStackTraceDepthMethod
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static java.lang.RuntimeException propagate(java.lang.Throwable r1) {
            throwIfUnchecked(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static <X extends java.lang.Throwable> void propagateIfInstanceOf(@javax.annotation.CheckForNull java.lang.Throwable r0, java.lang.Class<X> r1) throws java.lang.Throwable {
            if (r0 == 0) goto L5
            throwIfInstanceOf(r0, r1)
        L5:
            return
    }

    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable r0) {
            if (r0 == 0) goto L5
            throwIfUnchecked(r0)
        L5:
            return
    }

    @com.google.common.annotations.GwtIncompatible
    public static <X extends java.lang.Throwable> void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable r0, java.lang.Class<X> r1) throws java.lang.Throwable {
            propagateIfInstanceOf(r0, r1)
            propagateIfPossible(r0)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    public static <X1 extends java.lang.Throwable, X2 extends java.lang.Throwable> void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable r0, java.lang.Class<X1> r1, java.lang.Class<X2> r2) throws java.lang.Throwable, java.lang.Throwable {
            com.google.common.base.Preconditions.checkNotNull(r2)
            propagateIfInstanceOf(r0, r1)
            propagateIfPossible(r0, r2)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    public static <X extends java.lang.Throwable> void throwIfInstanceOf(java.lang.Throwable r1, java.lang.Class<X> r2) throws java.lang.Throwable {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r2.isInstance(r1)
            if (r0 != 0) goto La
            return
        La:
            java.lang.Object r1 = r2.cast(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
    }

    public static void throwIfUnchecked(java.lang.Throwable r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        Lf:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
    }
}
