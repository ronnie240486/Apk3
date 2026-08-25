package androidx.appcompat.app;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AppCompatDelegate$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ android.content.Context f$0;

    public /* synthetic */ AppCompatDelegate$$ExternalSyntheticLambda0(android.content.Context r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            android.content.Context r0 = r1.f$0
            androidx.appcompat.app.AppCompatDelegate.$r8$lambda$xDEIhDPiN8OUNYoBgEyEAVC_9OI(r0)
            return
        Lc:
            android.content.Context r0 = r1.f$0
            androidx.appcompat.app.AppCompatDelegate.$r8$lambda$F36VbET_i_Y_e98J3kKLOS37EAQ(r0)
            return
    }
}
