package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface FitWindowsViewGroup {

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(android.graphics.Rect r1);
    }

    void setOnFitSystemWindowsListener(androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener r1);
}
