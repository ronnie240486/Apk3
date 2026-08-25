package com.flextv.livestore.apps;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda5 implements io.realm.Realm.Transaction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.models.ResumeSeriesModel f$0;

    public /* synthetic */ BaseActivity$$ExternalSyntheticLambda5(com.flextv.livestore.models.ResumeSeriesModel r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(io.realm.Realm r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.flextv.livestore.models.ResumeSeriesModel r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.AnonymousClass10.m114$r8$lambda$eC23BVk3YGPrueuEzU6PVxehyo(r0, r2)
            return
        Lc:
            com.flextv.livestore.models.ResumeSeriesModel r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.m107$r8$lambda$AhzrLo0VFfWN9XRPpjzYS5d8Es(r0, r2)
            return
        L12:
            com.flextv.livestore.models.ResumeSeriesModel r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.AnonymousClass9.$r8$lambda$MZ8sKnoeWz3omd27il_VuMQEuCI(r0, r2)
            return
    }
}
