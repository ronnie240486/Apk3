package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/animation/Api19Impl;", "", "()V", "addPauseListener", "", "animator", "Landroid/animation/Animator;", "listener", "Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Api19Impl {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.animation.Api19Impl INSTANCE = null;

    static {
            androidx.core.animation.Api19Impl r0 = new androidx.core.animation.Api19Impl
            r0.<init>()
            androidx.core.animation.Api19Impl.INSTANCE = r0
            return
    }

    private Api19Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void addPauseListener(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull android.animation.Animator.AnimatorPauseListener r2) {
            java.lang.String r0 = "animator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addPauseListener(r2)
            return
    }
}
