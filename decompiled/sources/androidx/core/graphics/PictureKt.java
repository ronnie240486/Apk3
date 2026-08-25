package androidx.core.graphics;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PictureKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Picture record(@org.jetbrains.annotations.NotNull android.graphics.Picture r1, int r2, int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.graphics.Canvas r2 = r1.beginRecording(r2, r3)
            java.lang.String r3 = "beginRecording(width, height)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 1
            r4.invoke(r2)     // Catch: java.lang.Throwable -> L21
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.endRecording()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r1
        L21:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.endRecording()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r2
    }
}
