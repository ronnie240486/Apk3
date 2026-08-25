package com.andyhax;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.AppCompatActivity {

    /* JADX INFO: renamed from: com.andyhax.MainActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private class JsonTask extends android.os.AsyncTask<java.lang.String, java.lang.String, java.lang.String> {
        final /* synthetic */ com.andyhax.MainActivity this$0;

        private native JsonTask(com.andyhax.MainActivity r1);

        native /* synthetic */ JsonTask(com.andyhax.MainActivity r1, com.andyhax.MainActivity.AnonymousClass1 r2);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ java.lang.String doInBackground(java.lang.String[] r1);

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected native java.lang.String doInBackground2(java.lang.String... r1);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(java.lang.String r1);

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected native void onPostExecute2(java.lang.String r1);

        @Override // android.os.AsyncTask
        protected native void onPreExecute();
    }

    public native MainActivity();

    private native void CK();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
