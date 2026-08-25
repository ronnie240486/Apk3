package io.realm;

/* JADX INFO: loaded from: classes.dex */
public interface RealmCollection<E> extends java.util.Collection<E>, io.realm.internal.ManageableObject, io.realm.internal.Freezable<io.realm.RealmCollection<E>> {
    double average(java.lang.String r1);

    boolean contains(@javax.annotation.Nullable java.lang.Object r1);

    boolean deleteAllFromRealm();

    boolean isLoaded();

    @Override // io.realm.internal.ManageableObject
    boolean isManaged();

    @Override // io.realm.internal.ManageableObject
    boolean isValid();

    boolean load();

    @javax.annotation.Nullable
    java.lang.Number max(java.lang.String r1);

    @javax.annotation.Nullable
    java.util.Date maxDate(java.lang.String r1);

    @javax.annotation.Nullable
    java.lang.Number min(java.lang.String r1);

    @javax.annotation.Nullable
    java.util.Date minDate(java.lang.String r1);

    java.lang.Number sum(java.lang.String r1);

    io.realm.RealmQuery<E> where();
}
