package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class MoreObjects {

    /* JADX INFO: renamed from: com.google.common.base.MoreObjects$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class ToStringHelper {
        private final java.lang.String className;
        private final com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderHead;
        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        public static final class UnconditionalValueHolder extends com.google.common.base.MoreObjects.ToStringHelper.ValueHolder {
            private UnconditionalValueHolder() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            public /* synthetic */ UnconditionalValueHolder(com.google.common.base.MoreObjects.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public static class ValueHolder {

            @javax.annotation.CheckForNull
            public java.lang.String name;

            @javax.annotation.CheckForNull
            public com.google.common.base.MoreObjects.ToStringHelper.ValueHolder next;

            @javax.annotation.CheckForNull
            public java.lang.Object value;

            private ValueHolder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ ValueHolder(com.google.common.base.MoreObjects.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        private ToStringHelper(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = new com.google.common.base.MoreObjects$ToStringHelper$ValueHolder
                r1 = 0
                r0.<init>(r1)
                r2.holderHead = r0
                r2.holderTail = r0
                r0 = 0
                r2.omitNullValues = r0
                r2.omitEmptyValues = r0
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                r2.className = r3
                return
        }

        public /* synthetic */ ToStringHelper(java.lang.String r1, com.google.common.base.MoreObjects.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder addHolder() {
                r2 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = new com.google.common.base.MoreObjects$ToStringHelper$ValueHolder
                r1 = 0
                r0.<init>(r1)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r1 = r2.holderTail
                r1.next = r0
                r2.holderTail = r0
                return r0
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r1.addHolder()
                r0.value = r2
                return r1
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(java.lang.String r2, @javax.annotation.CheckForNull java.lang.Object r3) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r1.addHolder()
                r0.value = r3
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r2 = (java.lang.String) r2
                r0.name = r2
                return r1
        }

        private com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder addUnconditionalHolder() {
                r2 = this;
                com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder r0 = new com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder
                r1 = 0
                r0.<init>(r1)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r1 = r2.holderTail
                r1.next = r0
                r2.holderTail = r0
                return r0
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.Object r2) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder r0 = r1.addUnconditionalHolder()
                r0.value = r2
                return r1
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.String r2, java.lang.Object r3) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder r0 = r1.addUnconditionalHolder()
                r0.value = r3
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r2 = (java.lang.String) r2
                r0.name = r2
                return r1
        }

        private static boolean isEmpty(java.lang.Object r3) {
                boolean r0 = r3 instanceof java.lang.CharSequence
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L11
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
            L11:
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto L1c
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                return r3
            L1c:
                boolean r0 = r3 instanceof java.util.Map
                if (r0 == 0) goto L27
                java.util.Map r3 = (java.util.Map) r3
                boolean r3 = r3.isEmpty()
                return r3
            L27:
                boolean r0 = r3 instanceof com.google.common.base.Optional
                if (r0 == 0) goto L33
                com.google.common.base.Optional r3 = (com.google.common.base.Optional) r3
                boolean r3 = r3.isPresent()
                r3 = r3 ^ r1
                return r3
            L33:
                java.lang.Class r0 = r3.getClass()
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L46
                int r3 = java.lang.reflect.Array.getLength(r3)
                if (r3 != 0) goto L44
                goto L45
            L44:
                r1 = 0
            L45:
                return r1
            L46:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, char r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, double r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, float r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, long r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, @javax.annotation.CheckForNull java.lang.Object r2) {
                r0 = this;
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(char r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(double r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(float r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(int r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(long r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(boolean r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addUnconditionalHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper omitNullValues() {
                r1 = this;
                r0 = 1
                r1.omitNullValues = r0
                return r1
        }

        public java.lang.String toString() {
                r8 = this;
                boolean r0 = r8.omitNullValues
                boolean r1 = r8.omitEmptyValues
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r8.className
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r3 = r8.holderHead
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r3 = r3.next
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L66
                java.lang.Object r5 = r3.value
                boolean r6 = r3 instanceof com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L63
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = isEmpty(r5)
                if (r6 != 0) goto L63
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.name
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5e
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5e
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = java.util.Arrays.deepToString(r6)
                int r6 = r5.length()
                int r6 = r6 - r4
                r2.append(r5, r4, r6)
                goto L61
            L5e:
                r2.append(r5)
            L61:
                java.lang.String r4 = ", "
            L63:
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r3 = r3.next
                goto L1b
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    private MoreObjects() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T firstNonNull(@javax.annotation.CheckForNull T r0, T r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = "Both parameters are null"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Class<?> r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            java.lang.String r2 = r2.getSimpleName()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Object r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.String r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
