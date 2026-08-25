package com.andyhax.Task;

/* JADX INFO: loaded from: classes.dex */
public class DownloadImageTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
    private static final java.lang.String TAG = "MainActivity";
    private android.content.Context context;
    private java.lang.String[] urls;

    public DownloadImageTask(android.content.Context r1, java.lang.String[] r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.urls = r2
            return
    }

    private java.lang.String getFileExtension(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "."
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L16
            int r1 = r3.length()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L16
            java.lang.String r1 = r3.substring(r0)
            return r1
        L16:
            java.lang.String r1 = ""
            return r1
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    protected java.lang.Boolean doInBackground2(java.lang.Void... r15) {
            r14 = this;
            r0 = 0
        L1:
            r1 = 0
            java.lang.String[] r2 = r14.urls     // Catch: java.io.IOException -> L69
            int r3 = r2.length     // Catch: java.io.IOException -> L69
            if (r0 >= r3) goto L63
            r2 = r2[r0]     // Catch: java.io.IOException -> L69
            java.net.URL r3 = new java.net.URL     // Catch: java.io.IOException -> L69
            r3.<init>(r2)     // Catch: java.io.IOException -> L69
            java.net.URLConnection r4 = r3.openConnection()     // Catch: java.io.IOException -> L69
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.io.IOException -> L69
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L69
            java.io.InputStream r6 = r4.getInputStream()     // Catch: java.io.IOException -> L69
            r5.<init>(r6)     // Catch: java.io.IOException -> L69
            android.content.Context r6 = r14.context     // Catch: java.io.IOException -> L69
            java.io.File r6 = r6.getCacheDir()     // Catch: java.io.IOException -> L69
            java.lang.String r7 = r14.getFileExtension(r2)     // Catch: java.io.IOException -> L69
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> L69
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L69
            r9.<init>()     // Catch: java.io.IOException -> L69
            java.lang.String r10 = "image"
            r9.append(r10)     // Catch: java.io.IOException -> L69
            r9.append(r0)     // Catch: java.io.IOException -> L69
            java.lang.String r10 = ".jpg"
            r9.append(r10)     // Catch: java.io.IOException -> L69
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L69
            r8.<init>(r6, r9)     // Catch: java.io.IOException -> L69
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L69
            r9.<init>(r8)     // Catch: java.io.IOException -> L69
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.io.IOException -> L69
        L4b:
            int r11 = r5.read(r10)     // Catch: java.io.IOException -> L69
            r12 = r11
            r13 = -1
            if (r11 == r13) goto L57
            r9.write(r10, r1, r12)     // Catch: java.io.IOException -> L69
            goto L4b
        L57:
            r9.close()     // Catch: java.io.IOException -> L69
            r5.close()     // Catch: java.io.IOException -> L69
            r4.disconnect()     // Catch: java.io.IOException -> L69
            int r0 = r0 + 1
            goto L1
        L63:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.io.IOException -> L69
            return r0
        L69:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error downloading image: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MainActivity"
            android.util.Log.e(r3, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            java.lang.Boolean r1 = r0.doInBackground2(r1)
            return r1
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    protected void onPostExecute2(java.lang.Boolean r9) {
            r8 = this;
            boolean r0 = r9.booleanValue()
            java.lang.String r1 = "MainActivity"
            if (r0 == 0) goto L93
            java.lang.String r0 = "Images downloaded successfully!"
            android.util.Log.d(r1, r0)
            android.content.Context r0 = r8.context
            java.io.File r0 = r0.getCacheDir()
            r2 = 0
        L14:
            java.lang.String[] r3 = r8.urls
            int r3 = r3.length
            if (r2 >= r3) goto L92
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "image"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ".jpg"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r0, r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "old_image"
            r6.append(r7)
            r6.append(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r0, r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L56
            r4.delete()
        L56:
            boolean r5 = r3.renameTo(r4)
            if (r5 == 0) goto L76
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Image "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " replaced successfully!"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r1, r5)
            goto L8f
        L76:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to replace image "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r1, r5)
        L8f:
            int r2 = r2 + 1
            goto L14
        L92:
            goto L98
        L93:
            java.lang.String r0 = "Failed to download images."
            android.util.Log.e(r1, r0)
        L98:
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.onPostExecute2(r1)
            return
    }
}
