package com.andyhax.Task;

/* JADX INFO: loaded from: classes.dex */
public class FileCopyTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
    private static final java.lang.String TAG = "FileCopyTask";
    private android.content.Context context;
    private java.lang.String fileName;
    private com.andyhax.Task.FileCopyTask.FileCopyListener listener;

    public interface FileCopyListener {
        void onFileCopyComplete(boolean r1);
    }

    public FileCopyTask(android.content.Context r1, java.lang.String r2, com.andyhax.Task.FileCopyTask.FileCopyListener r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.fileName = r2
            r0.listener = r3
            return
    }

    private void copyFile(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r4 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r5.read(r0)
            r2 = r1
            r3 = -1
            if (r1 == r3) goto L11
            r1 = 0
            r6.write(r0, r1, r2)
            goto L4
        L11:
            r5.close()
            r6.flush()
            r6.close()
            return
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    protected java.lang.Boolean doInBackground2(java.lang.Void... r8) {
            r7 = this;
            android.content.Context r0 = r7.context
            java.io.File r0 = r0.getCacheDir()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r7.fileName
            r1.<init>(r0, r2)
            boolean r2 = r1.exists()
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "FileCopyTask"
            if (r2 == 0) goto L20
            java.lang.String r2 = "File already exists, no need to copy"
            android.util.Log.d(r4, r2)
            return r3
        L20:
            android.content.Context r2 = r7.context     // Catch: java.io.IOException -> L35
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.io.IOException -> L35
            java.lang.String r5 = r7.fileName     // Catch: java.io.IOException -> L35
            java.io.InputStream r5 = r2.open(r5)     // Catch: java.io.IOException -> L35
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L35
            r6.<init>(r1)     // Catch: java.io.IOException -> L35
            r7.copyFile(r5, r6)     // Catch: java.io.IOException -> L35
            return r3
        L35:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Error copying file: "
            r3.append(r5)
            java.lang.String r5 = r2.getMessage()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r4, r3)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            java.lang.Boolean r1 = r0.doInBackground2(r1)
            return r1
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    protected void onPostExecute2(java.lang.Boolean r3) {
            r2 = this;
            com.andyhax.Task.FileCopyTask$FileCopyListener r0 = r2.listener
            if (r0 == 0) goto Lb
            boolean r1 = r3.booleanValue()
            r0.onFileCopyComplete(r1)
        Lb:
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
