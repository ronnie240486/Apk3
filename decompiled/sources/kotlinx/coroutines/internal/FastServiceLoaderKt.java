package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)     // Catch: java.lang.Throwable -> Ld
            goto L18
        Ld:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        L18:
            boolean r0 = kotlin.Result.m340isSuccessimpl(r0)
            kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED = r0
            return
    }

    public static final boolean getANDROID_DETECTED() {
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED
            return r0
    }
}
