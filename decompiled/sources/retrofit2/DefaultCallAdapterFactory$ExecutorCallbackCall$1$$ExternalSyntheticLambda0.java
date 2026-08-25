package retrofit2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f$0;
    public final /* synthetic */ retrofit2.Callback f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, retrofit2.Callback r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 r0 = r3.f$0
            retrofit2.Callback r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            retrofit2.Response r2 = (retrofit2.Response) r2
            retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.$r8$lambda$hVGjmafRi6VitDIrPNdoFizVAdk(r0, r1, r2)
            return
        L12:
            retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 r0 = r3.f$0
            retrofit2.Callback r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.m2038$r8$lambda$G9BY9eQQk64nBfFjfIpxYzJzUo(r0, r1, r2)
            return
    }
}
