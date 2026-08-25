package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0018H\u0007\u001a\u001f\u0010\u0019\u001a\u00020\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0006*\u00020\t*\u0002H\u001bH\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"DEFAULT_ARGS_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "SAVED_STATE_KEY", "", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/savedstate/SavedStateRegistryOwner;", "VIEWMODEL_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "Landroidx/lifecycle/ViewModelStoreOwner;", "savedStateHandlesProvider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "createSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateRegistryOwner", "viewModelStoreOwner", "key", "defaultArgs", "Landroidx/lifecycle/viewmodel/CreationExtras;", "enableSavedStateHandles", "", "T", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@kotlin.jvm.JvmName(name = "SavedStateHandleSupport")
public final class SavedStateHandleSupport {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle> DEFAULT_ARGS_KEY = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.savedstate.SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.lifecycle.ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = null;

    static {
            androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY = r0
            return
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r0 = r4.get(r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = (androidx.savedstate.SavedStateRegistryOwner) r0
            if (r0 == 0) goto L40
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r4.get(r1)
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            if (r1 == 0) goto L38
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r2 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            java.lang.Object r2 = r4.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r3 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L30
            androidx.lifecycle.SavedStateHandle r4 = createSavedStateHandle(r0, r1, r4, r2)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r4.<init>(r0)
            throw r4
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r4.<init>(r0)
            throw r4
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r4.<init>(r0)
            throw r4
    }

    private static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(androidx.savedstate.SavedStateRegistryOwner r1, androidx.lifecycle.ViewModelStoreOwner r2, java.lang.String r3, android.os.Bundle r4) {
            androidx.lifecycle.SavedStateHandlesProvider r1 = getSavedStateHandlesProvider(r1)
            androidx.lifecycle.SavedStateHandlesVM r2 = getSavedStateHandlesVM(r2)
            java.util.Map r0 = r2.getHandles()
            java.lang.Object r0 = r0.get(r3)
            androidx.lifecycle.SavedStateHandle r0 = (androidx.lifecycle.SavedStateHandle) r0
            if (r0 != 0) goto L25
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            android.os.Bundle r1 = r1.consumeRestoredStateForKey(r3)
            androidx.lifecycle.SavedStateHandle r0 = r0.createHandle(r1, r4)
            java.util.Map r1 = r2.getHandles()
            r1.put(r3, r0)
        L25:
            return r0
    }

    @androidx.annotation.MainThread
    public static final <T extends androidx.savedstate.SavedStateRegistryOwner & androidx.lifecycle.ViewModelStoreOwner> void enableSavedStateHandles(@org.jetbrains.annotations.NotNull T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            java.lang.String r1 = "lifecycle.currentState"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1d
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L4c
            androidx.savedstate.SavedStateRegistry r0 = r4.getSavedStateRegistry()
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r0.getSavedStateProvider(r1)
            if (r0 != 0) goto L4b
            androidx.lifecycle.SavedStateHandlesProvider r0 = new androidx.lifecycle.SavedStateHandlesProvider
            androidx.savedstate.SavedStateRegistry r2 = r4.getSavedStateRegistry()
            r3 = r4
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            r0.<init>(r2, r3)
            androidx.savedstate.SavedStateRegistry r2 = r4.getSavedStateRegistry()
            r2.registerSavedStateProvider(r1, r0)
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle()
            androidx.lifecycle.SavedStateHandleAttacher r1 = new androidx.lifecycle.SavedStateHandleAttacher
            r1.<init>(r0)
            r4.addObserver(r1)
        L4b:
            return
        L4c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandlesProvider getSavedStateHandlesProvider(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.savedstate.SavedStateRegistry r1 = r1.getSavedStateRegistry()
            java.lang.String r0 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = r1.getSavedStateProvider(r0)
            boolean r0 = r1 instanceof androidx.lifecycle.SavedStateHandlesProvider
            if (r0 == 0) goto L16
            androidx.lifecycle.SavedStateHandlesProvider r1 = (androidx.lifecycle.SavedStateHandlesProvider) r1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1a
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandlesVM getSavedStateHandlesVM(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r4) {
            java.lang.Class<androidx.lifecycle.SavedStateHandlesVM> r0 = androidx.lifecycle.SavedStateHandlesVM.class
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r1 = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
            r1.<init>()
            androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1 r2 = androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r1.addInitializer(r3, r2)
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.build()
            androidx.lifecycle.ViewModelProvider r2 = new androidx.lifecycle.ViewModelProvider
            r2.<init>(r4, r1)
            java.lang.String r4 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            androidx.lifecycle.ViewModel r4 = r2.get(r4, r0)
            androidx.lifecycle.SavedStateHandlesVM r4 = (androidx.lifecycle.SavedStateHandlesVM) r4
            return r4
    }
}
