package io.realm.kotlin;

/* JADX INFO: compiled from: RealmModelExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007¢\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0003\u001a\u0019\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0003*\u00020\u0003¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0003\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0003\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\u0003\u001a\n\u0010\u0011\u001a\u00020\u000e*\u00020\u0003\u001a\n\u0010\u0012\u001a\u00020\u000e*\u00020\u0003\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0003\u001a'\u0010\u0014\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0014\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\u0015"}, d2 = {"addChangeListener", "", "E", "Lio/realm/RealmModel;", "listener", "Lio/realm/RealmChangeListener;", "(Lio/realm/RealmModel;Lio/realm/RealmChangeListener;)V", "Lio/realm/RealmObjectChangeListener;", "(Lio/realm/RealmModel;Lio/realm/RealmObjectChangeListener;)V", "deleteFromRealm", "freeze", "T", "(Lio/realm/RealmModel;)Lio/realm/RealmModel;", "isFrozen", "", "isLoaded", "isManaged", "isValid", "load", "removeAllChangeListeners", "removeChangeListener", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealmModelExtensionsKt {
    public static final <E extends io.realm.RealmModel> void addChangeListener(@org.jetbrains.annotations.NotNull E r1, @org.jetbrains.annotations.NotNull io.realm.RealmChangeListener<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            io.realm.RealmObject.addChangeListener(r1, r2)
            return
    }

    public static final <E extends io.realm.RealmModel> void addChangeListener(@org.jetbrains.annotations.NotNull E r1, @org.jetbrains.annotations.NotNull io.realm.RealmObjectChangeListener<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            io.realm.RealmObject.addChangeListener(r1, r2)
            return
    }

    public static final void deleteFromRealm(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            io.realm.RealmObject.deleteFromRealm(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> T freeze(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            io.realm.RealmModel r1 = io.realm.RealmObject.freeze(r1)
            java.lang.String r0 = "null cannot be cast to non-null type T of io.realm.kotlin.RealmModelExtensionsKt.freeze"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    public static final boolean isFrozen(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = io.realm.RealmObject.isFrozen(r1)
            return r1
    }

    public static final boolean isLoaded(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = io.realm.RealmObject.isLoaded(r1)
            return r1
    }

    public static final boolean isManaged(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = io.realm.RealmObject.isManaged(r1)
            return r1
    }

    public static final boolean isValid(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = io.realm.RealmObject.isValid(r1)
            return r1
    }

    public static final boolean load(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = io.realm.RealmObject.load(r1)
            return r1
    }

    public static final void removeAllChangeListeners(@org.jetbrains.annotations.NotNull io.realm.RealmModel r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            io.realm.RealmObject.removeAllChangeListeners(r1)
            return
    }

    public static final <E extends io.realm.RealmModel> void removeChangeListener(@org.jetbrains.annotations.NotNull E r1, @org.jetbrains.annotations.NotNull io.realm.RealmChangeListener<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            io.realm.RealmObject.removeChangeListener(r1, r2)
            return
    }

    public static final <E extends io.realm.RealmModel> void removeChangeListener(@org.jetbrains.annotations.NotNull E r1, @org.jetbrains.annotations.NotNull io.realm.RealmObjectChangeListener<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            io.realm.RealmObject.removeChangeListener(r1, r2)
            return
    }
}
