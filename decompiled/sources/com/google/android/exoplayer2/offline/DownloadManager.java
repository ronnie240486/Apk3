package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final com.google.android.exoplayer2.scheduler.Requirements DEFAULT_REQUIREMENTS = null;
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final java.lang.String TAG = "DownloadManager";
    private int activeTaskCount;
    private final android.os.Handler applicationHandler;
    private final android.content.Context context;
    private final com.google.android.exoplayer2.offline.WritableDownloadIndex downloadIndex;
    private java.util.List<com.google.android.exoplayer2.offline.Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final com.google.android.exoplayer2.offline.DownloadManager.InternalHandler internalHandler;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager.Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener requirementsListener;
    private com.google.android.exoplayer2.scheduler.RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class DownloadUpdate {
        public final com.google.android.exoplayer2.offline.Download download;
        public final java.util.List<com.google.android.exoplayer2.offline.Download> downloads;

        @androidx.annotation.Nullable
        public final java.lang.Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(com.google.android.exoplayer2.offline.Download r1, boolean r2, java.util.List<com.google.android.exoplayer2.offline.Download> r3, @androidx.annotation.Nullable java.lang.Exception r4) {
                r0 = this;
                r0.<init>()
                r0.download = r1
                r0.isRemove = r2
                r0.downloads = r3
                r0.finalException = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class InternalHandler extends android.os.Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager.Task> activeTasks;
        private final com.google.android.exoplayer2.offline.WritableDownloadIndex downloadIndex;
        private final com.google.android.exoplayer2.offline.DownloaderFactory downloaderFactory;
        private final java.util.ArrayList<com.google.android.exoplayer2.offline.Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final android.os.Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final android.os.HandlerThread thread;

        /* JADX INFO: renamed from: $r8$lambda$OH12G4NteYquO91-EYFUVBFeiK8, reason: not valid java name */
        public static /* synthetic */ int m233$r8$lambda$OH12G4NteYquO91EYFUVBFeiK8(com.google.android.exoplayer2.offline.Download r0, com.google.android.exoplayer2.offline.Download r1) {
                int r0 = compareStartTimes(r0, r1)
                return r0
        }

        public InternalHandler(android.os.HandlerThread r2, com.google.android.exoplayer2.offline.WritableDownloadIndex r3, com.google.android.exoplayer2.offline.DownloaderFactory r4, android.os.Handler r5, int r6, int r7, boolean r8) {
                r1 = this;
                android.os.Looper r0 = r2.getLooper()
                r1.<init>(r0)
                r1.thread = r2
                r1.downloadIndex = r3
                r1.downloaderFactory = r4
                r1.mainHandler = r5
                r1.maxParallelDownloads = r6
                r1.minRetryCount = r7
                r1.downloadsPaused = r8
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.downloads = r2
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r1.activeTasks = r2
                return
        }

        private void addDownload(com.google.android.exoplayer2.offline.DownloadRequest r14, int r15) {
                r13 = this;
                java.lang.String r0 = r14.id
                r1 = 1
                com.google.android.exoplayer2.offline.Download r0 = r13.getDownload(r0, r1)
                long r7 = java.lang.System.currentTimeMillis()
                r2 = 0
                if (r0 == 0) goto L41
                int r3 = com.google.android.exoplayer2.offline.DownloadManager.DEFAULT_MAX_PARALLEL_DOWNLOADS
                int r3 = r0.state
                r4 = 5
                if (r3 == r4) goto L1f
                boolean r5 = r0.isTerminalState()
                if (r5 == 0) goto L1c
                goto L1f
            L1c:
                long r5 = r0.startTimeMs
                goto L20
            L1f:
                r5 = r7
            L20:
                r9 = 7
                if (r3 == r4) goto L2c
                if (r3 != r9) goto L26
                goto L2c
            L26:
                if (r15 == 0) goto L2a
                r4 = 1
                goto L2d
            L2a:
                r4 = 0
                goto L2d
            L2c:
                r4 = 7
            L2d:
                com.google.android.exoplayer2.offline.Download r1 = new com.google.android.exoplayer2.offline.Download
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r0.request
                com.google.android.exoplayer2.offline.DownloadRequest r3 = r0.copyWithMergedRequest(r14)
                r9 = -1
                r12 = 0
                r2 = r1
                r11 = r15
                r2.<init>(r3, r4, r5, r7, r9, r11, r12)
                r13.putDownload(r1)
                goto L55
            L41:
                com.google.android.exoplayer2.offline.Download r0 = new com.google.android.exoplayer2.offline.Download
                if (r15 == 0) goto L47
                r4 = 1
                goto L48
            L47:
                r4 = 0
            L48:
                r9 = -1
                r12 = 0
                r2 = r0
                r3 = r14
                r5 = r7
                r11 = r15
                r2.<init>(r3, r4, r5, r7, r9, r11, r12)
                r13.putDownload(r0)
            L55:
                r13.syncTasks()
                return
        }

        private boolean canDownloadsRun() {
                r1 = this;
                boolean r0 = r1.downloadsPaused
                if (r0 != 0) goto La
                int r0 = r1.notMetRequirements
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        private static int compareStartTimes(com.google.android.exoplayer2.offline.Download r2, com.google.android.exoplayer2.offline.Download r3) {
                long r0 = r2.startTimeMs
                long r2 = r3.startTimeMs
                int r2 = com.google.android.exoplayer2.util.Util.compareLong(r0, r2)
                return r2
        }

        private static com.google.android.exoplayer2.offline.Download copyDownloadWithState(com.google.android.exoplayer2.offline.Download r13, int r14, int r15) {
                com.google.android.exoplayer2.offline.Download r12 = new com.google.android.exoplayer2.offline.Download
                com.google.android.exoplayer2.offline.DownloadRequest r1 = r13.request
                long r3 = r13.startTimeMs
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = r13.contentLength
                com.google.android.exoplayer2.offline.DownloadProgress r11 = r13.progress
                r10 = 0
                r0 = r12
                r2 = r14
                r9 = r15
                r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
                return r12
        }

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.offline.Download getDownload(java.lang.String r3, boolean r4) {
                r2 = this;
                int r0 = r2.getDownloadIndex(r3)
                r1 = -1
                if (r0 == r1) goto L10
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r3 = r2.downloads
                java.lang.Object r3 = r3.get(r0)
                com.google.android.exoplayer2.offline.Download r3 = (com.google.android.exoplayer2.offline.Download) r3
                return r3
            L10:
                if (r4 == 0) goto L30
                com.google.android.exoplayer2.offline.WritableDownloadIndex r4 = r2.downloadIndex     // Catch: java.io.IOException -> L19
                com.google.android.exoplayer2.offline.Download r3 = r4.getDownload(r3)     // Catch: java.io.IOException -> L19
                return r3
            L19:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to load download: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "DownloadManager"
                com.google.android.exoplayer2.util.Log.e(r0, r3, r4)
            L30:
                r3 = 0
                return r3
        }

        private int getDownloadIndex(java.lang.String r3) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r2.downloads
                int r1 = r1.size()
                if (r0 >= r1) goto L1f
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r2.downloads
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.offline.Download r1 = (com.google.android.exoplayer2.offline.Download) r1
                com.google.android.exoplayer2.offline.DownloadRequest r1 = r1.request
                java.lang.String r1 = r1.id
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L1c
                return r0
            L1c:
                int r0 = r0 + 1
                goto L1
            L1f:
                r3 = -1
                return r3
        }

        private void initialize(int r6) {
                r5 = this;
                r5.notMetRequirements = r6
                r6 = 0
                r0 = 0
                com.google.android.exoplayer2.offline.WritableDownloadIndex r1 = r5.downloadIndex     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r1.setDownloadingStatesToQueued()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                com.google.android.exoplayer2.offline.WritableDownloadIndex r1 = r5.downloadIndex     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r2 = 5
                int[] r3 = new int[r2]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r3[r6] = r6     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r4 = 1
                r3[r4] = r4     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r4 = 2
                r3[r4] = r4     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r4 = 3
                r3[r4] = r2     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r2 = 4
                r4 = 7
                r3[r2] = r4     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                com.google.android.exoplayer2.offline.DownloadCursor r0 = r1.getDownloads(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            L21:
                boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                if (r1 == 0) goto L40
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r5.downloads     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                com.google.android.exoplayer2.offline.Download r2 = r0.getDownload()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                r1.add(r2)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
                goto L21
            L31:
                r6 = move-exception
                goto L57
            L33:
                r1 = move-exception
                java.lang.String r2 = "DownloadManager"
                java.lang.String r3 = "Failed to load index."
                com.google.android.exoplayer2.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L31
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r5.downloads     // Catch: java.lang.Throwable -> L31
                r1.clear()     // Catch: java.lang.Throwable -> L31
            L40:
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r5.downloads
                r0.<init>(r1)
                android.os.Handler r1 = r5.mainHandler
                android.os.Message r6 = r1.obtainMessage(r6, r0)
                r6.sendToTarget()
                r5.syncTasks()
                return
            L57:
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
                throw r6
        }

        private void onContentLengthChanged(com.google.android.exoplayer2.offline.DownloadManager.Task r15, long r16) {
                r14 = this;
                r0 = r14
                com.google.android.exoplayer2.offline.DownloadRequest r1 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$200(r15)
                java.lang.String r1 = r1.id
                r2 = 0
                com.google.android.exoplayer2.offline.Download r1 = r14.getDownload(r1, r2)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.offline.Download r1 = (com.google.android.exoplayer2.offline.Download) r1
                long r2 = r1.contentLength
                int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
                if (r4 == 0) goto L3a
                r2 = -1
                int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
                if (r4 != 0) goto L1f
                goto L3a
            L1f:
                com.google.android.exoplayer2.offline.Download r13 = new com.google.android.exoplayer2.offline.Download
                com.google.android.exoplayer2.offline.DownloadRequest r2 = r1.request
                int r3 = r1.state
                long r4 = r1.startTimeMs
                long r6 = java.lang.System.currentTimeMillis()
                int r10 = r1.stopReason
                int r11 = r1.failureReason
                com.google.android.exoplayer2.offline.DownloadProgress r12 = r1.progress
                r1 = r13
                r8 = r16
                r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12)
                r14.putDownload(r13)
            L3a:
                return
        }

        private void onDownloadTaskStopped(com.google.android.exoplayer2.offline.Download r17, @androidx.annotation.Nullable java.lang.Exception r18) {
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                com.google.android.exoplayer2.offline.Download r15 = new com.google.android.exoplayer2.offline.Download
                com.google.android.exoplayer2.offline.DownloadRequest r4 = r0.request
                if (r2 != 0) goto Lf
                r3 = 3
                r5 = 3
                goto L11
            Lf:
                r3 = 4
                r5 = 4
            L11:
                long r6 = r0.startTimeMs
                long r8 = java.lang.System.currentTimeMillis()
                long r10 = r0.contentLength
                int r12 = r0.stopReason
                r14 = 0
                if (r2 != 0) goto L20
                r13 = 0
                goto L22
            L20:
                r3 = 1
                r13 = 1
            L22:
                com.google.android.exoplayer2.offline.DownloadProgress r0 = r0.progress
                r3 = r15
                r14 = r0
                r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14)
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r0 = r1.downloads
                com.google.android.exoplayer2.offline.DownloadRequest r3 = r15.request
                java.lang.String r3 = r3.id
                int r3 = r1.getDownloadIndex(r3)
                r0.remove(r3)
                com.google.android.exoplayer2.offline.WritableDownloadIndex r0 = r1.downloadIndex     // Catch: java.io.IOException -> L3c
                r0.putDownload(r15)     // Catch: java.io.IOException -> L3c
                goto L44
            L3c:
                r0 = move-exception
                java.lang.String r3 = "DownloadManager"
                java.lang.String r4 = "Failed to update index."
                com.google.android.exoplayer2.util.Log.e(r3, r4, r0)
            L44:
                com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate r0 = new com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r4 = r1.downloads
                r3.<init>(r4)
                r4 = 0
                r0.<init>(r15, r4, r3, r2)
                android.os.Handler r2 = r1.mainHandler
                r3 = 2
                android.os.Message r0 = r2.obtainMessage(r3, r0)
                r0.sendToTarget()
                return
        }

        private void onRemoveTaskStopped(com.google.android.exoplayer2.offline.Download r5) {
                r4 = this;
                int r0 = r5.state
                r1 = 1
                r2 = 7
                if (r0 != r2) goto L12
                int r0 = r5.stopReason
                if (r0 != 0) goto Lb
                r1 = 0
            Lb:
                r4.putDownloadWithState(r5, r1, r0)
                r4.syncTasks()
                goto L47
            L12:
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r5.request
                java.lang.String r0 = r0.id
                int r0 = r4.getDownloadIndex(r0)
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r2 = r4.downloads
                r2.remove(r0)
                com.google.android.exoplayer2.offline.WritableDownloadIndex r0 = r4.downloadIndex     // Catch: java.io.IOException -> L29
                com.google.android.exoplayer2.offline.DownloadRequest r2 = r5.request     // Catch: java.io.IOException -> L29
                java.lang.String r2 = r2.id     // Catch: java.io.IOException -> L29
                r0.removeDownload(r2)     // Catch: java.io.IOException -> L29
                goto L30
            L29:
                java.lang.String r0 = "DownloadManager"
                java.lang.String r2 = "Failed to remove from database"
                com.google.android.exoplayer2.util.Log.e(r0, r2)
            L30:
                com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate r0 = new com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r3 = r4.downloads
                r2.<init>(r3)
                r3 = 0
                r0.<init>(r5, r1, r2, r3)
                android.os.Handler r5 = r4.mainHandler
                r1 = 2
                android.os.Message r5 = r5.obtainMessage(r1, r0)
                r5.sendToTarget()
            L47:
                return
        }

        private void onTaskStopped(com.google.android.exoplayer2.offline.DownloadManager.Task r6) {
                r5 = this;
                com.google.android.exoplayer2.offline.DownloadRequest r0 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$200(r6)
                java.lang.String r0 = r0.id
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r1 = r5.activeTasks
                r1.remove(r0)
                boolean r1 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r6)
                r2 = 0
                if (r1 == 0) goto L15
                r5.hasActiveRemoveTask = r2
                goto L22
            L15:
                int r3 = r5.activeDownloadTaskCount
                int r3 = r3 + (-1)
                r5.activeDownloadTaskCount = r3
                if (r3 != 0) goto L22
                r3 = 11
                r5.removeMessages(r3)
            L22:
                boolean r3 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$300(r6)
                if (r3 == 0) goto L2c
                r5.syncTasks()
                return
            L2c:
                java.lang.Exception r3 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$400(r6)
                if (r3 == 0) goto L50
                java.lang.String r4 = "Task failed: "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                com.google.android.exoplayer2.offline.DownloadRequest r6 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$200(r6)
                r4.append(r6)
                java.lang.String r6 = ", "
                r4.append(r6)
                r4.append(r1)
                java.lang.String r6 = r4.toString()
                java.lang.String r4 = "DownloadManager"
                com.google.android.exoplayer2.util.Log.e(r4, r6, r3)
            L50:
                com.google.android.exoplayer2.offline.Download r6 = r5.getDownload(r0, r2)
                java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
                com.google.android.exoplayer2.offline.Download r6 = (com.google.android.exoplayer2.offline.Download) r6
                int r0 = r6.state
                r2 = 2
                if (r0 == r2) goto L73
                r2 = 5
                if (r0 == r2) goto L6c
                r2 = 7
                if (r0 != r2) goto L66
                goto L6c
            L66:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>()
                throw r6
            L6c:
                com.google.android.exoplayer2.util.Assertions.checkState(r1)
                r5.onRemoveTaskStopped(r6)
                goto L7b
            L73:
                r0 = r1 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r5.onDownloadTaskStopped(r6, r3)
            L7b:
                r5.syncTasks()
                return
        }

        private com.google.android.exoplayer2.offline.Download putDownload(com.google.android.exoplayer2.offline.Download r9) {
                r8 = this;
                int r0 = r9.state
                r1 = 1
                r2 = 0
                r3 = 3
                if (r0 == r3) goto Lc
                r3 = 4
                if (r0 == r3) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r9.request
                java.lang.String r0 = r0.id
                int r0 = r8.getDownloadIndex(r0)
                r3 = -1
                if (r0 != r3) goto L28
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r0 = r8.downloads
                r0.add(r9)
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r0 = r8.downloads
                com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0.INSTANCE
                java.util.Collections.sort(r0, r1)
                goto L48
            L28:
                long r3 = r9.startTimeMs
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r5 = r8.downloads
                java.lang.Object r5 = r5.get(r0)
                com.google.android.exoplayer2.offline.Download r5 = (com.google.android.exoplayer2.offline.Download) r5
                long r5 = r5.startTimeMs
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L39
                goto L3a
            L39:
                r1 = 0
            L3a:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r3 = r8.downloads
                r3.set(r0, r9)
                if (r1 == 0) goto L48
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r0 = r8.downloads
                com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0.INSTANCE$1
                java.util.Collections.sort(r0, r1)
            L48:
                com.google.android.exoplayer2.offline.WritableDownloadIndex r0 = r8.downloadIndex     // Catch: java.io.IOException -> L4e
                r0.putDownload(r9)     // Catch: java.io.IOException -> L4e
                goto L56
            L4e:
                r0 = move-exception
                java.lang.String r1 = "DownloadManager"
                java.lang.String r3 = "Failed to update index."
                com.google.android.exoplayer2.util.Log.e(r1, r3, r0)
            L56:
                com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate r0 = new com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r3 = r8.downloads
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r9, r2, r1, r3)
                android.os.Handler r1 = r8.mainHandler
                r2 = 2
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                return r9
        }

        private com.google.android.exoplayer2.offline.Download putDownloadWithState(com.google.android.exoplayer2.offline.Download r2, int r3, int r4) {
                r1 = this;
                r0 = 3
                if (r3 == r0) goto L8
                r0 = 4
                if (r3 == r0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.offline.Download r2 = copyDownloadWithState(r2, r3, r4)
                com.google.android.exoplayer2.offline.Download r2 = r1.putDownload(r2)
                return r2
        }

        private void release() {
                r4 = this;
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r0 = r4.activeTasks
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                r2 = 1
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.offline.DownloadManager$Task r1 = (com.google.android.exoplayer2.offline.DownloadManager.Task) r1
                r1.cancel(r2)
                goto La
            L1b:
                com.google.android.exoplayer2.offline.WritableDownloadIndex r0 = r4.downloadIndex     // Catch: java.io.IOException -> L21
                r0.setDownloadingStatesToQueued()     // Catch: java.io.IOException -> L21
                goto L29
            L21:
                r0 = move-exception
                java.lang.String r1 = "DownloadManager"
                java.lang.String r3 = "Failed to update index."
                com.google.android.exoplayer2.util.Log.e(r1, r3, r0)
            L29:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r0 = r4.downloads
                r0.clear()
                android.os.HandlerThread r0 = r4.thread
                r0.quit()
                monitor-enter(r4)
                r4.released = r2     // Catch: java.lang.Throwable -> L3b
                r4.notifyAll()     // Catch: java.lang.Throwable -> L3b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
                return
            L3b:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
                throw r0
        }

        private void removeAllDownloads() {
                r8 = this;
                java.lang.String r0 = "DownloadManager"
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2 = 2
                r3 = 0
                com.google.android.exoplayer2.offline.WritableDownloadIndex r4 = r8.downloadIndex     // Catch: java.io.IOException -> L36
                int[] r5 = new int[r2]     // Catch: java.io.IOException -> L36
                r6 = 3
                r5[r3] = r6     // Catch: java.io.IOException -> L36
                r6 = 4
                r7 = 1
                r5[r7] = r6     // Catch: java.io.IOException -> L36
                com.google.android.exoplayer2.offline.DownloadCursor r4 = r4.getDownloads(r5)     // Catch: java.io.IOException -> L36
            L18:
                boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L2a
                if (r5 == 0) goto L26
                com.google.android.exoplayer2.offline.Download r5 = r4.getDownload()     // Catch: java.lang.Throwable -> L2a
                r1.add(r5)     // Catch: java.lang.Throwable -> L2a
                goto L18
            L26:
                r4.close()     // Catch: java.io.IOException -> L36
                goto L3b
            L2a:
                r5 = move-exception
                if (r4 == 0) goto L35
                r4.close()     // Catch: java.lang.Throwable -> L31
                goto L35
            L31:
                r4 = move-exception
                r5.addSuppressed(r4)     // Catch: java.io.IOException -> L36
            L35:
                throw r5     // Catch: java.io.IOException -> L36
            L36:
                java.lang.String r4 = "Failed to load downloads."
                com.google.android.exoplayer2.util.Log.e(r0, r4)
            L3b:
                r4 = 0
            L3c:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r5 = r8.downloads
                int r5 = r5.size()
                r6 = 5
                if (r4 >= r5) goto L57
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r5 = r8.downloads
                java.lang.Object r7 = r5.get(r4)
                com.google.android.exoplayer2.offline.Download r7 = (com.google.android.exoplayer2.offline.Download) r7
                com.google.android.exoplayer2.offline.Download r6 = copyDownloadWithState(r7, r6, r3)
                r5.set(r4, r6)
                int r4 = r4 + 1
                goto L3c
            L57:
                r4 = 0
            L58:
                int r5 = r1.size()
                if (r4 >= r5) goto L70
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r5 = r8.downloads
                java.lang.Object r7 = r1.get(r4)
                com.google.android.exoplayer2.offline.Download r7 = (com.google.android.exoplayer2.offline.Download) r7
                com.google.android.exoplayer2.offline.Download r7 = copyDownloadWithState(r7, r6, r3)
                r5.add(r7)
                int r4 = r4 + 1
                goto L58
            L70:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r8.downloads
                com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0 r4 = com.google.android.exoplayer2.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0.INSTANCE$2
                java.util.Collections.sort(r1, r4)
                com.google.android.exoplayer2.offline.WritableDownloadIndex r1 = r8.downloadIndex     // Catch: java.io.IOException -> L7d
                r1.setStatesToRemoving()     // Catch: java.io.IOException -> L7d
                goto L83
            L7d:
                r1 = move-exception
                java.lang.String r4 = "Failed to update index."
                com.google.android.exoplayer2.util.Log.e(r0, r4, r1)
            L83:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r8.downloads
                r0.<init>(r1)
                r1 = 0
            L8b:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r4 = r8.downloads
                int r4 = r4.size()
                if (r1 >= r4) goto Lad
                com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate r4 = new com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r5 = r8.downloads
                java.lang.Object r5 = r5.get(r1)
                com.google.android.exoplayer2.offline.Download r5 = (com.google.android.exoplayer2.offline.Download) r5
                r6 = 0
                r4.<init>(r5, r3, r0, r6)
                android.os.Handler r5 = r8.mainHandler
                android.os.Message r4 = r5.obtainMessage(r2, r4)
                r4.sendToTarget()
                int r1 = r1 + 1
                goto L8b
            Lad:
                r8.syncTasks()
                return
        }

        private void removeDownload(java.lang.String r3) {
                r2 = this;
                r0 = 1
                com.google.android.exoplayer2.offline.Download r0 = r2.getDownload(r3, r0)
                if (r0 != 0) goto L1e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to remove nonexistent download: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "DownloadManager"
                com.google.android.exoplayer2.util.Log.e(r0, r3)
                return
            L1e:
                r3 = 5
                r1 = 0
                r2.putDownloadWithState(r0, r3, r1)
                r2.syncTasks()
                return
        }

        private void setDownloadsPaused(boolean r1) {
                r0 = this;
                r0.downloadsPaused = r1
                r0.syncTasks()
                return
        }

        private void setMaxParallelDownloads(int r1) {
                r0 = this;
                r0.maxParallelDownloads = r1
                r0.syncTasks()
                return
        }

        private void setMinRetryCount(int r1) {
                r0 = this;
                r0.minRetryCount = r1
                return
        }

        private void setNotMetRequirements(int r1) {
                r0 = this;
                r0.notMetRequirements = r1
                r0.syncTasks()
                return
        }

        private void setStopReason(com.google.android.exoplayer2.offline.Download r15, int r16) {
                r14 = this;
                r0 = r14
                r1 = r15
                r10 = r16
                r2 = 1
                if (r10 != 0) goto L10
                int r3 = r1.state
                if (r3 != r2) goto L34
                r2 = 0
                r14.putDownloadWithState(r15, r2, r2)
                goto L34
            L10:
                int r3 = r1.stopReason
                if (r10 == r3) goto L34
                int r3 = r1.state
                if (r3 == 0) goto L1b
                r4 = 2
                if (r3 != r4) goto L1c
            L1b:
                r3 = 1
            L1c:
                com.google.android.exoplayer2.offline.Download r13 = new com.google.android.exoplayer2.offline.Download
                com.google.android.exoplayer2.offline.DownloadRequest r2 = r1.request
                long r4 = r1.startTimeMs
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.contentLength
                r11 = 0
                com.google.android.exoplayer2.offline.DownloadProgress r12 = r1.progress
                r1 = r13
                r10 = r16
                r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12)
                r14.putDownload(r13)
            L34:
                return
        }

        private void setStopReason(@androidx.annotation.Nullable java.lang.String r4, int r5) {
                r3 = this;
                java.lang.String r0 = "DownloadManager"
                r1 = 0
                if (r4 != 0) goto L28
            L5:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r4 = r3.downloads
                int r4 = r4.size()
                if (r1 >= r4) goto L1b
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r4 = r3.downloads
                java.lang.Object r4 = r4.get(r1)
                com.google.android.exoplayer2.offline.Download r4 = (com.google.android.exoplayer2.offline.Download) r4
                r3.setStopReason(r4, r5)
                int r1 = r1 + 1
                goto L5
            L1b:
                com.google.android.exoplayer2.offline.WritableDownloadIndex r4 = r3.downloadIndex     // Catch: java.io.IOException -> L21
                r4.setStopReason(r5)     // Catch: java.io.IOException -> L21
                goto L4d
            L21:
                r4 = move-exception
                java.lang.String r5 = "Failed to set manual stop reason"
                com.google.android.exoplayer2.util.Log.e(r0, r5, r4)
                goto L4d
            L28:
                com.google.android.exoplayer2.offline.Download r1 = r3.getDownload(r4, r1)
                if (r1 == 0) goto L32
                r3.setStopReason(r1, r5)
                goto L4d
            L32:
                com.google.android.exoplayer2.offline.WritableDownloadIndex r1 = r3.downloadIndex     // Catch: java.io.IOException -> L38
                r1.setStopReason(r4, r5)     // Catch: java.io.IOException -> L38
                goto L4d
            L38:
                r5 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to set manual stop reason: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.google.android.exoplayer2.util.Log.e(r0, r4, r5)
            L4d:
                r3.syncTasks()
                return
        }

        private void syncDownloadingDownload(com.google.android.exoplayer2.offline.DownloadManager.Task r2, com.google.android.exoplayer2.offline.Download r3, int r4) {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r2)
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                boolean r0 = r1.canDownloadsRun()
                if (r0 == 0) goto L13
                int r0 = r1.maxParallelDownloads
                if (r4 < r0) goto L1a
            L13:
                r4 = 0
                r1.putDownloadWithState(r3, r4, r4)
                r2.cancel(r4)
            L1a:
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.CheckResult
        private com.google.android.exoplayer2.offline.DownloadManager.Task syncQueuedDownload(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.DownloadManager.Task r10, com.google.android.exoplayer2.offline.Download r11) {
                r9 = this;
                r0 = 0
                if (r10 == 0) goto L10
                boolean r11 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r10)
                r11 = r11 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r11)
                r10.cancel(r0)
                return r10
            L10:
                boolean r10 = r9.canDownloadsRun()
                if (r10 == 0) goto L55
                int r10 = r9.activeDownloadTaskCount
                int r1 = r9.maxParallelDownloads
                if (r10 < r1) goto L1d
                goto L55
            L1d:
                r10 = 2
                com.google.android.exoplayer2.offline.Download r10 = r9.putDownloadWithState(r11, r10, r0)
                com.google.android.exoplayer2.offline.DownloaderFactory r11 = r9.downloaderFactory
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r10.request
                com.google.android.exoplayer2.offline.Downloader r3 = r11.createDownloader(r0)
                com.google.android.exoplayer2.offline.DownloadManager$Task r11 = new com.google.android.exoplayer2.offline.DownloadManager$Task
                com.google.android.exoplayer2.offline.DownloadRequest r2 = r10.request
                com.google.android.exoplayer2.offline.DownloadProgress r4 = r10.progress
                r5 = 0
                int r6 = r9.minRetryCount
                r8 = 0
                r1 = r11
                r7 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r0 = r9.activeTasks
                com.google.android.exoplayer2.offline.DownloadRequest r10 = r10.request
                java.lang.String r10 = r10.id
                r0.put(r10, r11)
                int r10 = r9.activeDownloadTaskCount
                int r0 = r10 + 1
                r9.activeDownloadTaskCount = r0
                if (r10 != 0) goto L51
                r10 = 11
                r0 = 5000(0x1388, double:2.4703E-320)
                r9.sendEmptyMessageDelayed(r10, r0)
            L51:
                r11.start()
                return r11
            L55:
                r10 = 0
                return r10
        }

        private void syncRemovingDownload(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.DownloadManager.Task r10, com.google.android.exoplayer2.offline.Download r11) {
                r9 = this;
                if (r10 == 0) goto Ld
                boolean r11 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r10)
                if (r11 != 0) goto Lc
                r11 = 0
                r10.cancel(r11)
            Lc:
                return
            Ld:
                boolean r10 = r9.hasActiveRemoveTask
                if (r10 == 0) goto L12
                return
            L12:
                com.google.android.exoplayer2.offline.DownloaderFactory r10 = r9.downloaderFactory
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r11.request
                com.google.android.exoplayer2.offline.Downloader r3 = r10.createDownloader(r0)
                com.google.android.exoplayer2.offline.DownloadManager$Task r10 = new com.google.android.exoplayer2.offline.DownloadManager$Task
                com.google.android.exoplayer2.offline.DownloadRequest r2 = r11.request
                com.google.android.exoplayer2.offline.DownloadProgress r4 = r11.progress
                r5 = 1
                int r6 = r9.minRetryCount
                r8 = 0
                r1 = r10
                r7 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r0 = r9.activeTasks
                com.google.android.exoplayer2.offline.DownloadRequest r11 = r11.request
                java.lang.String r11 = r11.id
                r0.put(r11, r10)
                r11 = 1
                r9.hasActiveRemoveTask = r11
                r10.start()
                return
        }

        private void syncStoppedDownload(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.DownloadManager.Task r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                boolean r0 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r2)
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r0 = 0
                r2.cancel(r0)
            Lf:
                return
        }

        private void syncTasks() {
                r6 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r2 = r6.downloads
                int r2 = r2.size()
                if (r0 >= r2) goto L55
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r2 = r6.downloads
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.offline.Download r2 = (com.google.android.exoplayer2.offline.Download) r2
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r3 = r6.activeTasks
                com.google.android.exoplayer2.offline.DownloadRequest r4 = r2.request
                java.lang.String r4 = r4.id
                java.lang.Object r3 = r3.get(r4)
                com.google.android.exoplayer2.offline.DownloadManager$Task r3 = (com.google.android.exoplayer2.offline.DownloadManager.Task) r3
                int r4 = r2.state
                if (r4 == 0) goto L44
                r5 = 1
                if (r4 == r5) goto L40
                r5 = 2
                if (r4 == r5) goto L39
                r5 = 5
                if (r4 == r5) goto L35
                r5 = 7
                if (r4 != r5) goto L2f
                goto L35
            L2f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            L35:
                r6.syncRemovingDownload(r3, r2)
                goto L48
            L39:
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                r6.syncDownloadingDownload(r3, r2, r1)
                goto L48
            L40:
                r6.syncStoppedDownload(r3)
                goto L48
            L44:
                com.google.android.exoplayer2.offline.DownloadManager$Task r3 = r6.syncQueuedDownload(r3, r2)
            L48:
                if (r3 == 0) goto L52
                boolean r2 = com.google.android.exoplayer2.offline.DownloadManager.Task.access$000(r3)
                if (r2 != 0) goto L52
                int r1 = r1 + 1
            L52:
                int r0 = r0 + 1
                goto L2
            L55:
                return
        }

        private void updateProgress() {
                r4 = this;
                r0 = 0
            L1:
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r4.downloads
                int r1 = r1.size()
                if (r0 >= r1) goto L27
                java.util.ArrayList<com.google.android.exoplayer2.offline.Download> r1 = r4.downloads
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.offline.Download r1 = (com.google.android.exoplayer2.offline.Download) r1
                int r2 = r1.state
                r3 = 2
                if (r2 != r3) goto L24
                com.google.android.exoplayer2.offline.WritableDownloadIndex r2 = r4.downloadIndex     // Catch: java.io.IOException -> L1c
                r2.putDownload(r1)     // Catch: java.io.IOException -> L1c
                goto L24
            L1c:
                r1 = move-exception
                java.lang.String r2 = "DownloadManager"
                java.lang.String r3 = "Failed to update index."
                com.google.android.exoplayer2.util.Log.e(r2, r3, r1)
            L24:
                int r0 = r0 + 1
                goto L1
            L27:
                r0 = 11
                r1 = 5000(0x1388, double:2.4703E-320)
                r4.sendEmptyMessageDelayed(r0, r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 0
                r2 = 1
                switch(r0) {
                    case 0: goto L68;
                    case 1: goto L5f;
                    case 2: goto L59;
                    case 3: goto L4f;
                    case 4: goto L49;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L31;
                    case 8: goto L2d;
                    case 9: goto L25;
                    case 10: goto L15;
                    case 11: goto L11;
                    case 12: goto Ld;
                    default: goto L7;
                }
            L7:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                r4.<init>()
                throw r4
            Ld:
                r3.release()
                return
            L11:
                r3.updateProgress()
                return
            L15:
                java.lang.Object r0 = r4.obj
                com.google.android.exoplayer2.offline.DownloadManager$Task r0 = (com.google.android.exoplayer2.offline.DownloadManager.Task) r0
                int r1 = r4.arg1
                int r4 = r4.arg2
                long r1 = com.google.android.exoplayer2.util.Util.toLong(r1, r4)
                r3.onContentLengthChanged(r0, r1)
                return
            L25:
                java.lang.Object r4 = r4.obj
                com.google.android.exoplayer2.offline.DownloadManager$Task r4 = (com.google.android.exoplayer2.offline.DownloadManager.Task) r4
                r3.onTaskStopped(r4)
                goto L6e
            L2d:
                r3.removeAllDownloads()
                goto L6d
            L31:
                java.lang.Object r4 = r4.obj
                java.lang.String r4 = (java.lang.String) r4
                r3.removeDownload(r4)
                goto L6d
            L39:
                java.lang.Object r0 = r4.obj
                com.google.android.exoplayer2.offline.DownloadRequest r0 = (com.google.android.exoplayer2.offline.DownloadRequest) r0
                int r4 = r4.arg1
                r3.addDownload(r0, r4)
                goto L6d
            L43:
                int r4 = r4.arg1
                r3.setMinRetryCount(r4)
                goto L6d
            L49:
                int r4 = r4.arg1
                r3.setMaxParallelDownloads(r4)
                goto L6d
            L4f:
                java.lang.Object r0 = r4.obj
                java.lang.String r0 = (java.lang.String) r0
                int r4 = r4.arg1
                r3.setStopReason(r0, r4)
                goto L6d
            L59:
                int r4 = r4.arg1
                r3.setNotMetRequirements(r4)
                goto L6d
            L5f:
                int r4 = r4.arg1
                if (r4 == 0) goto L64
                r1 = 1
            L64:
                r3.setDownloadsPaused(r1)
                goto L6d
            L68:
                int r4 = r4.arg1
                r3.initialize(r4)
            L6d:
                r1 = 1
            L6e:
                android.os.Handler r4 = r3.mainHandler
                java.util.HashMap<java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$Task> r0 = r3.activeTasks
                int r0 = r0.size()
                android.os.Message r4 = r4.obtainMessage(r2, r1, r0)
                r4.sendToTarget()
                return
        }
    }

    public interface Listener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadManager$Listener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes.dex */
        public final /* synthetic */ class CC {
            public static void $default$onDownloadChanged(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2, @androidx.annotation.Nullable java.lang.Exception r3) {
                    return
            }

            public static void $default$onDownloadRemoved(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2) {
                    return
            }

            public static void $default$onDownloadsPausedChanged(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1, boolean r2) {
                    return
            }

            public static void $default$onIdle(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1) {
                    return
            }

            public static void $default$onInitialized(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1) {
                    return
            }

            public static void $default$onRequirementsStateChanged(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.scheduler.Requirements r2, int r3) {
                    return
            }

            public static void $default$onWaitingForRequirementsChanged(com.google.android.exoplayer2.offline.DownloadManager.Listener r0, com.google.android.exoplayer2.offline.DownloadManager r1, boolean r2) {
                    return
            }
        }

        void onDownloadChanged(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2, @androidx.annotation.Nullable java.lang.Exception r3);

        void onDownloadRemoved(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2);

        void onDownloadsPausedChanged(com.google.android.exoplayer2.offline.DownloadManager r1, boolean r2);

        void onIdle(com.google.android.exoplayer2.offline.DownloadManager r1);

        void onInitialized(com.google.android.exoplayer2.offline.DownloadManager r1);

        void onRequirementsStateChanged(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.scheduler.Requirements r2, int r3);

        void onWaitingForRequirementsChanged(com.google.android.exoplayer2.offline.DownloadManager r1, boolean r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Task extends java.lang.Thread implements com.google.android.exoplayer2.offline.Downloader.ProgressListener {
        private long contentLength;
        private final com.google.android.exoplayer2.offline.DownloadProgress downloadProgress;
        private final com.google.android.exoplayer2.offline.Downloader downloader;

        @androidx.annotation.Nullable
        private java.lang.Exception finalException;

        @androidx.annotation.Nullable
        private volatile com.google.android.exoplayer2.offline.DownloadManager.InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final com.google.android.exoplayer2.offline.DownloadRequest request;

        private Task(com.google.android.exoplayer2.offline.DownloadRequest r1, com.google.android.exoplayer2.offline.Downloader r2, com.google.android.exoplayer2.offline.DownloadProgress r3, boolean r4, int r5, com.google.android.exoplayer2.offline.DownloadManager.InternalHandler r6) {
                r0 = this;
                r0.<init>()
                r0.request = r1
                r0.downloader = r2
                r0.downloadProgress = r3
                r0.isRemove = r4
                r0.minRetryCount = r5
                r0.internalHandler = r6
                r1 = -1
                r0.contentLength = r1
                return
        }

        public /* synthetic */ Task(com.google.android.exoplayer2.offline.DownloadRequest r1, com.google.android.exoplayer2.offline.Downloader r2, com.google.android.exoplayer2.offline.DownloadProgress r3, boolean r4, int r5, com.google.android.exoplayer2.offline.DownloadManager.InternalHandler r6, com.google.android.exoplayer2.offline.DownloadManager.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public static /* synthetic */ boolean access$000(com.google.android.exoplayer2.offline.DownloadManager.Task r0) {
                boolean r0 = r0.isRemove
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.offline.DownloadRequest access$200(com.google.android.exoplayer2.offline.DownloadManager.Task r0) {
                com.google.android.exoplayer2.offline.DownloadRequest r0 = r0.request
                return r0
        }

        public static /* synthetic */ boolean access$300(com.google.android.exoplayer2.offline.DownloadManager.Task r0) {
                boolean r0 = r0.isCanceled
                return r0
        }

        public static /* synthetic */ java.lang.Exception access$400(com.google.android.exoplayer2.offline.DownloadManager.Task r0) {
                java.lang.Exception r0 = r0.finalException
                return r0
        }

        private static int getRetryDelayMillis(int r1) {
                int r1 = r1 + (-1)
                int r1 = r1 * 1000
                r0 = 5000(0x1388, float:7.006E-42)
                int r1 = java.lang.Math.min(r1, r0)
                return r1
        }

        public void cancel(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r1 = 0
                r0.internalHandler = r1
            L5:
                boolean r1 = r0.isCanceled
                if (r1 != 0) goto L14
                r1 = 1
                r0.isCanceled = r1
                com.google.android.exoplayer2.offline.Downloader r1 = r0.downloader
                r1.cancel()
                r0.interrupt()
            L14:
                return
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long r3, long r5, float r7) {
                r2 = this;
                com.google.android.exoplayer2.offline.DownloadProgress r0 = r2.downloadProgress
                r0.bytesDownloaded = r5
                com.google.android.exoplayer2.offline.DownloadProgress r5 = r2.downloadProgress
                r5.percentDownloaded = r7
                long r5 = r2.contentLength
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L23
                r2.contentLength = r3
                com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r5 = r2.internalHandler
                if (r5 == 0) goto L23
                r6 = 10
                r7 = 32
                long r0 = r3 >> r7
                int r7 = (int) r0
                int r4 = (int) r3
                android.os.Message r3 = r5.obtainMessage(r6, r7, r4, r2)
                r3.sendToTarget()
            L23:
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r8 = this;
                boolean r0 = r8.isRemove     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                if (r0 == 0) goto La
                com.google.android.exoplayer2.offline.Downloader r0 = r8.downloader     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                r0.remove()     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                goto L42
            La:
                r0 = -1
                r2 = 0
                r3 = 0
            Le:
                boolean r4 = r8.isCanceled     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                if (r4 != 0) goto L42
                com.google.android.exoplayer2.offline.Downloader r4 = r8.downloader     // Catch: java.io.IOException -> L18 java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                r4.download(r8)     // Catch: java.io.IOException -> L18 java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                goto L42
            L18:
                r4 = move-exception
                boolean r5 = r8.isCanceled     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                if (r5 != 0) goto Le
                com.google.android.exoplayer2.offline.DownloadProgress r5 = r8.downloadProgress     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                long r5 = r5.bytesDownloaded     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 == 0) goto L27
                r0 = r5
                r3 = 0
            L27:
                int r3 = r3 + 1
                int r5 = r8.minRetryCount     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                if (r3 > r5) goto L36
                int r4 = getRetryDelayMillis(r3)     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                long r4 = (long) r4     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                java.lang.Thread.sleep(r4)     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
                goto Le
            L36:
                throw r4     // Catch: java.lang.Exception -> L37 java.lang.InterruptedException -> L3b
            L37:
                r0 = move-exception
                r8.finalException = r0
                goto L42
            L3b:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r8.internalHandler
                if (r0 == 0) goto L4f
                r1 = 9
                android.os.Message r0 = r0.obtainMessage(r1, r8)
                r0.sendToTarget()
            L4f:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$9_Cit3svlv2xVuUzheKnCxLjKrE(com.google.android.exoplayer2.offline.DownloadManager r0, com.google.android.exoplayer2.scheduler.RequirementsWatcher r1, int r2) {
            r0.onRequirementsStateChanged(r1, r2)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$VH8vRSTYO69o4pUCxUdzDQ0ZEQ0(com.google.android.exoplayer2.offline.DownloadManager r0, android.os.Message r1) {
            boolean r0 = r0.handleMainMessage(r1)
            return r0
    }

    static {
            com.google.android.exoplayer2.scheduler.Requirements r0 = new com.google.android.exoplayer2.scheduler.Requirements
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.offline.DownloadManager.DEFAULT_REQUIREMENTS = r0
            return
    }

    @java.lang.Deprecated
    public DownloadManager(android.content.Context r7, com.google.android.exoplayer2.database.DatabaseProvider r8, com.google.android.exoplayer2.upstream.cache.Cache r9, com.google.android.exoplayer2.upstream.DataSource.Factory r10) {
            r6 = this;
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r5 = com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DownloadManager(android.content.Context r3, com.google.android.exoplayer2.database.DatabaseProvider r4, com.google.android.exoplayer2.upstream.cache.Cache r5, com.google.android.exoplayer2.upstream.DataSource.Factory r6, java.util.concurrent.Executor r7) {
            r2 = this;
            com.google.android.exoplayer2.offline.DefaultDownloadIndex r0 = new com.google.android.exoplayer2.offline.DefaultDownloadIndex
            r0.<init>(r4)
            com.google.android.exoplayer2.offline.DefaultDownloaderFactory r4 = new com.google.android.exoplayer2.offline.DefaultDownloaderFactory
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r1 = new com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory
            r1.<init>()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r5 = r1.setCache(r5)
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r5 = r5.setUpstreamDataSourceFactory(r6)
            r4.<init>(r5, r7)
            r2.<init>(r3, r0, r4)
            return
    }

    public DownloadManager(android.content.Context r12, com.google.android.exoplayer2.offline.WritableDownloadIndex r13, com.google.android.exoplayer2.offline.DownloaderFactory r14) {
            r11 = this;
            r11.<init>()
            android.content.Context r0 = r12.getApplicationContext()
            r11.context = r0
            r11.downloadIndex = r13
            r0 = 3
            r11.maxParallelDownloads = r0
            r0 = 5
            r11.minRetryCount = r0
            r0 = 1
            r11.downloadsPaused = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r11.downloads = r1
            java.util.concurrent.CopyOnWriteArraySet r1 = new java.util.concurrent.CopyOnWriteArraySet
            r1.<init>()
            r11.listeners = r1
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r11, r2)
            android.os.Handler r7 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper(r1)
            r11.applicationHandler = r7
            android.os.HandlerThread r4 = new android.os.HandlerThread
            java.lang.String r1 = "ExoPlayer:DownloadManager"
            r4.<init>(r1)
            r4.start()
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r1 = new com.google.android.exoplayer2.offline.DownloadManager$InternalHandler
            int r8 = r11.maxParallelDownloads
            int r9 = r11.minRetryCount
            boolean r10 = r11.downloadsPaused
            r3 = r1
            r5 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.internalHandler = r1
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r13 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r13.<init>(r11)
            r11.requirementsListener = r13
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r14 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher
            com.google.android.exoplayer2.scheduler.Requirements r3 = com.google.android.exoplayer2.offline.DownloadManager.DEFAULT_REQUIREMENTS
            r14.<init>(r12, r13, r3)
            r11.requirementsWatcher = r14
            int r12 = r14.start()
            r11.notMetRequirements = r12
            r11.pendingMessages = r0
            android.os.Message r12 = r1.obtainMessage(r2, r12, r2)
            r12.sendToTarget()
            return
    }

    private boolean handleMainMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 != r2) goto L12
            java.lang.Object r4 = r4.obj
            com.google.android.exoplayer2.offline.DownloadManager$DownloadUpdate r4 = (com.google.android.exoplayer2.offline.DownloadManager.DownloadUpdate) r4
            r3.onDownloadUpdate(r4)
            goto L27
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L18:
            int r0 = r4.arg1
            int r4 = r4.arg2
            r3.onMessageProcessed(r0, r4)
            goto L27
        L20:
            java.lang.Object r4 = r4.obj
            java.util.List r4 = (java.util.List) r4
            r3.onInitialized(r4)
        L27:
            return r1
    }

    private void notifyWaitingForRequirementsChanged() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r1 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r1
            boolean r2 = r3.waitingForRequirements
            r1.onWaitingForRequirementsChanged(r3, r2)
            goto L6
        L18:
            return
    }

    private void onDownloadUpdate(com.google.android.exoplayer2.offline.DownloadManager.DownloadUpdate r6) {
            r5 = this;
            java.util.List<com.google.android.exoplayer2.offline.Download> r0 = r6.downloads
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r5.downloads = r0
            com.google.android.exoplayer2.offline.Download r0 = r6.download
            boolean r1 = r5.updateWaitingForRequirements()
            boolean r2 = r6.isRemove
            if (r2 == 0) goto L28
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r6 = r5.listeners
            java.util.Iterator r6 = r6.iterator()
        L18:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r6.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r2 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r2
            r2.onDownloadRemoved(r5, r0)
            goto L18
        L28:
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r2 = r5.listeners
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r3 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r3
            java.lang.Exception r4 = r6.finalException
            r3.onDownloadChanged(r5, r0, r4)
            goto L2e
        L40:
            if (r1 == 0) goto L45
            r5.notifyWaitingForRequirementsChanged()
        L45:
            return
    }

    private void onInitialized(java.util.List<com.google.android.exoplayer2.offline.Download> r3) {
            r2 = this;
            r0 = 1
            r2.initialized = r0
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r2.downloads = r3
            boolean r3 = r2.updateWaitingForRequirements()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r1 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r1
            r1.onInitialized(r2)
            goto L13
        L23:
            if (r3 == 0) goto L28
            r2.notifyWaitingForRequirementsChanged()
        L28:
            return
    }

    private void onMessageProcessed(int r2, int r3) {
            r1 = this;
            int r0 = r1.pendingMessages
            int r0 = r0 - r2
            r1.pendingMessages = r0
            r1.activeTaskCount = r3
            boolean r2 = r1.isIdle()
            if (r2 == 0) goto L23
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r2 = r1.listeners
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r3 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r3
            r3.onIdle(r1)
            goto L13
        L23:
            return
    }

    private void onRequirementsStateChanged(com.google.android.exoplayer2.scheduler.RequirementsWatcher r4, int r5) {
            r3 = this;
            com.google.android.exoplayer2.scheduler.Requirements r4 = r4.getRequirements()
            int r0 = r3.notMetRequirements
            if (r0 == r5) goto L1b
            r3.notMetRequirements = r5
            int r0 = r3.pendingMessages
            int r0 = r0 + 1
            r3.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r1 = 2
            r2 = 0
            android.os.Message r0 = r0.obtainMessage(r1, r5, r2)
            r0.sendToTarget()
        L1b:
            boolean r0 = r3.updateWaitingForRequirements()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r1 = r3.listeners
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r2 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r2
            r2.onRequirementsStateChanged(r3, r4, r5)
            goto L25
        L35:
            if (r0 == 0) goto L3a
            r3.notifyWaitingForRequirementsChanged()
        L3a:
            return
    }

    private void setDownloadsPaused(boolean r4) {
            r3 = this;
            boolean r0 = r3.downloadsPaused
            if (r0 != r4) goto L5
            return
        L5:
            r3.downloadsPaused = r4
            int r0 = r3.pendingMessages
            r1 = 1
            int r0 = r0 + r1
            r3.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r2 = 0
            android.os.Message r0 = r0.obtainMessage(r1, r4, r2)
            r0.sendToTarget()
            boolean r0 = r3.updateWaitingForRequirements()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r1 = r3.listeners
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.google.android.exoplayer2.offline.DownloadManager$Listener r2 = (com.google.android.exoplayer2.offline.DownloadManager.Listener) r2
            r2.onDownloadsPausedChanged(r3, r4)
            goto L21
        L31:
            if (r0 == 0) goto L36
            r3.notifyWaitingForRequirementsChanged()
        L36:
            return
    }

    private boolean updateWaitingForRequirements() {
            r4 = this;
            boolean r0 = r4.downloadsPaused
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L24
            int r0 = r4.notMetRequirements
            if (r0 == 0) goto L24
            r0 = 0
        Lb:
            java.util.List<com.google.android.exoplayer2.offline.Download> r3 = r4.downloads
            int r3 = r3.size()
            if (r0 >= r3) goto L24
            java.util.List<com.google.android.exoplayer2.offline.Download> r3 = r4.downloads
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.offline.Download r3 = (com.google.android.exoplayer2.offline.Download) r3
            int r3 = r3.state
            if (r3 != 0) goto L21
            r0 = 1
            goto L25
        L21:
            int r0 = r0 + 1
            goto Lb
        L24:
            r0 = 0
        L25:
            boolean r3 = r4.waitingForRequirements
            if (r3 == r0) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            r4.waitingForRequirements = r0
            return r1
    }

    public void addDownload(com.google.android.exoplayer2.offline.DownloadRequest r2) {
            r1 = this;
            r0 = 0
            r1.addDownload(r2, r0)
            return
    }

    public void addDownload(com.google.android.exoplayer2.offline.DownloadRequest r4, int r5) {
            r3 = this;
            int r0 = r3.pendingMessages
            int r0 = r0 + 1
            r3.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r1 = 6
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r4.sendToTarget()
            return
    }

    public void addListener(com.google.android.exoplayer2.offline.DownloadManager.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public android.os.Looper getApplicationLooper() {
            r1 = this;
            android.os.Handler r0 = r1.applicationHandler
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    public java.util.List<com.google.android.exoplayer2.offline.Download> getCurrentDownloads() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.offline.Download> r0 = r1.downloads
            return r0
    }

    public com.google.android.exoplayer2.offline.DownloadIndex getDownloadIndex() {
            r1 = this;
            com.google.android.exoplayer2.offline.WritableDownloadIndex r0 = r1.downloadIndex
            return r0
    }

    public boolean getDownloadsPaused() {
            r1 = this;
            boolean r0 = r1.downloadsPaused
            return r0
    }

    public int getMaxParallelDownloads() {
            r1 = this;
            int r0 = r1.maxParallelDownloads
            return r0
    }

    public int getMinRetryCount() {
            r1 = this;
            int r0 = r1.minRetryCount
            return r0
    }

    public int getNotMetRequirements() {
            r1 = this;
            int r0 = r1.notMetRequirements
            return r0
    }

    public com.google.android.exoplayer2.scheduler.Requirements getRequirements() {
            r1 = this;
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r1.requirementsWatcher
            com.google.android.exoplayer2.scheduler.Requirements r0 = r0.getRequirements()
            return r0
    }

    public boolean isIdle() {
            r1 = this;
            int r0 = r1.activeTaskCount
            if (r0 != 0) goto La
            int r0 = r1.pendingMessages
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean isInitialized() {
            r1 = this;
            boolean r0 = r1.initialized
            return r0
    }

    public boolean isWaitingForRequirements() {
            r1 = this;
            boolean r0 = r1.waitingForRequirements
            return r0
    }

    public void pauseDownloads() {
            r1 = this;
            r0 = 1
            r1.setDownloadsPaused(r0)
            return
    }

    public void release() {
            r5 = this;
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r5.internalHandler
            monitor-enter(r0)
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r1 = r5.internalHandler     // Catch: java.lang.Throwable -> L44
            boolean r2 = r1.released     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        Lb:
            r2 = 12
            r1.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L44
            r1 = 0
            r2 = 0
        L12:
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r3 = r5.internalHandler     // Catch: java.lang.Throwable -> L44
            boolean r4 = r3.released     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L1e
            r3.wait()     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L44
            goto L12
        L1c:
            r2 = 1
            goto L12
        L1e:
            if (r2 == 0) goto L27
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L44
            r2.interrupt()     // Catch: java.lang.Throwable -> L44
        L27:
            android.os.Handler r2 = r5.applicationHandler     // Catch: java.lang.Throwable -> L44
            r3 = 0
            r2.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L44
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r2 = r5.requirementsWatcher     // Catch: java.lang.Throwable -> L44
            r2.stop()     // Catch: java.lang.Throwable -> L44
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L44
            r5.downloads = r2     // Catch: java.lang.Throwable -> L44
            r5.pendingMessages = r1     // Catch: java.lang.Throwable -> L44
            r5.activeTaskCount = r1     // Catch: java.lang.Throwable -> L44
            r5.initialized = r1     // Catch: java.lang.Throwable -> L44
            r5.notMetRequirements = r1     // Catch: java.lang.Throwable -> L44
            r5.waitingForRequirements = r1     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }

    public void removeAllDownloads() {
            r2 = this;
            int r0 = r2.pendingMessages
            int r0 = r0 + 1
            r2.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r2.internalHandler
            r1 = 8
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            return
    }

    public void removeDownload(java.lang.String r3) {
            r2 = this;
            int r0 = r2.pendingMessages
            int r0 = r0 + 1
            r2.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r2.internalHandler
            r1 = 7
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    public void removeListener(com.google.android.exoplayer2.offline.DownloadManager.Listener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.offline.DownloadManager$Listener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    public void resumeDownloads() {
            r1 = this;
            r0 = 0
            r1.setDownloadsPaused(r0)
            return
    }

    public void setMaxParallelDownloads(@androidx.annotation.IntRange(from = 1) int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            int r2 = r3.maxParallelDownloads
            if (r2 != r4) goto Lf
            return
        Lf:
            r3.maxParallelDownloads = r4
            int r2 = r3.pendingMessages
            int r2 = r2 + r0
            r3.pendingMessages = r2
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r2 = 4
            android.os.Message r4 = r0.obtainMessage(r2, r4, r1)
            r4.sendToTarget()
            return
    }

    public void setMinRetryCount(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            int r2 = r3.minRetryCount
            if (r2 != r4) goto Lf
            return
        Lf:
            r3.minRetryCount = r4
            int r2 = r3.pendingMessages
            int r2 = r2 + r0
            r3.pendingMessages = r2
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r2 = 5
            android.os.Message r4 = r0.obtainMessage(r2, r4, r1)
            r4.sendToTarget()
            return
    }

    public void setRequirements(com.google.android.exoplayer2.scheduler.Requirements r4) {
            r3 = this;
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r3.requirementsWatcher
            com.google.android.exoplayer2.scheduler.Requirements r0 = r0.getRequirements()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r3.requirementsWatcher
            r0.stop()
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher
            android.content.Context r1 = r3.context
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$Listener r2 = r3.requirementsListener
            r0.<init>(r1, r2, r4)
            r3.requirementsWatcher = r0
            int r4 = r0.start()
            com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r3.requirementsWatcher
            r3.onRequirementsStateChanged(r0, r4)
            return
    }

    public void setStopReason(@androidx.annotation.Nullable java.lang.String r4, int r5) {
            r3 = this;
            int r0 = r3.pendingMessages
            int r0 = r0 + 1
            r3.pendingMessages = r0
            com.google.android.exoplayer2.offline.DownloadManager$InternalHandler r0 = r3.internalHandler
            r1 = 3
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r4.sendToTarget()
            return
    }
}
