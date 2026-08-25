package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class FuturesGetChecked {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>> WITH_STRING_PARAM_FIRST = null;


    /* JADX INFO: loaded from: classes3.dex */
    @com.google.common.annotations.VisibleForTesting
    public interface GetCheckedTypeValidator {
        void validateClass(java.lang.Class<? extends java.lang.Exception> r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class GetCheckedTypeValidatorHolder {
        public static final com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator BEST_VALIDATOR = null;

        public static final enum WeakSetValidator extends java.lang.Enum<com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator> implements com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator {
            private static final /* synthetic */ com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator[] $VALUES = null;
            public static final com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator INSTANCE = null;
            private static final java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> validClasses = null;

            private static /* synthetic */ com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator[] $values() {
                    r0 = 1
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator[] r0 = new com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator[r0]
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator r1 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE
                    r2 = 0
                    r0[r2] = r1
                    return r0
            }

            static {
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator r0 = new com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE = r0
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator[] r0 = $values()
                    com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.$VALUES = r0
                    java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
                    r0.<init>()
                    com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.validClasses = r0
                    return
            }

            private WeakSetValidator(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator valueOf(java.lang.String r1) {
                    java.lang.Class<com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator> r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator r1 = (com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator) r1
                    return r1
            }

            public static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator[] values() {
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator[] r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator[] r0 = (com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator[]) r0
                    return r0
            }

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(java.lang.Class<? extends java.lang.Exception> r4) {
                    r3 = this;
                    java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.validClasses
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1d
                    java.lang.Object r1 = r0.next()
                    java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                    java.lang.Object r1 = r1.get()
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L6
                    return
                L1d:
                    com.google.common.util.concurrent.FuturesGetChecked.checkExceptionClassValidity(r4)
                    java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.validClasses
                    int r1 = r0.size()
                    r2 = 1000(0x3e8, float:1.401E-42)
                    if (r1 <= r2) goto L2d
                    r0.clear()
                L2d:
                    java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                    r1.<init>(r4)
                    r0.add(r1)
                    return
            }
        }

        static {
                int r0 = com.google.common.util.concurrent.FuturesGetChecked.$r8$clinit
                com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE
                com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.BEST_VALIDATOR = r0
                return
        }

        public GetCheckedTypeValidatorHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.util.concurrent.FuturesGetChecked$1 r1 = new com.google.common.util.concurrent.FuturesGetChecked$1
            r1.<init>()
            com.google.common.collect.Ordering r0 = r0.onResultOf(r1)
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.util.concurrent.FuturesGetChecked.WITH_STRING_PARAM_FIRST = r0
            return
    }

    private FuturesGetChecked() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator bestGetCheckedTypeValidator() {
            com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator r0 = com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.BEST_VALIDATOR
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    public static void checkExceptionClassValidity(java.lang.Class<? extends java.lang.Exception> r2) {
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            boolean r0 = r0.isAssignableFrom(r2)
            r0 = r0 ^ 1
            java.lang.String r1 = "Futures.getChecked exception type (%s) must not be a RuntimeException"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            boolean r0 = hasConstructorUsableByGetChecked(r2)
            java.lang.String r1 = "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> r1, java.lang.Class<X> r2) throws java.lang.Exception {
            com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidator r0 = bestGetCheckedTypeValidator()
            r0.validateClass(r2)
            java.lang.Object r1 = r1.get()     // Catch: java.util.concurrent.ExecutionException -> Lc java.lang.InterruptedException -> L1a
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            wrapAndThrowExceptionOrError(r1, r2)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1a:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.lang.Exception r1 = newWithCause(r2, r1)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> r1, java.lang.Class<X> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.Exception {
            com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidator r0 = bestGetCheckedTypeValidator()
            r0.validateClass(r2)
            java.lang.Object r1 = r1.get(r3, r5)     // Catch: java.util.concurrent.ExecutionException -> Lc java.util.concurrent.TimeoutException -> L1a java.lang.InterruptedException -> L20
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            wrapAndThrowExceptionOrError(r1, r2)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1a:
            r1 = move-exception
            java.lang.Exception r1 = newWithCause(r2, r1)
            throw r1
        L20:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            java.lang.Exception r1 = newWithCause(r2, r1)
            throw r1
    }

    private static boolean hasConstructorUsableByGetChecked(java.lang.Class<? extends java.lang.Exception> r1) {
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La
            r0.<init>()     // Catch: java.lang.Exception -> La
            newWithCause(r1, r0)     // Catch: java.lang.Exception -> La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @javax.annotation.CheckForNull
    private static <X> X newFromConstructor(java.lang.reflect.Constructor<X> r6, java.lang.Throwable r7) {
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r1 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
        L8:
            int r3 = r0.length
            r4 = 0
            if (r2 >= r3) goto L2b
            r3 = r0[r2]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            java.lang.String r3 = r7.toString()
            r1[r2] = r3
            goto L27
        L1d:
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L2a
            r1[r2] = r7
        L27:
            int r2 = r2 + 1
            goto L8
        L2a:
            return r4
        L2b:
            java.lang.Object r6 = r6.newInstance(r1)     // Catch: java.lang.Throwable -> L30
            return r6
        L30:
            return r4
    }

    private static <X extends java.lang.Exception> X newWithCause(java.lang.Class<X> r4, java.lang.Throwable r5) {
            java.lang.reflect.Constructor[] r0 = r4.getConstructors()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = preferringStrings(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Object r1 = newFromConstructor(r1, r5)
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r1 == 0) goto L10
            java.lang.Throwable r4 = r1.getCause()
            if (r4 != 0) goto L2d
            r1.initCause(r5)
        L2d:
            return r1
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            int r1 = r1 + 82
            java.lang.String r2 = "No appropriate constructor for exception of type "
            java.lang.String r3 = " in response to chained exception"
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r4, r3)
            r0.<init>(r4, r5)
            throw r0
    }

    private static <X extends java.lang.Exception> java.util.List<java.lang.reflect.Constructor<X>> preferringStrings(java.util.List<java.lang.reflect.Constructor<X>> r1) {
            com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>> r0 = com.google.common.util.concurrent.FuturesGetChecked.WITH_STRING_PARAM_FIRST
            java.util.List r1 = r0.sortedCopy(r1)
            return r1
    }

    private static <X extends java.lang.Exception> void wrapAndThrowExceptionOrError(java.lang.Throwable r1, java.lang.Class<X> r2) throws java.lang.Exception {
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 == 0) goto Le
            com.google.common.util.concurrent.UncheckedExecutionException r2 = new com.google.common.util.concurrent.UncheckedExecutionException
            r2.<init>(r1)
            throw r2
        Le:
            java.lang.Exception r1 = newWithCause(r2, r1)
            throw r1
        L13:
            com.google.common.util.concurrent.ExecutionError r2 = new com.google.common.util.concurrent.ExecutionError
            java.lang.Error r1 = (java.lang.Error) r1
            r2.<init>(r1)
            throw r2
    }
}
