package androidx.core.content;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001aQ\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u001a;\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"getSystemService", "T", "", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "withStyledAttributes", "", "set", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "defStyleRes", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "resourceId", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r2 = androidx.core.content.ContextCompat.getSystemService(r2, r0)
            return r2
    }

    public static final void withStyledAttributes(@org.jetbrains.annotations.NotNull android.content.Context r1, @androidx.annotation.StyleRes int r2, @org.jetbrains.annotations.NotNull int[] r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            java.lang.String r2 = "obtainStyledAttributes(resourceId, attrs)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.invoke(r1)
            r1.recycle()
            return
    }

    public static final void withStyledAttributes(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable android.util.AttributeSet r2, @org.jetbrains.annotations.NotNull int[] r3, @androidx.annotation.AttrRes int r4, @androidx.annotation.StyleRes int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            java.lang.String r2 = "obtainStyledAttributes(s…efStyleAttr, defStyleRes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6.invoke(r1)
            r1.recycle()
            return
    }

    public static /* synthetic */ void withStyledAttributes$default(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto Lb
            r4 = 0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r5 = 0
        L10:
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.lang.String r7 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            java.lang.String r2 = "obtainStyledAttributes(s…efStyleAttr, defStyleRes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6.invoke(r1)
            r1.recycle()
            return
    }
}
