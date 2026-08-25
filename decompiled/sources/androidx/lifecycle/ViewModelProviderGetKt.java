package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@kotlin.jvm.JvmName(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r1) {
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L16
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
            java.lang.String r0 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L18
        L16:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L18:
            return r1
    }

    @androidx.annotation.MainThread
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            androidx.lifecycle.ViewModel r2 = r2.get(r0)
            return r2
    }
}
