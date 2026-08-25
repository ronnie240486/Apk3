package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.SavedStateHandle mHandle;
    private boolean mIsAttached;
    private final java.lang.String mKey;

    public SavedStateHandleController(java.lang.String r2, androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsAttached = r0
            r1.mKey = r2
            r1.mHandle = r3
            return
    }

    public final void attachToLifecycle(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            r1 = this;
            boolean r0 = r1.mIsAttached
            if (r0 != 0) goto L16
            r0 = 1
            r1.mIsAttached = r0
            r3.addObserver(r1)
            java.lang.String r3 = r1.mKey
            androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r0.savedStateProvider()
            r2.registerSavedStateProvider(r3, r0)
            return
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached to lifecycleOwner"
            r2.<init>(r3)
            throw r2
    }

    public final androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
            return r0
    }

    public final boolean isAttached() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.mIsAttached = r3
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
        Le:
            return
    }
}
