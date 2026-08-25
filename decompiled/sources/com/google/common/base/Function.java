package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.base.ParametricNullness
    T apply(@com.google.common.base.ParametricNullness F r1);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);
}
