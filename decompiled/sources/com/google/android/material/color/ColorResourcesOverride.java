package com.google.android.material.color;

/* JADX INFO: loaded from: classes3.dex */
interface ColorResourcesOverride {

    /* JADX INFO: renamed from: com.google.android.material.color.ColorResourcesOverride$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.Nullable
        public static com.google.android.material.color.ColorResourcesOverride getInstance() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r1 > r0) goto Lf
                r1 = 33
                if (r0 > r1) goto Lf
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.access$000()
                return r0
            Lf:
                boolean r0 = androidx.core.os.BuildCompat.isAtLeastU()
                if (r0 == 0) goto L1a
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.access$000()
                return r0
            L1a:
                r0 = 0
                return r0
        }
    }

    boolean applyIfPossible(android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2);
}
