package com.flextv.livestore.apps;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda2 implements com.flextv.livestore.net.NetworkTask.OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.apps.BaseActivity f$0;
    public final /* synthetic */ io.realm.RealmResults f$1;
    public final /* synthetic */ java.util.List f$2;
    public final /* synthetic */ java.util.List f$3;

    public /* synthetic */ BaseActivity$$ExternalSyntheticLambda2(com.flextv.livestore.apps.BaseActivity r1, io.realm.RealmResults r2, java.util.List r3, java.util.List r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask.OnCompleteListener
    public final void onComplete(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            com.flextv.livestore.apps.BaseActivity r0 = r4.f$0
            io.realm.RealmResults r1 = r4.f$1
            java.util.List r2 = r4.f$2
            java.util.List r3 = r4.f$3
            java.util.List r5 = (java.util.List) r5
            com.flextv.livestore.apps.BaseActivity.m112$r8$lambda$vGsMKwosR0x9t58Y5ghrJaEokg(r0, r1, r2, r3, r5)
            return
        L14:
            com.flextv.livestore.apps.BaseActivity r0 = r4.f$0
            io.realm.RealmResults r1 = r4.f$1
            java.util.List r2 = r4.f$2
            java.util.List r3 = r4.f$3
            java.util.List r5 = (java.util.List) r5
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$sMNlwohdF2JebPpyWzbwoIATYY4(r0, r1, r2, r3, r5)
            return
    }
}
