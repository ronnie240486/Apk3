package androidx.core.os;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u001a4\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"postAtTime", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "uptimeMillis", "", "token", "", "action", "Lkotlin/Function0;", "", "postDelayed", "delayInMillis", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HandlerKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postAtTime(@org.jetbrains.annotations.NotNull android.os.Handler r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r0 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r0.<init>(r5)
            r1.postAtTime(r0, r4, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postAtTime$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r5 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r5.<init>(r4)
            r0.postAtTime(r5, r3, r1)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postDelayed(@org.jetbrains.annotations.NotNull android.os.Handler r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r0 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r0.<init>(r5)
            if (r4 != 0) goto L15
            r1.postDelayed(r0, r2)
            goto L18
        L15:
            androidx.core.os.HandlerCompat.postDelayed(r1, r0, r4, r2)
        L18:
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postDelayed$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r5 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r5.<init>(r4)
            if (r3 != 0) goto L1a
            r0.postDelayed(r5, r1)
            goto L1d
        L1a:
            androidx.core.os.HandlerCompat.postDelayed(r0, r5, r3, r1)
        L1d:
            return r5
    }
}
