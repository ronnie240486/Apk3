package com.google.android.exoplayer2.util;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public interface ErrorMessageProvider<T extends java.lang.Throwable> {
    android.util.Pair<java.lang.Integer, java.lang.String> getErrorMessage(T r1);
}
