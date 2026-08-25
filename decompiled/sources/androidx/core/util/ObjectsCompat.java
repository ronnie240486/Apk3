package androidx.core.util;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectsCompat {

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
                boolean r0 = java.util.Objects.equals(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int hash(java.lang.Object... r0) {
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    private ObjectsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equals(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.Object r1) {
            boolean r0 = androidx.core.util.ObjectsCompat.Api19Impl.equals(r0, r1)
            return r0
    }

    public static int hash(@androidx.annotation.Nullable java.lang.Object... r0) {
            int r0 = androidx.core.util.ObjectsCompat.Api19Impl.hash(r0)
            return r0
    }

    public static int hashCode(@androidx.annotation.Nullable java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> T requireNonNull(@androidx.annotation.Nullable T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> T requireNonNull(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String toString(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 == 0) goto L6
            java.lang.String r1 = r0.toString()
        L6:
            return r1
    }
}
