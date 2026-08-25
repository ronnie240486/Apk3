package io.realm.internal.coroutines;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InternalFlowFactory$from$3$$ExternalSyntheticLambda0 implements io.realm.RealmChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f$0;
    public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory f$1;

    public /* synthetic */ InternalFlowFactory$from$3$$ExternalSyntheticLambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // io.realm.RealmChangeListener
    public final void onChange(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L24;
                case 2: goto L1a;
                case 3: goto L10;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L38
        L6:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmModel r3 = (io.realm.RealmModel) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass7.$r8$lambda$XFoTSpTEZhDIZeA7qDK98ftgXB8(r0, r1, r3)
            return
        L10:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.internal.coroutines.InternalFlowFactory.C00686.$r8$lambda$S4qgyjw_rcMOu5Hpev2YfnJKQd8(r0, r1, r3)
            return
        L1a:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.internal.coroutines.InternalFlowFactory.C00675.$r8$lambda$2qjOtD7UrBzMxDiDhzxcjgLy8n4(r0, r1, r3)
            return
        L24:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.internal.coroutines.InternalFlowFactory.C00664.m322$r8$lambda$ozCCv0PV3WwfP7U6jQLd6TcYOo(r0, r1, r3)
            return
        L2e:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.internal.coroutines.InternalFlowFactory.C00653.m320$r8$lambda$WGdWxo2RtlVUtd33NUxBJ5I1t0(r0, r1, r3)
            return
        L38:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass8.$r8$lambda$B3rGt53URu6XWz5d1Me9uYGmPb8(r0, r1, r3)
            return
    }
}
