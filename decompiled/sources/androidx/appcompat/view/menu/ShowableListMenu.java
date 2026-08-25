package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface ShowableListMenu {
    void dismiss();

    android.widget.ListView getListView();

    boolean isShowing();

    void show();
}
