package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use Optional.of(value) or Optional.absent()")
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;


    public Optional() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.common.base.Optional<T> absent() {
            com.google.common.base.Absent<java.lang.Object> r0 = com.google.common.base.Absent.INSTANCE
            return r0
    }

    public static <T> com.google.common.base.Optional<T> fromNullable(@javax.annotation.CheckForNull T r1) {
            if (r1 != 0) goto L7
            com.google.common.base.Optional r1 = absent()
            goto Ld
        L7:
            com.google.common.base.Present r0 = new com.google.common.base.Present
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static <T> com.google.common.base.Optional<T> of(T r1) {
            com.google.common.base.Present r0 = new com.google.common.base.Present
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Optional$1 r0 = new com.google.common.base.Optional$1
            r0.<init>(r1)
            return r0
    }

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> r1);

    @com.google.common.annotations.Beta
    public abstract T or(com.google.common.base.Supplier<? extends T> r1);

    public abstract T or(T r1);

    @javax.annotation.CheckForNull
    public abstract T orNull();

    public abstract java.lang.String toString();

    public abstract <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> r1);
}
