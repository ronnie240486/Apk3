package com.google.common.primitives;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class Bytes {

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtCompatible
    public static class ByteArrayAsList extends java.util.AbstractList<java.lang.Byte> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] array;
        public final int end;
        public final int start;

        public ByteArrayAsList(byte[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.array = r2
                r2 = 0
                r1.start = r2
                r1.end = r0
                return
        }

        public ByteArrayAsList(byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                r0.start = r2
                r0.end = r3
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Byte
                if (r0 == 0) goto L19
                byte[] r0 = r3.array
                java.lang.Byte r4 = (java.lang.Byte) r4
                byte r4 = r4.byteValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Bytes.access$000(r0, r4, r1, r2)
                r0 = -1
                if (r4 == r0) goto L19
                r4 = 1
                goto L1a
            L19:
                r4 = 0
            L1a:
                return r4
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.common.primitives.Bytes.ByteArrayAsList
                if (r1 == 0) goto L2e
                com.google.common.primitives.Bytes$ByteArrayAsList r8 = (com.google.common.primitives.Bytes.ByteArrayAsList) r8
                int r1 = r7.size()
                int r2 = r8.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                byte[] r4 = r7.array
                int r5 = r7.start
                int r5 = r5 + r2
                r4 = r4[r5]
                byte[] r5 = r8.array
                int r6 = r8.start
                int r6 = r6 + r2
                r5 = r5[r6]
                if (r4 == r5) goto L2a
                return r3
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                return r0
            L2e:
                boolean r8 = super.equals(r8)
                return r8
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Byte get(int r3) {
                r2 = this;
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                byte[] r0 = r2.array
                int r1 = r2.start
                int r1 = r1 + r3
                r3 = r0[r1]
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Byte r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r3 = this;
                int r0 = r3.start
                r1 = 1
            L3:
                int r2 = r3.end
                if (r0 >= r2) goto L15
                int r1 = r1 * 31
                byte[] r2 = r3.array
                r2 = r2[r0]
                int r2 = com.google.common.primitives.Bytes.hashCode(r2)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L15:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Byte
                if (r0 == 0) goto L1a
                byte[] r0 = r3.array
                java.lang.Byte r4 = (java.lang.Byte) r4
                byte r4 = r4.byteValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Bytes.access$000(r0, r4, r1, r2)
                if (r4 < 0) goto L1a
                int r0 = r3.start
                int r4 = r4 - r0
                return r4
            L1a:
                r4 = -1
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Byte
                if (r0 == 0) goto L1a
                byte[] r0 = r3.array
                java.lang.Byte r4 = (java.lang.Byte) r4
                byte r4 = r4.byteValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Bytes.access$100(r0, r4, r1, r2)
                if (r4 < 0) goto L1a
                int r0 = r3.start
                int r4 = r4 - r0
                return r4
            L1a:
                r4 = -1
                return r4
        }

        public java.lang.Byte set(int r4, java.lang.Byte r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                byte[] r0 = r3.array
                int r1 = r3.start
                int r2 = r1 + r4
                r2 = r0[r2]
                int r1 = r1 + r4
                java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.Byte r4 = (java.lang.Byte) r4
                byte r4 = r4.byteValue()
                r0[r1] = r4
                java.lang.Byte r4 = java.lang.Byte.valueOf(r2)
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Byte r2 = (java.lang.Byte) r2
                java.lang.Byte r1 = r0.set(r1, r2)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Byte> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                com.google.common.primitives.Bytes$ByteArrayAsList r0 = new com.google.common.primitives.Bytes$ByteArrayAsList
                byte[] r1 = r3.array
                int r2 = r3.start
                int r4 = r4 + r2
                int r2 = r2 + r5
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.size()
                int r1 = r1 * 5
                r0.<init>(r1)
                r1 = 91
                r0.append(r1)
                byte[] r1 = r3.array
                int r2 = r3.start
                r1 = r1[r2]
                r0.append(r1)
                int r1 = r3.start
            L1b:
                int r1 = r1 + 1
                int r2 = r3.end
                if (r1 >= r2) goto L2e
                java.lang.String r2 = ", "
                r0.append(r2)
                byte[] r2 = r3.array
                r2 = r2[r1]
                r0.append(r2)
                goto L1b
            L2e:
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private Bytes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$000(byte[] r0, byte r1, int r2, int r3) {
            int r0 = indexOf(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$100(byte[] r0, byte r1, int r2, int r3) {
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.Byte> asList(byte... r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L8:
            com.google.common.primitives.Bytes$ByteArrayAsList r0 = new com.google.common.primitives.Bytes$ByteArrayAsList
            r0.<init>(r1)
            return r0
    }

    public static byte[] concat(byte[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            byte[] r0 = new byte[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L1f
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L12
        L1f:
            return r0
    }

    public static boolean contains(byte[] r4, byte r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static byte[] ensureCapacity(byte[] r4, int r5, int r6) {
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Invalid minLength: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r5)
            if (r6 < 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "Invalid padding: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            int r0 = r4.length
            if (r0 >= r5) goto L1d
            int r5 = r5 + r6
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
        L1d:
            return r4
    }

    public static int hashCode(byte r0) {
            return r0
    }

    public static int indexOf(byte[] r2, byte r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = indexOf(r2, r3, r1, r0)
            return r2
    }

    private static int indexOf(byte[] r1, byte r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            r0 = r1[r3]
            if (r0 != r2) goto L7
            return r3
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r1 = -1
            return r1
    }

    public static int indexOf(byte[] r5, byte[] r6) {
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r0 = 0
        L11:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2b
            r2 = 0
        L19:
            int r3 = r6.length
            if (r2 >= r3) goto L2a
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L27
            int r0 = r0 + 1
            goto L11
        L27:
            int r2 = r2 + 1
            goto L19
        L2a:
            return r0
        L2b:
            r5 = -1
            return r5
    }

    public static int lastIndexOf(byte[] r2, byte r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = lastIndexOf(r2, r3, r1, r0)
            return r2
    }

    private static int lastIndexOf(byte[] r1, byte r2, int r3, int r4) {
            int r4 = r4 + (-1)
        L2:
            if (r4 < r3) goto Lc
            r0 = r1[r4]
            if (r0 != r2) goto L9
            return r4
        L9:
            int r4 = r4 + (-1)
            goto L2
        Lc:
            r1 = -1
            return r1
    }

    public static void reverse(byte[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            reverse(r2, r1, r0)
            return
    }

    public static void reverse(byte[] r2, int r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            int r4 = r4 + (-1)
        L9:
            if (r3 >= r4) goto L18
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L9
        L18:
            return
    }

    public static byte[] toArray(java.util.Collection<? extends java.lang.Number> r4) {
            boolean r0 = r4 instanceof com.google.common.primitives.Bytes.ByteArrayAsList
            if (r0 == 0) goto L11
            com.google.common.primitives.Bytes$ByteArrayAsList r4 = (com.google.common.primitives.Bytes.ByteArrayAsList) r4
            byte[] r0 = r4.array
            int r1 = r4.start
            int r4 = r4.end
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r1, r4)
            return r4
        L11:
            java.lang.Object[] r4 = r4.toArray()
            int r0 = r4.length
            byte[] r1 = new byte[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2c
            r3 = r4[r2]
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            return r1
    }
}
