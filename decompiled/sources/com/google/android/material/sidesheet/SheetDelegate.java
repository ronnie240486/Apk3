package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes2.dex */
abstract class SheetDelegate {
    public SheetDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract float calculateSlideOffsetBasedOnOutwardEdge(int r1);

    public abstract int calculateTargetStateOnViewReleased(@androidx.annotation.NonNull android.view.View r1, float r2, float r3);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract <V extends android.view.View> int getOutwardEdge(@androidx.annotation.NonNull V r1);

    public abstract void getSheetEdge();

    public abstract boolean isSettling(android.view.View r1, int r2, boolean r3);

    public abstract void updateCoplanarSiblingLayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r1, int r2);
}
