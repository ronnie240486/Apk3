package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3, boolean r4);

    boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3);

    void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, @androidx.annotation.NonNull int[] r4);

    void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3);

    boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3);

    void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r1);
}
