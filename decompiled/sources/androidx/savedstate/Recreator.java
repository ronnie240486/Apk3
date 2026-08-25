package androidx.savedstate;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Recreator implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLASSES_KEY = "classes_to_restore";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COMPONENT_KEY = "androidx.savedstate.Restarter";

    @org.jetbrains.annotations.NotNull
    public static final androidx.savedstate.Recreator.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    /* JADX INFO: compiled from: Recreator.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "()V", "CLASSES_KEY", "", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    /* JADX INFO: compiled from: Recreator.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "add", "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {

        @org.jetbrains.annotations.NotNull
        private final java.util.Set<java.lang.String> classes;

        public SavedStateProvider(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry r2) {
                r1 = this;
                java.lang.String r0 = "registry"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.classes = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.registerSavedStateProvider(r0, r1)
                return
        }

        public final void add(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.Set<java.lang.String> r0 = r1.classes
                r0.add(r2)
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @org.jetbrains.annotations.NotNull
        public android.os.Bundle saveState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.classes
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.Recreator$Companion r0 = new androidx.savedstate.Recreator$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.Recreator.Companion = r0
            return
    }

    public Recreator(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.owner = r2
            return
    }

    private final void reflectiveNew(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Class "
            java.lang.Class<androidx.savedstate.Recreator> r1 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5f
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L5f
            java.lang.Class<androidx.savedstate.SavedStateRegistry$AutoRecreated> r3 = androidx.savedstate.SavedStateRegistry.AutoRecreated.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassNotFoundException -> L5f
            java.lang.String r3 = "{\n                Class.…class.java)\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L5f
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L44
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "{\n                constr…wInstance()\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L37
            androidx.savedstate.SavedStateRegistry$AutoRecreated r0 = (androidx.savedstate.SavedStateRegistry.AutoRecreated) r0     // Catch: java.lang.Exception -> L37
            androidx.savedstate.SavedStateRegistryOwner r5 = r4.owner
            r0.onRecreated(r5)
            return
        L37:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to instantiate "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5)
            r1.<init>(r5, r0)
            throw r1
        L44:
            r5 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " must have default constructor in order to be automatically recreated"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5)
            throw r2
        L5f:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = " wasn't found"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r3)
            r2.<init>(r5, r1)
            throw r2
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L4a
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            androidx.savedstate.SavedStateRegistryOwner r2 = r1.owner
            androidx.savedstate.SavedStateRegistry r2 = r2.getSavedStateRegistry()
            java.lang.String r3 = "androidx.savedstate.Restarter"
            android.os.Bundle r2 = r2.consumeRestoredStateForKey(r3)
            if (r2 != 0) goto L25
            return
        L25:
            java.lang.String r3 = "classes_to_restore"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L42
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.reflectiveNew(r3)
            goto L31
        L41:
            return
        L42:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r2.<init>(r3)
            throw r2
        L4a:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }
}
