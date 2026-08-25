package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface HasDefaultViewModelProviderFactory {

    /* JADX INFO: renamed from: androidx.lifecycle.HasDefaultViewModelProviderFactory$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.NonNull
        public static androidx.lifecycle.viewmodel.CreationExtras $default$getDefaultViewModelCreationExtras(androidx.lifecycle.HasDefaultViewModelProviderFactory r0) {
                androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                return r0
        }
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras();

    @androidx.annotation.NonNull
    androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
