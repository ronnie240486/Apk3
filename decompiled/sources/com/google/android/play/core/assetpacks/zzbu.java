package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbu {
    private final com.google.android.play.core.internal.zzco zza;

    public zzbu(com.google.android.play.core.internal.zzco r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.io.InputStream zza(int r9, java.lang.String r10, java.lang.String r11, int r12) {
            r8 = this;
            com.google.android.play.core.internal.zzco r0 = r8.zza
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            com.google.android.play.core.tasks.Task r0 = r0.zza(r9, r10, r11, r12)
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 4
            java.lang.Object r0 = com.google.android.play.core.tasks.Tasks.await(r0)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            if (r0 == 0) goto L25
            java.io.FileDescriptor r6 = r0.getFileDescriptor()     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            if (r6 == 0) goto L25
            android.os.ParcelFileDescriptor$AutoCloseInputStream r6 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r6.<init>(r0)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            return r6
        L25:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r6[r4] = r7     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r6[r3] = r10     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r6[r2] = r11     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r6[r1] = r7     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            java.lang.String r7 = "Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            r0.<init>(r6, r9)     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
            throw r0     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L4c
        L43:
            r10 = move-exception
            com.google.android.play.core.assetpacks.zzck r11 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r12 = "Extractor was interrupted while waiting for chunk file."
            r11.<init>(r12, r10, r9)
            throw r11
        L4c:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r6 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r5[r4] = r7
            r5[r3] = r10
            r5[r2] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r5[r1] = r10
            java.lang.String r10 = "Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s"
            java.lang.String r10 = java.lang.String.format(r10, r5)
            r6.<init>(r10, r0, r9)
            throw r6
    }
}
