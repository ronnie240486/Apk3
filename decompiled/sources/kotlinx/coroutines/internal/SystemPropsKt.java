package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
            int r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS()
            return r0
    }

    public static final int systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0, int r1, int r2, int r3) {
            int r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(r0, r1, r2, r3)
            return r0
    }

    public static final long systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0, long r1, long r3, long r5) {
            long r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(r0, r1, r3, r5)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.systemProp(r0)
            return r0
    }

    public static final boolean systemProp(@org.jetbrains.annotations.NotNull java.lang.String r0, boolean r1) {
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(r0, r1)
            return r0
    }

    public static /* synthetic */ int systemProp$default(java.lang.String r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            int r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ long systemProp$default(java.lang.String r0, long r1, long r3, long r5, int r7, java.lang.Object r8) {
            long r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default(r0, r1, r3, r5, r7, r8)
            return r0
    }
}
