package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zae implements android.view.View.OnClickListener {
    public final /* synthetic */ android.content.Context zaa;
    public final /* synthetic */ android.content.Intent zab;

    public zae(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.content.Context r3 = r2.zaa     // Catch: android.content.ActivityNotFoundException -> L8
            android.content.Intent r0 = r2.zab     // Catch: android.content.ActivityNotFoundException -> L8
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L8
            return
        L8:
            r3 = move-exception
            java.lang.String r0 = "DeferredLifecycleHelper"
            java.lang.String r1 = "Failed to start resolution intent"
            android.util.Log.e(r0, r1, r3)
            return
    }
}
