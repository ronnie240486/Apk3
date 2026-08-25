package androidx.core.util;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001aH\u0010\f\u001a\u00020\r*\u00020\u000226\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000fH\u0087\bø\u0001\u0000\u001a\u001d\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000bH\u0087\b\u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0087\bø\u0001\u0000\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0087\b\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0087\u0002\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u001d\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0087\n\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0002H\u0007\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"size", "", "Landroid/util/SparseLongArray;", "getSize", "(Landroid/util/SparseLongArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "Lkotlin/collections/LongIterator;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SparseLongArrayKt {



    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean contains(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsKey(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsValue(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfValue(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final void forEach(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            int r2 = r5.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.valueAt(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L27:
            return
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long getOrDefault(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, int r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            long r1 = r1.get(r2, r3)
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long getOrElse(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Long> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            long r1 = r1.valueAt(r2)
            goto L1f
        L15:
            java.lang.Object r1 = r3.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
        L1f:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final int getSize(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.IntIterator keyIterator(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.SparseLongArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.util.SparseLongArray plus(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r3, @org.jetbrains.annotations.NotNull android.util.SparseLongArray r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final void putAll(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r5, @org.jetbrains.annotations.NotNull android.util.SparseLongArray r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            int r2 = r6.keyAt(r1)
            long r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean remove(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r3, int r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r4 = r3.indexOfKey(r4)
            if (r4 < 0) goto L18
            long r0 = r3.valueAt(r4)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L18
            r3.removeAt(r4)
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final void set(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1, int r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.put(r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(18)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.LongIterator valueIterator(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.SparseLongArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
