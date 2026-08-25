package kotlin.concurrent;

/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\b\u001a6\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"read", "T", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "Ljava/util/concurrent/locks/Lock;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "LocksKt")
public final class LocksKt {
    @kotlin.internal.InlineOnly
    private static final <T> T read(java.util.concurrent.locks.ReentrantReadWriteLock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        L20:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T withLock(java.util.concurrent.locks.Lock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T write(java.util.concurrent.locks.ReentrantReadWriteLock r4, kotlin.jvm.functions.Function0<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = r4.getReadHoldCount()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r3 = 0
        L1c:
            if (r3 >= r1) goto L24
            r0.unlock()
            int r3 = r3 + 1
            goto L1c
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L42
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
        L33:
            if (r2 >= r1) goto L3b
            r0.lock()
            int r2 = r2 + 1
            goto L33
        L3b:
            r4.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r5
        L42:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
        L46:
            if (r2 >= r1) goto L4e
            r0.lock()
            int r2 = r2 + 1
            goto L46
        L4e:
            r4.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r5
    }
}
