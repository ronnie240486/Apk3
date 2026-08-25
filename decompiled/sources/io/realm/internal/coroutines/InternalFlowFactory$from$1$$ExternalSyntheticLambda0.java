package io.realm.internal.coroutines;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class InternalFlowFactory$from$1$$ExternalSyntheticLambda0 implements io.realm.RealmChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f$0;
    public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ InternalFlowFactory$from$1$$ExternalSyntheticLambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.BaseRealm r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // io.realm.RealmChangeListener
    public final void onChange(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            kotlinx.coroutines.channels.ProducerScope r0 = r3.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            io.realm.Realm r2 = (io.realm.Realm) r2
            io.realm.Realm r4 = (io.realm.Realm) r4
            io.realm.internal.coroutines.InternalFlowFactory.C00631.$r8$lambda$JH1LpjkSTMKSCZRCZzFLr2jOOgE(r0, r1, r2, r4)
            return
        L14:
            kotlinx.coroutines.channels.ProducerScope r0 = r3.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            io.realm.DynamicRealm r2 = (io.realm.DynamicRealm) r2
            io.realm.DynamicRealm r4 = (io.realm.DynamicRealm) r4
            io.realm.internal.coroutines.InternalFlowFactory.C00642.$r8$lambda$Lwtb1C40riPhNzP6XQyBZm1MOik(r0, r1, r2, r4)
            return
    }
}
