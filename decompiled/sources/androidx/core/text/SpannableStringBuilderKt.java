package androidx.core.text;

/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001aB\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000f\"\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"buildSpannedString", "Landroid/text/SpannedString;", "builderAction", "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "backgroundColor", "color", "", "bold", "inSpans", "span", "", "spans", "", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "italic", "scale", "proportion", "", "strikeThrough", "subscript", "superscript", "underline", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SpannableStringBuilderKt {
    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder backgroundColor(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @androidx.annotation.ColorInt int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder bold(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r1 = 1
            r0.<init>(r1)
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannedString buildSpannedString(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r1.invoke(r0)
            android.text.SpannedString r1 = new android.text.SpannedString
            r1.<init>(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder color(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @androidx.annotation.ColorInt int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder inSpans(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "span"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r3, r0, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder inSpans(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r5, @org.jetbrains.annotations.NotNull java.lang.Object[] r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "spans"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.length()
            r7.invoke(r5)
            int r7 = r6.length
            r1 = 0
        L19:
            if (r1 >= r7) goto L29
            r2 = r6[r1]
            int r3 = r5.length()
            r4 = 17
            r5.setSpan(r2, r0, r3, r4)
            int r1 = r1 + 1
            goto L19
        L29:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder italic(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r1 = 2
            r0.<init>(r1)
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder scale(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder strikeThrough(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder subscript(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.SubscriptSpan r0 = new android.text.style.SubscriptSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder superscript(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.SuperscriptSpan r0 = new android.text.style.SuperscriptSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder underline(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }
}
