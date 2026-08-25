package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class PendingResultUtil {
    private static final com.google.android.gms.common.internal.zas zaa = null;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ResultConverter<R extends com.google.android.gms.common.api.Result, T> {
        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        T convert(@androidx.annotation.NonNull R r1);
    }

    static {
            com.google.android.gms.common.internal.zao r0 = new com.google.android.gms.common.internal.zao
            r0.<init>()
            com.google.android.gms.common.internal.PendingResultUtil.zaa = r0
            return
    }

    public PendingResultUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.Response<R>> com.google.android.gms.tasks.Task<T> toResponseTask(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult<R> r1, @androidx.annotation.NonNull T r2) {
            com.google.android.gms.common.internal.zaq r0 = new com.google.android.gms.common.internal.zaq
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r1 = toTask(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result, T> com.google.android.gms.tasks.Task<T> toTask(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult<R> r3, @androidx.annotation.NonNull com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<R, T> r4) {
            com.google.android.gms.common.internal.zas r0 = com.google.android.gms.common.internal.PendingResultUtil.zaa
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            com.google.android.gms.common.internal.zap r2 = new com.google.android.gms.common.internal.zap
            r2.<init>(r3, r1, r4, r0)
            r3.addStatusListener(r2)
            com.google.android.gms.tasks.Task r3 = r1.getTask()
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.tasks.Task<java.lang.Void> toVoidTask(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult<R> r1) {
            com.google.android.gms.common.internal.zar r0 = new com.google.android.gms.common.internal.zar
            r0.<init>()
            com.google.android.gms.tasks.Task r1 = toTask(r1, r0)
            return r1
    }
}
