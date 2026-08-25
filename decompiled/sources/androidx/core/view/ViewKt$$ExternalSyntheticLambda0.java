package androidx.core.view;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewKt$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ViewKt$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
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
            goto Le
        L6:
            java.lang.Object r0 = r1.f$0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.core.view.ViewKt.$r8$lambda$Y6wGMU_rQCvb5uOg5WbipwD8gCc(r0)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            android.view.View r0 = (android.view.View) r0
            androidx.core.view.WindowInsetsControllerCompat.Impl20.$r8$lambda$pAhi3kcyEfefAOVk6cMro6TSEfc(r0)
            return
    }
}
