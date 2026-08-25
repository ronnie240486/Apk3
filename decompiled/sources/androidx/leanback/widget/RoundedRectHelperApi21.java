package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
class RoundedRectHelperApi21 {
    private static final int MAX_CACHED_PROVIDER = 32;
    private static android.util.SparseArray<android.view.ViewOutlineProvider> sRoundedRectProvider;

    public static final class RoundedRectOutlineProvider extends android.view.ViewOutlineProvider {
        private int mRadius;

        public RoundedRectOutlineProvider(int r1) {
                r0 = this;
                r0.<init>()
                r0.mRadius = r1
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r7, android.graphics.Outline r8) {
                r6 = this;
                int r3 = r7.getWidth()
                int r4 = r7.getHeight()
                int r7 = r6.mRadius
                float r5 = (float) r7
                r1 = 0
                r2 = 0
                r0 = r8
                r0.setRoundRect(r1, r2, r3, r4, r5)
                r7 = 1065353216(0x3f800000, float:1.0)
                r8.setAlpha(r7)
                return
        }
    }

    private RoundedRectHelperApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setClipToRoundedOutline(android.view.View r3, boolean r4, int r5) {
            if (r4 == 0) goto L2f
            android.util.SparseArray<android.view.ViewOutlineProvider> r0 = androidx.leanback.widget.RoundedRectHelperApi21.sRoundedRectProvider
            if (r0 != 0) goto Ld
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.leanback.widget.RoundedRectHelperApi21.sRoundedRectProvider = r0
        Ld:
            android.util.SparseArray<android.view.ViewOutlineProvider> r0 = androidx.leanback.widget.RoundedRectHelperApi21.sRoundedRectProvider
            java.lang.Object r0 = r0.get(r5)
            android.view.ViewOutlineProvider r0 = (android.view.ViewOutlineProvider) r0
            if (r0 != 0) goto L2b
            androidx.leanback.widget.RoundedRectHelperApi21$RoundedRectOutlineProvider r0 = new androidx.leanback.widget.RoundedRectHelperApi21$RoundedRectOutlineProvider
            r0.<init>(r5)
            android.util.SparseArray<android.view.ViewOutlineProvider> r1 = androidx.leanback.widget.RoundedRectHelperApi21.sRoundedRectProvider
            int r1 = r1.size()
            r2 = 32
            if (r1 >= r2) goto L2b
            android.util.SparseArray<android.view.ViewOutlineProvider> r1 = androidx.leanback.widget.RoundedRectHelperApi21.sRoundedRectProvider
            r1.put(r5, r0)
        L2b:
            r3.setOutlineProvider(r0)
            goto L34
        L2f:
            android.view.ViewOutlineProvider r5 = android.view.ViewOutlineProvider.BACKGROUND
            r3.setOutlineProvider(r5)
        L34:
            r3.setClipToOutline(r4)
            return
    }
}
