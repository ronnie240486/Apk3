package androidx.core.graphics;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a3\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aG\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a)\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aQ\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a=\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a=\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CanvasKt {
    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, int r2, int r3, int r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "clipPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.save()
            r1.clipPath(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L1e
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L1e:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "clipRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L1e
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L1e:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.RectF r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "clipRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L1e
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L1e:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static final void withMatrix(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Matrix r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "matrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.save()
            r1.concat(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L1e
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L1e:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas r0, android.graphics.Matrix r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L9
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
        L9:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "matrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            int r3 = r0.save()
            r0.concat(r1)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L26
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r3, r4)
            return
        L26:
            r1 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r3, r4)
            throw r1
    }

    public static final void withRotation(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas r0, float r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r1 = 0
        L5:
            r6 = r5 & 2
            if (r6 == 0) goto La
            r2 = 0
        La:
            r5 = r5 & 4
            if (r5 == 0) goto Lf
            r3 = 0
        Lf:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            int r5 = r0.save()
            r0.rotate(r1, r2, r3)
            r1 = 1
            r4.invoke(r0)     // Catch: java.lang.Throwable -> L28
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r5, r1)
            return
        L28:
            r2 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r5, r1)
            throw r2
    }

    public static final void withSave(@org.jetbrains.annotations.NotNull android.graphics.Canvas r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.save()
            r1 = 1
            r3.invoke(r2)     // Catch: java.lang.Throwable -> L16
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r0, r1)
            return
        L16:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r0, r1)
            throw r3
    }

    public static final void withScale(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas r0, float r1, float r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            r1 = 1065353216(0x3f800000, float:1.0)
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            r2 = 1065353216(0x3f800000, float:1.0)
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            r3 = 0
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L16
            r4 = 0
        L16:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            int r6 = r0.save()
            r0.scale(r1, r2, r3, r4)
            r1 = 1
            r5.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r6, r1)
            return
        L2f:
            r2 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r6, r1)
            throw r2
    }

    public static final void withSkew(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas r0, float r1, float r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 0
        La:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            int r4 = r0.save()
            r0.skew(r1, r2)
            r1 = 1
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L23
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r1)
            return
        L23:
            r2 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r1)
            throw r2
    }

    public static final void withTranslation(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            return
        L19:
            r3 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r2)
            throw r3
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas r0, float r1, float r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 0
        La:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            int r4 = r0.save()
            r0.translate(r1, r2)
            r1 = 1
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L23
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r1)
            return
        L23:
            r2 = move-exception
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r1)
            throw r2
    }
}
