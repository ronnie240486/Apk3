package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class Callables {



    /* JADX INFO: renamed from: com.google.common.util.concurrent.Callables$3, reason: invalid class name */
    class AnonymousClass3 implements java.util.concurrent.Callable<java.lang.Object> {
        public final /* synthetic */ java.util.concurrent.Callable val$callable;
        public final /* synthetic */ com.google.common.base.Supplier val$nameSupplier;

        public AnonymousClass3(com.google.common.base.Supplier r1, java.util.concurrent.Callable r2) {
                r0 = this;
                r0.val$nameSupplier = r1
                r0.val$callable = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        @com.google.common.util.concurrent.ParametricNullness
        public java.lang.Object call() throws java.lang.Exception {
                r4 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r1 = r0.getName()
                com.google.common.base.Supplier r2 = r4.val$nameSupplier
                java.lang.Object r2 = r2.get()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = com.google.common.util.concurrent.Callables.access$000(r2, r0)
                java.util.concurrent.Callable r3 = r4.val$callable     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L1f
                com.google.common.util.concurrent.Callables.access$000(r1, r0)
            L1f:
                return r3
            L20:
                r3 = move-exception
                if (r2 == 0) goto L26
                com.google.common.util.concurrent.Callables.access$000(r1, r0)
            L26:
                throw r3
        }
    }


    private Callables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$000(java.lang.String r0, java.lang.Thread r1) {
            boolean r0 = trySetName(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <T> com.google.common.util.concurrent.AsyncCallable<T> asAsyncCallable(java.util.concurrent.Callable<T> r1, com.google.common.util.concurrent.ListeningExecutorService r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.Callables$2 r0 = new com.google.common.util.concurrent.Callables$2
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<T> returning(@com.google.common.util.concurrent.ParametricNullness T r1) {
            com.google.common.util.concurrent.Callables$1 r0 = new com.google.common.util.concurrent.Callables$1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.lang.Runnable threadRenaming(java.lang.Runnable r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.Callables$4 r0 = new com.google.common.util.concurrent.Callables$4
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static boolean trySetName(java.lang.String r0, java.lang.Thread r1) {
            r1.setName(r0)     // Catch: java.lang.SecurityException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
