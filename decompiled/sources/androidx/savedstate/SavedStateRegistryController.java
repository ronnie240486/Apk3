package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "attached", "", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "performAttach", "", "performRestore", "savedState", "Landroid/os/Bundle;", "performSave", "outBundle", "Companion", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SavedStateRegistryController {

    @org.jetbrains.annotations.NotNull
    public static final androidx.savedstate.SavedStateRegistryController.Companion Companion = null;
    private boolean attached;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.savedstate.SavedStateRegistryController create(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r3) {
                r2 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.savedstate.SavedStateRegistryController r0 = new androidx.savedstate.SavedStateRegistryController
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = new androidx.savedstate.SavedStateRegistryController$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistryController.Companion = r0
            return
    }

    private SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1) {
            r0 = this;
            r0.<init>()
            r0.owner = r1
            androidx.savedstate.SavedStateRegistry r1 = new androidx.savedstate.SavedStateRegistry
            r1.<init>()
            r0.savedStateRegistry = r1
            return
    }

    public /* synthetic */ SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.savedstate.SavedStateRegistryController create(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r1) {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = androidx.savedstate.SavedStateRegistryController.Companion
            androidx.savedstate.SavedStateRegistryController r1 = r0.create(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            return r0
    }

    @androidx.annotation.MainThread
    public final void performAttach() {
            r4 = this;
            androidx.savedstate.SavedStateRegistryOwner r0 = r4.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r1 = "owner.lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r3 = 1
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L2b
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            androidx.savedstate.SavedStateRegistryOwner r2 = r4.owner
            r1.<init>(r2)
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistry r1 = r4.savedStateRegistry
            r1.performAttach$savedstate_release(r0)
            r4.attached = r3
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void performRestore(@org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.attached
            if (r0 != 0) goto L7
            r3.performAttach()
        L7:
            androidx.savedstate.SavedStateRegistryOwner r0 = r3.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r1 = "owner.lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L26
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            r0.performRestore$savedstate_release(r4)
            return
        L26:
            java.lang.String r4 = "performRestore cannot be called when owner is "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void performSave(@org.jetbrains.annotations.NotNull android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            r0.performSave(r2)
            return
    }
}
