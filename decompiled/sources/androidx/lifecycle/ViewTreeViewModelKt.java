package androidx.lifecycle;

/* JADX INFO: compiled from: ViewTreeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ViewTreeViewModelKt {
    @org.jetbrains.annotations.Nullable
    public static final androidx.lifecycle.ViewModelStoreOwner findViewTreeViewModelStoreOwner(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.lifecycle.ViewModelStoreOwner r1 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r1)
            return r1
    }
}
