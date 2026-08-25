package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferOverflow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "(Ljava/lang/String;I)V", "SUSPEND", "DROP_OLDEST", "DROP_LATEST", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final enum BufferOverflow extends java.lang.Enum<kotlinx.coroutines.channels.BufferOverflow> {
    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $VALUES = null;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_LATEST = null;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_OLDEST = null;
    public static final kotlinx.coroutines.channels.BufferOverflow SUSPEND = null;

    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $values() {
            r0 = 3
            kotlinx.coroutines.channels.BufferOverflow[] r0 = new kotlinx.coroutines.channels.BufferOverflow[r0]
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "SUSPEND"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.SUSPEND = r0
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "DROP_OLDEST"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST = r0
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "DROP_LATEST"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST = r0
            kotlinx.coroutines.channels.BufferOverflow[] r0 = $values()
            kotlinx.coroutines.channels.BufferOverflow.$VALUES = r0
            return
    }

    private BufferOverflow(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.channels.BufferOverflow valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.channels.BufferOverflow> r0 = kotlinx.coroutines.channels.BufferOverflow.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.channels.BufferOverflow r1 = (kotlinx.coroutines.channels.BufferOverflow) r1
            return r1
    }

    public static kotlinx.coroutines.channels.BufferOverflow[] values() {
            kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.channels.BufferOverflow[] r0 = (kotlinx.coroutines.channels.BufferOverflow[]) r0
            return r0
    }
}
