package androidx.core.graphics;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0087\u0002\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020#H\u0087\b\u001a\r\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0000\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\n*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006%"}, d2 = {"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", "blue", "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "green", "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", "red", "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ColorKt {
    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long r0) {
            float r0 = android.graphics.Color.red(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component1(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            float r1 = r1.getComponent(r0)
            return r1
    }

    public static final int component1(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long r0) {
            float r0 = android.graphics.Color.green(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component2(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 1
            float r1 = r1.getComponent(r0)
            return r1
    }

    public static final int component2(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long r0) {
            float r0 = android.graphics.Color.blue(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component3(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2
            float r1 = r1.getComponent(r0)
            return r1
    }

    public static final int component3(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long r0) {
            float r0 = android.graphics.Color.alpha(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component4(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 3
            float r1 = r1.getComponent(r0)
            return r1
    }

    public static final int component4(@androidx.annotation.ColorInt int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@androidx.annotation.ColorInt int r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r2) {
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
            long r1 = android.graphics.Color.convert(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@androidx.annotation.ColorInt int r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r2) {
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r1 = android.graphics.Color.convert(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r3) {
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            long r1 = android.graphics.Color.convert(r1, r3)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r3) {
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r1 = android.graphics.Color.convert(r1, r3)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color convertTo(@org.jetbrains.annotations.NotNull android.graphics.Color r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
            android.graphics.Color r1 = r1.convert(r2)
            java.lang.String r2 = "convert(ColorSpace.get(colorSpace))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color convertTo(@org.jetbrains.annotations.NotNull android.graphics.Color r1, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Color r1 = r1.convert(r2)
            java.lang.String r2 = "convert(colorSpace)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long r0) {
            float r0 = android.graphics.Color.alpha(r0)
            return r0
    }

    public static final int getAlpha(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long r0) {
            float r0 = android.graphics.Color.blue(r0)
            return r0
    }

    public static final int getBlue(@androidx.annotation.ColorInt int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.ColorSpace getColorSpace(long r0) {
            android.graphics.ColorSpace r0 = android.graphics.Color.colorSpace(r0)
            java.lang.String r1 = "colorSpace(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long r0) {
            float r0 = android.graphics.Color.green(r0)
            return r0
    }

    public static final int getGreen(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@androidx.annotation.ColorInt int r0) {
            float r0 = android.graphics.Color.luminance(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long r0) {
            float r0 = android.graphics.Color.luminance(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long r0) {
            float r0 = android.graphics.Color.red(r0)
            return r0
    }

    public static final int getRed(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long r0) {
            boolean r0 = android.graphics.Color.isSrgb(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long r0) {
            boolean r0 = android.graphics.Color.isWideGamut(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color plus(@org.jetbrains.annotations.NotNull android.graphics.Color r1, @org.jetbrains.annotations.NotNull android.graphics.Color r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Color r1 = androidx.core.graphics.ColorUtils.compositeColors(r2, r1)
            java.lang.String r2 = "compositeColors(c, this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color toColor(@androidx.annotation.ColorInt int r1) {
            android.graphics.Color r1 = android.graphics.Color.valueOf(r1)
            java.lang.String r0 = "valueOf(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color toColor(long r0) {
            android.graphics.Color r0 = android.graphics.Color.valueOf(r0)
            java.lang.String r1 = "valueOf(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @androidx.annotation.ColorInt
    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long r0) {
            int r0 = android.graphics.Color.toArgb(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public static final int toColorInt(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = android.graphics.Color.parseColor(r1)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@androidx.annotation.ColorInt int r2) {
            long r0 = android.graphics.Color.pack(r2)
            return r0
    }
}
