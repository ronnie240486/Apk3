package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.WorkerThread
public interface WritableDownloadIndex extends com.google.android.exoplayer2.offline.DownloadIndex {
    void putDownload(com.google.android.exoplayer2.offline.Download r1) throws java.io.IOException;

    void removeDownload(java.lang.String r1) throws java.io.IOException;

    void setDownloadingStatesToQueued() throws java.io.IOException;

    void setStatesToRemoving() throws java.io.IOException;

    void setStopReason(int r1) throws java.io.IOException;

    void setStopReason(java.lang.String r1, int r2) throws java.io.IOException;
}
