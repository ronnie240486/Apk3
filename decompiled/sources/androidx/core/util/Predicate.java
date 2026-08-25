package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"UnknownNullness"})
public interface Predicate<T> {

    /* JADX INFO: renamed from: androidx.core.util.Predicate$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
        @android.annotation.SuppressLint({"MissingNullability"})
        public static androidx.core.util.Predicate $default$and(androidx.core.util.Predicate r2, @android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate r3) {
                java.util.Objects.requireNonNull(r3)
                androidx.core.util.Predicate$$ExternalSyntheticLambda0 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r2, r3, r1)
                return r0
        }

        @android.annotation.SuppressLint({"MissingNullability"})
        public static androidx.core.util.Predicate $default$negate(androidx.core.util.Predicate r2) {
                androidx.core.util.Predicate$$ExternalSyntheticLambda1 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda1
                r1 = 1
                r0.<init>(r2, r1)
                return r0
        }

        @android.annotation.SuppressLint({"MissingNullability"})
        public static androidx.core.util.Predicate $default$or(androidx.core.util.Predicate r2, @android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate r3) {
                java.util.Objects.requireNonNull(r3)
                androidx.core.util.Predicate$$ExternalSyntheticLambda0 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }

        public static /* synthetic */ boolean $private$lambda$and$0(androidx.core.util.Predicate r0, androidx.core.util.Predicate r1, java.lang.Object r2) {
                boolean r0 = r0.test(r2)
                if (r0 == 0) goto Le
                boolean r0 = r1.test(r2)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public static /* synthetic */ boolean $private$lambda$negate$1(androidx.core.util.Predicate r0, java.lang.Object r1) {
                boolean r0 = r0.test(r1)
                r0 = r0 ^ 1
                return r0
        }

        public static /* synthetic */ boolean $private$lambda$or$2(androidx.core.util.Predicate r0, androidx.core.util.Predicate r1, java.lang.Object r2) {
                boolean r0 = r0.test(r2)
                if (r0 != 0) goto Lf
                boolean r0 = r1.test(r2)
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        @android.annotation.SuppressLint({"MissingNullability"})
        public static <T> androidx.core.util.Predicate<T> isEqual(@android.annotation.SuppressLint({"MissingNullability"}) java.lang.Object r2) {
                if (r2 != 0) goto L5
                androidx.core.util.Predicate$$ExternalSyntheticLambda2 r2 = androidx.core.util.Predicate$$ExternalSyntheticLambda2.INSTANCE
                goto Lc
            L5:
                androidx.core.util.Predicate$$ExternalSyntheticLambda1 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda1
                r1 = 0
                r0.<init>(r2, r1)
                r2 = r0
            Lc:
                return r2
        }

        public static /* synthetic */ boolean lambda$isEqual$3(java.lang.Object r0) {
                if (r0 != 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        public static /* synthetic */ boolean lambda$isEqual$4(java.lang.Object r0, java.lang.Object r1) {
                boolean r0 = r0.equals(r1)
                return r0
        }

        @android.annotation.SuppressLint({"MissingNullability"})
        public static <T> androidx.core.util.Predicate<T> not(@android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate<? super T> r0) {
                java.util.Objects.requireNonNull(r0)
                androidx.core.util.Predicate r0 = r0.negate()
                return r0
        }
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    androidx.core.util.Predicate<T> and(@android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate<? super T> r1);

    @android.annotation.SuppressLint({"MissingNullability"})
    androidx.core.util.Predicate<T> negate();

    @android.annotation.SuppressLint({"MissingNullability"})
    androidx.core.util.Predicate<T> or(@android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate<? super T> r1);

    boolean test(T r1);
}
