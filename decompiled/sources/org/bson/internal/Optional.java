package org.bson.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class Optional<T> {
    private static final org.bson.internal.Optional<java.lang.Object> NONE = null;


    public static class Some<T> extends org.bson.internal.Optional<T> {
        private final T value;

        public Some(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // org.bson.internal.Optional
        public T get() {
                r1 = this;
                T r0 = r1.value
                return r0
        }

        @Override // org.bson.internal.Optional
        public /* bridge */ /* synthetic */ boolean isDefined() {
                r1 = this;
                boolean r0 = super.isDefined()
                return r0
        }

        @Override // org.bson.internal.Optional
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.bson.internal.Optional
        public java.lang.String toString() {
                r3 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                T r1 = r3.value
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "Some(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    static {
            org.bson.internal.Optional$1 r0 = new org.bson.internal.Optional$1
            r0.<init>()
            org.bson.internal.Optional.NONE = r0
            return
    }

    public Optional() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> org.bson.internal.Optional<T> empty() {
            org.bson.internal.Optional<java.lang.Object> r0 = org.bson.internal.Optional.NONE
            return r0
    }

    public static <T> org.bson.internal.Optional<T> of(T r1) {
            if (r1 != 0) goto L5
            org.bson.internal.Optional<java.lang.Object> r1 = org.bson.internal.Optional.NONE
            return r1
        L5:
            org.bson.internal.Optional$Some r0 = new org.bson.internal.Optional$Some
            r0.<init>(r1)
            return r0
    }

    public abstract T get();

    public boolean isDefined() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public abstract boolean isEmpty();

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "None"
            return r0
    }
}
