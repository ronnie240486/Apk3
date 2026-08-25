package com.google.android.material.color;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(api = 30)
class ResourcesLoaderColorResourcesOverride implements com.google.android.material.color.ColorResourcesOverride {

    /* JADX INFO: renamed from: com.google.android.material.color.ResourcesLoaderColorResourcesOverride$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final com.google.android.material.color.ResourcesLoaderColorResourcesOverride INSTANCE = null;

        static {
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = new com.google.android.material.color.ResourcesLoaderColorResourcesOverride
                r1 = 0
                r0.<init>(r1)
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE = r0
                return
        }

        private ResourcesLoaderColorResourcesOverrideSingleton() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ com.google.android.material.color.ResourcesLoaderColorResourcesOverride access$000() {
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE
                return r0
        }
    }

    private ResourcesLoaderColorResourcesOverride() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ ResourcesLoaderColorResourcesOverride(com.google.android.material.color.ResourcesLoaderColorResourcesOverride.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2) {
            r0 = this;
            boolean r2 = com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(r1, r2)
            if (r2 == 0) goto Ld
            int r2 = com.google.android.material.R.style.ThemeOverlay_Material3_PersonalizedColors
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r1, r2)
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }
}
