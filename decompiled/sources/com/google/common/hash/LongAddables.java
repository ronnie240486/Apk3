package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class LongAddables {
    private static final com.google.common.base.Supplier<com.google.common.hash.LongAddable> SUPPLIER = null;



    /* JADX INFO: loaded from: classes2.dex */
    public static final class PureJavaLongAddable extends java.util.concurrent.atomic.AtomicLong implements com.google.common.hash.LongAddable {
        private PureJavaLongAddable() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ PureJavaLongAddable(com.google.common.hash.LongAddables.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.hash.LongAddable
        public void add(long r1) {
                r0 = this;
                r0.getAndAdd(r1)
                return
        }

        @Override // com.google.common.hash.LongAddable
        public void increment() {
                r0 = this;
                r0.getAndIncrement()
                return
        }

        @Override // com.google.common.hash.LongAddable
        public long sum() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }
    }

    static {
            com.google.common.hash.LongAdder r0 = new com.google.common.hash.LongAdder     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            com.google.common.hash.LongAddables$1 r0 = new com.google.common.hash.LongAddables$1     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            goto L10
        Lb:
            com.google.common.hash.LongAddables$2 r0 = new com.google.common.hash.LongAddables$2
            r0.<init>()
        L10:
            com.google.common.hash.LongAddables.SUPPLIER = r0
            return
    }

    public LongAddables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.hash.LongAddable create() {
            com.google.common.base.Supplier<com.google.common.hash.LongAddable> r0 = com.google.common.hash.LongAddables.SUPPLIER
            java.lang.Object r0 = r0.get()
            com.google.common.hash.LongAddable r0 = (com.google.common.hash.LongAddable) r0
            return r0
    }
}
