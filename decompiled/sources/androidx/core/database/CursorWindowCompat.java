package androidx.core.database;

/* JADX INFO: loaded from: classes2.dex */
public final class CursorWindowCompat {

    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.database.CursorWindow createCursorWindow(java.lang.String r1) {
                android.database.CursorWindow r0 = new android.database.CursorWindow
                r0.<init>(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.database.CursorWindow createCursorWindow(java.lang.String r1, long r2) {
                android.database.CursorWindow r0 = new android.database.CursorWindow
                r0.<init>(r1, r2)
                return r0
        }
    }

    private CursorWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.database.CursorWindow create(@androidx.annotation.Nullable java.lang.String r2, long r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.database.CursorWindow r2 = androidx.core.database.CursorWindowCompat.Api28Impl.createCursorWindow(r2, r3)
            return r2
        Lb:
            android.database.CursorWindow r2 = androidx.core.database.CursorWindowCompat.Api15Impl.createCursorWindow(r2)
            return r2
    }
}
