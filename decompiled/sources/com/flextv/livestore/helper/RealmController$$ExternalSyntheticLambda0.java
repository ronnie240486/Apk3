package com.flextv.livestore.helper;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RealmController$$ExternalSyntheticLambda0 implements io.realm.Realm.Transaction.OnSuccess {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.helper.RealmChangeItemListener f$0;

    public /* synthetic */ RealmController$$ExternalSyntheticLambda0(com.flextv.livestore.helper.RealmChangeItemListener r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // io.realm.Realm.Transaction.OnSuccess
    public final void onSuccess() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L5;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                default: goto L5;
            }
        L5:
            com.flextv.livestore.helper.RealmChangeItemListener r0 = r1.f$0
            r0.onItemChanged()
            return
    }
}
