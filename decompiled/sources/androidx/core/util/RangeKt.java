package androidx.core.util;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\f\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0007\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"and", "Landroid/util/Range;", "T", "", "other", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "rangeTo", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class RangeKt {


    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> and(@org.jetbrains.annotations.NotNull android.util.Range<T> r1, @org.jetbrains.annotations.NotNull android.util.Range<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.util.Range r1 = r1.intersect(r2)
            java.lang.String r2 = "intersect(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(@org.jetbrains.annotations.NotNull android.util.Range<T> r1, @org.jetbrains.annotations.NotNull android.util.Range<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.util.Range r1 = r1.extend(r2)
            java.lang.String r2 = "extend(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(@org.jetbrains.annotations.NotNull android.util.Range<T> r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.util.Range r1 = r1.extend(r2)
            java.lang.String r2 = "extend(value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> rangeTo(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "that"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.util.Range r0 = new android.util.Range
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> toClosedRange(@org.jetbrains.annotations.NotNull android.util.Range<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.RangeKt$toClosedRange$1 r0 = new androidx.core.util.RangeKt$toClosedRange$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> toRange(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedRange<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r1 = r2.getStart()
            java.lang.Comparable r2 = r2.getEndInclusive()
            r0.<init>(r1, r2)
            return r0
    }
}
