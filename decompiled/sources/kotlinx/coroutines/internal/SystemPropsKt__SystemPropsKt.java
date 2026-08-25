package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"AVAILABLE_PROCESSORS", "", "getAVAILABLE_PROCESSORS", "()I", "systemProp", "", "propertyName", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class SystemPropsKt__SystemPropsKt {
    private static final int AVAILABLE_PROCESSORS = 0;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS = r0
            return
    }

    public static final int getAVAILABLE_PROCESSORS() {
            int r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
