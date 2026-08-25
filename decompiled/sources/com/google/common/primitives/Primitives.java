package com.google.common.primitives;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class Primitives {
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> PRIMITIVE_TO_WRAPPER_TYPE = null;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> WRAPPER_TO_PRIMITIVE_TYPE = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            add(r0, r2, r1, r3)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            add(r0, r2, r1, r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.common.primitives.Primitives.PRIMITIVE_TO_WRAPPER_TYPE = r0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            com.google.common.primitives.Primitives.WRAPPER_TO_PRIMITIVE_TYPE = r0
            return
    }

    private Primitives() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void add(java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0, java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r0.put(r2, r3)
            r1.put(r3, r2)
            return
    }

    public static java.util.Set<java.lang.Class<?>> allPrimitiveTypes() {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.common.primitives.Primitives.PRIMITIVE_TO_WRAPPER_TYPE
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public static java.util.Set<java.lang.Class<?>> allWrapperTypes() {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.common.primitives.Primitives.WRAPPER_TO_PRIMITIVE_TYPE
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public static boolean isWrapperType(java.lang.Class<?> r1) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.common.primitives.Primitives.WRAPPER_TO_PRIMITIVE_TYPE
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    public static <T> java.lang.Class<T> unwrap(java.lang.Class<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.common.primitives.Primitives.WRAPPER_TO_PRIMITIVE_TYPE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            return r1
    }

    public static <T> java.lang.Class<T> wrap(java.lang.Class<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.common.primitives.Primitives.PRIMITIVE_TO_WRAPPER_TYPE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            return r1
    }
}
