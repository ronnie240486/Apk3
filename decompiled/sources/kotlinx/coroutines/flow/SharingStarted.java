package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface SharingStarted {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.SharingStarted.Companion Companion = null;

    /* JADX INFO: compiled from: SharingStarted.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "()V", "Eagerly", "Lkotlinx/coroutines/flow/SharingStarted;", "getEagerly", "()Lkotlinx/coroutines/flow/SharingStarted;", "Lazily", "getLazily", "WhileSubscribed", "stopTimeoutMillis", "", "replayExpirationMillis", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ kotlinx.coroutines.flow.SharingStarted.Companion $$INSTANCE = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlinx.coroutines.flow.SharingStarted Eagerly = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlinx.coroutines.flow.SharingStarted Lazily = null;

        static {
                kotlinx.coroutines.flow.SharingStarted$Companion r0 = new kotlinx.coroutines.flow.SharingStarted$Companion
                r0.<init>()
                kotlinx.coroutines.flow.SharingStarted.Companion.$$INSTANCE = r0
                kotlinx.coroutines.flow.StartedEagerly r0 = new kotlinx.coroutines.flow.StartedEagerly
                r0.<init>()
                kotlinx.coroutines.flow.SharingStarted.Companion.Eagerly = r0
                kotlinx.coroutines.flow.StartedLazily r0 = new kotlinx.coroutines.flow.StartedLazily
                r0.<init>()
                kotlinx.coroutines.flow.SharingStarted.Companion.Lazily = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlinx.coroutines.flow.SharingStarted WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion r0, long r1, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L6
                r1 = 0
            L6:
                r5 = r5 & 2
                if (r5 == 0) goto Lf
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            Lf:
                kotlinx.coroutines.flow.SharingStarted r0 = r0.WhileSubscribed(r1, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.SharingStarted WhileSubscribed(long r2, long r4) {
                r1 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed
                r0.<init>(r2, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.SharingStarted getEagerly() {
                r1 = this;
                kotlinx.coroutines.flow.SharingStarted r0 = kotlinx.coroutines.flow.SharingStarted.Companion.Eagerly
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.SharingStarted getLazily() {
                r1 = this;
                kotlinx.coroutines.flow.SharingStarted r0 = kotlinx.coroutines.flow.SharingStarted.Companion.Lazily
                return r0
        }
    }

    static {
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.Companion.$$INSTANCE
            kotlinx.coroutines.flow.SharingStarted.Companion = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r1);
}
