package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownloadService extends android.app.Service {
    public static final java.lang.String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final java.lang.String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final java.lang.String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final java.lang.String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final java.lang.String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final java.lang.String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final java.lang.String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final java.lang.String KEY_CONTENT_ID = "content_id";
    public static final java.lang.String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final java.lang.String KEY_FOREGROUND = "foreground";
    public static final java.lang.String KEY_REQUIREMENTS = "requirements";
    public static final java.lang.String KEY_STOP_REASON = "stop_reason";
    private static final java.lang.String TAG = "DownloadService";
    private static final java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper> downloadManagerHelpers = null;

    @androidx.annotation.StringRes
    private final int channelDescriptionResourceId;

    @androidx.annotation.Nullable
    private final java.lang.String channelId;

    @androidx.annotation.StringRes
    private final int channelNameResourceId;
    private com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper downloadManagerHelper;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadService$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class DownloadManagerHelper implements com.google.android.exoplayer2.offline.DownloadManager.Listener {
        private final android.content.Context context;
        private final com.google.android.exoplayer2.offline.DownloadManager downloadManager;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.offline.DownloadService downloadService;
        private final boolean foregroundAllowed;
        private com.google.android.exoplayer2.scheduler.Requirements scheduledRequirements;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.scheduler.Scheduler scheduler;
        private final java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> serviceClass;

        public static /* synthetic */ void $r8$lambda$qq9H8ivS_AHHJLwDXbhMquS4lDU(com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper r0, com.google.android.exoplayer2.offline.DownloadService r1) {
                r0.lambda$attachService$0(r1)
                return
        }

        private DownloadManagerHelper(android.content.Context r1, com.google.android.exoplayer2.offline.DownloadManager r2, boolean r3, @androidx.annotation.Nullable com.google.android.exoplayer2.scheduler.Scheduler r4, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r5) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.downloadManager = r2
                r0.foregroundAllowed = r3
                r0.scheduler = r4
                r0.serviceClass = r5
                r2.addListener(r0)
                r0.updateScheduler()
                return
        }

        public /* synthetic */ DownloadManagerHelper(android.content.Context r1, com.google.android.exoplayer2.offline.DownloadManager r2, boolean r3, com.google.android.exoplayer2.scheduler.Scheduler r4, java.lang.Class r5, com.google.android.exoplayer2.offline.DownloadService.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.offline.DownloadManager access$100(com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper r0) {
                com.google.android.exoplayer2.offline.DownloadManager r0 = r0.downloadManager
                return r0
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"scheduler"})
        private void cancelScheduler() {
                r2 = this;
                com.google.android.exoplayer2.scheduler.Requirements r0 = new com.google.android.exoplayer2.scheduler.Requirements
                r1 = 0
                r0.<init>(r1)
                boolean r1 = r2.schedulerNeedsUpdate(r0)
                if (r1 == 0) goto L13
                com.google.android.exoplayer2.scheduler.Scheduler r1 = r2.scheduler
                r1.cancel()
                r2.scheduledRequirements = r0
            L13:
                return
        }

        private /* synthetic */ void lambda$attachService$0(com.google.android.exoplayer2.offline.DownloadService r2) {
                r1 = this;
                com.google.android.exoplayer2.offline.DownloadManager r0 = r1.downloadManager
                java.util.List r0 = r0.getCurrentDownloads()
                com.google.android.exoplayer2.offline.DownloadService.access$300(r2, r0)
                return
        }

        private void restartService() {
                r4 = this;
                boolean r0 = r4.foregroundAllowed
                java.lang.String r1 = "DownloadService"
                if (r0 == 0) goto L1c
                android.content.Context r0 = r4.context     // Catch: java.lang.IllegalStateException -> L16
                java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2 = r4.serviceClass     // Catch: java.lang.IllegalStateException -> L16
                java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.RESTART"
                android.content.Intent r0 = com.google.android.exoplayer2.offline.DownloadService.access$900(r0, r2, r3)     // Catch: java.lang.IllegalStateException -> L16
                android.content.Context r2 = r4.context     // Catch: java.lang.IllegalStateException -> L16
                com.google.android.exoplayer2.util.Util.startForegroundService(r2, r0)     // Catch: java.lang.IllegalStateException -> L16
                goto L31
            L16:
                java.lang.String r0 = "Failed to restart (foreground launch restriction)"
                com.google.android.exoplayer2.util.Log.w(r1, r0)
                goto L31
            L1c:
                android.content.Context r0 = r4.context     // Catch: java.lang.IllegalStateException -> L2c
                java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2 = r4.serviceClass     // Catch: java.lang.IllegalStateException -> L2c
                java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
                android.content.Intent r0 = com.google.android.exoplayer2.offline.DownloadService.access$900(r0, r2, r3)     // Catch: java.lang.IllegalStateException -> L2c
                android.content.Context r2 = r4.context     // Catch: java.lang.IllegalStateException -> L2c
                r2.startService(r0)     // Catch: java.lang.IllegalStateException -> L2c
                goto L31
            L2c:
                java.lang.String r0 = "Failed to restart (process is idle)"
                com.google.android.exoplayer2.util.Log.w(r1, r0)
            L31:
                return
        }

        private boolean schedulerNeedsUpdate(com.google.android.exoplayer2.scheduler.Requirements r2) {
                r1 = this;
                com.google.android.exoplayer2.scheduler.Requirements r0 = r1.scheduledRequirements
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
                r2 = r2 ^ 1
                return r2
        }

        private boolean serviceMayNeedRestart() {
                r1 = this;
                com.google.android.exoplayer2.offline.DownloadService r0 = r1.downloadService
                if (r0 == 0) goto Ld
                boolean r0 = com.google.android.exoplayer2.offline.DownloadService.access$800(r0)
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        public void attachService(com.google.android.exoplayer2.offline.DownloadService r4) {
                r3 = this;
                com.google.android.exoplayer2.offline.DownloadService r0 = r3.downloadService
                r1 = 1
                if (r0 != 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r3.downloadService = r4
                com.google.android.exoplayer2.offline.DownloadManager r0 = r3.downloadManager
                boolean r0 = r0.isInitialized()
                if (r0 == 0) goto L21
                android.os.Handler r0 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
                com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5 r2 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5
                r2.<init>(r3, r4, r1)
                r0.postAtFrontOfQueue(r2)
            L21:
                return
        }

        public void detachService(com.google.android.exoplayer2.offline.DownloadService r2) {
                r1 = this;
                com.google.android.exoplayer2.offline.DownloadService r0 = r1.downloadService
                if (r0 != r2) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                com.google.android.exoplayer2.util.Assertions.checkState(r2)
                r2 = 0
                r1.downloadService = r2
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2, @androidx.annotation.Nullable java.lang.Exception r3) {
                r0 = this;
                com.google.android.exoplayer2.offline.DownloadService r1 = r0.downloadService
                if (r1 == 0) goto L7
                com.google.android.exoplayer2.offline.DownloadService.access$400(r1, r2)
            L7:
                boolean r1 = r0.serviceMayNeedRestart()
                if (r1 == 0) goto L1f
                int r1 = r2.state
                boolean r1 = com.google.android.exoplayer2.offline.DownloadService.access$500(r1)
                if (r1 == 0) goto L1f
                java.lang.String r1 = "DownloadService"
                java.lang.String r2 = "DownloadService wasn't running. Restarting."
                com.google.android.exoplayer2.util.Log.w(r1, r2)
                r0.restartService()
            L1f:
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.offline.Download r2) {
                r0 = this;
                com.google.android.exoplayer2.offline.DownloadService r1 = r0.downloadService
                if (r1 == 0) goto L7
                com.google.android.exoplayer2.offline.DownloadService.access$600(r1)
            L7:
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final /* synthetic */ void onDownloadsPausedChanged(com.google.android.exoplayer2.offline.DownloadManager r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.offline.DownloadManager.Listener.CC.$default$onDownloadsPausedChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(com.google.android.exoplayer2.offline.DownloadManager r1) {
                r0 = this;
                com.google.android.exoplayer2.offline.DownloadService r1 = r0.downloadService
                if (r1 == 0) goto L7
                com.google.android.exoplayer2.offline.DownloadService.access$700(r1)
            L7:
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(com.google.android.exoplayer2.offline.DownloadManager r2) {
                r1 = this;
                com.google.android.exoplayer2.offline.DownloadService r0 = r1.downloadService
                if (r0 == 0) goto Lb
                java.util.List r2 = r2.getCurrentDownloads()
                com.google.android.exoplayer2.offline.DownloadService.access$300(r0, r2)
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onRequirementsStateChanged(com.google.android.exoplayer2.offline.DownloadManager r1, com.google.android.exoplayer2.scheduler.Requirements r2, int r3) {
                r0 = this;
                r0.updateScheduler()
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(com.google.android.exoplayer2.offline.DownloadManager r2, boolean r3) {
                r1 = this;
                if (r3 != 0) goto L2a
                boolean r3 = r2.getDownloadsPaused()
                if (r3 != 0) goto L2a
                boolean r3 = r1.serviceMayNeedRestart()
                if (r3 == 0) goto L2a
                java.util.List r2 = r2.getCurrentDownloads()
                r3 = 0
            L13:
                int r0 = r2.size()
                if (r3 >= r0) goto L2a
                java.lang.Object r0 = r2.get(r3)
                com.google.android.exoplayer2.offline.Download r0 = (com.google.android.exoplayer2.offline.Download) r0
                int r0 = r0.state
                if (r0 != 0) goto L27
                r1.restartService()
                return
            L27:
                int r3 = r3 + 1
                goto L13
            L2a:
                return
        }

        public boolean updateScheduler() {
                r6 = this;
                com.google.android.exoplayer2.offline.DownloadManager r0 = r6.downloadManager
                boolean r0 = r0.isWaitingForRequirements()
                com.google.android.exoplayer2.scheduler.Scheduler r1 = r6.scheduler
                r2 = 1
                if (r1 != 0) goto Ld
                r0 = r0 ^ r2
                return r0
            Ld:
                if (r0 != 0) goto L13
                r6.cancelScheduler()
                return r2
            L13:
                com.google.android.exoplayer2.offline.DownloadManager r0 = r6.downloadManager
                com.google.android.exoplayer2.scheduler.Requirements r0 = r0.getRequirements()
                com.google.android.exoplayer2.scheduler.Scheduler r1 = r6.scheduler
                com.google.android.exoplayer2.scheduler.Requirements r1 = r1.getSupportedRequirements(r0)
                boolean r1 = r1.equals(r0)
                r3 = 0
                if (r1 != 0) goto L2a
                r6.cancelScheduler()
                return r3
            L2a:
                boolean r1 = r6.schedulerNeedsUpdate(r0)
                if (r1 != 0) goto L31
                return r2
            L31:
                android.content.Context r1 = r6.context
                java.lang.String r1 = r1.getPackageName()
                com.google.android.exoplayer2.scheduler.Scheduler r4 = r6.scheduler
                java.lang.String r5 = "com.google.android.exoplayer.downloadService.action.RESTART"
                boolean r1 = r4.schedule(r0, r1, r5)
                if (r1 == 0) goto L44
                r6.scheduledRequirements = r0
                return r2
            L44:
                java.lang.String r0 = "DownloadService"
                java.lang.String r1 = "Failed to schedule restart"
                com.google.android.exoplayer2.util.Log.w(r0, r1)
                r6.cancelScheduler()
                return r3
        }
    }

    public final class ForegroundNotificationUpdater {
        private final android.os.Handler handler;
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        public final /* synthetic */ com.google.android.exoplayer2.offline.DownloadService this$0;
        private final long updateInterval;

        public static /* synthetic */ void $r8$lambda$pYuZL1QRc5pDjZBDyUT_MTJZ65U(com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater r0) {
                r0.update()
                return
        }

        public ForegroundNotificationUpdater(com.google.android.exoplayer2.offline.DownloadService r1, int r2, long r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.notificationId = r2
                r0.updateInterval = r3
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.handler = r1
                return
        }

        private void update() {
                r4 = this;
                com.google.android.exoplayer2.offline.DownloadService r0 = r4.this$0
                com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = com.google.android.exoplayer2.offline.DownloadService.access$200(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r0
                com.google.android.exoplayer2.offline.DownloadManager r0 = com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper.access$100(r0)
                r0.getCurrentDownloads()
                r0.getNotMetRequirements()
                com.google.android.exoplayer2.offline.DownloadService r0 = r4.this$0
                android.app.Notification r0 = r0.getForegroundNotification()
                boolean r1 = r4.notificationDisplayed
                r2 = 1
                if (r1 != 0) goto L2b
                com.google.android.exoplayer2.offline.DownloadService r1 = r4.this$0
                int r3 = r4.notificationId
                r1.startForeground(r3, r0)
                r4.notificationDisplayed = r2
                goto L3a
            L2b:
                com.google.android.exoplayer2.offline.DownloadService r1 = r4.this$0
                java.lang.String r3 = "notification"
                java.lang.Object r1 = r1.getSystemService(r3)
                android.app.NotificationManager r1 = (android.app.NotificationManager) r1
                int r3 = r4.notificationId
                r1.notify(r3, r0)
            L3a:
                boolean r0 = r4.periodicUpdatesStarted
                if (r0 == 0) goto L50
                android.os.Handler r0 = r4.handler
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                android.os.Handler r0 = r4.handler
                com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda4
                r1.<init>(r4, r2)
                long r2 = r4.updateInterval
                r0.postDelayed(r1, r2)
            L50:
                return
        }

        public void invalidate() {
                r1 = this;
                boolean r0 = r1.notificationDisplayed
                if (r0 == 0) goto L7
                r1.update()
            L7:
                return
        }

        public void showNotificationIfNotAlready() {
                r1 = this;
                boolean r0 = r1.notificationDisplayed
                if (r0 != 0) goto L7
                r1.update()
            L7:
                return
        }

        public void startPeriodicUpdates() {
                r1 = this;
                r0 = 1
                r1.periodicUpdatesStarted = r0
                r1.update()
                return
        }

        public void stopPeriodicUpdates() {
                r2 = this;
                r0 = 0
                r2.periodicUpdatesStarted = r0
                android.os.Handler r0 = r2.handler
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.exoplayer2.offline.DownloadService.downloadManagerHelpers = r0
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper access$200(com.google.android.exoplayer2.offline.DownloadService r0) {
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = r0.downloadManagerHelper
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.exoplayer2.offline.DownloadService r0, java.util.List r1) {
            r0.notifyDownloads(r1)
            return
    }

    public static /* synthetic */ void access$400(com.google.android.exoplayer2.offline.DownloadService r0, com.google.android.exoplayer2.offline.Download r1) {
            r0.notifyDownloadChanged(r1)
            return
    }

    public static /* synthetic */ boolean access$500(int r0) {
            boolean r0 = needsStartedService(r0)
            return r0
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.offline.DownloadService r0) {
            r0.notifyDownloadRemoved()
            return
    }

    public static /* synthetic */ void access$700(com.google.android.exoplayer2.offline.DownloadService r0) {
            r0.onIdle()
            return
    }

    public static /* synthetic */ boolean access$800(com.google.android.exoplayer2.offline.DownloadService r0) {
            boolean r0 = r0.isStopped()
            return r0
    }

    public static /* synthetic */ android.content.Intent access$900(android.content.Context r0, java.lang.Class r1, java.lang.String r2) {
            android.content.Intent r0 = getIntent(r0, r1, r2)
            return r0
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, com.google.android.exoplayer2.offline.DownloadRequest r3, int r4, boolean r5) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD"
            android.content.Intent r1 = getIntent(r1, r2, r0, r5)
            java.lang.String r2 = "download_request"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "stop_reason"
            android.content.Intent r1 = r1.putExtra(r2, r4)
            return r1
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, com.google.android.exoplayer2.offline.DownloadRequest r3, boolean r4) {
            r0 = 0
            android.content.Intent r1 = buildAddDownloadIntent(r1, r2, r3, r0, r4)
            return r1
    }

    public static android.content.Intent buildPauseDownloadsIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, boolean r3) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS"
            android.content.Intent r1 = getIntent(r1, r2, r0, r3)
            return r1
    }

    public static android.content.Intent buildRemoveAllDownloadsIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, boolean r3) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"
            android.content.Intent r1 = getIntent(r1, r2, r0, r3)
            return r1
    }

    public static android.content.Intent buildRemoveDownloadIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD"
            android.content.Intent r1 = getIntent(r1, r2, r0, r4)
            java.lang.String r2 = "content_id"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            return r1
    }

    public static android.content.Intent buildResumeDownloadsIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, boolean r3) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS"
            android.content.Intent r1 = getIntent(r1, r2, r0, r3)
            return r1
    }

    public static android.content.Intent buildSetRequirementsIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, com.google.android.exoplayer2.scheduler.Requirements r3, boolean r4) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS"
            android.content.Intent r1 = getIntent(r1, r2, r0, r4)
            java.lang.String r2 = "requirements"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            return r1
    }

    public static android.content.Intent buildSetStopReasonIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, @androidx.annotation.Nullable java.lang.String r3, int r4, boolean r5) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON"
            android.content.Intent r1 = getIntent(r1, r2, r0, r5)
            java.lang.String r2 = "content_id"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "stop_reason"
            android.content.Intent r1 = r1.putExtra(r2, r4)
            return r1
    }

    public static void clearDownloadManagerHelpers() {
            java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper> r0 = com.google.android.exoplayer2.offline.DownloadService.downloadManagerHelpers
            r0.clear()
            return
    }

    private static android.content.Intent getIntent(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2, java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            android.content.Intent r1 = r0.setAction(r3)
            return r1
    }

    private static android.content.Intent getIntent(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, java.lang.String r2, boolean r3) {
            android.content.Intent r0 = getIntent(r0, r1, r2)
            java.lang.String r1 = "foreground"
            android.content.Intent r0 = r0.putExtra(r1, r3)
            return r0
    }

    private boolean isStopped() {
            r1 = this;
            boolean r0 = r1.isStopped
            return r0
    }

    private static boolean needsStartedService(int r1) {
            r0 = 2
            if (r1 == r0) goto Lc
            r0 = 5
            if (r1 == r0) goto Lc
            r0 = 7
            if (r1 != r0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            return r1
    }

    private void notifyDownloadChanged(com.google.android.exoplayer2.offline.Download r2) {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = r1.foregroundNotificationUpdater
            if (r0 == 0) goto L17
            int r2 = r2.state
            boolean r2 = needsStartedService(r2)
            if (r2 == 0) goto L12
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r2 = r1.foregroundNotificationUpdater
            r2.startPeriodicUpdates()
            goto L17
        L12:
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r2 = r1.foregroundNotificationUpdater
            r2.invalidate()
        L17:
            return
    }

    private void notifyDownloadRemoved() {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = r1.foregroundNotificationUpdater
            if (r0 == 0) goto L7
            r0.invalidate()
        L7:
            return
    }

    private void notifyDownloads(java.util.List<com.google.android.exoplayer2.offline.Download> r3) {
            r2 = this;
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = r2.foregroundNotificationUpdater
            if (r0 == 0) goto L22
            r0 = 0
        L5:
            int r1 = r3.size()
            if (r0 >= r1) goto L22
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.offline.Download r1 = (com.google.android.exoplayer2.offline.Download) r1
            int r1 = r1.state
            boolean r1 = needsStartedService(r1)
            if (r1 == 0) goto L1f
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r3 = r2.foregroundNotificationUpdater
            r3.startPeriodicUpdates()
            goto L22
        L1f:
            int r0 = r0 + 1
            goto L5
        L22:
            return
    }

    private void onIdle() {
            r2 = this;
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = r2.foregroundNotificationUpdater
            if (r0 == 0) goto L7
            r0.stopPeriodicUpdates()
        L7:
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = r2.downloadManagerHelper
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r0
            boolean r0 = r0.updateScheduler()
            if (r0 != 0) goto L16
            return
        L16:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L27
            boolean r0 = r2.taskRemoved
            if (r0 == 0) goto L27
            r2.stopSelf()
            r0 = 1
            r2.isStopped = r0
            goto L32
        L27:
            boolean r0 = r2.isStopped
            int r1 = r2.lastStartId
            boolean r1 = r2.stopSelfResult(r1)
            r0 = r0 | r1
            r2.isStopped = r0
        L32:
            return
    }

    public static void sendAddDownload(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, com.google.android.exoplayer2.offline.DownloadRequest r2, int r3, boolean r4) {
            android.content.Intent r1 = buildAddDownloadIntent(r0, r1, r2, r3, r4)
            startService(r0, r1, r4)
            return
    }

    public static void sendAddDownload(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, com.google.android.exoplayer2.offline.DownloadRequest r2, boolean r3) {
            android.content.Intent r1 = buildAddDownloadIntent(r0, r1, r2, r3)
            startService(r0, r1, r3)
            return
    }

    public static void sendPauseDownloads(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, boolean r2) {
            android.content.Intent r1 = buildPauseDownloadsIntent(r0, r1, r2)
            startService(r0, r1, r2)
            return
    }

    public static void sendRemoveAllDownloads(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, boolean r2) {
            android.content.Intent r1 = buildRemoveAllDownloadsIntent(r0, r1, r2)
            startService(r0, r1, r2)
            return
    }

    public static void sendRemoveDownload(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, java.lang.String r2, boolean r3) {
            android.content.Intent r1 = buildRemoveDownloadIntent(r0, r1, r2, r3)
            startService(r0, r1, r3)
            return
    }

    public static void sendResumeDownloads(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, boolean r2) {
            android.content.Intent r1 = buildResumeDownloadsIntent(r0, r1, r2)
            startService(r0, r1, r2)
            return
    }

    public static void sendSetRequirements(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, com.google.android.exoplayer2.scheduler.Requirements r2, boolean r3) {
            android.content.Intent r1 = buildSetRequirementsIntent(r0, r1, r2, r3)
            startService(r0, r1, r3)
            return
    }

    public static void sendSetStopReason(android.content.Context r0, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r1, @androidx.annotation.Nullable java.lang.String r2, int r3, boolean r4) {
            android.content.Intent r1 = buildSetStopReasonIntent(r0, r1, r2, r3, r4)
            startService(r0, r1, r4)
            return
    }

    public static void start(android.content.Context r1, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r2) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.INIT"
            android.content.Intent r2 = getIntent(r1, r2, r0)
            r1.startService(r2)
            return
    }

    public static void startForeground(android.content.Context r2, java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService> r3) {
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.INIT"
            r1 = 1
            android.content.Intent r3 = getIntent(r2, r3, r0, r1)
            com.google.android.exoplayer2.util.Util.startForegroundService(r2, r3)
            return
    }

    private static void startService(android.content.Context r0, android.content.Intent r1, boolean r2) {
            if (r2 == 0) goto L6
            com.google.android.exoplayer2.util.Util.startForegroundService(r0, r1)
            goto L9
        L6:
            r0.startService(r1)
        L9:
            return
    }

    public abstract com.google.android.exoplayer2.offline.DownloadManager getDownloadManager();

    public abstract android.app.Notification getForegroundNotification();

    @androidx.annotation.Nullable
    public abstract com.google.android.exoplayer2.scheduler.Scheduler getScheduler();

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r11 = this;
            java.lang.String r0 = r11.channelId
            if (r0 == 0) goto Lc
            int r1 = r11.channelNameResourceId
            int r2 = r11.channelDescriptionResourceId
            r3 = 2
            com.google.android.exoplayer2.util.NotificationUtil.createNotificationChannel(r11, r0, r1, r2, r3)
        Lc:
            java.lang.Class r0 = r11.getClass()
            java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.DownloadService>, com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper> r1 = com.google.android.exoplayer2.offline.DownloadService.downloadManagerHelpers
            java.lang.Object r2 = r1.get(r0)
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r2 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r2
            if (r2 != 0) goto L4c
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r2 = r11.foregroundNotificationUpdater
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L22
            r7 = 1
            goto L23
        L22:
            r7 = 0
        L23:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r5 = 31
            if (r2 >= r5) goto L2a
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r7 == 0) goto L34
            if (r3 == 0) goto L34
            com.google.android.exoplayer2.scheduler.Scheduler r2 = r11.getScheduler()
            goto L35
        L34:
            r2 = 0
        L35:
            r8 = r2
            com.google.android.exoplayer2.offline.DownloadManager r6 = r11.getDownloadManager()
            r6.resumeDownloads()
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r2 = new com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper
            android.content.Context r5 = r11.getApplicationContext()
            r10 = 0
            r4 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.put(r0, r2)
        L4c:
            r11.downloadManagerHelper = r2
            r2.attachService(r11)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            r0 = 1
            r1.isDestroyed = r0
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = r1.downloadManagerHelper
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r0
            r0.detachService(r1)
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = r1.foregroundNotificationUpdater
            if (r0 == 0) goto L15
            r0.stopPeriodicUpdates()
        L15:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.Nullable android.content.Intent r8, int r9, int r10) {
            r7 = this;
            r7.lastStartId = r10
            r9 = 0
            r7.taskRemoved = r9
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L2d
            java.lang.String r0 = r8.getAction()
            java.lang.String r2 = "content_id"
            java.lang.String r2 = r8.getStringExtra(r2)
            boolean r3 = r7.startedInForeground
            java.lang.String r4 = "foreground"
            boolean r4 = r8.getBooleanExtra(r4, r9)
            if (r4 != 0) goto L28
            boolean r4 = r10.equals(r0)
            if (r4 == 0) goto L26
            goto L28
        L26:
            r4 = 0
            goto L29
        L28:
            r4 = 1
        L29:
            r3 = r3 | r4
            r7.startedInForeground = r3
            goto L2e
        L2d:
            r2 = r0
        L2e:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r0 != 0) goto L33
            r0 = r3
        L33:
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r4 = r7.downloadManagerHelper
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r4 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r4
            com.google.android.exoplayer2.offline.DownloadManager r4 = com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper.access$100(r4)
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -1931239035: goto L9f;
                case -932047176: goto L94;
                case -871181424: goto L8b;
                case -650547439: goto L80;
                case -119057172: goto L75;
                case 191112771: goto L6a;
                case 671523141: goto L5f;
                case 1015676687: goto L56;
                case 1547520644: goto L49;
                default: goto L47;
            }
        L47:
            goto La9
        L49:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L53
            goto La9
        L53:
            r5 = 8
            goto La9
        L56:
            boolean r10 = r0.equals(r3)
            if (r10 != 0) goto L5d
            goto La9
        L5d:
            r5 = 7
            goto La9
        L5f:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L68
            goto La9
        L68:
            r5 = 6
            goto La9
        L6a:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L73
            goto La9
        L73:
            r5 = 5
            goto La9
        L75:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L7e
            goto La9
        L7e:
            r5 = 4
            goto La9
        L80:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L89
            goto La9
        L89:
            r5 = 3
            goto La9
        L8b:
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L92
            goto La9
        L92:
            r5 = 2
            goto La9
        L94:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L9d
            goto La9
        L9d:
            r5 = 1
            goto La9
        L9f:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto La8
            goto La9
        La8:
            r5 = 0
        La9:
            java.lang.String r10 = "stop_reason"
            java.lang.String r3 = "DownloadService"
            switch(r5) {
                case 0: goto L114;
                case 1: goto L110;
                case 2: goto L131;
                case 3: goto L10c;
                case 4: goto Lf1;
                case 5: goto Led;
                case 6: goto Ld3;
                case 7: goto L131;
                case 8: goto Lc7;
                default: goto Lb1;
            }
        Lb1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Ignored unrecognized action: "
            r8.append(r10)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.google.android.exoplayer2.util.Log.e(r3, r8)
            goto L131
        Lc7:
            if (r2 != 0) goto Lcf
            java.lang.String r8 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra"
            com.google.android.exoplayer2.util.Log.e(r3, r8)
            goto L131
        Lcf:
            r4.removeDownload(r2)
            goto L131
        Ld3:
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r0.hasExtra(r10)
            if (r0 != 0) goto Le5
            java.lang.String r8 = "Ignored SET_STOP_REASON: Missing stop_reason extra"
            com.google.android.exoplayer2.util.Log.e(r3, r8)
            goto L131
        Le5:
            int r8 = r8.getIntExtra(r10, r9)
            r4.setStopReason(r2, r8)
            goto L131
        Led:
            r4.pauseDownloads()
            goto L131
        Lf1:
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r10 = "requirements"
            android.os.Parcelable r8 = r8.getParcelableExtra(r10)
            com.google.android.exoplayer2.scheduler.Requirements r8 = (com.google.android.exoplayer2.scheduler.Requirements) r8
            if (r8 != 0) goto L108
            java.lang.String r8 = "Ignored SET_REQUIREMENTS: Missing requirements extra"
            com.google.android.exoplayer2.util.Log.e(r3, r8)
            goto L131
        L108:
            r4.setRequirements(r8)
            goto L131
        L10c:
            r4.removeAllDownloads()
            goto L131
        L110:
            r4.resumeDownloads()
            goto L131
        L114:
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = "download_request"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            com.google.android.exoplayer2.offline.DownloadRequest r0 = (com.google.android.exoplayer2.offline.DownloadRequest) r0
            if (r0 != 0) goto L12a
            java.lang.String r8 = "Ignored ADD_DOWNLOAD: Missing download_request extra"
            com.google.android.exoplayer2.util.Log.e(r3, r8)
            goto L131
        L12a:
            int r8 = r8.getIntExtra(r10, r9)
            r4.addDownload(r0, r8)
        L131:
            int r8 = com.google.android.exoplayer2.util.Util.SDK_INT
            r10 = 26
            if (r8 < r10) goto L142
            boolean r8 = r7.startedInForeground
            if (r8 == 0) goto L142
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r8 = r7.foregroundNotificationUpdater
            if (r8 == 0) goto L142
            r8.showNotificationIfNotAlready()
        L142:
            r7.isStopped = r9
            boolean r8 = r4.isIdle()
            if (r8 == 0) goto L14d
            r7.onIdle()
        L14d:
            return r1
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r1) {
            r0 = this;
            r1 = 1
            r0.taskRemoved = r1
            return
    }
}
