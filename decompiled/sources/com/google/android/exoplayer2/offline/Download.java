package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    public final com.google.android.exoplayer2.offline.DownloadProgress progress;
    public final com.google.android.exoplayer2.offline.DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(com.google.android.exoplayer2.offline.DownloadRequest r13, int r14, long r15, long r17, long r19, int r21, int r22) {
            r12 = this;
            com.google.android.exoplayer2.offline.DownloadProgress r11 = new com.google.android.exoplayer2.offline.DownloadProgress
            r11.<init>()
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r7 = r19
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
            return
    }

    public Download(com.google.android.exoplayer2.offline.DownloadRequest r5, int r6, long r7, long r9, long r11, int r13, int r14, com.google.android.exoplayer2.offline.DownloadProgress r15) {
            r4 = this;
            r4.<init>()
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r15)
            r0 = 1
            r1 = 0
            if (r14 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r3 = 4
            if (r6 == r3) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            if (r13 == 0) goto L27
            r2 = 2
            if (r6 == r2) goto L23
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
        L27:
            r4.request = r5
            r4.state = r6
            r4.startTimeMs = r7
            r4.updateTimeMs = r9
            r4.contentLength = r11
            r4.stopReason = r13
            r4.failureReason = r14
            r4.progress = r15
            return
    }

    public long getBytesDownloaded() {
            r2 = this;
            com.google.android.exoplayer2.offline.DownloadProgress r0 = r2.progress
            long r0 = r0.bytesDownloaded
            return r0
    }

    public float getPercentDownloaded() {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadProgress r0 = r1.progress
            float r0 = r0.percentDownloaded
            return r0
    }

    public boolean isTerminalState() {
            r2 = this;
            int r0 = r2.state
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
