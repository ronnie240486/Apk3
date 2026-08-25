package androidx.core.text;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"layoutDirection", "", "Ljava/util/Locale;", "getLayoutDirection", "(Ljava/util/Locale;)I", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class LocaleKt {
    @androidx.annotation.RequiresApi(17)
    public static final int getLayoutDirection(@org.jetbrains.annotations.NotNull java.util.Locale r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
            return r1
    }
}
