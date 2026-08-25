package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public class Joiner {
    private final java.lang.String separator;




    /* JADX INFO: loaded from: classes.dex */
    public static final class MapJoiner {
        private final com.google.common.base.Joiner joiner;
        private final java.lang.String keyValueSeparator;

        private MapJoiner(com.google.common.base.Joiner r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.joiner = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.keyValueSeparator = r1
                return
        }

        public /* synthetic */ MapJoiner(com.google.common.base.Joiner r1, java.lang.String r2, com.google.common.base.Joiner.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public <A extends java.lang.Appendable> A appendTo(A r1, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> r2) throws java.io.IOException {
                r0 = this;
                java.util.Iterator r2 = r2.iterator()
                java.lang.Appendable r1 = r0.appendTo(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public <A extends java.lang.Appendable> A appendTo(A r4, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> r5) throws java.io.IOException {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L63
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.google.common.base.Joiner r1 = r3.joiner
                java.lang.Object r2 = r0.getKey()
                java.lang.CharSequence r1 = r1.toString(r2)
                r4.append(r1)
                java.lang.String r1 = r3.keyValueSeparator
                r4.append(r1)
                com.google.common.base.Joiner r1 = r3.joiner
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = r1.toString(r0)
                r4.append(r0)
            L2e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L63
                com.google.common.base.Joiner r0 = r3.joiner
                java.lang.String r0 = com.google.common.base.Joiner.access$100(r0)
                r4.append(r0)
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.google.common.base.Joiner r1 = r3.joiner
                java.lang.Object r2 = r0.getKey()
                java.lang.CharSequence r1 = r1.toString(r2)
                r4.append(r1)
                java.lang.String r1 = r3.keyValueSeparator
                r4.append(r1)
                com.google.common.base.Joiner r1 = r3.joiner
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = r1.toString(r0)
                r4.append(r0)
                goto L2e
            L63:
                return r4
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <A extends java.lang.Appendable> A appendTo(A r1, java.util.Map<?, ?> r2) throws java.io.IOException {
                r0 = this;
                java.util.Set r2 = r2.entrySet()
                java.lang.Appendable r1 = r0.appendTo(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> r2) {
                r0 = this;
                java.util.Iterator r2 = r2.iterator()
                java.lang.StringBuilder r1 = r0.appendTo(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> r2) {
                r0 = this;
                r0.appendTo(r1, r2)     // Catch: java.io.IOException -> L4
                return r1
            L4:
                r1 = move-exception
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>(r1)
                throw r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.util.Map<?, ?> r2) {
                r0 = this;
                java.util.Set r2 = r2.entrySet()
                java.lang.StringBuilder r1 = r0.appendTo(r1, r2)
                return r1
        }

        @com.google.common.annotations.Beta
        public java.lang.String join(java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> r1) {
                r0 = this;
                java.util.Iterator r1 = r1.iterator()
                java.lang.String r1 = r0.join(r1)
                return r1
        }

        @com.google.common.annotations.Beta
        public java.lang.String join(java.util.Iterator<? extends java.util.Map.Entry<?, ?>> r2) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r2 = r1.appendTo(r0, r2)
                java.lang.String r2 = r2.toString()
                return r2
        }

        public java.lang.String join(java.util.Map<?, ?> r1) {
                r0 = this;
                java.util.Set r1 = r1.entrySet()
                java.lang.String r1 = r0.join(r1)
                return r1
        }

        public com.google.common.base.Joiner.MapJoiner useForNull(java.lang.String r3) {
                r2 = this;
                com.google.common.base.Joiner$MapJoiner r0 = new com.google.common.base.Joiner$MapJoiner
                com.google.common.base.Joiner r1 = r2.joiner
                com.google.common.base.Joiner r3 = r1.useForNull(r3)
                java.lang.String r1 = r2.keyValueSeparator
                r0.<init>(r3, r1)
                return r0
        }
    }

    private Joiner(com.google.common.base.Joiner r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.separator
            r0.separator = r1
            return
    }

    public /* synthetic */ Joiner(com.google.common.base.Joiner r1, com.google.common.base.Joiner.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private Joiner(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.separator = r1
            return
    }

    public static /* synthetic */ java.lang.String access$100(com.google.common.base.Joiner r0) {
            java.lang.String r0 = r0.separator
            return r0
    }

    private static java.lang.Iterable<java.lang.Object> iterable(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2, java.lang.Object[] r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Joiner$3 r0 = new com.google.common.base.Joiner$3
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static com.google.common.base.Joiner on(char r1) {
            com.google.common.base.Joiner r0 = new com.google.common.base.Joiner
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.base.Joiner on(java.lang.String r1) {
            com.google.common.base.Joiner r0 = new com.google.common.base.Joiner
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <A extends java.lang.Appendable> A appendTo(A r1, java.lang.Iterable<? extends java.lang.Object> r2) throws java.io.IOException {
            r0 = this;
            java.util.Iterator r2 = r2.iterator()
            java.lang.Appendable r1 = r0.appendTo(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final <A extends java.lang.Appendable> A appendTo(A r1, @javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3, java.lang.Object... r4) throws java.io.IOException {
            r0 = this;
            java.lang.Iterable r2 = iterable(r2, r3, r4)
            java.lang.Appendable r1 = r0.appendTo(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <A extends java.lang.Appendable> A appendTo(A r2, java.util.Iterator<? extends java.lang.Object> r3) throws java.io.IOException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            java.lang.CharSequence r0 = r1.toString(r0)
            r2.append(r0)
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.String r0 = r1.separator
            r2.append(r0)
            java.lang.Object r0 = r3.next()
            java.lang.CharSequence r0 = r1.toString(r0)
            r2.append(r0)
            goto L14
        L2b:
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final <A extends java.lang.Appendable> A appendTo(A r1, java.lang.Object[] r2) throws java.io.IOException {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.Appendable r1 = r0.appendTo(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.lang.Iterable<? extends java.lang.Object> r2) {
            r0 = this;
            java.util.Iterator r2 = r2.iterator()
            java.lang.StringBuilder r1 = r0.appendTo(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, @javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3, java.lang.Object... r4) {
            r0 = this;
            java.lang.Iterable r2 = iterable(r2, r3, r4)
            java.lang.StringBuilder r1 = r0.appendTo(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.util.Iterator<? extends java.lang.Object> r2) {
            r0 = this;
            r0.appendTo(r1, r2)     // Catch: java.io.IOException -> L4
            return r1
        L4:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder r1, java.lang.Object[] r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.StringBuilder r1 = r0.appendTo(r1, r2)
            return r1
    }

    public final java.lang.String join(java.lang.Iterable<? extends java.lang.Object> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = r0.join(r1)
            return r1
    }

    public final java.lang.String join(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2, java.lang.Object... r3) {
            r0 = this;
            java.lang.Iterable r1 = iterable(r1, r2, r3)
            java.lang.String r1 = r0.join(r1)
            return r1
    }

    public final java.lang.String join(java.util.Iterator<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r1.appendTo(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public final java.lang.String join(java.lang.Object[] r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r1 = r0.join(r1)
            return r1
    }

    public com.google.common.base.Joiner skipNulls() {
            r1 = this;
            com.google.common.base.Joiner$2 r0 = new com.google.common.base.Joiner$2
            r0.<init>(r1, r1)
            return r0
    }

    public java.lang.CharSequence toString(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto La
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto Le
        La:
            java.lang.String r2 = r2.toString()
        Le:
            return r2
    }

    public com.google.common.base.Joiner useForNull(java.lang.String r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Joiner$1 r0 = new com.google.common.base.Joiner$1
            r0.<init>(r1, r1, r2)
            return r0
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(char r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.google.common.base.Joiner$MapJoiner r1 = r0.withKeyValueSeparator(r1)
            return r1
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(java.lang.String r3) {
            r2 = this;
            com.google.common.base.Joiner$MapJoiner r0 = new com.google.common.base.Joiner$MapJoiner
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
