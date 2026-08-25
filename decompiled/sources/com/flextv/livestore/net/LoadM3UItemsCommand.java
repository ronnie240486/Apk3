package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes.dex */
public class LoadM3UItemsCommand extends com.flextv.livestore.net.BaseCommand {
    public LoadM3UItemsCommand(java.lang.String r1, java.util.ArrayList<org.apache.http.NameValuePair> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.flextv.livestore.net.BaseCommand
    public /* bridge */ /* synthetic */ java.lang.Object execute() throws java.io.IOException, org.json.JSONException {
            r1 = this;
            java.util.List r0 = r1.execute()
            return r0
    }

    @Override // com.flextv.livestore.net.BaseCommand
    public java.util.List<iptv.m3u.parser.M3UItem> execute() throws java.io.IOException {
            r7 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            com.flextv.livestore.apps.LTVApp r2 = com.flextv.livestore.apps.LTVApp.getInstance()
            r3 = 0
            java.io.File r2 = r2.getExternalFilesDir(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.urlServer
            java.lang.String r4 = com.flextv.livestore.utils.Utils.getUserId(r4)
            r3.append(r4)
            java.lang.String r4 = ".m3u"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.lang.String r2 = r7.urlServer
            java.lang.String r3 = "urlServer"
            android.util.Log.e(r3, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L50
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r0 = r0.format(r2)
            com.flextv.livestore.apps.LTVApp r2 = com.flextv.livestore.apps.LTVApp.instance
            java.lang.String r2 = r2.getM3uDate()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L84
        L50:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L59
            r1.delete()
        L59:
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L80
            java.lang.String r2 = r7.urlServer     // Catch: java.io.IOException -> L80
            r0.<init>(r2)     // Catch: java.io.IOException -> L80
            java.io.InputStream r0 = r0.openStream()     // Catch: java.io.IOException -> L80
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L80
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L80
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L80
        L6e:
            int r5 = r0.read(r4)     // Catch: java.io.IOException -> L80
            r6 = -1
            if (r5 <= r6) goto L79
            r2.write(r4, r3, r5)     // Catch: java.io.IOException -> L80
            goto L6e
        L79:
            r2.close()     // Catch: java.io.IOException -> L80
            r0.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r0 = move-exception
            r0.printStackTrace()
        L84:
            java.lang.String r0 = r1.getPath()
            iptv.m3u.parser.M3UFile r0 = iptv.m3u.parser.M3UToolSet.load(r0)
            java.util.List r0 = r0.getItems()
            return r0
    }
}
