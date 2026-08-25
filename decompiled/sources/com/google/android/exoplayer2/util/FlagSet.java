package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class FlagSet {
    private final android.util.SparseBooleanArray flags;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.FlagSet$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private boolean buildCalled;
        private final android.util.SparseBooleanArray flags;

        public Builder() {
                r1 = this;
                r1.<init>()
                android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
                r0.<init>()
                r1.flags = r0
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder add(int r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r1 = 1
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                android.util.SparseBooleanArray r0 = r2.flags
                r0.append(r3, r1)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder addAll(com.google.android.exoplayer2.util.FlagSet r3) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r3.size()
                if (r0 >= r1) goto L11
                int r1 = r3.get(r0)
                r2.add(r1)
                int r0 = r0 + 1
                goto L1
            L11:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder addAll(int... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Lc
                r2 = r4[r1]
                r3.add(r2)
                int r1 = r1 + 1
                goto L2
            Lc:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder addIf(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L7
                com.google.android.exoplayer2.util.FlagSet$Builder r1 = r0.add(r1)
                return r1
            L7:
                return r0
        }

        public com.google.android.exoplayer2.util.FlagSet build() {
                r3 = this;
                boolean r0 = r3.buildCalled
                r1 = 1
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r3.buildCalled = r1
                com.google.android.exoplayer2.util.FlagSet r0 = new com.google.android.exoplayer2.util.FlagSet
                android.util.SparseBooleanArray r1 = r3.flags
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder remove(int r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                android.util.SparseBooleanArray r0 = r1.flags
                r0.delete(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder removeAll(int... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Lc
                r2 = r4[r1]
                r3.remove(r2)
                int r1 = r1 + 1
                goto L2
            Lc:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.FlagSet.Builder removeIf(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L7
                com.google.android.exoplayer2.util.FlagSet$Builder r1 = r0.remove(r1)
                return r1
            L7:
                return r0
        }
    }

    private FlagSet(android.util.SparseBooleanArray r1) {
            r0 = this;
            r0.<init>()
            r0.flags = r1
            return
    }

    public /* synthetic */ FlagSet(android.util.SparseBooleanArray r1, com.google.android.exoplayer2.util.FlagSet.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean contains(int r2) {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.flags
            boolean r2 = r0.get(r2)
            return r2
    }

    public boolean containsAny(int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.exoplayer2.util.FlagSet
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.util.FlagSet r6 = (com.google.android.exoplayer2.util.FlagSet) r6
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 24
            if (r1 >= r3) goto L33
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L1d
            return r2
        L1d:
            r1 = 0
        L1e:
            int r3 = r5.size()
            if (r1 >= r3) goto L32
            int r3 = r5.get(r1)
            int r4 = r6.get(r1)
            if (r3 == r4) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L1e
        L32:
            return r0
        L33:
            android.util.SparseBooleanArray r0 = r5.flags
            android.util.SparseBooleanArray r6 = r6.flags
            boolean r6 = r0.equals(r6)
            return r6
    }

    public int get(int r3) {
            r2 = this;
            int r0 = r2.size()
            r1 = 0
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r0)
            android.util.SparseBooleanArray r0 = r2.flags
            int r3 = r0.keyAt(r3)
            return r3
    }

    public int hashCode() {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L1c
            int r0 = r3.size()
            r1 = 0
        Lb:
            int r2 = r3.size()
            if (r1 >= r2) goto L1b
            int r0 = r0 * 31
            int r2 = r3.get(r1)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
        L1c:
            android.util.SparseBooleanArray r0 = r3.flags
            int r0 = r0.hashCode()
            return r0
    }

    public int size() {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.flags
            int r0 = r0.size()
            return r0
    }
}
