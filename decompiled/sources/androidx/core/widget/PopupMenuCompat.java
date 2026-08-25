package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class PopupMenuCompat {

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.View.OnTouchListener getDragToOpenListener(android.widget.PopupMenu r0) {
                android.view.View$OnTouchListener r0 = r0.getDragToOpenListener()
                return r0
        }
    }

    private PopupMenuCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.view.View.OnTouchListener getDragToOpenListener(@androidx.annotation.NonNull java.lang.Object r0) {
            android.widget.PopupMenu r0 = (android.widget.PopupMenu) r0
            android.view.View$OnTouchListener r0 = androidx.core.widget.PopupMenuCompat.Api19Impl.getDragToOpenListener(r0)
            return r0
    }
}
