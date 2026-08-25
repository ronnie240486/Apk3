package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003()*B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\bH\u0007J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "()V", "attached", "", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "<set-?>", "isRestored", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "restoredState", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "key", "getSavedStateProvider", "performAttach", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "performAttach$savedstate_release", "performRestore", "savedState", "performRestore$savedstate_release", "performSave", "outBundle", "registerSavedStateProvider", "provider", "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "unregisterSavedStateProvider", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@android.annotation.SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    @org.jetbrains.annotations.NotNull
    private static final androidx.savedstate.SavedStateRegistry.Companion Companion = null;

    @java.lang.Deprecated
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;

    @org.jetbrains.annotations.NotNull
    private final androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components;
    private boolean isAllowingSavingState;
    private boolean isRestored;

    @org.jetbrains.annotations.Nullable
    private androidx.savedstate.Recreator.SavedStateProvider recreatorProvider;

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle restoredState;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface AutoRecreated {
        void onRecreated(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r1);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface SavedStateProvider {
        @org.jetbrains.annotations.NotNull
        android.os.Bundle saveState();
    }

    public static /* synthetic */ void $r8$lambda$fqOml4yVknvVr08QjHEXC_isf3A(androidx.savedstate.SavedStateRegistry r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            m42performAttach$lambda4(r0, r1, r2)
            return
    }

    static {
            androidx.savedstate.SavedStateRegistry$Companion r0 = new androidx.savedstate.SavedStateRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistry.Companion = r0
            return
    }

    public SavedStateRegistry() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.components = r0
            r0 = 1
            r1.isAllowingSavingState = r0
            return
    }

    /* JADX INFO: renamed from: performAttach$lambda-4, reason: not valid java name */
    private static final void m42performAttach$lambda4(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r3 != r2) goto L18
            r2 = 1
            r1.isAllowingSavingState = r2
            goto L1f
        L18:
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1f
            r2 = 0
            r1.isAllowingSavingState = r2
        L1f:
            return
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle consumeRestoredStateForKey(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isRestored
            if (r0 == 0) goto L2f
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L2e
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L16
        L15:
            r0 = r1
        L16:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1d
            r2.remove(r4)
        L1d:
            android.os.Bundle r4 = r3.restoredState
            r2 = 0
            if (r4 == 0) goto L29
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L29
            r2 = 1
        L29:
            if (r2 != 0) goto L2d
            r3.restoredState = r1
        L2d:
            return r0
        L2e:
            return r1
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r3.components
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "components"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto Lb
            goto L30
        L2f:
            r1 = 0
        L30:
            return r1
    }

    public final boolean isAllowingSavingState$savedstate_release() {
            r1 = this;
            boolean r0 = r1.isAllowingSavingState
            return r0
    }

    @androidx.annotation.MainThread
    public final boolean isRestored() {
            r1 = this;
            boolean r0 = r1.isRestored
            return r0
    }

    @androidx.annotation.MainThread
    public final void performAttach$savedstate_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3) {
            r2 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.attached
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L16
            androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0 r0 = new androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r3.addObserver(r0)
            r2.attached = r1
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already attached."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.MainThread
    public final void performRestore$savedstate_release(@org.jetbrains.annotations.Nullable android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.attached
            if (r0 == 0) goto L25
            boolean r0 = r2.isRestored
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L19
            if (r3 == 0) goto L13
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r3.getBundle(r0)
            goto L14
        L13:
            r3 = 0
        L14:
            r2.restoredState = r3
            r2.isRestored = r1
            return
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.MainThread
    public final void performSave(@org.jetbrains.annotations.NotNull android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r4.restoredState
            if (r1 == 0) goto L11
            r0.putAll(r1)
        L11:
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r4.components
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
            java.lang.String r2 = "this.components.iteratorWithAdditions()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r2 = r2.saveState()
            r0.putBundle(r3, r2)
            goto L1d
        L3d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L48
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r1, r0)
        L48:
            return
    }

    @androidx.annotation.MainThread
    public final void registerSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            if (r2 != 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L1b
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.MainThread
    public final void runOnNextRecreation(@org.jetbrains.annotations.NotNull java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> r4) {
            r3 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isAllowingSavingState
            if (r0 == 0) goto L48
            androidx.savedstate.Recreator$SavedStateProvider r0 = r3.recreatorProvider
            if (r0 != 0) goto L12
            androidx.savedstate.Recreator$SavedStateProvider r0 = new androidx.savedstate.Recreator$SavedStateProvider
            r0.<init>(r3)
        L12:
            r3.recreatorProvider = r0
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2b
            r4.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L2b
            androidx.savedstate.Recreator$SavedStateProvider r0 = r3.recreatorProvider
            if (r0 == 0) goto L2a
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "clazz.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.add(r4)
        L2a:
            return
        L2b:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Class "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " must have default constructor in order to be automatically recreated"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L48:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public final void setAllowingSavingState$savedstate_release(boolean r1) {
            r0 = this;
            r0.isAllowingSavingState = r1
            return
    }

    @androidx.annotation.MainThread
    public final void unregisterSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            r0.remove(r2)
            return
    }
}
