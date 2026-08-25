package io.realm.kotlin;

/* JADX INFO: compiled from: DynamicRealmExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toflow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/DynamicRealm;", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DynamicRealmExtensionsKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<io.realm.DynamicRealm> toflow(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            io.realm.RealmConfiguration r0 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r0 = r0.getFlowFactory()
            kotlinx.coroutines.flow.Flow r1 = r0.from(r1)
            java.lang.String r0 = "configuration.flowFactory.from(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
