package com.google.android.play.core.common;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends android.app.Activity {

    @androidx.annotation.Nullable
    private android.os.ResultReceiver zza;

    public PlayCoreDialogWrapperActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            if (r1 != 0) goto L21
            android.os.ResultReceiver r1 = r0.zza
            if (r1 == 0) goto L21
            r3 = -1
            if (r2 != r3) goto L16
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 1
            r1.send(r3, r2)
            goto L21
        L16:
            if (r2 != 0) goto L21
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 2
            r1.send(r3, r2)
        L21:
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle r11) {
            r10 = this;
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "window_flags"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            if (r0 == 0) goto L22
            android.view.Window r2 = r10.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.setSystemUiVisibility(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.putExtra(r1, r0)
            goto L23
        L22:
            r2 = 0
        L23:
            r6 = r2
            super.onCreate(r11)
            java.lang.String r0 = "result_receiver"
            if (r11 != 0) goto L67
            android.content.Intent r11 = r10.getIntent()
            android.os.Parcelable r11 = r11.getParcelableExtra(r0)
            android.os.ResultReceiver r11 = (android.os.ResultReceiver) r11
            r10.zza = r11
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r11 = r11.get(r0)
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            android.content.IntentSender r4 = r11.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L55
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r10
            r3.startIntentSenderForResult(r4, r5, r6, r7, r8, r9)     // Catch: android.content.IntentSender.SendIntentException -> L55
            return
        L55:
            android.os.ResultReceiver r11 = r10.zza
            if (r11 == 0) goto L63
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 3
            r11.send(r1, r0)
        L63:
            r10.finish()
            return
        L67:
            android.os.Parcelable r11 = r11.getParcelable(r0)
            android.os.ResultReceiver r11 = (android.os.ResultReceiver) r11
            r10.zza = r11
            return
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            android.os.ResultReceiver r0 = r2.zza
            java.lang.String r1 = "result_receiver"
            r3.putParcelable(r1, r0)
            return
    }
}
