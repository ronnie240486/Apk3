package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÉ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class TransitionKt {






    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener addListener(@org.jetbrains.annotations.NotNull android.transition.Transition r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onEnd"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onCancel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onResume"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onPause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.core.transition.TransitionKt$addListener$listener$1 r0 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r1 = r0
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.addListener(r0)
            return r0
    }

    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            androidx.core.transition.TransitionKt$addListener$1 r3 = androidx.core.transition.TransitionKt.AnonymousClass1.INSTANCE
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            androidx.core.transition.TransitionKt$addListener$2 r4 = androidx.core.transition.TransitionKt.AnonymousClass2.INSTANCE
        Lc:
            r9 = r4
            r4 = r8 & 4
            if (r4 == 0) goto L13
            androidx.core.transition.TransitionKt$addListener$3 r5 = androidx.core.transition.TransitionKt.AnonymousClass3.INSTANCE
        L13:
            r0 = r5
            r4 = r8 & 8
            if (r4 == 0) goto L1a
            androidx.core.transition.TransitionKt$addListener$4 r6 = androidx.core.transition.TransitionKt.AnonymousClass4.INSTANCE
        L1a:
            r4 = r8 & 16
            if (r4 == 0) goto L20
            androidx.core.transition.TransitionKt$addListener$5 r7 = androidx.core.transition.TransitionKt.AnonymousClass5.INSTANCE
        L20:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "onEnd"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.String r4 = "onStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.String r4 = "onCancel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "onResume"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.lang.String r4 = "onPause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            androidx.core.transition.TransitionKt$addListener$listener$1 r1 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r4 = r1
            r5 = r3
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r2.addListener(r1)
            return r1
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnCancel(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnEnd(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnPause(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnResume(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnStart(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }
}
