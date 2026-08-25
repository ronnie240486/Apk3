package androidx.core.text;

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HtmlKt {
    @org.jetbrains.annotations.NotNull
    public static final android.text.Spanned parseAsHtml(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.Nullable android.text.Html.ImageGetter r3, @org.jetbrains.annotations.Nullable android.text.Html.TagHandler r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.text.Spanned r1 = androidx.core.text.HtmlCompat.fromHtml(r1, r2, r3, r4)
            java.lang.String r2 = "fromHtml(this, flags, imageGetter, tagHandler)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ android.text.Spanned parseAsHtml$default(java.lang.String r1, int r2, android.text.Html.ImageGetter r3, android.text.Html.TagHandler r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto Lb
            r3 = r0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            android.text.Spanned r1 = androidx.core.text.HtmlCompat.fromHtml(r1, r2, r3, r4)
            java.lang.String r2 = "fromHtml(this, flags, imageGetter, tagHandler)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHtml(@org.jetbrains.annotations.NotNull android.text.Spanned r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = androidx.core.text.HtmlCompat.toHtml(r1, r2)
            java.lang.String r2 = "toHtml(this, option)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String toHtml$default(android.text.Spanned r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r0 = androidx.core.text.HtmlCompat.toHtml(r0, r1)
            java.lang.String r1 = "toHtml(this, option)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
