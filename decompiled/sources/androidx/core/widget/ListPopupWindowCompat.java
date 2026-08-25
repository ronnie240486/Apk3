package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ListPopupWindowCompat {

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow r0, android.view.View r1) {
                android.view.View$OnTouchListener r0 = r0.createDragToOpenListener(r1)
                return r0
        }
    }

    private ListPopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.view.View.OnTouchListener createDragToOpenListener(@androidx.annotation.NonNull android.widget.ListPopupWindow r0, @androidx.annotation.NonNull android.view.View r1) {
            android.view.View$OnTouchListener r0 = androidx.core.widget.ListPopupWindowCompat.Api19Impl.createDragToOpenListener(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object r0, android.view.View r1) {
            android.widget.ListPopupWindow r0 = (android.widget.ListPopupWindow) r0
            android.view.View$OnTouchListener r0 = createDragToOpenListener(r0, r1)
            return r0
    }
}
