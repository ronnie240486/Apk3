package io.realm.kotlin;

/* JADX INFO: compiled from: RealmObjectExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"toChangesetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/ObjectChange;", "T", "Lio/realm/RealmModel;", "(Lio/realm/RealmModel;)Lkotlinx/coroutines/flow/Flow;", "toFlow", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealmObjectExtensionsKt {
    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T>> toChangesetFlow(@org.jetbrains.annotations.Nullable T r3) {
            r0 = 0
            if (r3 != 0) goto L5
            r3 = r0
            goto L40
        L5:
            boolean r1 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L62
            r1 = r3
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            boolean r2 = r1 instanceof io.realm.Realm
            if (r2 == 0) goto L27
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.realm.RealmConfiguration r2 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r2 = r2.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r2.changesetFrom(r1, r3)
            goto L40
        L27:
            boolean r2 = r1 instanceof io.realm.DynamicRealm
            if (r2 == 0) goto L47
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.RealmConfiguration r2 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r2 = r2.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r2.changesetFrom(r1, r3)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T of io.realm.kotlin.RealmObjectExtensionsKt.toChangesetFlow$lambda-3$lambda-2>?>"
            java.util.Objects.requireNonNull(r3, r1)
        L40:
            if (r3 != 0) goto L46
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
        L46:
            return r3
        L47:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L62:
            io.realm.rx.ObjectChange r1 = new io.realm.rx.ObjectChange
            r1.<init>(r3, r0)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<T> toFlow(@org.jetbrains.annotations.Nullable T r3) {
            r0 = 0
            if (r3 != 0) goto L5
            r3 = r0
            goto L40
        L5:
            boolean r1 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L62
            r1 = r3
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            boolean r2 = r1 instanceof io.realm.Realm
            if (r2 == 0) goto L27
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.realm.RealmConfiguration r2 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r2 = r2.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r2.from(r1, r3)
            goto L40
        L27:
            boolean r2 = r1 instanceof io.realm.DynamicRealm
            if (r2 == 0) goto L47
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.RealmConfiguration r2 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r2 = r2.getFlowFactory()
            kotlinx.coroutines.flow.Flow r3 = r2.from(r1, r3)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of io.realm.kotlin.RealmObjectExtensionsKt.toFlow$lambda-1$lambda-0?>"
            java.util.Objects.requireNonNull(r3, r1)
        L40:
            if (r3 != 0) goto L46
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
        L46:
            return r3
        L47:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L62:
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
    }
}
