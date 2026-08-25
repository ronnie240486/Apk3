package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use Interners.new*Interner")
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Interner<E> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    E intern(E r1);
}
