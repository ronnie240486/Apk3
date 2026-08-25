package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public interface Bundleable {

    /* JADX INFO: loaded from: classes2.dex */
    public interface Creator<T extends com.google.android.exoplayer2.Bundleable> {
        T fromBundle(android.os.Bundle r1);
    }

    android.os.Bundle toBundle();
}
