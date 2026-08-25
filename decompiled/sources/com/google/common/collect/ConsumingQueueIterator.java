package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ConsumingQueueIterator<T> extends com.google.common.collect.AbstractIterator<T> {
    private final java.util.Queue<T> queue;

    public ConsumingQueueIterator(java.util.Queue<T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Queue r1 = (java.util.Queue) r1
            r0.queue = r1
            return
    }

    @Override // com.google.common.collect.AbstractIterator
    @javax.annotation.CheckForNull
    public T computeNext() {
            r1 = this;
            java.util.Queue<T> r0 = r1.queue
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            r1.endOfData()
            r0 = 0
            return r0
        Ld:
            java.util.Queue<T> r0 = r1.queue
            java.lang.Object r0 = r0.remove()
            return r0
    }
}
