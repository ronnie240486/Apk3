package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(18)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/os/BundleApi18ImplKt;", "", "()V", "putBinder", "", "bundle", "Landroid/os/Bundle;", "key", "", "value", "Landroid/os/IBinder;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class BundleApi18ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.BundleApi18ImplKt INSTANCE = null;

    static {
            androidx.core.os.BundleApi18ImplKt r0 = new androidx.core.os.BundleApi18ImplKt
            r0.<init>()
            androidx.core.os.BundleApi18ImplKt.INSTANCE = r0
            return
    }

    private BundleApi18ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putBinder(@org.jetbrains.annotations.NotNull android.os.Bundle r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable android.os.IBinder r3) {
            java.lang.String r0 = "bundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.putBinder(r2, r3)
            return
    }
}
