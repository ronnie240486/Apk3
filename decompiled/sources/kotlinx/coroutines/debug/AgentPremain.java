package kotlinx.coroutines.debug;

/* JADX INFO: compiled from: AgentPremain.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "()V", "enableCreationStackTraces", "", "installSignalHandler", "", "premain", "args", "", "instrumentation", "Ljava/lang/instrument/Instrumentation;", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@android.annotation.SuppressLint({"all"})
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
public final class AgentPremain {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.debug.AgentPremain INSTANCE = null;
    private static final boolean enableCreationStackTraces = false;

    /* JADX INFO: compiled from: AgentPremain.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DebugProbesTransformer implements java.lang.instrument.ClassFileTransformer {

        @org.jetbrains.annotations.NotNull
        public static final kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer INSTANCE = null;

        static {
                kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer r0 = new kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer
                r0.<init>()
                kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer.INSTANCE = r0
                return
        }

        private DebugProbesTransformer() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public byte[] transform(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Class<?> r3, @org.jetbrains.annotations.NotNull java.security.ProtectionDomain r4, @org.jetbrains.annotations.Nullable byte[] r5) {
                r0 = this;
                java.lang.String r3 = "kotlin/coroutines/jvm/internal/DebugProbesKt"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto La
                r1 = 0
                return r1
            La:
                kotlinx.coroutines.debug.internal.AgentInstallationType r2 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
                r3 = 1
                r2.setInstalledStatically$kotlinx_coroutines_core(r3)
                java.lang.String r2 = "DebugProbesKt.bin"
                java.io.InputStream r1 = r1.getResourceAsStream(r2)
                byte[] r1 = kotlin.io.ByteStreamsKt.readBytes(r1)
                return r1
        }
    }

    static {
            kotlinx.coroutines.debug.AgentPremain r0 = new kotlinx.coroutines.debug.AgentPremain
            r0.<init>()
            kotlinx.coroutines.debug.AgentPremain.INSTANCE = r0
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "kotlinx.coroutines.debug.enable.creation.stack.trace"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L14
            r1 = r0
            goto L1c
        L14:
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L21
        L1c:
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)     // Catch: java.lang.Throwable -> L21
            goto L2c
        L21:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
        L2c:
            boolean r2 = kotlin.Result.m339isFailureimpl(r1)
            if (r2 == 0) goto L33
            goto L34
        L33:
            r0 = r1
        L34:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L3f
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r0 = r0.getEnableCreationStackTraces()
            goto L43
        L3f:
            boolean r0 = r0.booleanValue()
        L43:
            kotlinx.coroutines.debug.AgentPremain.enableCreationStackTraces = r0
            return
    }

    private AgentPremain() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void installSignalHandler() {
            r2 = this;
            sun.misc.Signal r0 = new sun.misc.Signal     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "TRAP"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            kotlinx.coroutines.debug.AgentPremain$$ExternalSyntheticLambda0 r1 = kotlinx.coroutines.debug.AgentPremain$$ExternalSyntheticLambda0.INSTANCE     // Catch: java.lang.Throwable -> Lc
            sun.misc.Signal.handle(r0, r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    /* JADX INFO: renamed from: installSignalHandler$lambda-1, reason: not valid java name */
    private static final void m1843installSignalHandler$lambda1(sun.misc.Signal r1) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r0 = r1.isInstalled$kotlinx_coroutines_core()
            if (r0 == 0) goto Le
            java.io.PrintStream r0 = java.lang.System.out
            r1.dumpCoroutines(r0)
            goto L15
        Le:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r0 = "Cannot perform coroutines dump, debug probes are disabled"
            r1.println(r0)
        L15:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void premain(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.instrument.Instrumentation r2) {
            kotlinx.coroutines.debug.internal.AgentInstallationType r1 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
            r0 = 1
            r1.setInstalledStatically$kotlinx_coroutines_core(r0)
            kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer r1 = kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer.INSTANCE
            java.lang.instrument.ClassFileTransformer r1 = (java.lang.instrument.ClassFileTransformer) r1
            r2.addTransformer(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r2 = kotlinx.coroutines.debug.AgentPremain.enableCreationStackTraces
            r1.setEnableCreationStackTraces(r2)
            r1.install()
            kotlinx.coroutines.debug.AgentPremain r1 = kotlinx.coroutines.debug.AgentPremain.INSTANCE
            r1.installSignalHandler()
            return
    }
}
