package androidx.lifecycle.viewmodel;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0096\u0002¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\u000b\u001a\u0002H\u0005H\u0086\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "set", "", "t", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MutableCreationExtras extends androidx.lifecycle.viewmodel.CreationExtras {
    public MutableCreationExtras() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public MutableCreationExtras(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r2) {
            r1 = this;
            java.lang.String r0 = "initialExtras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            java.util.Map r2 = r2.getMap$lifecycle_viewmodel_release()
            r0.putAll(r2)
            return
    }

    public /* synthetic */ MutableCreationExtras(androidx.lifecycle.viewmodel.CreationExtras r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L6:
            r0.<init>(r1)
            return
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    @org.jetbrains.annotations.Nullable
    public <T> T get(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final <T> void set(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            r0.put(r2, r3)
            return
    }
}
