package androidx.lifecycle;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public interface LifecycleRegistryOwner extends androidx.lifecycle.LifecycleOwner {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleRegistryOwner$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.NonNull
        public static /* bridge */ /* synthetic */ androidx.lifecycle.Lifecycle $default$getLifecycle(androidx.lifecycle.LifecycleRegistryOwner r0) {
                androidx.lifecycle.LifecycleRegistry r0 = r0.getLifecycle()
                return r0
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @androidx.annotation.NonNull
    /* bridge */ /* synthetic */ androidx.lifecycle.Lifecycle getLifecycle();

    @Override // androidx.lifecycle.LifecycleOwner
    @androidx.annotation.NonNull
    androidx.lifecycle.LifecycleRegistry getLifecycle();
}
