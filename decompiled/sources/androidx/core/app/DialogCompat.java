package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class DialogCompat {

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static <T> T requireViewById(android.app.Dialog r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    private DialogCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.view.View requireViewById(@androidx.annotation.NonNull android.app.Dialog r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.app.DialogCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Dialog"
            r2.<init>(r3)
            throw r2
    }
}
