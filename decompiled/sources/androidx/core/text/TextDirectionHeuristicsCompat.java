package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {
    public static final androidx.core.text.TextDirectionHeuristicCompat ANYRTL_LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_RTL = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat LOCALE = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat RTL = null;
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    public static class AnyStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        public static final androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong INSTANCE_RTL = null;
        private final boolean mLookForRtl;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong r0 = new androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong
                r1 = 1
                r0.<init>(r1)
                androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.INSTANCE_RTL = r0
                return
        }

        private AnyStrong(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.mLookForRtl = r1
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence r6, int r7, int r8) {
                r5 = this;
                int r8 = r8 + r7
                r0 = 0
                r1 = 0
            L3:
                r2 = 2
                if (r7 >= r8) goto L2e
                char r3 = r6.charAt(r7)
                byte r3 = java.lang.Character.getDirectionality(r3)
                androidx.core.text.TextDirectionHeuristicCompat r4 = androidx.core.text.TextDirectionHeuristicsCompat.LTR
                r4 = 1
                if (r3 == 0) goto L1a
                if (r3 == r4) goto L18
                if (r3 == r2) goto L18
                goto L1b
            L18:
                r2 = 0
                goto L1b
            L1a:
                r2 = 1
            L1b:
                if (r2 == 0) goto L25
                if (r2 == r4) goto L20
                goto L2b
            L20:
                boolean r1 = r5.mLookForRtl
                if (r1 != 0) goto L2a
                return r4
            L25:
                boolean r1 = r5.mLookForRtl
                if (r1 == 0) goto L2a
                return r0
            L2a:
                r1 = 1
            L2b:
                int r7 = r7 + 1
                goto L3
            L2e:
                if (r1 == 0) goto L33
                boolean r6 = r5.mLookForRtl
                return r6
            L33:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class FirstStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        public static final androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong INSTANCE = null;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong r0 = new androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong
                r0.<init>()
                androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE = r0
                return
        }

        private FirstStrong() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence r4, int r5, int r6) {
                r3 = this;
                int r6 = r6 + r5
                r0 = 2
                r1 = 2
            L3:
                if (r5 >= r6) goto L23
                if (r1 != r0) goto L23
                char r1 = r4.charAt(r5)
                byte r1 = java.lang.Character.getDirectionality(r1)
                androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.TextDirectionHeuristicsCompat.LTR
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1d
                if (r1 == r0) goto L1d
                switch(r1) {
                    case 14: goto L1f;
                    case 15: goto L1f;
                    case 16: goto L1d;
                    case 17: goto L1d;
                    default: goto L1b;
                }
            L1b:
                r1 = 2
                goto L20
            L1d:
                r1 = 0
                goto L20
            L1f:
                r1 = 1
            L20:
                int r5 = r5 + 1
                goto L3
            L23:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface TextDirectionAlgorithm {
        int checkRtl(java.lang.CharSequence r1, int r2, int r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class TextDirectionHeuristicImpl implements androidx.core.text.TextDirectionHeuristicCompat {
        private final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm mAlgorithm;

        public TextDirectionHeuristicImpl(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm r1) {
                r0 = this;
                r0.<init>()
                r0.mAlgorithm = r1
                return
        }

        private boolean doCheck(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm r0 = r1.mAlgorithm
                int r2 = r0.checkRtl(r2, r3, r4)
                r3 = 1
                if (r2 == 0) goto L12
                if (r2 == r3) goto L10
                boolean r2 = r1.defaultIsRtl()
                return r2
            L10:
                r2 = 0
                return r2
            L12:
                return r3
        }

        public abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                if (r2 == 0) goto L1b
                if (r3 < 0) goto L1b
                if (r4 < 0) goto L1b
                int r0 = r2.length()
                int r0 = r0 - r4
                if (r0 < r3) goto L1b
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm r0 = r1.mAlgorithm
                if (r0 != 0) goto L16
                boolean r2 = r1.defaultIsRtl()
                return r2
            L16:
                boolean r2 = r1.doCheck(r2, r3, r4)
                return r2
            L1b:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] r1, int r2, int r3) {
                r0 = this;
                java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
                boolean r1 = r0.isRtl(r1, r2, r3)
                return r1
        }
    }

    public static class TextDirectionHeuristicInternal extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        public TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mDefaultIsRtl = r2
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean defaultIsRtl() {
                r1 = this;
                boolean r0 = r1.mDefaultIsRtl
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TextDirectionHeuristicLocale extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        public static final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale INSTANCE = null;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale
                r0.<init>()
                androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.INSTANCE = r0
                return
        }

        public TextDirectionHeuristicLocale() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean defaultIsRtl() {
                r2 = this;
                java.util.Locale r0 = java.util.Locale.getDefault()
                int r0 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r0)
                r1 = 1
                if (r0 != r1) goto Lc
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r3 = 1
            r0.<init>(r1, r3)
            androidx.core.text.TextDirectionHeuristicsCompat.RTL = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong r1 = androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r0.<init>(r1, r3)
            androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong r1 = androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.INSTANCE_RTL
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.ANYRTL_LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale r0 = androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.INSTANCE
            androidx.core.text.TextDirectionHeuristicsCompat.LOCALE = r0
            return
    }

    private TextDirectionHeuristicsCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
