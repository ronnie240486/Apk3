package androidx.lifecycle.viewmodel;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "()V", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "addInitializer", "", "T", "Landroidx/lifecycle/ViewModel;", "clazz", "Lkotlin/reflect/KClass;", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "build", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.lifecycle.viewmodel.ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> initializers;

    public InitializerViewModelFactoryBuilder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.initializers = r0
            return
    }

    public final <T extends androidx.lifecycle.ViewModel> void addInitializer(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r4) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r0 = r2.initializers
            androidx.lifecycle.viewmodel.ViewModelInitializer r1 = new androidx.lifecycle.viewmodel.ViewModelInitializer
            java.lang.Class r3 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r3)
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory build() {
            r3 = this;
            androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r1 = r3.initializers
            r2 = 0
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r2 = new androidx.lifecycle.viewmodel.ViewModelInitializer[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            r0.<init>(r1)
            return r0
    }
}
