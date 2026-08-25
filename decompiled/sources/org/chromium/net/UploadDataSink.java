package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UploadDataSink {
    public UploadDataSink() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onReadError(java.lang.Exception r1);

    public abstract void onReadSucceeded(boolean r1);

    public abstract void onRewindError(java.lang.Exception r1);

    public abstract void onRewindSucceeded();
}
