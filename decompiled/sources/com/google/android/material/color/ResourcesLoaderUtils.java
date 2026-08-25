package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(api = 30)
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addResourcesLoaderToContext(android.content.Context r3, java.util.Map<java.lang.Integer, java.lang.Integer> r4) {
            android.content.res.loader.ResourcesLoader r4 = com.google.android.material.color.ColorResourcesLoaderCreator.create(r3, r4)
            r0 = 0
            if (r4 == 0) goto L14
            android.content.res.Resources r3 = r3.getResources()
            r1 = 1
            android.content.res.loader.ResourcesLoader[] r2 = new android.content.res.loader.ResourcesLoader[r1]
            r2[r0] = r4
            r3.addLoaders(r2)
            return r1
        L14:
            return r0
    }
}
