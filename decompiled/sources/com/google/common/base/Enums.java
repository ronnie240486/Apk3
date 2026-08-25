package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Enums {

    @com.google.common.annotations.GwtIncompatible
    private static final java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> enumConstantCache = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StringConverter<T extends java.lang.Enum<T>> extends com.google.common.base.Converter<java.lang.String, T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<T> enumClass;

        public StringConverter(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                r0.enumClass = r1
                return
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Object r1) {
                r0 = this;
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.String r1 = r1.name()
                return r1
        }

        @Override // com.google.common.base.Converter
        public final java.lang.Object doForward(java.lang.String r2) {
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Class<T extends java.lang.Enum<T>> r0 = r1.enumClass
                java.lang.Enum r2 = java.lang.Enum.valueOf(r0, r2)
                return r2
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Enums.StringConverter
                if (r0 == 0) goto Lf
                com.google.common.base.Enums$StringConverter r2 = (com.google.common.base.Enums.StringConverter) r2
                java.lang.Class<T extends java.lang.Enum<T>> r0 = r1.enumClass
                java.lang.Class<T extends java.lang.Enum<T>> r2 = r2.enumClass
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<T extends java.lang.Enum<T>> r0 = r1.enumClass
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Class<T extends java.lang.Enum<T>> r0 = r4.enumClass
                java.lang.String r0 = r0.getName()
                int r1 = r0.length()
                int r1 = r1 + 29
                java.lang.String r2 = "Enums.stringConverter("
                java.lang.String r3 = ".class)"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.common.base.Enums.enumConstantCache = r0
            return
    }

    private Enums() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> getEnumConstants(java.lang.Class<T> r2) {
            java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> r0 = com.google.common.base.Enums.enumConstantCache
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
            java.util.Map r1 = populateCache(r2)     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.lang.reflect.Field getField(java.lang.Enum<?> r1) {
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r1 = r1.name()     // Catch: java.lang.NoSuchFieldException -> Ld
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> r1, java.lang.String r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = com.google.common.base.Platform.$r8$clinit
            java.util.Map r0 = getEnumConstants(r1)
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 != 0) goto L19
            com.google.common.base.Optional r1 = com.google.common.base.Optional.absent()
            goto L27
        L19:
            java.lang.Object r2 = r2.get()
            java.lang.Object r1 = r1.cast(r2)
            java.lang.Enum r1 = (java.lang.Enum) r1
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
        L27:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> populateCache(java.lang.Class<T> r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r5)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            java.lang.Enum r2 = (java.lang.Enum) r2
            java.lang.String r3 = r2.name()
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r0.put(r3, r4)
            goto Ld
        L26:
            java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> r1 = com.google.common.base.Enums.enumConstantCache
            r1.put(r5, r0)
            return r0
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> r1) {
            com.google.common.base.Enums$StringConverter r0 = new com.google.common.base.Enums$StringConverter
            r0.<init>(r1)
            return r0
    }
}
