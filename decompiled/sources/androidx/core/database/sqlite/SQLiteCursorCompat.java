package androidx.core.database.sqlite;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCursorCompat {

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor r0, boolean r1) {
                r0.setFillWindowForwardOnly(r1)
                return
        }
    }

    private SQLiteCursorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setFillWindowForwardOnly(@androidx.annotation.NonNull android.database.sqlite.SQLiteCursor r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L9
            androidx.core.database.sqlite.SQLiteCursorCompat.Api28Impl.setFillWindowForwardOnly(r2, r3)
        L9:
            return
    }
}
