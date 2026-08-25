package kotlinx.coroutines;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/YieldContext;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "()V", "dispatcherWasUnconfined", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.PublishedApi
public final class YieldContext extends kotlin.coroutines.AbstractCoroutineContextElement {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.YieldContext.Key Key = null;

    @kotlin.jvm.JvmField
    public boolean dispatcherWasUnconfined;

    /* JADX INFO: compiled from: Unconfined.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/YieldContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/YieldContext;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.YieldContext> {
        private Key() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.YieldContext$Key r0 = new kotlinx.coroutines.YieldContext$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.YieldContext.Key = r0
            return
    }

    public YieldContext() {
            r1 = this;
            kotlinx.coroutines.YieldContext$Key r0 = kotlinx.coroutines.YieldContext.Key
            r1.<init>(r0)
            return
    }
}
