package io.realm.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public class RealmFlowFactory implements io.realm.coroutines.FlowFactory {
    private final io.realm.internal.coroutines.InternalFlowFactory factory;

    public RealmFlowFactory(java.lang.Boolean r2) {
            r1 = this;
            r1.<init>()
            io.realm.internal.coroutines.InternalFlowFactory r0 = new io.realm.internal.coroutines.InternalFlowFactory
            boolean r2 = r2.booleanValue()
            r0.<init>(r2)
            r1.factory = r0
            return
    }

    @Override // io.realm.coroutines.FlowFactory
    public kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.DynamicRealmObject r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.RealmList<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.RealmResults<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull io.realm.RealmList<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull T r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull io.realm.RealmResults<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.changesetFrom(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public kotlinx.coroutines.flow.Flow<io.realm.DynamicRealm> from(@javax.annotation.Nonnull io.realm.DynamicRealm r2) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public kotlinx.coroutines.flow.Flow<io.realm.DynamicRealmObject> from(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.DynamicRealmObject r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.RealmList<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@javax.annotation.Nonnull io.realm.DynamicRealm r2, @javax.annotation.Nonnull io.realm.RealmResults<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public kotlinx.coroutines.flow.Flow<io.realm.Realm> from(@javax.annotation.Nonnull io.realm.Realm r2) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull io.realm.RealmList<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<T> from(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull T r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@javax.annotation.Nonnull io.realm.Realm r2, @javax.annotation.Nonnull io.realm.RealmResults<T> r3) {
            r1 = this;
            io.realm.internal.coroutines.InternalFlowFactory r0 = r1.factory
            kotlinx.coroutines.flow.Flow r2 = r0.from(r2, r3)
            return r2
    }
}
