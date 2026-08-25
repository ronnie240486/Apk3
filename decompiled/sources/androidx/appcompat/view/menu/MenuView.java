package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface MenuView {

    /* JADX INFO: loaded from: classes2.dex */
    public interface ItemView {
        androidx.appcompat.view.menu.MenuItemImpl getItemData();

        void initialize(androidx.appcompat.view.menu.MenuItemImpl r1, int r2);

        boolean prefersCondensedTitle();

        void setCheckable(boolean r1);

        void setChecked(boolean r1);

        void setEnabled(boolean r1);

        void setIcon(android.graphics.drawable.Drawable r1);

        void setShortcut(boolean r1, char r2);

        void setTitle(java.lang.CharSequence r1);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(androidx.appcompat.view.menu.MenuBuilder r1);
}
