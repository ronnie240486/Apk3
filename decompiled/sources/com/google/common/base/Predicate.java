package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean apply(@com.google.common.base.ParametricNullness T r1);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);
}
