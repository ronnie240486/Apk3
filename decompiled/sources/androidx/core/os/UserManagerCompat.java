package androidx.core.os;

/* JADX INFO: loaded from: classes3.dex */
public class UserManagerCompat {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isUserUnlocked(android.content.Context r1) {
                java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.os.UserManager r1 = (android.os.UserManager) r1
                boolean r1 = r1.isUserUnlocked()
                return r1
        }
    }

    private UserManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isUserUnlocked(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.UserManagerCompat.Api24Impl.isUserUnlocked(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }
}
