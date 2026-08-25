package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "threadLocal", "Ljava/lang/ThreadLocal;", "(Ljava/lang/ThreadLocal;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.PublishedApi
public final class ThreadLocalKey implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.internal.ThreadLocalElement<?>> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<?> threadLocal;

    public ThreadLocalKey(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r1) {
            r0 = this;
            r0.<init>()
            r0.threadLocal = r1
            return
    }

    private final java.lang.ThreadLocal<?> component1() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.threadLocal
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.internal.ThreadLocalKey copy$default(kotlinx.coroutines.internal.ThreadLocalKey r0, java.lang.ThreadLocal r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.ThreadLocal<?> r1 = r0.threadLocal
        L6:
            kotlinx.coroutines.internal.ThreadLocalKey r0 = r0.copy(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.ThreadLocalKey copy(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r2) {
            r1 = this;
            kotlinx.coroutines.internal.ThreadLocalKey r0 = new kotlinx.coroutines.internal.ThreadLocalKey
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlinx.coroutines.internal.ThreadLocalKey
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.internal.ThreadLocalKey r4 = (kotlinx.coroutines.internal.ThreadLocalKey) r4
            java.lang.ThreadLocal<?> r1 = r3.threadLocal
            java.lang.ThreadLocal<?> r4 = r4.threadLocal
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.threadLocal
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ThreadLocalKey(threadLocal="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.ThreadLocal<?> r1 = r2.threadLocal
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
