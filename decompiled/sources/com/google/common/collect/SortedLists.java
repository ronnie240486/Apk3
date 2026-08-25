package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedLists {

    /* JADX INFO: renamed from: com.google.common.collect.SortedLists$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract enum KeyAbsentBehavior extends java.lang.Enum<com.google.common.collect.SortedLists.KeyAbsentBehavior> {
        private static final /* synthetic */ com.google.common.collect.SortedLists.KeyAbsentBehavior[] $VALUES = null;
        public static final com.google.common.collect.SortedLists.KeyAbsentBehavior INVERTED_INSERTION_INDEX = null;
        public static final com.google.common.collect.SortedLists.KeyAbsentBehavior NEXT_HIGHER = null;
        public static final com.google.common.collect.SortedLists.KeyAbsentBehavior NEXT_LOWER = null;




        private static /* synthetic */ com.google.common.collect.SortedLists.KeyAbsentBehavior[] $values() {
                r0 = 3
                com.google.common.collect.SortedLists$KeyAbsentBehavior[] r0 = new com.google.common.collect.SortedLists.KeyAbsentBehavior[r0]
                com.google.common.collect.SortedLists$KeyAbsentBehavior r1 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyAbsentBehavior r1 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
                r2 = 1
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyAbsentBehavior r1 = com.google.common.collect.SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.SortedLists$KeyAbsentBehavior$1 r0 = new com.google.common.collect.SortedLists$KeyAbsentBehavior$1
                r0.<init>()
                com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER = r0
                com.google.common.collect.SortedLists$KeyAbsentBehavior$2 r0 = new com.google.common.collect.SortedLists$KeyAbsentBehavior$2
                r0.<init>()
                com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER = r0
                com.google.common.collect.SortedLists$KeyAbsentBehavior$3 r0 = new com.google.common.collect.SortedLists$KeyAbsentBehavior$3
                r0.<init>()
                com.google.common.collect.SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX = r0
                com.google.common.collect.SortedLists$KeyAbsentBehavior[] r0 = $values()
                com.google.common.collect.SortedLists.KeyAbsentBehavior.$VALUES = r0
                return
        }

        private KeyAbsentBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ KeyAbsentBehavior(java.lang.String r1, int r2, com.google.common.collect.SortedLists.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.SortedLists.KeyAbsentBehavior valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.SortedLists$KeyAbsentBehavior> r0 = com.google.common.collect.SortedLists.KeyAbsentBehavior.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.SortedLists$KeyAbsentBehavior r1 = (com.google.common.collect.SortedLists.KeyAbsentBehavior) r1
                return r1
        }

        public static com.google.common.collect.SortedLists.KeyAbsentBehavior[] values() {
                com.google.common.collect.SortedLists$KeyAbsentBehavior[] r0 = com.google.common.collect.SortedLists.KeyAbsentBehavior.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.SortedLists$KeyAbsentBehavior[] r0 = (com.google.common.collect.SortedLists.KeyAbsentBehavior[]) r0
                return r0
        }

        public abstract int resultIndex(int r1);
    }

    public static abstract enum KeyPresentBehavior extends java.lang.Enum<com.google.common.collect.SortedLists.KeyPresentBehavior> {
        private static final /* synthetic */ com.google.common.collect.SortedLists.KeyPresentBehavior[] $VALUES = null;
        public static final com.google.common.collect.SortedLists.KeyPresentBehavior ANY_PRESENT = null;
        public static final com.google.common.collect.SortedLists.KeyPresentBehavior FIRST_AFTER = null;
        public static final com.google.common.collect.SortedLists.KeyPresentBehavior FIRST_PRESENT = null;
        public static final com.google.common.collect.SortedLists.KeyPresentBehavior LAST_BEFORE = null;
        public static final com.google.common.collect.SortedLists.KeyPresentBehavior LAST_PRESENT = null;






        private static /* synthetic */ com.google.common.collect.SortedLists.KeyPresentBehavior[] $values() {
                r0 = 5
                com.google.common.collect.SortedLists$KeyPresentBehavior[] r0 = new com.google.common.collect.SortedLists.KeyPresentBehavior[r0]
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_PRESENT
                r2 = 1
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT
                r2 = 2
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
                r2 = 3
                r0[r2] = r1
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_BEFORE
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.SortedLists$KeyPresentBehavior$1 r0 = new com.google.common.collect.SortedLists$KeyPresentBehavior$1
                r0.<init>()
                com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT = r0
                com.google.common.collect.SortedLists$KeyPresentBehavior$2 r0 = new com.google.common.collect.SortedLists$KeyPresentBehavior$2
                r0.<init>()
                com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_PRESENT = r0
                com.google.common.collect.SortedLists$KeyPresentBehavior$3 r0 = new com.google.common.collect.SortedLists$KeyPresentBehavior$3
                r0.<init>()
                com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT = r0
                com.google.common.collect.SortedLists$KeyPresentBehavior$4 r0 = new com.google.common.collect.SortedLists$KeyPresentBehavior$4
                r0.<init>()
                com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER = r0
                com.google.common.collect.SortedLists$KeyPresentBehavior$5 r0 = new com.google.common.collect.SortedLists$KeyPresentBehavior$5
                r0.<init>()
                com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_BEFORE = r0
                com.google.common.collect.SortedLists$KeyPresentBehavior[] r0 = $values()
                com.google.common.collect.SortedLists.KeyPresentBehavior.$VALUES = r0
                return
        }

        private KeyPresentBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ KeyPresentBehavior(java.lang.String r1, int r2, com.google.common.collect.SortedLists.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.SortedLists.KeyPresentBehavior valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.SortedLists$KeyPresentBehavior> r0 = com.google.common.collect.SortedLists.KeyPresentBehavior.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.SortedLists$KeyPresentBehavior r1 = (com.google.common.collect.SortedLists.KeyPresentBehavior) r1
                return r1
        }

        public static com.google.common.collect.SortedLists.KeyPresentBehavior[] values() {
                com.google.common.collect.SortedLists$KeyPresentBehavior[] r0 = com.google.common.collect.SortedLists.KeyPresentBehavior.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.SortedLists$KeyPresentBehavior[] r0 = (com.google.common.collect.SortedLists.KeyPresentBehavior[]) r0
                return r0
        }

        public abstract <E> int resultIndex(java.util.Comparator<? super E> r1, @com.google.common.collect.ParametricNullness E r2, java.util.List<? extends E> r3, int r4);
    }

    private SortedLists() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E, K extends java.lang.Comparable> int binarySearch(java.util.List<E> r6, com.google.common.base.Function<? super E, K> r7, K r8, com.google.common.collect.SortedLists.KeyPresentBehavior r9, com.google.common.collect.SortedLists.KeyAbsentBehavior r10) {
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            int r6 = binarySearch(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <E, K> int binarySearch(java.util.List<E> r0, com.google.common.base.Function<? super E, K> r1, @com.google.common.collect.ParametricNullness K r2, java.util.Comparator<? super K> r3, com.google.common.collect.SortedLists.KeyPresentBehavior r4, com.google.common.collect.SortedLists.KeyAbsentBehavior r5) {
            java.util.List r0 = com.google.common.collect.Lists.transform(r0, r1)
            int r0 = binarySearch(r0, r2, r3, r4, r5)
            return r0
    }

    public static <E extends java.lang.Comparable> int binarySearch(java.util.List<? extends E> r1, E r2, com.google.common.collect.SortedLists.KeyPresentBehavior r3, com.google.common.collect.SortedLists.KeyAbsentBehavior r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            int r1 = binarySearch(r1, r2, r0, r3, r4)
            return r1
    }

    public static <E> int binarySearch(java.util.List<? extends E> r4, @com.google.common.collect.ParametricNullness E r5, java.util.Comparator<? super E> r6, com.google.common.collect.SortedLists.KeyPresentBehavior r7, com.google.common.collect.SortedLists.KeyAbsentBehavior r8) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Preconditions.checkNotNull(r8)
            boolean r0 = r4 instanceof java.util.RandomAccess
            if (r0 != 0) goto L14
            java.util.ArrayList r4 = com.google.common.collect.Lists.newArrayList(r4)
        L14:
            r0 = 0
            int r1 = r4.size()
            int r1 = r1 + (-1)
        L1b:
            if (r0 > r1) goto L42
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            java.lang.Object r3 = r4.get(r2)
            int r3 = r6.compare(r5, r3)
            if (r3 >= 0) goto L2f
            int r2 = r2 + (-1)
            r1 = r2
            goto L1b
        L2f:
            if (r3 <= 0) goto L35
            int r2 = r2 + 1
            r0 = r2
            goto L1b
        L35:
            int r1 = r1 + 1
            java.util.List r4 = r4.subList(r0, r1)
            int r2 = r2 - r0
            int r4 = r7.resultIndex(r6, r5, r4, r2)
            int r0 = r0 + r4
            return r0
        L42:
            int r4 = r8.resultIndex(r0)
            return r4
    }
}
