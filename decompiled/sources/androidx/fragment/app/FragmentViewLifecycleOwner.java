package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    public FragmentViewLifecycleOwner(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull androidx.lifecycle.ViewModelStore r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLifecycleRegistry = r0
            r1.mSavedStateRegistryController = r0
            r1.mFragment = r2
            r1.mViewModelStore = r3
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r1 = this;
            androidx.lifecycle.viewmodel.CreationExtras r0 = androidx.lifecycle.HasDefaultViewModelProviderFactory.CC.$default$getDefaultViewModelCreationExtras(r1)
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.lifecycle.SavedStateViewModelFactory r1 = r1.mDefaultFactory
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L13
            r3.mDefaultFactory = r0
            return r0
        L13:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L42
            r0 = 0
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.content.Context r1 = r1.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        L22:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L35
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L2e
            r0 = r1
            android.app.Application r0 = (android.app.Application) r0
            goto L35
        L2e:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L22
        L35:
            androidx.lifecycle.SavedStateViewModelFactory r1 = new androidx.lifecycle.SavedStateViewModelFactory
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.os.Bundle r2 = r2.getArguments()
            r1.<init>(r0, r3, r2)
            r3.mDefaultFactory = r1
        L42:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @androidx.annotation.NonNull
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            r1.initialize()
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            return r0
    }

    public final void handleLifecycleEvent(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.handleLifecycleEvent(r2)
            return
    }

    public final void initialize() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 != 0) goto L11
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
        L11:
            return
    }

    public final boolean isInitialized() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final void performRestore(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            return
    }

    public final void performSave(@androidx.annotation.NonNull android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    public final void setCurrentState(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r2)
            return
    }
}
