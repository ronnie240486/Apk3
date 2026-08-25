package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public interface MenuProvider {

    /* JADX INFO: renamed from: androidx.core.view.MenuProvider$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onMenuClosed(androidx.core.view.MenuProvider r0, @androidx.annotation.NonNull android.view.Menu r1) {
                return
        }

        public static void $default$onPrepareMenu(androidx.core.view.MenuProvider r0, @androidx.annotation.NonNull android.view.Menu r1) {
                return
        }
    }

    void onCreateMenu(@androidx.annotation.NonNull android.view.Menu r1, @androidx.annotation.NonNull android.view.MenuInflater r2);

    void onMenuClosed(@androidx.annotation.NonNull android.view.Menu r1);

    boolean onMenuItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);

    void onPrepareMenu(@androidx.annotation.NonNull android.view.Menu r1);
}
