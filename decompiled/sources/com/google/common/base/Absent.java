package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
final class Absent<T> extends com.google.common.base.Optional<T> {
    public static final com.google.common.base.Absent<java.lang.Object> INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.base.Absent r0 = new com.google.common.base.Absent
            r0.<init>()
            com.google.common.base.Absent.INSTANCE = r0
            return
    }

    private Absent() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.base.Absent<java.lang.Object> r0 = com.google.common.base.Absent.INSTANCE
            return r0
    }

    @Override // com.google.common.base.Optional
    public java.util.Set<T> asSet() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // com.google.common.base.Optional
    public T get() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Optional.get() cannot be called on an absent value"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
            r1 = this;
            r0 = 2040732332(0x79a31aac, float:1.0586067E35)
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.base.Optional
    public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Optional r1 = (com.google.common.base.Optional) r1
            return r1
    }

    @Override // com.google.common.base.Optional
    public T or(com.google.common.base.Supplier<? extends T> r2) {
            r1 = this;
            java.lang.Object r2 = r2.get()
            java.lang.String r0 = "use Optional.orNull() instead of a Supplier that returns null"
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // com.google.common.base.Optional
    public T or(T r2) {
            r1 = this;
            java.lang.String r0 = "use Optional.orNull() instead of Optional.or(null)"
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // com.google.common.base.Optional
    @javax.annotation.CheckForNull
    public T orNull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.base.Optional
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Optional.absent()"
            return r0
    }

    @Override // com.google.common.base.Optional
    public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> r1) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.absent()
            return r1
    }
}
