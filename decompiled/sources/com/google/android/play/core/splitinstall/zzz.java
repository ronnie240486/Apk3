package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzz implements com.google.android.play.core.common.IntentSenderForResultStarter {
    public final /* synthetic */ android.app.Activity zza;

    public zzz(android.app.Activity r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(android.content.IntentSender r8, int r9, android.content.Intent r10, int r11, int r12, int r13, android.os.Bundle r14) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            android.app.Activity r0 = r7.zza
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }
}
