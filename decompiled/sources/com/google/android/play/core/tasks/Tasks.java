package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class Tasks {
    private Tasks() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <ResultT> ResultT await(@androidx.annotation.NonNull com.google.android.play.core.tasks.Task<ResultT> r2) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            java.lang.String r0 = "Task must not be null"
            com.google.android.play.core.internal.zzci.zza(r2, r0)
            boolean r0 = r2.isComplete()
            if (r0 == 0) goto L10
            java.lang.Object r2 = zzc(r2)
            return r2
        L10:
            com.google.android.play.core.tasks.zzo r0 = new com.google.android.play.core.tasks.zzo
            r1 = 0
            r0.<init>(r1)
            zzd(r2, r0)
            r0.zza()
            java.lang.Object r2 = zzc(r2)
            return r2
    }

    public static <ResultT> ResultT await(@androidx.annotation.NonNull com.google.android.play.core.tasks.Task<ResultT> r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            java.lang.String r0 = "Task must not be null"
            com.google.android.play.core.internal.zzci.zza(r2, r0)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.play.core.internal.zzci.zza(r5, r0)
            boolean r0 = r2.isComplete()
            if (r0 == 0) goto L15
            java.lang.Object r2 = zzc(r2)
            return r2
        L15:
            com.google.android.play.core.tasks.zzo r0 = new com.google.android.play.core.tasks.zzo
            r1 = 0
            r0.<init>(r1)
            zzd(r2, r0)
            boolean r3 = r0.zzb(r3, r5)
            if (r3 == 0) goto L29
            java.lang.Object r2 = zzc(r2)
            return r2
        L29:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for Task"
            r2.<init>(r3)
            throw r2
    }

    public static com.google.android.play.core.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.google.android.play.core.tasks.Task<?>> r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc
            r3 = 0
            com.google.android.play.core.tasks.Task r3 = zzb(r3)
            return r3
        Lc:
            java.util.Iterator r0 = r3.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.google.android.play.core.tasks.Task r1 = (com.google.android.play.core.tasks.Task) r1
            java.lang.String r2 = "null tasks are not accepted"
            java.util.Objects.requireNonNull(r1, r2)
            goto L10
        L22:
            com.google.android.play.core.tasks.zzm r0 = new com.google.android.play.core.tasks.zzm
            r0.<init>()
            com.google.android.play.core.tasks.zzq r1 = new com.google.android.play.core.tasks.zzq
            int r2 = r3.size()
            r1.<init>(r2, r0)
            java.util.Iterator r3 = r3.iterator()
        L34:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r3.next()
            com.google.android.play.core.tasks.Task r2 = (com.google.android.play.core.tasks.Task) r2
            zzd(r2, r1)
            goto L34
        L44:
            return r0
    }

    public static com.google.android.play.core.tasks.Task zza(java.lang.Exception r1) {
            com.google.android.play.core.tasks.zzm r0 = new com.google.android.play.core.tasks.zzm
            r0.<init>()
            r0.zza(r1)
            return r0
    }

    public static com.google.android.play.core.tasks.Task zzb(java.lang.Object r1) {
            com.google.android.play.core.tasks.zzm r0 = new com.google.android.play.core.tasks.zzm
            r0.<init>()
            r0.zzb(r1)
            return r0
    }

    private static java.lang.Object zzc(com.google.android.play.core.tasks.Task r1) throws java.util.concurrent.ExecutionException {
            boolean r0 = r1.isSuccessful()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.getResult()
            return r1
        Lb:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Exception r1 = r1.getException()
            r0.<init>(r1)
            throw r0
    }

    private static void zzd(com.google.android.play.core.tasks.Task r1, com.google.android.play.core.tasks.zzp r2) {
            java.util.concurrent.Executor r0 = com.google.android.play.core.tasks.TaskExecutors.zza
            r1.addOnSuccessListener(r0, r2)
            r1.addOnFailureListener(r0, r2)
            return
    }
}
