package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface Supplier<T> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.base.ParametricNullness
    T get();
}
