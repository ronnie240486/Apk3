package androidx.core.content.res;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ResourcesCompat$FontCallback$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ResourcesCompat$FontCallback$$ExternalSyntheticLambda0(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r2.f$0
            androidx.core.content.res.ResourcesCompat$FontCallback r0 = (androidx.core.content.res.ResourcesCompat.FontCallback) r0
            int r1 = r2.f$1
            androidx.core.content.res.ResourcesCompat.FontCallback.$r8$lambda$3yv7dDJDSSH8XKTxkNkwYH6nK6w(r0, r1)
            return
        L10:
            java.lang.Object r0 = r2.f$0
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            int r1 = r2.f$1
            com.google.android.material.sidesheet.SideSheetBehavior.$r8$lambda$BqwTUDu32X3pYkD_jSNGWG9fjsM(r0, r1)
            return
    }
}
