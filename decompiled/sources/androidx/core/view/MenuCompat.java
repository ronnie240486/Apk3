package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuCompat {

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setGroupDividerEnabled(android.view.Menu r0, boolean r1) {
                r0.setGroupDividerEnabled(r1)
                return
        }
    }

    private MenuCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setGroupDividerEnabled(@androidx.annotation.NonNull android.view.Menu r2, boolean r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenu
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenu r2 = (androidx.core.internal.view.SupportMenu) r2
            r2.setGroupDividerEnabled(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L13
            androidx.core.view.MenuCompat.Api28Impl.setGroupDividerEnabled(r2, r3)
        L13:
            return
    }

    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }
}
