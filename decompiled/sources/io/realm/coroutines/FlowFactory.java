package io.realm.coroutines;

/* JADX INFO: loaded from: classes.dex */
public interface FlowFactory {
    kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.DynamicRealmObject r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.RealmList<T> r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.RealmResults<T> r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull io.realm.RealmList<T> r2);

    <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull T r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull io.realm.RealmResults<T> r2);

    kotlinx.coroutines.flow.Flow<io.realm.DynamicRealm> from(@javax.annotation.Nonnull io.realm.DynamicRealm r1);

    kotlinx.coroutines.flow.Flow<io.realm.DynamicRealmObject> from(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.DynamicRealmObject r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.RealmList<T> r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@javax.annotation.Nonnull io.realm.DynamicRealm r1, @javax.annotation.Nonnull io.realm.RealmResults<T> r2);

    kotlinx.coroutines.flow.Flow<io.realm.Realm> from(@javax.annotation.Nonnull io.realm.Realm r1);

    <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull io.realm.RealmList<T> r2);

    <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<T> from(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull T r2);

    <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@javax.annotation.Nonnull io.realm.Realm r1, @javax.annotation.Nonnull io.realm.RealmResults<T> r2);
}
