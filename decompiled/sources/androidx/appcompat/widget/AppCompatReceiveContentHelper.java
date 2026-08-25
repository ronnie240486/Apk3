package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean onDropForTextView(@androidx.annotation.NonNull android.view.DragEvent r1, @androidx.annotation.NonNull android.widget.TextView r2, @androidx.annotation.NonNull android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                float r3 = r1.getX()
                float r0 = r1.getY()
                int r3 = r2.getOffsetForPosition(r3, r0)
                r2.beginBatchEdit()
                java.lang.CharSequence r0 = r2.getText()     // Catch: java.lang.Throwable -> L31
                android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L31
                android.text.Selection.setSelection(r0, r3)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder     // Catch: java.lang.Throwable -> L31
                android.content.ClipData r1 = r1.getClipData()     // Catch: java.lang.Throwable -> L31
                r0 = 3
                r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat r1 = r3.build()     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)     // Catch: java.lang.Throwable -> L31
                r2.endBatchEdit()
                r1 = 1
                return r1
            L31:
                r1 = move-exception
                r2.endBatchEdit()
                throw r1
        }

        @androidx.annotation.DoNotInline
        public static boolean onDropForView(@androidx.annotation.NonNull android.view.DragEvent r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder
                android.content.ClipData r1 = r1.getClipData()
                r0 = 3
                r3.<init>(r1, r0)
                androidx.core.view.ContentInfoCompat r1 = r3.build()
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)
                r1 = 1
                return r1
        }
    }

    private AppCompatReceiveContentHelper() {
            r0 = this;
            r0.<init>()
            return
    }
}
