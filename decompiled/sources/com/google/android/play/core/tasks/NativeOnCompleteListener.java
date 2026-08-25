package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class NativeOnCompleteListener implements com.google.android.play.core.tasks.OnCompleteListener<java.lang.Object> {
    private final long zza;
    private final int zzb;

    public NativeOnCompleteListener(long r1, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public native void nativeOnComplete(long r1, int r3, @androidx.annotation.Nullable java.lang.Object r4, int r5);

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public void onComplete(com.google.android.play.core.tasks.Task<java.lang.Object> r8) {
            r7 = this;
            boolean r0 = r8.isComplete()
            if (r0 == 0) goto L50
            boolean r0 = r8.isSuccessful()
            if (r0 == 0) goto L1a
            long r2 = r7.zza
            int r4 = r7.zzb
            java.lang.Object r5 = r8.getResult()
            r6 = 0
            r1 = r7
            r1.nativeOnComplete(r2, r4, r5, r6)
            return
        L1a:
            java.lang.Exception r8 = r8.getException()
            boolean r0 = r8 instanceof com.google.android.play.core.tasks.zzj
            if (r0 != 0) goto L2e
            long r2 = r7.zza
            int r4 = r7.zzb
            r5 = 0
            r6 = -100
            r1 = r7
            r1.nativeOnComplete(r2, r4, r5, r6)
            return
        L2e:
            com.google.android.play.core.tasks.zzj r8 = (com.google.android.play.core.tasks.zzj) r8
            int r5 = r8.getErrorCode()
            if (r5 == 0) goto L40
            long r1 = r7.zza
            int r3 = r7.zzb
            r4 = 0
            r0 = r7
            r0.nativeOnComplete(r1, r3, r4, r5)
            return
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            int r0 = r7.zzb
            r1 = 51
            java.lang.String r2 = "TaskException has error code 0 on task: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r8.<init>(r0)
            throw r8
        L50:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            int r0 = r7.zzb
            r1 = 50
            java.lang.String r2 = "onComplete called for incomplete task: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r8.<init>(r0)
            throw r8
    }
}
