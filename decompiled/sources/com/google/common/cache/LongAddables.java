package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
final class LongAddables {
    private static final com.google.common.base.Supplier<com.google.common.cache.LongAddable> SUPPLIER = null;



    public static final class PureJavaLongAddable extends java.util.concurrent.atomic.AtomicLong implements com.google.common.cache.LongAddable {
        private PureJavaLongAddable() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ PureJavaLongAddable(com.google.common.cache.LongAddables.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long r1) {
                r0 = this;
                r0.getAndAdd(r1)
                return
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
                r0 = this;
                r0.getAndIncrement()
                return
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }
    }

    static {
            com.google.common.cache.LongAdder r0 = new com.google.common.cache.LongAdder     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            com.google.common.cache.LongAddables$1 r0 = new com.google.common.cache.LongAddables$1     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            goto L10
        Lb:
            com.google.common.cache.LongAddables$2 r0 = new com.google.common.cache.LongAddables$2
            r0.<init>()
        L10:
            com.google.common.cache.LongAddables.SUPPLIER = r0
            return
    }

    public LongAddables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.cache.LongAddable create() {
            com.google.common.base.Supplier<com.google.common.cache.LongAddable> r0 = com.google.common.cache.LongAddables.SUPPLIER
            java.lang.Object r0 = r0.get()
            com.google.common.cache.LongAddable r0 = (com.google.common.cache.LongAddable) r0
            return r0
    }
}
