package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes3.dex */
public final class TaskExecutors {
    public static final java.util.concurrent.Executor MAIN_THREAD = null;
    public static final java.util.concurrent.Executor zza = null;

    static {
            com.google.android.play.core.tasks.zzl r0 = new com.google.android.play.core.tasks.zzl
            r0.<init>()
            com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD = r0
            com.google.android.play.core.tasks.zzk r0 = new com.google.android.play.core.tasks.zzk
            r0.<init>()
            com.google.android.play.core.tasks.TaskExecutors.zza = r0
            return
    }

    private TaskExecutors() {
            r0 = this;
            r0.<init>()
            return
    }
}
