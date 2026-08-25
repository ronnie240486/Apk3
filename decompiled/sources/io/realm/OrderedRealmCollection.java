package io.realm;

/* JADX INFO: loaded from: classes.dex */
public interface OrderedRealmCollection<E> extends java.util.List<E>, io.realm.RealmCollection<E> {
    io.realm.OrderedRealmCollectionSnapshot<E> createSnapshot();

    boolean deleteFirstFromRealm();

    void deleteFromRealm(int r1);

    boolean deleteLastFromRealm();

    @javax.annotation.Nullable
    E first();

    @javax.annotation.Nullable
    E first(@javax.annotation.Nullable E r1);

    @javax.annotation.Nullable
    E last();

    @javax.annotation.Nullable
    E last(@javax.annotation.Nullable E r1);

    io.realm.RealmResults<E> sort(java.lang.String r1);

    io.realm.RealmResults<E> sort(java.lang.String r1, io.realm.Sort r2);

    io.realm.RealmResults<E> sort(java.lang.String r1, io.realm.Sort r2, java.lang.String r3, io.realm.Sort r4);

    io.realm.RealmResults<E> sort(java.lang.String[] r1, io.realm.Sort[] r2);
}
