package com.google.android.material.color;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(30)
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResourcesLoaderCreator";

    private ColorResourcesLoaderCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.content.res.loader.ResourcesLoader create(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, java.lang.Integer> r5) {
            r0 = 0
            byte[] r4 = com.google.android.material.color.ColorResourcesTableCreator.create(r4, r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = com.google.android.material.color.ColorResourcesLoaderCreator.TAG     // Catch: java.lang.Exception -> L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            r1.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "Table created, length: "
            r1.append(r2)     // Catch: java.lang.Exception -> L6e
            int r2 = r4.length     // Catch: java.lang.Exception -> L6e
            r1.append(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6e
            android.util.Log.i(r5, r1)     // Catch: java.lang.Exception -> L6e
            int r5 = r4.length     // Catch: java.lang.Exception -> L6e
            if (r5 != 0) goto L20
            return r0
        L20:
            java.lang.String r5 = "temp.arsc"
            r1 = 0
            java.io.FileDescriptor r5 = android.system.Os.memfd_create(r5, r1)     // Catch: java.lang.Throwable -> L66
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L64
            r1.write(r4)     // Catch: java.lang.Throwable -> L5a
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.dup(r5)     // Catch: java.lang.Throwable -> L5a
            android.content.res.loader.ResourcesLoader r2 = new android.content.res.loader.ResourcesLoader     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            android.content.res.loader.ResourcesProvider r3 = android.content.res.loader.ResourcesProvider.loadFromTable(r4, r0)     // Catch: java.lang.Throwable -> L4e
            r2.addProvider(r3)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.lang.Throwable -> L5a
        L45:
            r1.close()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L4d
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L6e
        L4d:
            return r2
        L4e:
            r2 = move-exception
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch: java.lang.Throwable -> L5a
        L59:
            throw r2     // Catch: java.lang.Throwable -> L5a
        L5a:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.Throwable -> L64
        L63:
            throw r4     // Catch: java.lang.Throwable -> L64
        L64:
            r4 = move-exception
            goto L68
        L66:
            r4 = move-exception
            r5 = r0
        L68:
            if (r5 == 0) goto L6d
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L6e
        L6d:
            throw r4     // Catch: java.lang.Exception -> L6e
        L6e:
            r4 = move-exception
            java.lang.String r5 = com.google.android.material.color.ColorResourcesLoaderCreator.TAG
            java.lang.String r1 = "Failed to create the ColorResourcesTableCreator."
            android.util.Log.e(r5, r1, r4)
            return r0
    }
}
