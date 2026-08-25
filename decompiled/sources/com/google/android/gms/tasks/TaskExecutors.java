package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskExecutors {

    @androidx.annotation.NonNull
    public static final java.util.concurrent.Executor MAIN_THREAD = null;
    public static final java.util.concurrent.Executor zza = null;

    static {
            com.google.android.gms.tasks.zzu r0 = new com.google.android.gms.tasks.zzu
            r0.<init>()
            com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD = r0
            com.google.android.gms.tasks.zzt r0 = new com.google.android.gms.tasks.zzt
            r0.<init>()
            com.google.android.gms.tasks.TaskExecutors.zza = r0
            return
    }

    private TaskExecutors() {
            r0 = this;
            r0.<init>()
            return
    }
}
