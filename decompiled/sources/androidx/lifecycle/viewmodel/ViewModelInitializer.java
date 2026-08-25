package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B,\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "T", "Landroidx/lifecycle/ViewModel;", "", "clazz", "Ljava/lang/Class;", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "getClazz$lifecycle_viewmodel_release", "()Ljava/lang/Class;", "getInitializer$lifecycle_viewmodel_release", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewModelInitializer<T extends androidx.lifecycle.ViewModel> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<T> clazz;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> initializer;

    public ViewModelInitializer(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.clazz = r2
            r1.initializer = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Class<T> getClazz$lifecycle_viewmodel_release() {
            r1 = this;
            java.lang.Class<T extends androidx.lifecycle.ViewModel> r0 = r1.clazz
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
            r1 = this;
            kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T extends androidx.lifecycle.ViewModel> r0 = r1.initializer
            return r0
    }
}
