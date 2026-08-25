package io.realm.kotlin;

/* JADX INFO: compiled from: RealmResultsExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0003\u001a&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0003¨\u0006\u0007"}, d2 = {"toChangesetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmResults;", "T", "Lio/realm/RealmModel;", "toFlow", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealmResultsExtensionsKt {
    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> toChangesetFlow(@org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.BaseRealm r0 = r3.baseRealm
            boolean r1 = r0 instanceof io.realm.Realm
            java.lang.String r2 = "realmInstance.configurat…From(realmInstance, this)"
            if (r1 == 0) goto L1f
            io.realm.Realm r0 = (io.realm.Realm) r0
            io.realm.RealmConfiguration r1 = r0.getConfiguration()
            io.realm.coroutines.FlowFactory r1 = r1.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r1.changesetFrom(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            goto L34
        L1f:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L35
            io.realm.DynamicRealm r0 = (io.realm.DynamicRealm) r0
            io.realm.RealmConfiguration r1 = r0.getConfiguration()
            io.realm.coroutines.FlowFactory r1 = r1.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r1.changesetFrom(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
        L34:
            return r3
        L35:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Wrong type of Realm."
            r3.<init>(r0)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> toFlow(@org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.BaseRealm r0 = r3.baseRealm
            boolean r1 = r0 instanceof io.realm.Realm
            java.lang.String r2 = "realmInstance.configurat…from(realmInstance, this)"
            if (r1 == 0) goto L1f
            io.realm.Realm r0 = (io.realm.Realm) r0
            io.realm.RealmConfiguration r1 = r0.getConfiguration()
            io.realm.coroutines.FlowFactory r1 = r1.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r1.from(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            goto L34
        L1f:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L35
            io.realm.DynamicRealm r0 = (io.realm.DynamicRealm) r0
            io.realm.RealmConfiguration r1 = r0.getConfiguration()
            io.realm.coroutines.FlowFactory r1 = r1.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r1.from(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
        L34:
            return r3
        L35:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Wrong type of Realm."
            r3.<init>(r0)
            throw r3
    }
}
