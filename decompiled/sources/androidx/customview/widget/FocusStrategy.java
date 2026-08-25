package androidx.customview.widget;

/* JADX INFO: loaded from: classes3.dex */
class FocusStrategy {

    /* JADX INFO: loaded from: classes.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T r1, android.graphics.Rect r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface CollectionAdapter<T, V> {
        V get(T r1, int r2);

        int size(T r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SequentialComparator<T> implements java.util.Comparator<T> {
        private final androidx.customview.widget.FocusStrategy.BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final android.graphics.Rect mTemp1;
        private final android.graphics.Rect mTemp2;

        public SequentialComparator(boolean r2, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp1 = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp2 = r0
                r1.mIsLayoutRtl = r2
                r1.mAdapter = r3
                return
        }

        @Override // java.util.Comparator
        public int compare(T r5, T r6) {
                r4 = this;
                android.graphics.Rect r0 = r4.mTemp1
                android.graphics.Rect r1 = r4.mTemp2
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r2 = r4.mAdapter
                r2.obtainBounds(r5, r0)
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r5 = r4.mAdapter
                r5.obtainBounds(r6, r1)
                int r5 = r0.top
                int r6 = r1.top
                r2 = -1
                if (r5 >= r6) goto L16
                return r2
            L16:
                r3 = 1
                if (r5 <= r6) goto L1a
                return r3
            L1a:
                int r5 = r0.left
                int r6 = r1.left
                if (r5 >= r6) goto L26
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L25
                r2 = 1
            L25:
                return r2
            L26:
                if (r5 <= r6) goto L2f
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r2 = 1
            L2e:
                return r2
            L2f:
                int r5 = r0.bottom
                int r6 = r1.bottom
                if (r5 >= r6) goto L36
                return r2
            L36:
                if (r5 <= r6) goto L39
                return r3
            L39:
                int r5 = r0.right
                int r6 = r1.right
                if (r5 >= r6) goto L45
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L44
                r2 = 1
            L44:
                return r2
            L45:
                if (r5 <= r6) goto L4e
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L4c
                goto L4d
            L4c:
                r2 = 1
            L4d:
                return r2
            L4e:
                r5 = 0
                return r5
        }
    }

    private FocusStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean beamBeats(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            boolean r0 = beamsOverlap(r3, r4, r5)
            boolean r1 = beamsOverlap(r3, r4, r6)
            r2 = 0
            if (r1 != 0) goto L2c
            if (r0 != 0) goto Le
            goto L2c
        Le:
            boolean r0 = isToDirectionOf(r3, r4, r6)
            r1 = 1
            if (r0 != 0) goto L16
            return r1
        L16:
            r0 = 17
            if (r3 == r0) goto L2b
            r0 = 66
            if (r3 != r0) goto L1f
            goto L2b
        L1f:
            int r5 = majorAxisDistance(r3, r4, r5)
            int r3 = majorAxisDistanceToFarEdge(r3, r4, r6)
            if (r5 >= r3) goto L2a
            r2 = 1
        L2a:
            return r2
        L2b:
            return r1
        L2c:
            return r2
    }

    private static boolean beamsOverlap(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5) {
            r0 = 17
            r1 = 1
            r2 = 0
            if (r3 == r0) goto L2a
            r0 = 33
            if (r3 == r0) goto L1b
            r0 = 66
            if (r3 == r0) goto L2a
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L1b:
            int r3 = r5.right
            int r0 = r4.left
            if (r3 < r0) goto L28
            int r3 = r5.left
            int r4 = r4.right
            if (r3 > r4) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
        L2a:
            int r3 = r5.bottom
            int r0 = r4.top
            if (r3 < r0) goto L37
            int r3 = r5.top
            int r4 = r4.bottom
            if (r3 > r4) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@androidx.annotation.NonNull L r7, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r8, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r9, @androidx.annotation.Nullable T r10, @androidx.annotation.NonNull android.graphics.Rect r11, int r12) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L3e
            r1 = 33
            if (r12 == r1) goto L34
            r1 = 66
            if (r12 == r1) goto L29
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L21
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r2, r1)
            goto L47
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L29:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r1, r2)
            goto L47
        L34:
            int r1 = r11.height()
            int r1 = r1 + 1
            r0.offset(r2, r1)
            goto L47
        L3e:
            int r1 = r11.width()
            int r1 = r1 + 1
            r0.offset(r1, r2)
        L47:
            r1 = 0
            int r3 = r8.size(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L51:
            if (r2 >= r3) goto L6a
            java.lang.Object r5 = r8.get(r7, r2)
            if (r5 != r10) goto L5a
            goto L67
        L5a:
            r9.obtainBounds(r5, r4)
            boolean r6 = isBetterCandidate(r12, r11, r4, r0)
            if (r6 == 0) goto L67
            r0.set(r4)
            r1 = r5
        L67:
            int r2 = r2 + 1
            goto L51
        L6a:
            return r1
    }

    public static <L, T> T findNextFocusInRelativeDirection(@androidx.annotation.NonNull L r4, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r5, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r6, @androidx.annotation.Nullable T r7, int r8, boolean r9, boolean r10) {
            int r0 = r5.size(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r5.get(r4, r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            androidx.customview.widget.FocusStrategy$SequentialComparator r4 = new androidx.customview.widget.FocusStrategy$SequentialComparator
            r4.<init>(r9, r6)
            java.util.Collections.sort(r1, r4)
            r4 = 1
            if (r8 == r4) goto L31
            r4 = 2
            if (r8 != r4) goto L29
            java.lang.Object r4 = getNextFocusable(r7, r1, r10)
            return r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r4.<init>(r5)
            throw r4
        L31:
            java.lang.Object r4 = getPreviousFocusable(r7, r1, r10)
            return r4
    }

    private static <T> T getNextFocusable(T r1, java.util.ArrayList<T> r2, boolean r3) {
            int r0 = r2.size()
            if (r1 != 0) goto L8
            r1 = -1
            goto Lc
        L8:
            int r1 = r2.lastIndexOf(r1)
        Lc:
            int r1 = r1 + 1
            if (r1 >= r0) goto L15
            java.lang.Object r1 = r2.get(r1)
            return r1
        L15:
            if (r3 == 0) goto L1f
            if (r0 <= 0) goto L1f
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            return r1
        L1f:
            r1 = 0
            return r1
    }

    private static <T> T getPreviousFocusable(T r1, java.util.ArrayList<T> r2, boolean r3) {
            int r0 = r2.size()
            if (r1 != 0) goto L8
            r1 = r0
            goto Lc
        L8:
            int r1 = r2.indexOf(r1)
        Lc:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L15
            java.lang.Object r1 = r2.get(r1)
            return r1
        L15:
            if (r3 == 0) goto L20
            if (r0 <= 0) goto L20
            int r0 = r0 + (-1)
            java.lang.Object r1 = r2.get(r0)
            return r1
        L20:
            r1 = 0
            return r1
    }

    private static int getWeightedDistanceFor(int r1, int r2) {
            int r0 = r1 * 13
            int r0 = r0 * r1
            int r2 = r2 * r2
            int r2 = r2 + r0
            return r2
    }

    private static boolean isBetterCandidate(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            boolean r0 = isCandidate(r4, r5, r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = isCandidate(r4, r6, r3)
            r2 = 1
            if (r0 != 0) goto L10
            return r2
        L10:
            boolean r0 = beamBeats(r3, r4, r5, r6)
            if (r0 == 0) goto L17
            return r2
        L17:
            boolean r0 = beamBeats(r3, r4, r6, r5)
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = majorAxisDistance(r3, r4, r5)
            int r5 = minorAxisDistance(r3, r4, r5)
            int r5 = getWeightedDistanceFor(r0, r5)
            int r0 = majorAxisDistance(r3, r4, r6)
            int r3 = minorAxisDistance(r3, r4, r6)
            int r3 = getWeightedDistanceFor(r0, r3)
            if (r5 >= r3) goto L39
            r1 = 1
        L39:
            return r1
    }

    private static boolean isCandidate(@androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.NonNull android.graphics.Rect r4, int r5) {
            r0 = 17
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L53
            r0 = 33
            if (r5 == r0) goto L40
            r0 = 66
            if (r5 == r0) goto L2d
            r0 = 130(0x82, float:1.82E-43)
            if (r5 != r0) goto L25
            int r5 = r3.top
            int r0 = r4.top
            if (r5 < r0) goto L1c
            int r5 = r3.bottom
            if (r5 > r0) goto L23
        L1c:
            int r3 = r3.bottom
            int r4 = r4.bottom
            if (r3 >= r4) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L2d:
            int r5 = r3.left
            int r0 = r4.left
            if (r5 < r0) goto L37
            int r5 = r3.right
            if (r5 > r0) goto L3e
        L37:
            int r3 = r3.right
            int r4 = r4.right
            if (r3 >= r4) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            return r1
        L40:
            int r5 = r3.bottom
            int r0 = r4.bottom
            if (r5 > r0) goto L4a
            int r5 = r3.top
            if (r5 < r0) goto L51
        L4a:
            int r3 = r3.top
            int r4 = r4.top
            if (r3 <= r4) goto L51
            goto L52
        L51:
            r1 = 0
        L52:
            return r1
        L53:
            int r5 = r3.right
            int r0 = r4.right
            if (r5 > r0) goto L5d
            int r5 = r3.left
            if (r5 < r0) goto L64
        L5d:
            int r3 = r3.left
            int r4 = r4.left
            if (r3 <= r4) goto L64
            goto L65
        L64:
            r1 = 0
        L65:
            return r1
    }

    private static boolean isToDirectionOf(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5) {
            r0 = 17
            r1 = 1
            r2 = 0
            if (r3 == r0) goto L35
            r0 = 33
            if (r3 == r0) goto L2c
            r0 = 66
            if (r3 == r0) goto L23
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L1b
            int r3 = r4.bottom
            int r4 = r5.top
            if (r3 > r4) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L23:
            int r3 = r4.right
            int r4 = r5.left
            if (r3 > r4) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            return r1
        L2c:
            int r3 = r4.top
            int r4 = r5.bottom
            if (r3 < r4) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            return r1
        L35:
            int r3 = r4.left
            int r4 = r5.right
            if (r3 < r4) goto L3c
            goto L3d
        L3c:
            r1 = 0
        L3d:
            return r1
    }

    private static int majorAxisDistance(int r0, @androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            int r0 = majorAxisDistanceRaw(r0, r1, r2)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static int majorAxisDistanceRaw(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.top
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.left
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.bottom
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.right
            goto L14
    }

    private static int majorAxisDistanceToFarEdge(int r0, @androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            int r0 = majorAxisDistanceToFarEdgeRaw(r0, r1, r2)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static int majorAxisDistanceToFarEdgeRaw(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.bottom
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.right
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.top
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.left
            goto L14
    }

    private static int minorAxisDistance(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L31
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L31
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.left
            int r3 = r3.width()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
        L31:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.top
            int r3 = r3.height()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
    }
}
