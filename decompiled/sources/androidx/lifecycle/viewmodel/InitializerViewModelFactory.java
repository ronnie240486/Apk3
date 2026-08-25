package androidx.lifecycle.viewmodel;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InitializerViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r2) {
            r1 = this;
            java.lang.String r0 = "initializers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.initializers = r2
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ androidx.lifecycle.ViewModel create(java.lang.Class r1) {
            r0 = this;
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.ViewModelProvider.Factory.CC.$default$create(r0, r1)
            return r1
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r8, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r9) {
            r7 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] r0 = r7.initializers
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
        L10:
            if (r3 >= r1) goto L31
            r5 = r0[r3]
            java.lang.Class r6 = r5.getClazz$lifecycle_viewmodel_release()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 == 0) goto L2e
            kotlin.jvm.functions.Function1 r4 = r5.getInitializer$lifecycle_viewmodel_release()
            java.lang.Object r4 = r4.invoke(r9)
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModel
            if (r5 == 0) goto L2d
            androidx.lifecycle.ViewModel r4 = (androidx.lifecycle.ViewModel) r4
            goto L2e
        L2d:
            r4 = r2
        L2e:
            int r3 = r3 + 1
            goto L10
        L31:
            if (r4 == 0) goto L34
            return r4
        L34:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No initializer set for given class "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r8 = r8.getName()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }
}
