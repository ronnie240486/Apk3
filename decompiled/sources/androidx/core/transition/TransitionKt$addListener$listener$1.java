package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 176)
public final class TransitionKt$addListener$listener$1 implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onCancel;
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onEnd;
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onPause;
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onResume;
    public final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onStart;

    public TransitionKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r3, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r4, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r5) {
            r0 = this;
            r0.$onEnd = r1
            r0.$onResume = r2
            r0.$onPause = r3
            r0.$onCancel = r4
            r0.$onStart = r5
            r0.<init>()
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> r0 = r1.$onCancel
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> r0 = r1.$onEnd
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> r0 = r1.$onPause
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> r0 = r1.$onResume
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> r0 = r1.$onStart
            r0.invoke(r2)
            return
    }
}
