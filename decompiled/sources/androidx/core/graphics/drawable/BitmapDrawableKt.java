package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: BitmapDrawable.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/Bitmap;", "resources", "Landroid/content/res/Resources;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BitmapDrawableKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.BitmapDrawable toDrawable(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, @org.jetbrains.annotations.NotNull android.content.res.Resources r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r2, r1)
            return r0
    }
}
