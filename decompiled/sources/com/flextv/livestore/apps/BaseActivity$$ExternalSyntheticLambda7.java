package com.flextv.livestore.apps;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda7 implements io.realm.Realm.Transaction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.util.List f$0;

    public /* synthetic */ BaseActivity$$ExternalSyntheticLambda7(java.util.List r1, int r2) {
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
                case 0: goto L12;
                case 1: goto Lc;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.util.List r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.m106$r8$lambda$8iXwlvuOTeOLmgyp5zAu7z8WyI(r0, r2)
            return
        Lc:
            java.util.List r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$837cPBuv3ZXpo2DqO_99MtDbeUM(r0, r2)
            return
        L12:
            java.util.List r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$NAjSG1uOyLQAcvxSR3FTOM6eEpg(r0, r2)
            return
        L18:
            java.util.List r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$euu7KY1XtZF18CBsYSjxe6AdNS4(r0, r2)
            return
    }
}
