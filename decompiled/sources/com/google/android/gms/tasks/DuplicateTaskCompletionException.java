package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.IllegalStateException of(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<?> r4) {
            boolean r0 = r4.isComplete()
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "DuplicateTaskCompletionException can only be created from completed Task."
            r4.<init>(r0)
            return r4
        Le:
            java.lang.Exception r0 = r4.getException()
            if (r0 == 0) goto L17
            java.lang.String r4 = "failure"
            goto L39
        L17:
            boolean r1 = r4.isSuccessful()
            if (r1 == 0) goto L2d
            java.lang.Object r4 = r4.getResult()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "result "
            java.lang.String r4 = r1.concat(r4)
            goto L39
        L2d:
            boolean r4 = r4.isCanceled()
            if (r4 == 0) goto L36
            java.lang.String r4 = "cancellation"
            goto L39
        L36:
            java.lang.String r4 = "unknown issue"
        L39:
            com.google.android.gms.tasks.DuplicateTaskCompletionException r1 = new com.google.android.gms.tasks.DuplicateTaskCompletionException
            java.lang.String r2 = "Complete with: "
            int r3 = r4.length()
            if (r3 == 0) goto L48
            java.lang.String r4 = r2.concat(r4)
            goto L4d
        L48:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
        L4d:
            r1.<init>(r4, r0)
            return r1
    }
}
