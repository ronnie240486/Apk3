package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class ItemTouchUIUtilImpl implements androidx.recyclerview.widget.ItemTouchUIUtil {
    public static final androidx.recyclerview.widget.ItemTouchUIUtil INSTANCE = null;

    static {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl r0 = new androidx.recyclerview.widget.ItemTouchUIUtilImpl
            r0.<init>()
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE = r0
            return
    }

    public ItemTouchUIUtilImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float findMaxElevation(androidx.recyclerview.widget.RecyclerView r5, android.view.View r6) {
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r5.getChildAt(r2)
            if (r3 != r6) goto Lf
            goto L18
        Lf:
            float r3 = androidx.core.view.ViewCompat.getElevation(r3)
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L18
            r1 = r3
        L18:
            int r2 = r2 + 1
            goto L6
        L1b:
            return r1
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(android.view.View r4) {
            r3 = this;
            int r0 = androidx.recyclerview.R.id.item_touch_helper_previous_elevation
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L13
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            androidx.core.view.ViewCompat.setElevation(r4, r1)
        L13:
            r1 = 0
            r4.setTag(r0, r1)
            r0 = 0
            r4.setTranslationX(r0)
            r4.setTranslationY(r0)
            return
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7) {
            r0 = this;
            if (r7 == 0) goto L1f
            int r1 = androidx.recyclerview.R.id.item_touch_helper_previous_elevation
            java.lang.Object r6 = r3.getTag(r1)
            if (r6 != 0) goto L1f
            float r6 = androidx.core.view.ViewCompat.getElevation(r3)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = findMaxElevation(r2, r3)
            float r2 = r2 + r7
            androidx.core.view.ViewCompat.setElevation(r3, r2)
            r3.setTag(r1, r6)
        L1f:
            r3.setTranslationX(r4)
            r3.setTranslationY(r5)
            return
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(android.view.View r1) {
            r0 = this;
            return
    }
}
