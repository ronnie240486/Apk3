package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u0007B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/selects/SeqNumber;", "<init>", "()V", "", "next", "()J", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SeqNumber {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater number$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long number;

    static {
            java.lang.Class<kotlinx.coroutines.selects.SeqNumber> r0 = kotlinx.coroutines.selects.SeqNumber.class
            java.lang.String r1 = "number"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.selects.SeqNumber.number$FU = r0
            return
    }

    public SeqNumber() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.number = r0
            return
    }

    public final long next() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.selects.SeqNumber.number$FU
            long r0 = r0.incrementAndGet(r2)
            return r0
    }
}
