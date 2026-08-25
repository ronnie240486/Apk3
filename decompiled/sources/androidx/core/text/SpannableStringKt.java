package androidx.core.text;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a%\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0002*\u00020\fH\u0086\b¨\u0006\r"}, d2 = {"clearSpans", "", "Landroid/text/Spannable;", "set", "start", "", "end", "span", "", "range", "Lkotlin/ranges/IntRange;", "toSpannable", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SpannableStringKt {
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public static final void clearSpans(@org.jetbrains.annotations.NotNull android.text.Spannable r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            java.lang.Object[] r0 = r4.getSpans(r2, r0, r1)
            java.lang.String r1 = "getSpans(start, end, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
        L16:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            r4.removeSpan(r3)
            int r2 = r2 + 1
            goto L16
        L20:
            return
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.text.Spannable r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "span"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 17
            r1.setSpan(r4, r2, r3, r0)
            return
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.text.Spannable r2, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r3, @org.jetbrains.annotations.NotNull java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "span"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Integer r0 = r3.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r3 = r3.getEndInclusive()
            int r3 = r3.intValue()
            r1 = 17
            r2.setSpan(r4, r0, r3, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.Spannable toSpannable(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            java.lang.String r0 = "valueOf(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
