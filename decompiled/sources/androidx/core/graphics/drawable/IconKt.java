package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class IconKt {
    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toAdaptiveIcon(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r1)
            java.lang.String r0 = "createWithAdaptiveBitmap(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithBitmap(r1)
            java.lang.String r0 = "createWithBitmap(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull android.net.Uri r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithContentUri(r1)
            java.lang.String r0 = "createWithContentUri(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            r1 = 0
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithData(r2, r1, r0)
            java.lang.String r0 = "createWithData(this, 0, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }
}
