package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements com.google.common.base.Predicate<java.lang.Character> {
    private static final int DISTINCT_CHARS = 65536;


    public static final class And extends com.google.common.base.CharMatcher {
        public final com.google.common.base.CharMatcher first;
        public final com.google.common.base.CharMatcher second;

        public And(com.google.common.base.CharMatcher r1, com.google.common.base.CharMatcher r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                r0.first = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                r0.second = r1
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.first
                boolean r0 = r0.matches(r2)
                if (r0 == 0) goto L12
                com.google.common.base.CharMatcher r0 = r1.second
                boolean r2 = r0.matches(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r4) {
                r3 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                com.google.common.base.CharMatcher r1 = r3.first
                r1.setBits(r0)
                java.util.BitSet r1 = new java.util.BitSet
                r1.<init>()
                com.google.common.base.CharMatcher r2 = r3.second
                r2.setBits(r1)
                r0.and(r1)
                r4.or(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.CharMatcher r0 = r5.first
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.CharMatcher r1 = r5.second
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 19
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "CharMatcher.and("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class Any extends com.google.common.base.CharMatcher.NamedFastMatcher {
        public static final com.google.common.base.CharMatcher.Any INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$Any r0 = new com.google.common.base.CharMatcher$Any
                r0.<init>()
                com.google.common.base.CharMatcher.Any.INSTANCE = r0
                return
        }

        private Any() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.any()"
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence r1, char r2) {
                r0 = this;
                int r1 = r1.length()
                if (r1 != 0) goto L9
                java.lang.String r1 = ""
                goto Ld
            L9:
                java.lang.String r1 = java.lang.String.valueOf(r2)
            Ld:
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence r1) {
                r0 = this;
                int r1 = r1.length()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence r1) {
                r0 = this;
                int r1 = r1.length()
                if (r1 != 0) goto L8
                r1 = -1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence r1, int r2) {
                r0 = this;
                int r1 = r1.length()
                com.google.common.base.Preconditions.checkPositionIndex(r2, r1)
                if (r2 != r1) goto La
                r2 = -1
            La:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence r1) {
                r0 = this;
                int r1 = r1.length()
                int r1 = r1 + (-1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                r1 = 1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence r1) {
                r0 = this;
                int r1 = r1.length()
                if (r1 != 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.none()
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = ""
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence r1, char r2) {
                r0 = this;
                int r1 = r1.length()
                char[] r1 = new char[r1]
                java.util.Arrays.fill(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r1)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence r4, java.lang.CharSequence r5) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r4.length()
                int r2 = r5.length()
                int r2 = r2 * r1
                r0.<init>(r2)
                r1 = 0
            L10:
                int r2 = r4.length()
                if (r1 >= r2) goto L1c
                r0.append(r5)
                int r1 = r1 + 1
                goto L10
            L1c:
                java.lang.String r4 = r0.toString()
                return r4
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = ""
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AnyOf extends com.google.common.base.CharMatcher {
        private final char[] chars;

        public AnyOf(java.lang.CharSequence r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = r1.toString()
                char[] r1 = r1.toCharArray()
                r0.chars = r1
                java.util.Arrays.sort(r1)
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                char[] r0 = r1.chars
                int r2 = java.util.Arrays.binarySearch(r0, r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r5) {
                r4 = this;
                char[] r0 = r4.chars
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                char r3 = r0[r2]
                r5.set(r3)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CharMatcher.anyOf(\""
                r0.<init>(r1)
                char[] r1 = r5.chars
                int r2 = r1.length
                r3 = 0
            Lb:
                if (r3 >= r2) goto L19
                char r4 = r1[r3]
                java.lang.String r4 = com.google.common.base.CharMatcher.access$100(r4)
                r0.append(r4)
                int r3 = r3 + 1
                goto Lb
            L19:
                java.lang.String r1 = "\")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class Ascii extends com.google.common.base.CharMatcher.NamedFastMatcher {
        public static final com.google.common.base.CharMatcher.Ascii INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$Ascii r0 = new com.google.common.base.CharMatcher$Ascii
                r0.<init>()
                com.google.common.base.CharMatcher.Ascii.INSTANCE = r0
                return
        }

        public Ascii() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.ascii()"
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                r0 = 127(0x7f, float:1.78E-43)
                if (r2 > r0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class BitSetMatcher extends com.google.common.base.CharMatcher.NamedFastMatcher {
        private final java.util.BitSet table;

        private BitSetMatcher(java.util.BitSet r2, java.lang.String r3) {
                r1 = this;
                r1.<init>(r3)
                int r3 = r2.length()
                int r3 = r3 + 64
                int r0 = r2.size()
                if (r3 >= r0) goto L15
                java.lang.Object r2 = r2.clone()
                java.util.BitSet r2 = (java.util.BitSet) r2
            L15:
                r1.table = r2
                return
        }

        public /* synthetic */ BitSetMatcher(java.util.BitSet r1, java.lang.String r2, com.google.common.base.CharMatcher.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                java.util.BitSet r0 = r1.table
                boolean r2 = r0.get(r2)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public final void setBits(java.util.BitSet r2) {
                r1 = this;
                java.util.BitSet r0 = r1.table
                r2.or(r0)
                return
        }
    }

    public static final class BreakingWhitespace extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$BreakingWhitespace r0 = new com.google.common.base.CharMatcher$BreakingWhitespace
                r0.<init>()
                com.google.common.base.CharMatcher.BreakingWhitespace.INSTANCE = r0
                return
        }

        private BreakingWhitespace() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r4) {
                r3 = this;
                r0 = 32
                r1 = 1
                if (r4 == r0) goto L31
                r0 = 133(0x85, float:1.86E-43)
                if (r4 == r0) goto L31
                r0 = 5760(0x1680, float:8.071E-42)
                if (r4 == r0) goto L31
                r0 = 8199(0x2007, float:1.1489E-41)
                r2 = 0
                if (r4 == r0) goto L30
                r0 = 8287(0x205f, float:1.1613E-41)
                if (r4 == r0) goto L31
                r0 = 12288(0x3000, float:1.7219E-41)
                if (r4 == r0) goto L31
                r0 = 8232(0x2028, float:1.1535E-41)
                if (r4 == r0) goto L31
                r0 = 8233(0x2029, float:1.1537E-41)
                if (r4 == r0) goto L31
                switch(r4) {
                    case 9: goto L31;
                    case 10: goto L31;
                    case 11: goto L31;
                    case 12: goto L31;
                    case 13: goto L31;
                    default: goto L25;
                }
            L25:
                r0 = 8192(0x2000, float:1.148E-41)
                if (r4 < r0) goto L2e
                r0 = 8202(0x200a, float:1.1493E-41)
                if (r4 > r0) goto L2e
                goto L2f
            L2e:
                r1 = 0
            L2f:
                return r1
            L30:
                return r2
            L31:
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.breakingWhitespace()"
                return r0
        }
    }

    public static final class Digit extends com.google.common.base.CharMatcher.RangesMatcher {
        public static final com.google.common.base.CharMatcher.Digit INSTANCE = null;
        private static final java.lang.String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        static {
                com.google.common.base.CharMatcher$Digit r0 = new com.google.common.base.CharMatcher$Digit
                r0.<init>()
                com.google.common.base.CharMatcher.Digit.INSTANCE = r0
                return
        }

        private Digit() {
                r3 = this;
                char[] r0 = zeroes()
                char[] r1 = nines()
                java.lang.String r2 = "CharMatcher.digit()"
                r3.<init>(r2, r0, r1)
                return
        }

        private static char[] nines() {
                r0 = 37
                char[] r1 = new char[r0]
                r2 = 0
            L5:
                if (r2 >= r0) goto L15
                java.lang.String r3 = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０"
                char r3 = r3.charAt(r2)
                int r3 = r3 + 9
                char r3 = (char) r3
                r1[r2] = r3
                int r2 = r2 + 1
                goto L5
            L15:
                return r1
        }

        private static char[] zeroes() {
                java.lang.String r0 = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０"
                char[] r0 = r0.toCharArray()
                return r0
        }
    }

    public static abstract class FastMatcher extends com.google.common.base.CharMatcher {
        public FastMatcher() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                com.google.common.base.CharMatcher$NegatedFastMatcher r0 = new com.google.common.base.CharMatcher$NegatedFastMatcher
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
                r0 = this;
                return r0
        }
    }

    public static final class ForPredicate extends com.google.common.base.CharMatcher {
        private final com.google.common.base.Predicate<? super java.lang.Character> predicate;

        public ForPredicate(com.google.common.base.Predicate<? super java.lang.Character> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
                r0.predicate = r1
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher
        public boolean apply(java.lang.Character r2) {
                r1 = this;
                com.google.common.base.Predicate<? super java.lang.Character> r0 = r1.predicate
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                boolean r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = r0.apply(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                com.google.common.base.Predicate<? super java.lang.Character> r0 = r1.predicate
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                boolean r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Predicate<? super java.lang.Character> r0 = r4.predicate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 26
                java.lang.String r2 = "CharMatcher.forPredicate("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static final class InRange extends com.google.common.base.CharMatcher.FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        public InRange(char r2, char r3) {
                r1 = this;
                r1.<init>()
                if (r3 < r2) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.common.base.Preconditions.checkArgument(r0)
                r1.startInclusive = r2
                r1.endInclusive = r3
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                char r0 = r1.startInclusive
                if (r0 > r2) goto La
                char r0 = r1.endInclusive
                if (r2 > r0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r3) {
                r2 = this;
                char r0 = r2.startInclusive
                char r1 = r2.endInclusive
                int r1 = r1 + 1
                r3.set(r0, r1)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r5 = this;
                char r0 = r5.startInclusive
                java.lang.String r0 = com.google.common.base.CharMatcher.access$100(r0)
                char r1 = r5.endInclusive
                java.lang.String r1 = com.google.common.base.CharMatcher.access$100(r1)
                r2 = 27
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
                java.lang.String r3 = "CharMatcher.inRange('"
                java.lang.String r4 = "', '"
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r2, r3, r0, r4, r1)
                java.lang.String r1 = "')"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Invisible extends com.google.common.base.CharMatcher.RangesMatcher {
        public static final com.google.common.base.CharMatcher.Invisible INSTANCE = null;
        private static final java.lang.String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final java.lang.String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        static {
                com.google.common.base.CharMatcher$Invisible r0 = new com.google.common.base.CharMatcher$Invisible
                r0.<init>()
                com.google.common.base.CharMatcher.Invisible.INSTANCE = r0
                return
        }

        private Invisible() {
                r3 = this;
                java.lang.String r0 = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9"
                char[] r0 = r0.toCharArray()
                java.lang.String r1 = "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb"
                char[] r1 = r1.toCharArray()
                java.lang.String r2 = "CharMatcher.invisible()"
                r3.<init>(r2, r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Is extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        public Is(char r1) {
                r0 = this;
                r0.<init>()
                r0.match = r1
                return
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher r2) {
                r1 = this;
                char r0 = r1.match
                boolean r2 = r2.matches(r0)
                if (r2 == 0) goto La
                r2 = r1
                goto Le
            La:
                com.google.common.base.CharMatcher r2 = com.google.common.base.CharMatcher.none()
            Le:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                char r0 = r1.match
                if (r2 != r0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                char r0 = r1.match
                com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.isNot(r0)
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher r2) {
                r1 = this;
                char r0 = r1.match
                boolean r0 = r2.matches(r0)
                if (r0 == 0) goto L9
                goto Ld
            L9:
                com.google.common.base.CharMatcher r2 = super.or(r2)
            Ld:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence r2, char r3) {
                r1 = this;
                java.lang.String r2 = r2.toString()
                char r0 = r1.match
                java.lang.String r2 = r2.replace(r0, r3)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r2) {
                r1 = this;
                char r0 = r1.match
                r2.set(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r4 = this;
                char r0 = r4.match
                java.lang.String r0 = com.google.common.base.CharMatcher.access$100(r0)
                r1 = 18
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "CharMatcher.is('"
                java.lang.String r3 = "')"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class IsEither extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match1;
        private final char match2;

        public IsEither(char r1, char r2) {
                r0 = this;
                r0.<init>()
                r0.match1 = r1
                r0.match2 = r2
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                char r0 = r1.match1
                if (r2 == r0) goto Lb
                char r0 = r1.match2
                if (r2 != r0) goto L9
                goto Lb
            L9:
                r2 = 0
                goto Lc
            Lb:
                r2 = 1
            Lc:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r2) {
                r1 = this;
                char r0 = r1.match1
                r2.set(r0)
                char r0 = r1.match2
                r2.set(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r5 = this;
                char r0 = r5.match1
                java.lang.String r0 = com.google.common.base.CharMatcher.access$100(r0)
                char r1 = r5.match2
                java.lang.String r1 = com.google.common.base.CharMatcher.access$100(r1)
                r2 = 21
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
                java.lang.String r3 = "CharMatcher.anyOf(\""
                java.lang.String r4 = "\")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0, r1, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class IsNot extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        public IsNot(char r1) {
                r0 = this;
                r0.<init>()
                r0.match = r1
                return
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher r2) {
                r1 = this;
                char r0 = r1.match
                boolean r0 = r2.matches(r0)
                if (r0 == 0) goto Lc
                com.google.common.base.CharMatcher r2 = super.and(r2)
            Lc:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                char r0 = r1.match
                if (r2 == r0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                char r0 = r1.match
                com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.is(r0)
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher r2) {
                r1 = this;
                char r0 = r1.match
                boolean r2 = r2.matches(r0)
                if (r2 == 0) goto Ld
                com.google.common.base.CharMatcher r2 = com.google.common.base.CharMatcher.any()
                goto Le
            Ld:
                r2 = r1
            Le:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r3) {
                r2 = this;
                char r0 = r2.match
                r1 = 0
                r3.set(r1, r0)
                char r0 = r2.match
                int r0 = r0 + 1
                r1 = 65536(0x10000, float:9.1835E-41)
                r3.set(r0, r1)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r4 = this;
                char r0 = r4.match
                java.lang.String r0 = com.google.common.base.CharMatcher.access$100(r0)
                r1 = 21
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "CharMatcher.isNot('"
                java.lang.String r3 = "')"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static final class JavaDigit extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher.JavaDigit INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaDigit r0 = new com.google.common.base.CharMatcher$JavaDigit
                r0.<init>()
                com.google.common.base.CharMatcher.JavaDigit.INSTANCE = r0
                return
        }

        private JavaDigit() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                boolean r1 = java.lang.Character.isDigit(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaDigit()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class JavaIsoControl extends com.google.common.base.CharMatcher.NamedFastMatcher {
        public static final com.google.common.base.CharMatcher.JavaIsoControl INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaIsoControl r0 = new com.google.common.base.CharMatcher$JavaIsoControl
                r0.<init>()
                com.google.common.base.CharMatcher.JavaIsoControl.INSTANCE = r0
                return
        }

        private JavaIsoControl() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaIsoControl()"
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                r0 = 31
                if (r2 <= r0) goto Lf
                r0 = 127(0x7f, float:1.78E-43)
                if (r2 < r0) goto Ld
                r0 = 159(0x9f, float:2.23E-43)
                if (r2 > r0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = 1
            L10:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class JavaLetter extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher.JavaLetter INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaLetter r0 = new com.google.common.base.CharMatcher$JavaLetter
                r0.<init>()
                com.google.common.base.CharMatcher.JavaLetter.INSTANCE = r0
                return
        }

        private JavaLetter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                boolean r1 = java.lang.Character.isLetter(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaLetter()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class JavaLetterOrDigit extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher.JavaLetterOrDigit INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaLetterOrDigit r0 = new com.google.common.base.CharMatcher$JavaLetterOrDigit
                r0.<init>()
                com.google.common.base.CharMatcher.JavaLetterOrDigit.INSTANCE = r0
                return
        }

        private JavaLetterOrDigit() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                boolean r1 = java.lang.Character.isLetterOrDigit(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaLetterOrDigit()"
                return r0
        }
    }

    public static final class JavaLowerCase extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher.JavaLowerCase INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaLowerCase r0 = new com.google.common.base.CharMatcher$JavaLowerCase
                r0.<init>()
                com.google.common.base.CharMatcher.JavaLowerCase.INSTANCE = r0
                return
        }

        private JavaLowerCase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                boolean r1 = java.lang.Character.isLowerCase(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaLowerCase()"
                return r0
        }
    }

    public static final class JavaUpperCase extends com.google.common.base.CharMatcher {
        public static final com.google.common.base.CharMatcher.JavaUpperCase INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$JavaUpperCase r0 = new com.google.common.base.CharMatcher$JavaUpperCase
                r0.<init>()
                com.google.common.base.CharMatcher.JavaUpperCase.INSTANCE = r0
                return
        }

        private JavaUpperCase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                boolean r1 = java.lang.Character.isUpperCase(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.javaUpperCase()"
                return r0
        }
    }

    public static abstract class NamedFastMatcher extends com.google.common.base.CharMatcher.FastMatcher {
        private final java.lang.String description;

        public NamedFastMatcher(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.description = r1
                return
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.description
                return r0
        }
    }

    public static class Negated extends com.google.common.base.CharMatcher {
        public final com.google.common.base.CharMatcher original;

        public Negated(com.google.common.base.CharMatcher r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                r0.original = r1
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence r3) {
                r2 = this;
                int r0 = r3.length()
                com.google.common.base.CharMatcher r1 = r2.original
                int r3 = r1.countIn(r3)
                int r0 = r0 - r3
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.original
                boolean r2 = r0.matches(r2)
                r2 = r2 ^ 1
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.original
                boolean r2 = r0.matchesNoneOf(r2)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.original
                boolean r2 = r0.matchesAllOf(r2)
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.original
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r4) {
                r3 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                com.google.common.base.CharMatcher r1 = r3.original
                r1.setBits(r0)
                r1 = 0
                r2 = 65536(0x10000, float:9.1835E-41)
                r0.flip(r1, r2)
                r4.or(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r3 = this;
                com.google.common.base.CharMatcher r0 = r3.original
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 9
                java.lang.String r2 = ".negate()"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
                return r0
        }
    }

    public static class NegatedFastMatcher extends com.google.common.base.CharMatcher.Negated {
        public NegatedFastMatcher(com.google.common.base.CharMatcher r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
                r0 = this;
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class None extends com.google.common.base.CharMatcher.NamedFastMatcher {
        public static final com.google.common.base.CharMatcher.None INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$None r0 = new com.google.common.base.CharMatcher$None
                r0.<init>()
                com.google.common.base.CharMatcher.None.INSTANCE = r0
                return
        }

        private None() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.none()"
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence r1, char r2) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                r1 = 0
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                r1 = -1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence r1, int r2) {
                r0 = this;
                int r1 = r1.length()
                com.google.common.base.Preconditions.checkPositionIndex(r2, r1)
                r1 = -1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                r1 = -1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence r1) {
                r0 = this;
                int r1 = r1.length()
                if (r1 != 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                r1 = 1
                return r1
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
                r1 = this;
                com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.any()
                return r0
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence r1, char r2) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence r1, java.lang.CharSequence r2) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimLeadingFrom(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimTrailingFrom(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    public static final class Or extends com.google.common.base.CharMatcher {
        public final com.google.common.base.CharMatcher first;
        public final com.google.common.base.CharMatcher second;

        public Or(com.google.common.base.CharMatcher r1, com.google.common.base.CharMatcher r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                r0.first = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
                r0.second = r1
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.first
                boolean r0 = r0.matches(r2)
                if (r0 != 0) goto L13
                com.google.common.base.CharMatcher r0 = r1.second
                boolean r2 = r0.matches(r2)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                return r2
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r2) {
                r1 = this;
                com.google.common.base.CharMatcher r0 = r1.first
                r0.setBits(r2)
                com.google.common.base.CharMatcher r0 = r1.second
                r0.setBits(r2)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.CharMatcher r0 = r5.first
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.CharMatcher r1 = r5.second
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 18
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "CharMatcher.or("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RangesMatcher extends com.google.common.base.CharMatcher {
        private final java.lang.String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        public RangesMatcher(java.lang.String r5, char[] r6, char[] r7) {
                r4 = this;
                r4.<init>()
                r4.description = r5
                r4.rangeStarts = r6
                r4.rangeEnds = r7
                int r5 = r6.length
                int r0 = r7.length
                r1 = 1
                r2 = 0
                if (r5 != r0) goto L11
                r5 = 1
                goto L12
            L11:
                r5 = 0
            L12:
                com.google.common.base.Preconditions.checkArgument(r5)
                r5 = 0
            L16:
                int r0 = r6.length
                if (r5 >= r0) goto L38
                char r0 = r6[r5]
                char r3 = r7[r5]
                if (r0 > r3) goto L21
                r0 = 1
                goto L22
            L21:
                r0 = 0
            L22:
                com.google.common.base.Preconditions.checkArgument(r0)
                int r0 = r5 + 1
                int r3 = r6.length
                if (r0 >= r3) goto L36
                char r5 = r7[r5]
                char r3 = r6[r0]
                if (r5 >= r3) goto L32
                r5 = 1
                goto L33
            L32:
                r5 = 0
            L33:
                com.google.common.base.Preconditions.checkArgument(r5)
            L36:
                r5 = r0
                goto L16
            L38:
                return
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                boolean r1 = super.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r4) {
                r3 = this;
                char[] r0 = r3.rangeStarts
                int r0 = java.util.Arrays.binarySearch(r0, r4)
                r1 = 1
                if (r0 < 0) goto La
                return r1
            La:
                int r0 = ~r0
                int r0 = r0 - r1
                if (r0 < 0) goto L15
                char[] r2 = r3.rangeEnds
                char r0 = r2[r0]
                if (r4 > r0) goto L15
                goto L16
            L15:
                r1 = 0
            L16:
                return r1
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.description
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SingleWidth extends com.google.common.base.CharMatcher.RangesMatcher {
        public static final com.google.common.base.CharMatcher.SingleWidth INSTANCE = null;

        static {
                com.google.common.base.CharMatcher$SingleWidth r0 = new com.google.common.base.CharMatcher$SingleWidth
                r0.<init>()
                com.google.common.base.CharMatcher.SingleWidth.INSTANCE = r0
                return
        }

        private SingleWidth() {
                r3 = this;
                java.lang.String r0 = "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡"
                char[] r0 = r0.toCharArray()
                java.lang.String r1 = "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ"
                char[] r1 = r1.toCharArray()
                java.lang.String r2 = "CharMatcher.singleWidth()"
                r3.<init>(r2, r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.VisibleForTesting
    public static final class Whitespace extends com.google.common.base.CharMatcher.NamedFastMatcher {
        public static final com.google.common.base.CharMatcher.Whitespace INSTANCE = null;
        public static final int SHIFT = 0;

        static {
                r0 = 31
                int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
                com.google.common.base.CharMatcher.Whitespace.SHIFT = r0
                com.google.common.base.CharMatcher$Whitespace r0 = new com.google.common.base.CharMatcher$Whitespace
                r0.<init>()
                com.google.common.base.CharMatcher.Whitespace.INSTANCE = r0
                return
        }

        public Whitespace() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.whitespace()"
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char r3) {
                r2 = this;
                r0 = 1682554634(0x6449bf0a, float:1.4886245E22)
                int r0 = r0 * r3
                int r1 = com.google.common.base.CharMatcher.Whitespace.SHIFT
                int r0 = r0 >>> r1
                java.lang.String r1 = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000"
                char r0 = r1.charAt(r0)
                if (r0 != r3) goto L13
                r3 = 1
                goto L14
            L13:
                r3 = 0
            L14:
                return r3
        }

        @Override // com.google.common.base.CharMatcher
        @com.google.common.annotations.GwtIncompatible
        public final void setBits(java.util.BitSet r3) {
                r2 = this;
                r0 = 0
            L1:
                r1 = 32
                if (r0 >= r1) goto L12
                java.lang.String r1 = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000"
                char r1 = r1.charAt(r0)
                r3.set(r1)
                int r0 = r0 + 1
                goto L1
            L12:
                return
        }
    }

    public CharMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$100(char r0) {
            java.lang.String r0 = showCharacter(r0)
            return r0
    }

    public static com.google.common.base.CharMatcher any() {
            com.google.common.base.CharMatcher$Any r0 = com.google.common.base.CharMatcher.Any.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence r4) {
            int r0 = r4.length()
            if (r0 == 0) goto L29
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            r3 = 2
            if (r0 == r3) goto L13
            com.google.common.base.CharMatcher$AnyOf r0 = new com.google.common.base.CharMatcher$AnyOf
            r0.<init>(r4)
            return r0
        L13:
            char r0 = r4.charAt(r1)
            char r4 = r4.charAt(r2)
            com.google.common.base.CharMatcher$IsEither r4 = isEither(r0, r4)
            return r4
        L20:
            char r4 = r4.charAt(r1)
            com.google.common.base.CharMatcher r4 = is(r4)
            return r4
        L29:
            com.google.common.base.CharMatcher r4 = none()
            return r4
    }

    public static com.google.common.base.CharMatcher ascii() {
            com.google.common.base.CharMatcher$Ascii r0 = com.google.common.base.CharMatcher.Ascii.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher breakingWhitespace() {
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.BreakingWhitespace.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher digit() {
            com.google.common.base.CharMatcher$Digit r0 = com.google.common.base.CharMatcher.Digit.INSTANCE
            return r0
    }

    private java.lang.String finishCollapseFrom(java.lang.CharSequence r3, int r4, int r5, char r6, java.lang.StringBuilder r7, boolean r8) {
            r2 = this;
        L0:
            if (r4 >= r5) goto L1a
            char r0 = r3.charAt(r4)
            boolean r1 = r2.matches(r0)
            if (r1 == 0) goto L13
            if (r8 != 0) goto L17
            r7.append(r6)
            r8 = 1
            goto L17
        L13:
            r7.append(r0)
            r8 = 0
        L17:
            int r4 = r4 + 1
            goto L0
        L1a:
            java.lang.String r3 = r7.toString()
            return r3
    }

    public static com.google.common.base.CharMatcher forPredicate(com.google.common.base.Predicate<? super java.lang.Character> r1) {
            boolean r0 = r1 instanceof com.google.common.base.CharMatcher
            if (r0 == 0) goto L7
            com.google.common.base.CharMatcher r1 = (com.google.common.base.CharMatcher) r1
            goto Ld
        L7:
            com.google.common.base.CharMatcher$ForPredicate r0 = new com.google.common.base.CharMatcher$ForPredicate
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static com.google.common.base.CharMatcher inRange(char r1, char r2) {
            com.google.common.base.CharMatcher$InRange r0 = new com.google.common.base.CharMatcher$InRange
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher invisible() {
            com.google.common.base.CharMatcher$Invisible r0 = com.google.common.base.CharMatcher.Invisible.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher is(char r1) {
            com.google.common.base.CharMatcher$Is r0 = new com.google.common.base.CharMatcher$Is
            r0.<init>(r1)
            return r0
    }

    private static com.google.common.base.CharMatcher.IsEither isEither(char r1, char r2) {
            com.google.common.base.CharMatcher$IsEither r0 = new com.google.common.base.CharMatcher$IsEither
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.common.base.CharMatcher isNot(char r1) {
            com.google.common.base.CharMatcher$IsNot r0 = new com.google.common.base.CharMatcher$IsNot
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static boolean isSmall(int r1, int r2) {
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r1 > r0) goto Lc
            int r1 = r1 * 4
            int r1 = r1 * 16
            if (r2 <= r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaDigit() {
            com.google.common.base.CharMatcher$JavaDigit r0 = com.google.common.base.CharMatcher.JavaDigit.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher javaIsoControl() {
            com.google.common.base.CharMatcher$JavaIsoControl r0 = com.google.common.base.CharMatcher.JavaIsoControl.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetter() {
            com.google.common.base.CharMatcher$JavaLetter r0 = com.google.common.base.CharMatcher.JavaLetter.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetterOrDigit() {
            com.google.common.base.CharMatcher$JavaLetterOrDigit r0 = com.google.common.base.CharMatcher.JavaLetterOrDigit.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLowerCase() {
            com.google.common.base.CharMatcher$JavaLowerCase r0 = com.google.common.base.CharMatcher.JavaLowerCase.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaUpperCase() {
            com.google.common.base.CharMatcher$JavaUpperCase r0 = com.google.common.base.CharMatcher.JavaUpperCase.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher none() {
            com.google.common.base.CharMatcher$None r0 = com.google.common.base.CharMatcher.None.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence r0) {
            com.google.common.base.CharMatcher r0 = anyOf(r0)
            com.google.common.base.CharMatcher r0 = r0.negate()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static com.google.common.base.CharMatcher precomputedPositive(int r2, java.util.BitSet r3, java.lang.String r4) {
            if (r2 == 0) goto L3a
            r0 = 0
            r1 = 1
            if (r2 == r1) goto L30
            r1 = 2
            if (r2 == r1) goto L1f
            int r0 = r3.length()
            boolean r2 = isSmall(r2, r0)
            if (r2 == 0) goto L18
            com.google.common.base.CharMatcher r2 = com.google.common.base.SmallCharMatcher.from(r3, r4)
            goto L1e
        L18:
            com.google.common.base.CharMatcher$BitSetMatcher r2 = new com.google.common.base.CharMatcher$BitSetMatcher
            r0 = 0
            r2.<init>(r3, r4, r0)
        L1e:
            return r2
        L1f:
            int r2 = r3.nextSetBit(r0)
            char r2 = (char) r2
            int r4 = r2 + 1
            int r3 = r3.nextSetBit(r4)
            char r3 = (char) r3
            com.google.common.base.CharMatcher$IsEither r2 = isEither(r2, r3)
            return r2
        L30:
            int r2 = r3.nextSetBit(r0)
            char r2 = (char) r2
            com.google.common.base.CharMatcher r2 = is(r2)
            return r2
        L3a:
            com.google.common.base.CharMatcher r2 = none()
            return r2
    }

    private static java.lang.String showCharacter(char r6) {
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [92, 117, 0, 0, 0, 0} // fill-array
            r1 = 0
        L7:
            r2 = 4
            if (r1 >= r2) goto L1b
            int r3 = 5 - r1
            r4 = r6 & 15
            java.lang.String r5 = "0123456789ABCDEF"
            char r4 = r5.charAt(r4)
            r0[r3] = r4
            int r6 = r6 >> r2
            char r6 = (char) r6
            int r1 = r1 + 1
            goto L7
        L1b:
            java.lang.String r6 = java.lang.String.copyValueOf(r0)
            return r6
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher singleWidth() {
            com.google.common.base.CharMatcher$SingleWidth r0 = com.google.common.base.CharMatcher.SingleWidth.INSTANCE
            return r0
    }

    public static com.google.common.base.CharMatcher whitespace() {
            com.google.common.base.CharMatcher$Whitespace r0 = com.google.common.base.CharMatcher.Whitespace.INSTANCE
            return r0
    }

    public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher r2) {
            r1 = this;
            com.google.common.base.CharMatcher$And r0 = new com.google.common.base.CharMatcher$And
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public boolean apply2(java.lang.Character r1) {
            r0 = this;
            char r1 = r1.charValue()
            boolean r1 = r0.matches(r1)
            return r1
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean apply(java.lang.Character r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            boolean r1 = r0.apply2(r1)
            return r1
    }

    public java.lang.String collapseFrom(java.lang.CharSequence r8, char r9) {
            r7 = this;
            int r3 = r8.length()
            r0 = 0
            r1 = 0
        L6:
            if (r1 >= r3) goto L40
            char r2 = r8.charAt(r1)
            boolean r4 = r7.matches(r2)
            if (r4 == 0) goto L3d
            if (r2 != r9) goto L27
            int r2 = r3 + (-1)
            if (r1 == r2) goto L24
            int r2 = r1 + 1
            char r2 = r8.charAt(r2)
            boolean r2 = r7.matches(r2)
            if (r2 != 0) goto L27
        L24:
            int r1 = r1 + 1
            goto L3d
        L27:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r8, r0, r1)
            r5.append(r9)
            int r2 = r1 + 1
            r6 = 1
            r0 = r7
            r1 = r8
            r4 = r9
            java.lang.String r8 = r0.finishCollapseFrom(r1, r2, r3, r4, r5, r6)
            return r8
        L3d:
            int r1 = r1 + 1
            goto L6
        L40:
            java.lang.String r8 = r8.toString()
            return r8
    }

    public int countIn(java.lang.CharSequence r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            if (r0 >= r2) goto L17
            char r2 = r4.charAt(r0)
            boolean r2 = r3.matches(r2)
            if (r2 == 0) goto L14
            int r1 = r1 + 1
        L14:
            int r0 = r0 + 1
            goto L2
        L17:
            return r1
    }

    public int indexIn(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexIn(r2, r0)
            return r2
    }

    public int indexIn(java.lang.CharSequence r3, int r4) {
            r2 = this;
            int r0 = r3.length()
            com.google.common.base.Preconditions.checkPositionIndex(r4, r0)
        L7:
            if (r4 >= r0) goto L17
            char r1 = r3.charAt(r4)
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto L14
            return r4
        L14:
            int r4 = r4 + 1
            goto L7
        L17:
            r3 = -1
            return r3
    }

    public int lastIndexIn(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = r3.length()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L16
            char r1 = r3.charAt(r0)
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + (-1)
            goto L6
        L16:
            r3 = -1
            return r3
    }

    public abstract boolean matches(char r1);

    public boolean matchesAllOf(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L17
            char r2 = r4.charAt(r0)
            boolean r2 = r3.matches(r2)
            if (r2 != 0) goto L14
            r4 = 0
            return r4
        L14:
            int r0 = r0 + (-1)
            goto L6
        L17:
            return r1
    }

    public boolean matchesAnyOf(java.lang.CharSequence r1) {
            r0 = this;
            boolean r1 = r0.matchesNoneOf(r1)
            r1 = r1 ^ 1
            return r1
    }

    public boolean matchesNoneOf(java.lang.CharSequence r2) {
            r1 = this;
            int r2 = r1.indexIn(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    public com.google.common.base.CharMatcher negate() {
            r1 = this;
            com.google.common.base.CharMatcher$Negated r0 = new com.google.common.base.CharMatcher$Negated
            r0.<init>(r1)
            return r0
    }

    public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher r2) {
            r1 = this;
            com.google.common.base.CharMatcher$Or r0 = new com.google.common.base.CharMatcher$Or
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.common.base.CharMatcher precomputed() {
            r1 = this;
            int r0 = com.google.common.base.Platform.$r8$clinit
            com.google.common.base.CharMatcher r0 = r1.precomputedInternal()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.base.CharMatcher precomputedInternal() {
            r6 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r6.setBits(r0)
            int r1 = r0.cardinality()
            int r2 = r1 * 2
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 > r3) goto L1b
            java.lang.String r2 = r6.toString()
            com.google.common.base.CharMatcher r0 = precomputedPositive(r1, r0, r2)
            return r0
        L1b:
            r2 = 0
            r0.flip(r2, r3)
            int r3 = r3 - r1
            java.lang.String r1 = ".negate()"
            java.lang.String r4 = r6.toString()
            boolean r5 = r4.endsWith(r1)
            if (r5 == 0) goto L37
            int r1 = r4.length()
            int r1 = r1 + (-9)
            java.lang.String r1 = r4.substring(r2, r1)
            goto L3b
        L37:
            java.lang.String r1 = r4.concat(r1)
        L3b:
            com.google.common.base.CharMatcher$1 r2 = new com.google.common.base.CharMatcher$1
            com.google.common.base.CharMatcher r0 = precomputedPositive(r3, r0, r1)
            r2.<init>(r0, r4)
            return r2
    }

    public java.lang.String removeFrom(java.lang.CharSequence r6) {
            r5 = this;
            java.lang.String r6 = r6.toString()
            int r0 = r5.indexIn(r6)
            r1 = -1
            if (r0 != r1) goto Lc
            return r6
        Lc:
            char[] r6 = r6.toCharArray()
            r1 = 1
            r2 = 1
        L12:
            int r0 = r0 + r1
        L13:
            int r3 = r6.length
            if (r0 != r3) goto L1e
            java.lang.String r1 = new java.lang.String
            r3 = 0
            int r0 = r0 - r2
            r1.<init>(r6, r3, r0)
            return r1
        L1e:
            char r3 = r6[r0]
            boolean r3 = r5.matches(r3)
            if (r3 == 0) goto L29
            int r2 = r2 + 1
            goto L12
        L29:
            int r3 = r0 - r2
            char r4 = r6[r0]
            r6[r3] = r4
            int r0 = r0 + 1
            goto L13
    }

    public java.lang.String replaceFrom(java.lang.CharSequence r3, char r4) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            int r0 = r2.indexIn(r3)
            r1 = -1
            if (r0 != r1) goto Lc
            return r3
        Lc:
            char[] r3 = r3.toCharArray()
            r3[r0] = r4
        L12:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L22
            char r1 = r3[r0]
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto L12
            r3[r0] = r4
            goto L12
        L22:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            return r4
    }

    public java.lang.String replaceFrom(java.lang.CharSequence r8, java.lang.CharSequence r9) {
            r7 = this;
            int r0 = r9.length()
            if (r0 != 0) goto Lb
            java.lang.String r8 = r7.removeFrom(r8)
            return r8
        Lb:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L18
            char r9 = r9.charAt(r1)
            java.lang.String r8 = r7.replaceFrom(r8, r9)
            return r8
        L18:
            java.lang.String r8 = r8.toString()
            int r0 = r7.indexIn(r8)
            r3 = -1
            if (r0 != r3) goto L24
            return r8
        L24:
            int r4 = r8.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r4 * 3
            int r6 = r6 / 2
            int r6 = r6 + 16
            r5.<init>(r6)
        L33:
            r5.append(r8, r1, r0)
            r5.append(r9)
            int r1 = r0 + 1
            int r0 = r7.indexIn(r8, r1)
            if (r0 != r3) goto L33
            r5.append(r8, r1, r4)
            java.lang.String r8 = r5.toString()
            return r8
    }

    public java.lang.String retainFrom(java.lang.CharSequence r2) {
            r1 = this;
            com.google.common.base.CharMatcher r0 = r1.negate()
            java.lang.String r2 = r0.removeFrom(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public void setBits(java.util.BitSet r3) {
            r2 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
        L3:
            if (r0 < 0) goto L12
            char r1 = (char) r0
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto Lf
            r3.set(r0)
        Lf:
            int r0 = r0 + (-1)
            goto L3
        L12:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    public java.lang.String trimAndCollapseFrom(java.lang.CharSequence r11, char r12) {
            r10 = this;
            int r0 = r11.length()
            int r1 = r0 + (-1)
            r2 = 0
            r5 = 0
        L8:
            if (r5 >= r0) goto L17
            char r2 = r11.charAt(r5)
            boolean r2 = r10.matches(r2)
            if (r2 == 0) goto L17
            int r5 = r5 + 1
            goto L8
        L17:
            r0 = r1
        L18:
            if (r0 <= r5) goto L27
            char r2 = r11.charAt(r0)
            boolean r2 = r10.matches(r2)
            if (r2 == 0) goto L27
            int r0 = r0 + (-1)
            goto L18
        L27:
            if (r5 != 0) goto L30
            if (r0 != r1) goto L30
            java.lang.String r11 = r10.collapseFrom(r11, r12)
            goto L41
        L30:
            int r6 = r0 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r0 = r6 - r5
            r8.<init>(r0)
            r9 = 0
            r3 = r10
            r4 = r11
            r7 = r12
            java.lang.String r11 = r3.finishCollapseFrom(r4, r5, r6, r7, r8, r9)
        L41:
            return r11
    }

    public java.lang.String trimFrom(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            char r2 = r4.charAt(r1)
            boolean r2 = r3.matches(r2)
            if (r2 != 0) goto L12
            goto L15
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            int r0 = r0 + (-1)
        L17:
            if (r0 <= r1) goto L27
            char r2 = r4.charAt(r0)
            boolean r2 = r3.matches(r2)
            if (r2 != 0) goto L24
            goto L27
        L24:
            int r0 = r0 + (-1)
            goto L17
        L27:
            int r0 = r0 + 1
            java.lang.CharSequence r4 = r4.subSequence(r1, r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public java.lang.String trimLeadingFrom(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            char r2 = r4.charAt(r1)
            boolean r2 = r3.matches(r2)
            if (r2 != 0) goto L1a
            java.lang.CharSequence r4 = r4.subSequence(r1, r0)
            java.lang.String r4 = r4.toString()
            return r4
        L1a:
            int r1 = r1 + 1
            goto L5
        L1d:
            java.lang.String r4 = ""
            return r4
    }

    public java.lang.String trimTrailingFrom(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = r3.length()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L21
            char r1 = r3.charAt(r0)
            boolean r1 = r2.matches(r1)
            if (r1 != 0) goto L1e
            r1 = 0
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            java.lang.String r3 = r3.toString()
            return r3
        L1e:
            int r0 = r0 + (-1)
            goto L6
        L21:
            java.lang.String r3 = ""
            return r3
    }
}
