package io.realm.internal.coroutines;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0 implements io.realm.RealmObjectChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f$0;
    public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory f$1;

    public /* synthetic */ InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // io.realm.RealmObjectChangeListener
    public final void onChange(io.realm.RealmModel r3, io.realm.ObjectChangeSet r4) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass5.$r8$lambda$n45p70UenmQ8UyDHodgcBUkEGak(r0, r1, r3, r4)
            return
        Le:
            kotlinx.coroutines.channels.ProducerScope r0 = r2.f$0
            io.realm.internal.coroutines.InternalFlowFactory r1 = r2.f$1
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass6.m316$r8$lambda$Tuj7GVUVsteQluKqO93D3_3UQ(r0, r1, r3, r4)
            return
    }
}
