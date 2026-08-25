package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final enum SharingCommand extends java.lang.Enum<kotlinx.coroutines.flow.SharingCommand> {
    private static final /* synthetic */ kotlinx.coroutines.flow.SharingCommand[] $VALUES = null;
    public static final kotlinx.coroutines.flow.SharingCommand START = null;
    public static final kotlinx.coroutines.flow.SharingCommand STOP = null;
    public static final kotlinx.coroutines.flow.SharingCommand STOP_AND_RESET_REPLAY_CACHE = null;

    private static final /* synthetic */ kotlinx.coroutines.flow.SharingCommand[] $values() {
            r0 = 3
            kotlinx.coroutines.flow.SharingCommand[] r0 = new kotlinx.coroutines.flow.SharingCommand[r0]
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.START = r0
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "STOP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.STOP = r0
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "STOP_AND_RESET_REPLAY_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE = r0
            kotlinx.coroutines.flow.SharingCommand[] r0 = $values()
            kotlinx.coroutines.flow.SharingCommand.$VALUES = r0
            return
    }

    private SharingCommand(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.flow.SharingCommand valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.flow.SharingCommand> r0 = kotlinx.coroutines.flow.SharingCommand.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
            return r1
    }

    public static kotlinx.coroutines.flow.SharingCommand[] values() {
            kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.flow.SharingCommand[] r0 = (kotlinx.coroutines.flow.SharingCommand[]) r0
            return r0
    }
}
