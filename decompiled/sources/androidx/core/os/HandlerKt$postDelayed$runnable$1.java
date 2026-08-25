package androidx.core.os;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 7, 1}, xi = 176)
public final class HandlerKt$postDelayed$runnable$1 implements java.lang.Runnable {
    public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $action;

    public HandlerKt$postDelayed$runnable$1(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = this;
            r0.$action = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.$action
            r0.invoke()
            return
    }
}
