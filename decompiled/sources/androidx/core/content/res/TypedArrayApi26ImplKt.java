package androidx.core.content.res;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(26)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "()V", "getFont", "Landroid/graphics/Typeface;", "typedArray", "Landroid/content/res/TypedArray;", "index", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class TypedArrayApi26ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.content.res.TypedArrayApi26ImplKt INSTANCE = null;

    static {
            androidx.core.content.res.TypedArrayApi26ImplKt r0 = new androidx.core.content.res.TypedArrayApi26ImplKt
            r0.<init>()
            androidx.core.content.res.TypedArrayApi26ImplKt.INSTANCE = r0
            return
    }

    private TypedArrayApi26ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Typeface getFont(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            java.lang.String r0 = "typedArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.Typeface r1 = r1.getFont(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
    }
}
