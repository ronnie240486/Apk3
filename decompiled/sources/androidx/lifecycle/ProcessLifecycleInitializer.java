package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.Initializer<androidx.lifecycle.LifecycleOwner> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public androidx.lifecycle.LifecycleOwner create(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r3)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r0 = r0.isEagerlyInitialized(r1)
            if (r0 == 0) goto L17
            androidx.lifecycle.LifecycleDispatcher.init(r3)
            androidx.lifecycle.ProcessLifecycleOwner.init(r3)
            androidx.lifecycle.LifecycleOwner r3 = androidx.lifecycle.ProcessLifecycleOwner.get()
            return r3
        L17:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner create(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            androidx.lifecycle.LifecycleOwner r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }
}
