package kotlinx.coroutines;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "", "parallelism", "limitedParallelism", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class MainCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    public MainCoroutineDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r1) {
            r0 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r1)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toStringInternalImpl()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L22:
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.String toStringInternalImpl() {
            r2 = this;
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            return r0
        L9:
            r1 = 0
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r2 != r0) goto L15
            java.lang.String r0 = "Dispatchers.Main.immediate"
            return r0
        L15:
            return r1
    }
}
