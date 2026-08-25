package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface MenuPresenter {

    /* JADX INFO: loaded from: classes3.dex */
    public interface Callback {
        void onCloseMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

        boolean onOpenSubMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1);
    }

    boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean flagActionItems();

    int getId();

    androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r1);

    void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2);

    void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

    void onRestoreInstanceState(android.os.Parcelable r1);

    android.os.Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r1);

    void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1);

    void updateMenuView(boolean r1);
}
