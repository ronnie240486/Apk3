package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.WorkerThread
public interface DownloadIndex {
    @androidx.annotation.Nullable
    com.google.android.exoplayer2.offline.Download getDownload(java.lang.String r1) throws java.io.IOException;

    com.google.android.exoplayer2.offline.DownloadCursor getDownloads(int... r1) throws java.io.IOException;
}
