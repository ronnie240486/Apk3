package androidx.lifecycle;

import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BA\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewModelLazy<VM extends androidx.lifecycle.ViewModel> implements kotlin.Lazy<VM> {

    @org.jetbrains.annotations.Nullable
    private VM cached;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> extrasProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> factoryProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> storeProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KClass<VM> viewModelClass;


    @kotlin.jvm.JvmOverloads
    public ViewModelLazy(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<VM> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r11) {
            r8 = this;
            java.lang.String r0 = "viewModelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "storeProducer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "factoryProducer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ViewModelLazy(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<VM> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r5) {
            r1 = this;
            java.lang.String r0 = "viewModelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "storeProducer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "factoryProducer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "extrasProducer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.viewModelClass = r2
            r1.storeProducer = r3
            r1.factoryProducer = r4
            r1.extrasProducer = r5
            return
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.KClass r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function0 r3, kotlin.jvm.functions.Function0 r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L6
            androidx.lifecycle.ViewModelLazy$1 r4 = androidx.lifecycle.ViewModelLazy.AnonymousClass1.INSTANCE
        L6:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlin.Lazy
    @org.jetbrains.annotations.NotNull
    public VM getValue() {
            r4 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r4.cached
            if (r0 != 0) goto L2d
            kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider$Factory> r0 = r4.factoryProducer
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> r1 = r4.storeProducer
            java.lang.Object r1 = r1.invoke()
            androidx.lifecycle.ViewModelStore r1 = (androidx.lifecycle.ViewModelStore) r1
            androidx.lifecycle.ViewModelProvider r2 = new androidx.lifecycle.ViewModelProvider
            kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> r3 = r4.extrasProducer
            java.lang.Object r3 = r3.invoke()
            androidx.lifecycle.viewmodel.CreationExtras r3 = (androidx.lifecycle.viewmodel.CreationExtras) r3
            r2.<init>(r1, r0, r3)
            kotlin.reflect.KClass<VM extends androidx.lifecycle.ViewModel> r0 = r4.viewModelClass
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r0)
            androidx.lifecycle.ViewModel r0 = r2.get(r0)
            r4.cached = r0
        L2d:
            return r0
    }

    @Override // kotlin.Lazy
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
            r1 = this;
            androidx.lifecycle.ViewModel r0 = r1.getValue()
            return r0
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
            r1 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r1.cached
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
