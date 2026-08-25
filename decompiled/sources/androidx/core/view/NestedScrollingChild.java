package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float r1, float r2, boolean r3);

    boolean dispatchNestedPreFling(float r1, float r2);

    boolean dispatchNestedPreScroll(int r1, int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable int[] r4);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, @androidx.annotation.Nullable int[] r5);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean r1);

    boolean startNestedScroll(int r1);

    void stopNestedScroll();
}
