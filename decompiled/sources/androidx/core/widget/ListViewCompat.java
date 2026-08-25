package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ListViewCompat {

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean canScrollList(android.widget.ListView r0, int r1) {
                boolean r0 = r0.canScrollList(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void scrollListBy(android.widget.ListView r0, int r1) {
                r0.scrollListBy(r1)
                return
        }
    }

    private ListViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canScrollList(@androidx.annotation.NonNull android.widget.ListView r0, int r1) {
            boolean r0 = androidx.core.widget.ListViewCompat.Api19Impl.canScrollList(r0, r1)
            return r0
    }

    public static void scrollListBy(@androidx.annotation.NonNull android.widget.ListView r0, int r1) {
            androidx.core.widget.ListViewCompat.Api19Impl.scrollListBy(r0, r1)
            return
    }
}
