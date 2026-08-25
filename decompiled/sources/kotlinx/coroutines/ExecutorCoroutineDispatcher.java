package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ExecutorCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher.Key Key = null;

    /* JADX INFO: compiled from: Executors.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.ExperimentalStdlibApi
    public static final class Key extends kotlin.coroutines.AbstractCoroutineContextKey<kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher> {


        private Key() {
                r2 = this;
                kotlinx.coroutines.CoroutineDispatcher$Key r0 = kotlinx.coroutines.CoroutineDispatcher.Key
                kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1 r1 = kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.AnonymousClass1.INSTANCE
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.ExecutorCoroutineDispatcher$Key r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcher$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.ExecutorCoroutineDispatcher.Key = r0
            return
    }

    public ExecutorCoroutineDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @org.jetbrains.annotations.NotNull
    public abstract java.util.concurrent.Executor getExecutor();
}
