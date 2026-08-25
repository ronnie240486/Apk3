package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(16)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/view/Api16Impl;", "", "()V", "postOnAnimationDelayed", "", "view", "Landroid/view/View;", "action", "Ljava/lang/Runnable;", "delayInMillis", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Api16Impl {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.view.Api16Impl INSTANCE = null;

    static {
            androidx.core.view.Api16Impl r0 = new androidx.core.view.Api16Impl
            r0.<init>()
            androidx.core.view.Api16Impl.INSTANCE = r0
            return
    }

    private Api16Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void postOnAnimationDelayed(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2, long r3) {
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.postOnAnimationDelayed(r2, r3)
            return
    }
}
