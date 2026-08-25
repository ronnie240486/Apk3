package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class LegacySavedStateHandleController {


    /* JADX INFO: loaded from: classes2.dex */
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        public OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(@androidx.annotation.NonNull androidx.savedstate.SavedStateRegistryOwner r6) {
                r5 = this;
                boolean r0 = r6 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L43
                r0 = r6
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.HashSet r2 = (java.util.HashSet) r2
                java.util.Iterator r2 = r2.iterator()
            L19:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L31
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r3 = r0.get(r3)
                androidx.lifecycle.Lifecycle r4 = r6.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r1, r4)
                goto L19
            L31:
                java.util.Set r6 = r0.keys()
                java.util.HashSet r6 = (java.util.HashSet) r6
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L42
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r6 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r6)
            L42:
                return
            L43:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                r6.<init>(r0)
                throw r6
        }
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void attachHandleIfNeeded(androidx.lifecycle.ViewModel r1, androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            java.lang.Object r1 = r1.getTag()
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L14
            boolean r0 = r1.isAttached()
            if (r0 != 0) goto L14
            r1.attachToLifecycle(r2, r3)
            tryToAddRecreator(r2, r3)
        L14:
            return
    }

    public static androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.Lifecycle r2, java.lang.String r3, android.os.Bundle r4) {
            android.os.Bundle r0 = r1.consumeRestoredStateForKey(r3)
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandle.createHandle(r0, r4)
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r3, r4)
            r0.attachToLifecycle(r1, r2)
            tryToAddRecreator(r1, r2)
            return r0
    }

    private static void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L11
            goto L1a
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$1 r0 = new androidx.lifecycle.LegacySavedStateHandleController$1
            r0.<init>(r3, r2)
            r3.addObserver(r0)
            goto L1f
        L1a:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r3 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r2.runOnNextRecreation(r3)
        L1f:
            return
    }
}
