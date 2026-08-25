package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class PendingResults {
    @com.google.android.gms.common.annotation.KeepForSdk
    private PendingResults() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> canceledPendingResult() {
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = new com.google.android.gms.common.api.internal.StatusPendingResult
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0.cancel()
            return r0
    }

    @androidx.annotation.NonNull
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> canceledPendingResult(@androidx.annotation.NonNull R r2) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.Status r0 = r2.getStatus()
            int r0 = r0.getStatusCode()
            r1 = 16
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "Status code must be CommonStatusCodes.CANCELED"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.zaf r0 = new com.google.android.gms.common.api.zaf
            r0.<init>(r2)
            r0.cancel()
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> immediateFailedResult(@androidx.annotation.NonNull R r2, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r3) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.Status r0 = r2.getStatus()
            boolean r0 = r0.isSuccess()
            r0 = r0 ^ 1
            java.lang.String r1 = "Status code must not be SUCCESS"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.zag r0 = new com.google.android.gms.common.api.zag
            r0.<init>(r3, r2)
            r0.setResult(r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(@androidx.annotation.NonNull R r2) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.zah r0 = new com.google.android.gms.common.api.zah
            r1 = 0
            r0.<init>(r1)
            r0.setResult(r2)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r2 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r2.<init>(r0)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(@androidx.annotation.NonNull R r1, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r2) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            com.google.android.gms.common.api.zah r0 = new com.google.android.gms.common.api.zah
            r0.<init>(r2)
            r0.setResult(r1)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r1 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r1.<init>(r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = new com.google.android.gms.common.api.internal.StatusPendingResult
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0.setResult(r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r2) {
            java.lang.String r0 = "Result must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = new com.google.android.gms.common.api.internal.StatusPendingResult
            r0.<init>(r2)
            r0.setResult(r1)
            return r0
    }
}
