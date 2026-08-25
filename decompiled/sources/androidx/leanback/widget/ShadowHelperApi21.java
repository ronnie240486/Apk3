package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
class ShadowHelperApi21 {
    public static final android.view.ViewOutlineProvider sOutlineProvider = null;


    /* JADX INFO: loaded from: classes2.dex */
    public static class ShadowImpl {
        public float mFocusedZ;
        public float mNormalZ;
        public android.view.View mShadowContainer;

        public ShadowImpl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.leanback.widget.ShadowHelperApi21$1 r0 = new androidx.leanback.widget.ShadowHelperApi21$1
            r0.<init>()
            androidx.leanback.widget.ShadowHelperApi21.sOutlineProvider = r0
            return
    }

    private ShadowHelperApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object addDynamicShadow(android.view.View r1, float r2, float r3, int r4) {
            if (r4 <= 0) goto L7
            r0 = 1
            androidx.leanback.widget.RoundedRectHelperApi21.setClipToRoundedOutline(r1, r0, r4)
            goto Lc
        L7:
            android.view.ViewOutlineProvider r4 = androidx.leanback.widget.ShadowHelperApi21.sOutlineProvider
            r1.setOutlineProvider(r4)
        Lc:
            androidx.leanback.widget.ShadowHelperApi21$ShadowImpl r4 = new androidx.leanback.widget.ShadowHelperApi21$ShadowImpl
            r4.<init>()
            r4.mShadowContainer = r1
            r4.mNormalZ = r2
            r4.mFocusedZ = r3
            r1.setZ(r2)
            return r4
    }

    public static void setShadowFocusLevel(java.lang.Object r2, float r3) {
            androidx.leanback.widget.ShadowHelperApi21$ShadowImpl r2 = (androidx.leanback.widget.ShadowHelperApi21.ShadowImpl) r2
            android.view.View r0 = r2.mShadowContainer
            float r1 = r2.mNormalZ
            float r2 = r2.mFocusedZ
            float r2 = r2 - r1
            float r2 = r2 * r3
            float r2 = r2 + r1
            r0.setZ(r2)
            return
    }
}
