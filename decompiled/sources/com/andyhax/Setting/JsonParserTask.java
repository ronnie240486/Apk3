package com.andyhax.Setting;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParserTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
    public JsonParserTask() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ java.lang.String doInBackground(java.lang.String[] r1) {
            r0 = this;
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r1 = r0.doInBackground2(r1)
            return r1
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    protected java.lang.String doInBackground2(java.lang.String... r10) {
            r9 = this;
            r0 = 0
            r0 = r10[r0]
            java.lang.String r1 = ""
            java.net.URL r2 = new java.net.URL     // Catch: java.io.IOException -> L5e
            r2.<init>(r0)     // Catch: java.io.IOException -> L5e
            java.net.URLConnection r3 = r2.openConnection()     // Catch: java.io.IOException -> L5e
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.io.IOException -> L5e
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)     // Catch: java.io.IOException -> L5e
            int r4 = r3.getResponseCode()     // Catch: java.io.IOException -> L5e
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L44
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.io.IOException -> L5e
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L5e
            java.io.InputStream r7 = r3.getInputStream()     // Catch: java.io.IOException -> L5e
            r6.<init>(r7)     // Catch: java.io.IOException -> L5e
            r5.<init>(r6)     // Catch: java.io.IOException -> L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5e
            r6.<init>()     // Catch: java.io.IOException -> L5e
        L30:
            java.lang.String r7 = r5.readLine()     // Catch: java.io.IOException -> L5e
            r8 = r7
            if (r7 == 0) goto L3b
            r6.append(r8)     // Catch: java.io.IOException -> L5e
            goto L30
        L3b:
            r5.close()     // Catch: java.io.IOException -> L5e
            java.lang.String r7 = r6.toString()     // Catch: java.io.IOException -> L5e
            r1 = r7
            goto L5a
        L44:
            java.io.PrintStream r5 = java.lang.System.out     // Catch: java.io.IOException -> L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5e
            r6.<init>()     // Catch: java.io.IOException -> L5e
            java.lang.String r7 = "HTTP GET request failed with response code: "
            r6.append(r7)     // Catch: java.io.IOException -> L5e
            r6.append(r4)     // Catch: java.io.IOException -> L5e
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L5e
            r5.println(r6)     // Catch: java.io.IOException -> L5e
        L5a:
            r3.disconnect()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r2 = move-exception
            r2.printStackTrace()
        L62:
            return r1
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.onPostExecute2(r1)
            return
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    protected void onPostExecute2(java.lang.String r9) {
            r8 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4f
            r0.<init>(r9)     // Catch: org.json.JSONException -> L4f
            r1 = 0
        L6:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L4f
            if (r1 >= r2) goto L4e
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L4f
            java.lang.String r3 = "RTXSetting"
            java.lang.String r3 = r2.getString(r3)     // Catch: org.json.JSONException -> L4f
            java.lang.String r4 = "PanalData"
            java.lang.String r4 = r2.getString(r4)     // Catch: org.json.JSONException -> L4f
            com.andyhax.Setting.Prefs.putString(r3, r4)     // Catch: org.json.JSONException -> L4f
            java.io.PrintStream r5 = java.lang.System.out     // Catch: org.json.JSONException -> L4f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4f
            r6.<init>()     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = "RTXSetting: "
            r6.append(r7)     // Catch: org.json.JSONException -> L4f
            r6.append(r3)     // Catch: org.json.JSONException -> L4f
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L4f
            r5.println(r6)     // Catch: org.json.JSONException -> L4f
            java.io.PrintStream r5 = java.lang.System.out     // Catch: org.json.JSONException -> L4f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4f
            r6.<init>()     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = "PanalData: "
            r6.append(r7)     // Catch: org.json.JSONException -> L4f
            r6.append(r4)     // Catch: org.json.JSONException -> L4f
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L4f
            r5.println(r6)     // Catch: org.json.JSONException -> L4f
            int r1 = r1 + 1
            goto L6
        L4e:
            goto L53
        L4f:
            r0 = move-exception
            r0.printStackTrace()
        L53:
            return
    }
}
