package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.ObsoleteCoroutinesApi
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final enum TickerMode extends java.lang.Enum<kotlinx.coroutines.channels.TickerMode> {
    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $VALUES = null;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_DELAY = null;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_PERIOD = null;

    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $values() {
            r0 = 2
            kotlinx.coroutines.channels.TickerMode[] r0 = new kotlinx.coroutines.channels.TickerMode[r0]
            kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.channels.TickerMode r0 = new kotlinx.coroutines.channels.TickerMode
            java.lang.String r1 = "FIXED_PERIOD"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD = r0
            kotlinx.coroutines.channels.TickerMode r0 = new kotlinx.coroutines.channels.TickerMode
            java.lang.String r1 = "FIXED_DELAY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.TickerMode.FIXED_DELAY = r0
            kotlinx.coroutines.channels.TickerMode[] r0 = $values()
            kotlinx.coroutines.channels.TickerMode.$VALUES = r0
            return
    }

    private TickerMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.channels.TickerMode valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.channels.TickerMode> r0 = kotlinx.coroutines.channels.TickerMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.channels.TickerMode r1 = (kotlinx.coroutines.channels.TickerMode) r1
            return r1
    }

    public static kotlinx.coroutines.channels.TickerMode[] values() {
            kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.channels.TickerMode[] r0 = (kotlinx.coroutines.channels.TickerMode[]) r0
            return r0
    }
}
