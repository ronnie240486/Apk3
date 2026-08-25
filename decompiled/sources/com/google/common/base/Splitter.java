package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final com.google.common.base.Splitter.Strategy strategy;
    private final com.google.common.base.CharMatcher trimmer;






    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public static final class MapSplitter {
        private static final java.lang.String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final com.google.common.base.Splitter entrySplitter;
        private final com.google.common.base.Splitter outerSplitter;

        private MapSplitter(com.google.common.base.Splitter r1, com.google.common.base.Splitter r2) {
                r0 = this;
                r0.<init>()
                r0.outerSplitter = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Splitter r1 = (com.google.common.base.Splitter) r1
                r0.entrySplitter = r1
                return
        }

        public /* synthetic */ MapSplitter(com.google.common.base.Splitter r1, com.google.common.base.Splitter r2, com.google.common.base.Splitter.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.util.Map<java.lang.String, java.lang.String> split(java.lang.CharSequence r8) {
                r7 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                com.google.common.base.Splitter r1 = r7.outerSplitter
                java.lang.Iterable r8 = r1.split(r8)
                java.util.Iterator r8 = r8.iterator()
            Lf:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L55
                java.lang.Object r1 = r8.next()
                java.lang.String r1 = (java.lang.String) r1
                com.google.common.base.Splitter r2 = r7.entrySplitter
                java.util.Iterator r2 = com.google.common.base.Splitter.access$000(r2, r1)
                boolean r3 = r2.hasNext()
                java.lang.String r4 = "Chunk [%s] is not a valid entry"
                com.google.common.base.Preconditions.checkArgument(r3, r4, r1)
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r5 = r0.containsKey(r3)
                r5 = r5 ^ 1
                java.lang.String r6 = "Duplicate key [%s] found."
                com.google.common.base.Preconditions.checkArgument(r5, r6, r3)
                boolean r5 = r2.hasNext()
                com.google.common.base.Preconditions.checkArgument(r5, r4, r1)
                java.lang.Object r5 = r2.next()
                java.lang.String r5 = (java.lang.String) r5
                r0.put(r3, r5)
                boolean r2 = r2.hasNext()
                r2 = r2 ^ 1
                com.google.common.base.Preconditions.checkArgument(r2, r4, r1)
                goto Lf
            L55:
                java.util.Map r8 = java.util.Collections.unmodifiableMap(r0)
                return r8
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class SplittingIterator extends com.google.common.base.AbstractIterator<java.lang.String> {
        public int limit;
        public int offset;
        public final boolean omitEmptyStrings;
        public final java.lang.CharSequence toSplit;
        public final com.google.common.base.CharMatcher trimmer;

        public SplittingIterator(com.google.common.base.Splitter r2, java.lang.CharSequence r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.offset = r0
                com.google.common.base.CharMatcher r0 = com.google.common.base.Splitter.access$200(r2)
                r1.trimmer = r0
                boolean r0 = com.google.common.base.Splitter.access$300(r2)
                r1.omitEmptyStrings = r0
                int r2 = com.google.common.base.Splitter.access$400(r2)
                r1.limit = r2
                r1.toSplit = r3
                return
        }

        @Override // com.google.common.base.AbstractIterator
        @javax.annotation.CheckForNull
        public final java.lang.String computeNext() {
                r6 = this;
                int r0 = r6.offset
            L2:
                int r1 = r6.offset
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.separatorStart(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.toSplit
                int r1 = r1.length()
                r6.offset = r2
                goto L1c
            L16:
                int r3 = r6.separatorEnd(r1)
                r6.offset = r3
            L1c:
                int r3 = r6.offset
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.offset = r3
                java.lang.CharSequence r1 = r6.toSplit
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.offset = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                com.google.common.base.CharMatcher r3 = r6.trimmer
                java.lang.CharSequence r4 = r6.toSplit
                char r4 = r4.charAt(r0)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L56
                com.google.common.base.CharMatcher r3 = r6.trimmer
                java.lang.CharSequence r4 = r6.toSplit
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L56
                r1 = r5
                goto L42
            L56:
                boolean r3 = r6.omitEmptyStrings
                if (r3 == 0) goto L5f
                if (r0 != r1) goto L5f
                int r0 = r6.offset
                goto L2
            L5f:
                int r3 = r6.limit
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.toSplit
                int r1 = r1.length()
                r6.offset = r2
            L6c:
                if (r1 <= r0) goto L83
                com.google.common.base.CharMatcher r2 = r6.trimmer
                java.lang.CharSequence r3 = r6.toSplit
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.matches(r3)
                if (r2 == 0) goto L83
                r1 = r4
                goto L6c
            L80:
                int r3 = r3 - r4
                r6.limit = r3
            L83:
                java.lang.CharSequence r2 = r6.toSplit
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                goto L92
            L8e:
                r6.endOfData()
                r0 = 0
            L92:
                return r0
        }

        public abstract int separatorEnd(int r1);

        public abstract int separatorStart(int r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Strategy {
        java.util.Iterator<java.lang.String> iterator(com.google.common.base.Splitter r1, java.lang.CharSequence r2);
    }

    private Splitter(com.google.common.base.Splitter.Strategy r4) {
            r3 = this;
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.none()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r4, r1, r0, r2)
            return
    }

    private Splitter(com.google.common.base.Splitter.Strategy r1, boolean r2, com.google.common.base.CharMatcher r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.strategy = r1
            r0.omitEmptyStrings = r2
            r0.trimmer = r3
            r0.limit = r4
            return
    }

    public static /* synthetic */ java.util.Iterator access$000(com.google.common.base.Splitter r0, java.lang.CharSequence r1) {
            java.util.Iterator r0 = r0.splittingIterator(r1)
            return r0
    }

    public static /* synthetic */ com.google.common.base.CharMatcher access$200(com.google.common.base.Splitter r0) {
            com.google.common.base.CharMatcher r0 = r0.trimmer
            return r0
    }

    public static /* synthetic */ boolean access$300(com.google.common.base.Splitter r0) {
            boolean r0 = r0.omitEmptyStrings
            return r0
    }

    public static /* synthetic */ int access$400(com.google.common.base.Splitter r0) {
            int r0 = r0.limit
            return r0
    }

    public static com.google.common.base.Splitter fixedLength(int r2) {
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "The length may not be less than 1"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$4 r1 = new com.google.common.base.Splitter$4
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.base.Splitter on(char r0) {
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.is(r0)
            com.google.common.base.Splitter r0 = on(r0)
            return r0
    }

    public static com.google.common.base.Splitter on(com.google.common.base.CharMatcher r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$1 r1 = new com.google.common.base.Splitter$1
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    private static com.google.common.base.Splitter on(com.google.common.base.CommonPattern r2) {
            java.lang.String r0 = ""
            com.google.common.base.CommonMatcher r0 = r2.matcher(r0)
            boolean r0 = r0.matches()
            r0 = r0 ^ 1
            java.lang.String r1 = "The pattern may not match the empty string: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$3 r1 = new com.google.common.base.Splitter$3
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.base.Splitter on(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "The separator may not be the empty string."
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = r4.length()
            if (r0 != r1) goto L1f
            char r4 = r4.charAt(r2)
            com.google.common.base.Splitter r4 = on(r4)
            return r4
        L1f:
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$2 r1 = new com.google.common.base.Splitter$2
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.base.Splitter on(java.util.regex.Pattern r1) {
            com.google.common.base.JdkPattern r0 = new com.google.common.base.JdkPattern
            r0.<init>(r1)
            com.google.common.base.Splitter r1 = on(r0)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.base.Splitter onPattern(java.lang.String r0) {
            com.google.common.base.CommonPattern r0 = com.google.common.base.Platform.compilePattern(r0)
            com.google.common.base.Splitter r0 = on(r0)
            return r0
    }

    private java.util.Iterator<java.lang.String> splittingIterator(java.lang.CharSequence r2) {
            r1 = this;
            com.google.common.base.Splitter$Strategy r0 = r1.strategy
            java.util.Iterator r2 = r0.iterator(r1, r2)
            return r2
    }

    public com.google.common.base.Splitter limit(int r5) {
            r4 = this;
            if (r5 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "must be greater than zero: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5)
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$Strategy r1 = r4.strategy
            boolean r2 = r4.omitEmptyStrings
            com.google.common.base.CharMatcher r3 = r4.trimmer
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public com.google.common.base.Splitter omitEmptyStrings() {
            r5 = this;
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$Strategy r1 = r5.strategy
            com.google.common.base.CharMatcher r2 = r5.trimmer
            int r3 = r5.limit
            r4 = 1
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public java.lang.Iterable<java.lang.String> split(java.lang.CharSequence r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Splitter$5 r0 = new com.google.common.base.Splitter$5
            r0.<init>(r1, r2)
            return r0
    }

    public java.util.List<java.lang.String> splitToList(java.lang.CharSequence r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r3 = r2.splittingIterator(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lc
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }

    public com.google.common.base.Splitter trimResults() {
            r1 = this;
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.whitespace()
            com.google.common.base.Splitter r0 = r1.trimResults(r0)
            return r0
    }

    public com.google.common.base.Splitter trimResults(com.google.common.base.CharMatcher r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.base.Splitter r0 = new com.google.common.base.Splitter
            com.google.common.base.Splitter$Strategy r1 = r4.strategy
            boolean r2 = r4.omitEmptyStrings
            int r3 = r4.limit
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @com.google.common.annotations.Beta
    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(char r1) {
            r0 = this;
            com.google.common.base.Splitter r1 = on(r1)
            com.google.common.base.Splitter$MapSplitter r1 = r0.withKeyValueSeparator(r1)
            return r1
    }

    @com.google.common.annotations.Beta
    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(com.google.common.base.Splitter r3) {
            r2 = this;
            com.google.common.base.Splitter$MapSplitter r0 = new com.google.common.base.Splitter$MapSplitter
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(java.lang.String r1) {
            r0 = this;
            com.google.common.base.Splitter r1 = on(r1)
            com.google.common.base.Splitter$MapSplitter r1 = r0.withKeyValueSeparator(r1)
            return r1
    }
}
