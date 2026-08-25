package io.realm.internal.coroutines;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0 implements io.realm.OrderedRealmCollectionChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f$0;
    public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory f$1;

    public /* synthetic */ InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // io.realm.OrderedRealmCollectionChangeListener
    public final void onChange(java.lang.Object r3, io.realm.OrderedCollectionChangeSet r4) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L10;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass3.$r8$lambda$Xjm1ghsEou1JAEToBGOPdewoEgc(r0, r1, r3, r4)
            return
        L10:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass2.$r8$lambda$kUzkxXXEX2mItRPrm83WiLOTQok(r0, r1, r3, r4)
            return
        L1a:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass1.m309$r8$lambda$X7LXaX9W_Gehv0zHwBdQPaDq5s(r0, r1, r3, r4)
            return
        L24:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass4.m313$r8$lambda$9qv5NKj4Jqg6s9SfhINNXugcoI(r0, r1, r3, r4)
            return
    }
}
