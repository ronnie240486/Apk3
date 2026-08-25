package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(22)
    public static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isAsynchronous(android.os.Message r0) {
                boolean r0 = r0.isAsynchronous()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAsynchronous(android.os.Message r0, boolean r1) {
                r0.setAsynchronous(r1)
                return
        }
    }

    private MessageCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@androidx.annotation.NonNull android.os.Message r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(r2)
            return r2
        Lb:
            boolean r0 = androidx.core.os.MessageCompat.sTryIsAsynchronous
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(r2)     // Catch: java.lang.NoSuchMethodError -> L15
            return r2
        L15:
            androidx.core.os.MessageCompat.sTryIsAsynchronous = r1
        L17:
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void setAsynchronous(@androidx.annotation.NonNull android.os.Message r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto La
            androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(r2, r3)
            return
        La:
            boolean r0 = androidx.core.os.MessageCompat.sTrySetAsynchronous
            if (r0 == 0) goto L15
            androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r2 = 0
            androidx.core.os.MessageCompat.sTrySetAsynchronous = r2
        L15:
            return
    }
}
