package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: AgentInstallationType.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/AgentInstallationType;", "", "()V", "isInstalledStatically", "", "isInstalledStatically$kotlinx_coroutines_core", "()Z", "setInstalledStatically$kotlinx_coroutines_core", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AgentInstallationType {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.debug.internal.AgentInstallationType INSTANCE = null;
    private static boolean isInstalledStatically;

    static {
            kotlinx.coroutines.debug.internal.AgentInstallationType r0 = new kotlinx.coroutines.debug.internal.AgentInstallationType
            r0.<init>()
            kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE = r0
            return
    }

    private AgentInstallationType() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean isInstalledStatically$kotlinx_coroutines_core() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.AgentInstallationType.isInstalledStatically
            return r0
    }

    public final void setInstalledStatically$kotlinx_coroutines_core(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.AgentInstallationType.isInstalledStatically = r1
            return
    }
}
