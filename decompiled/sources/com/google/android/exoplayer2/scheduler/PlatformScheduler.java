package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(21)
public final class PlatformScheduler implements com.google.android.exoplayer2.scheduler.Scheduler {
    private static final java.lang.String KEY_REQUIREMENTS = "requirements";
    private static final java.lang.String KEY_SERVICE_ACTION = "service_action";
    private static final java.lang.String KEY_SERVICE_PACKAGE = "service_package";
    private static final int SUPPORTED_REQUIREMENTS = 0;
    private static final java.lang.String TAG = "PlatformScheduler";
    private final int jobId;
    private final android.app.job.JobScheduler jobScheduler;
    private final android.content.ComponentName jobServiceComponentName;

    /* JADX INFO: loaded from: classes.dex */
    public static final class PlatformSchedulerService extends android.app.job.JobService {
        public PlatformSchedulerService() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(android.app.job.JobParameters r4) {
                r3 = this;
                android.os.PersistableBundle r0 = r4.getExtras()
                com.google.android.exoplayer2.scheduler.Requirements r1 = new com.google.android.exoplayer2.scheduler.Requirements
                java.lang.String r2 = "requirements"
                int r2 = r0.getInt(r2)
                r1.<init>(r2)
                int r1 = r1.getNotMetRequirements(r3)
                if (r1 != 0) goto L3d
                java.lang.String r4 = "service_action"
                java.lang.String r4 = r0.getString(r4)
                java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r1 = "service_package"
                java.lang.String r0 = r0.getString(r1)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r1 = new android.content.Intent
                r1.<init>(r4)
                android.content.Intent r4 = r1.setPackage(r0)
                com.google.android.exoplayer2.util.Util.startForegroundService(r3, r4)
                goto L57
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Requirements not met: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "PlatformScheduler"
                com.google.android.exoplayer2.util.Log.w(r1, r0)
                r0 = 1
                r3.jobFinished(r4, r0)
            L57:
                r4 = 0
                return r4
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(android.app.job.JobParameters r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r0 = 16
            goto La
        L9:
            r0 = 0
        La:
            r0 = r0 | 15
            com.google.android.exoplayer2.scheduler.PlatformScheduler.SUPPORTED_REQUIREMENTS = r0
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.jobId = r3
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.Class<com.google.android.exoplayer2.scheduler.PlatformScheduler$PlatformSchedulerService> r0 = com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.class
            r3.<init>(r2, r0)
            r1.jobServiceComponentName = r3
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            r1.jobScheduler = r2
            return
    }

    private static android.app.job.JobInfo buildJobInfo(int r3, android.content.ComponentName r4, com.google.android.exoplayer2.scheduler.Requirements r5, java.lang.String r6, java.lang.String r7) {
            int r0 = com.google.android.exoplayer2.scheduler.PlatformScheduler.SUPPORTED_REQUIREMENTS
            com.google.android.exoplayer2.scheduler.Requirements r0 = r5.filterRequirements(r0)
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L27
            java.lang.String r1 = "Ignoring unsupported requirements: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r0 = r0.getRequirements()
            int r2 = r5.getRequirements()
            r0 = r0 ^ r2
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PlatformScheduler"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
        L27:
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder
            r0.<init>(r3, r4)
            boolean r3 = r5.isUnmeteredNetworkRequired()
            r4 = 1
            if (r3 == 0) goto L38
            r3 = 2
            r0.setRequiredNetworkType(r3)
            goto L41
        L38:
            boolean r3 = r5.isNetworkRequired()
            if (r3 == 0) goto L41
            r0.setRequiredNetworkType(r4)
        L41:
            boolean r3 = r5.isIdleRequired()
            r0.setRequiresDeviceIdle(r3)
            boolean r3 = r5.isChargingRequired()
            r0.setRequiresCharging(r3)
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r3 < r1) goto L5e
            boolean r3 = r5.isStorageNotLowRequired()
            if (r3 == 0) goto L5e
            r0.setRequiresStorageNotLow(r4)
        L5e:
            r0.setPersisted(r4)
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r4 = "service_action"
            r3.putString(r4, r6)
            java.lang.String r4 = "service_package"
            r3.putString(r4, r7)
            int r4 = r5.getRequirements()
            java.lang.String r5 = "requirements"
            r3.putInt(r5, r4)
            r0.setExtras(r3)
            android.app.job.JobInfo r3 = r0.build()
            return r3
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
            r2 = this;
            android.app.job.JobScheduler r0 = r2.jobScheduler
            int r1 = r2.jobId
            r0.cancel(r1)
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public com.google.android.exoplayer2.scheduler.Requirements getSupportedRequirements(com.google.android.exoplayer2.scheduler.Requirements r2) {
            r1 = this;
            int r0 = com.google.android.exoplayer2.scheduler.PlatformScheduler.SUPPORTED_REQUIREMENTS
            com.google.android.exoplayer2.scheduler.Requirements r2 = r2.filterRequirements(r0)
            return r2
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean schedule(com.google.android.exoplayer2.scheduler.Requirements r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.jobId
            android.content.ComponentName r1 = r2.jobServiceComponentName
            android.app.job.JobInfo r3 = buildJobInfo(r0, r1, r3, r5, r4)
            android.app.job.JobScheduler r4 = r2.jobScheduler
            int r3 = r4.schedule(r3)
            r4 = 1
            if (r3 != r4) goto L12
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }
}
