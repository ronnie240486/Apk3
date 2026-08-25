package io.realm.rx;

/* JADX INFO: loaded from: classes.dex */
public interface RxObservableFactory {
    io.reactivex.Observable<io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> changesetsFrom(io.realm.DynamicRealm r1, io.realm.DynamicRealmObject r2);

    <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmList<E>>> changesetsFrom(io.realm.DynamicRealm r1, io.realm.RealmList<E> r2);

    <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmResults<E>>> changesetsFrom(io.realm.DynamicRealm r1, io.realm.RealmResults<E> r2);

    <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmList<E>>> changesetsFrom(io.realm.Realm r1, io.realm.RealmList<E> r2);

    <E extends io.realm.RealmModel> io.reactivex.Observable<io.realm.rx.ObjectChange<E>> changesetsFrom(io.realm.Realm r1, E r2);

    <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmResults<E>>> changesetsFrom(io.realm.Realm r1, io.realm.RealmResults<E> r2);

    io.reactivex.Flowable<io.realm.DynamicRealm> from(io.realm.DynamicRealm r1);

    io.reactivex.Flowable<io.realm.DynamicRealmObject> from(io.realm.DynamicRealm r1, io.realm.DynamicRealmObject r2);

    <E> io.reactivex.Flowable<io.realm.RealmList<E>> from(io.realm.DynamicRealm r1, io.realm.RealmList<E> r2);

    <E> io.reactivex.Flowable<io.realm.RealmResults<E>> from(io.realm.DynamicRealm r1, io.realm.RealmResults<E> r2);

    io.reactivex.Flowable<io.realm.Realm> from(io.realm.Realm r1);

    <E> io.reactivex.Flowable<io.realm.RealmList<E>> from(io.realm.Realm r1, io.realm.RealmList<E> r2);

    <E extends io.realm.RealmModel> io.reactivex.Flowable<E> from(io.realm.Realm r1, E r2);

    <E> io.reactivex.Flowable<io.realm.RealmResults<E>> from(io.realm.Realm r1, io.realm.RealmResults<E> r2);

    <E> io.reactivex.Single<io.realm.RealmQuery<E>> from(io.realm.DynamicRealm r1, io.realm.RealmQuery<E> r2);

    <E> io.reactivex.Single<io.realm.RealmQuery<E>> from(io.realm.Realm r1, io.realm.RealmQuery<E> r2);
}
