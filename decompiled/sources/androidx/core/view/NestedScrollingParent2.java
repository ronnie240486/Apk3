package androidx.core.view;

/* JADX INFO: loaded from: classes3.dex */
public interface NestedScrollingParent2 extends androidx.core.view.NestedScrollingParent {
    void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, @androidx.annotation.NonNull int[] r4, int r5);

    void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5, int r6);

    void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4);

    boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4);

    void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2);
}
