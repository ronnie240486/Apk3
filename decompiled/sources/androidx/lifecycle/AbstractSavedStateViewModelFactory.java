package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private android.os.Bundle mDefaultArgs;
    private androidx.lifecycle.Lifecycle mLifecycle;
    private androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    public AbstractSavedStateViewModelFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public AbstractSavedStateViewModelFactory(@androidx.annotation.NonNull androidx.savedstate.SavedStateRegistryOwner r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            r1.mSavedStateRegistry = r0
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.mLifecycle = r2
            r1.mDefaultArgs = r3
            return
    }

    @androidx.annotation.NonNull
    private <T extends androidx.lifecycle.ViewModel> T create(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r4 = r2.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
            android.os.Bundle r1 = r2.mDefaultArgs
            androidx.lifecycle.SavedStateHandleController r3 = androidx.lifecycle.LegacySavedStateHandleController.create(r4, r0, r3, r1)
            androidx.lifecycle.ViewModel r4 = r2.create()
            r4.setTagIfAbsent(r3)
            return r4
    }

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.ViewModel create();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @androidx.annotation.NonNull
    public final <T extends androidx.lifecycle.ViewModel> T create(@androidx.annotation.NonNull java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = r3.getCanonicalName()
            if (r0 == 0) goto L17
            androidx.lifecycle.Lifecycle r1 = r2.mLifecycle
            if (r1 == 0) goto Lf
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            return r3
        Lf:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r3.<init>(r0)
            throw r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @androidx.annotation.NonNull
    public final <T extends androidx.lifecycle.ViewModel> T create(@androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull androidx.lifecycle.viewmodel.CreationExtras r4) {
            r2 = this;
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1b
            androidx.savedstate.SavedStateRegistry r1 = r2.mSavedStateRegistry
            if (r1 == 0) goto L13
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            return r3
        L13:
            androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r4)
            androidx.lifecycle.ViewModel r3 = r2.create()
            return r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r3.<init>(r4)
            throw r3
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@androidx.annotation.NonNull androidx.lifecycle.ViewModel r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r0 = r2.mSavedStateRegistry
            if (r0 == 0) goto L9
            androidx.lifecycle.Lifecycle r1 = r2.mLifecycle
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L9:
            return
    }
}
