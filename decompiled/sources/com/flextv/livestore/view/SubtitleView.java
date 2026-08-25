package com.flextv.livestore.view;

/* JADX INFO: loaded from: classes2.dex */
public class SubtitleView extends android.widget.TextView implements java.lang.Runnable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SubtitleView";
    private static final int UPDATE_INTERVAL = 300;
    private com.google.android.exoplayer2.ExoPlayer player;
    private java.util.TreeMap<java.lang.Long, com.flextv.livestore.view.SubtitleView.Line> track;

    /* JADX INFO: loaded from: classes.dex */
    public static class Line {
        public java.lang.String text;
        public long to;

        public Line(long r1, long r3, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.to = r3
                r0.text = r5
                return
        }
    }

    public SubtitleView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SubtitleView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public SubtitleView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private java.util.TreeMap<java.lang.Long, com.flextv.livestore.view.SubtitleView.Line> getSubtitleFile(java.lang.String r4) {
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            java.util.TreeMap r0 = parse(r4)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L36
            if (r4 == 0) goto L1e
            r4.close()     // Catch: java.io.IOException -> L1a
            goto L1e
        L1a:
            r4 = move-exception
            r4.printStackTrace()
        L1e:
            return r0
        L1f:
            r1 = move-exception
            goto L28
        L21:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L37
        L26:
            r1 = move-exception
            r4 = r0
        L28:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L35
            r4.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r4 = move-exception
            r4.printStackTrace()
        L35:
            return r0
        L36:
            r0 = move-exception
        L37:
            if (r4 == 0) goto L41
            r4.close()     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r4 = move-exception
            r4.printStackTrace()
        L41:
            throw r0
    }

    private java.lang.String getTimedText(long r7) {
            r6 = this;
            java.util.TreeMap<java.lang.Long, com.flextv.livestore.view.SubtitleView$Line> r0 = r6.track
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = ""
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L27
            goto L3c
        L27:
            java.lang.Object r3 = r2.getValue()
            com.flextv.livestore.view.SubtitleView$Line r3 = (com.flextv.livestore.view.SubtitleView.Line) r3
            long r3 = r3.to
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
            java.lang.Object r1 = r2.getValue()
            com.flextv.livestore.view.SubtitleView$Line r1 = (com.flextv.livestore.view.SubtitleView.Line) r1
            java.lang.String r1 = r1.text
            goto Lc
        L3c:
            return r1
    }

    private static long parse(java.lang.String r14) {
            java.lang.String r0 = ":"
            java.lang.String[] r1 = r14.split(r0)
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = r1.trim()
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.String[] r1 = r14.split(r0)
            r5 = 1
            r1 = r1[r5]
            java.lang.String r1 = r1.trim()
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.String[] r1 = r14.split(r0)
            r8 = 2
            r1 = r1[r8]
            java.lang.String r9 = ","
            java.lang.String[] r1 = r1.split(r9)
            r1 = r1[r2]
            java.lang.String r1 = r1.trim()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String[] r14 = r14.split(r0)
            r14 = r14[r8]
            java.lang.String[] r14 = r14.split(r9)
            r14 = r14[r5]
            java.lang.String r14 = r14.trim()
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 60
            long r3 = r3 * r10
            long r3 = r3 * r10
            r12 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r12
            long r6 = r6 * r10
            long r6 = r6 * r12
            long r6 = r6 + r3
            long r1 = r1 * r12
            long r1 = r1 + r6
            long r1 = r1 + r8
            return r1
    }

    public static java.util.TreeMap<java.lang.Long, com.flextv.livestore.view.SubtitleView.Line> parse(java.io.InputStream r9) throws java.io.IOException {
            java.io.LineNumberReader r0 = new java.io.LineNumberReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r9, r2)
            r0.<init>(r1)
            java.util.TreeMap r9 = new java.util.TreeMap
            r9.<init>()
        L11:
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L5b
            java.lang.String r1 = r0.readLine()
            java.lang.String r2 = ""
            r8 = r2
        L1e:
            java.lang.String r3 = r0.readLine()
            if (r3 == 0) goto L35
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L35
            java.lang.String r4 = "\n"
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r3, r4)
            goto L1e
        L35:
            java.lang.String r2 = "-->"
            java.lang.String[] r3 = r1.split(r2)
            r4 = 0
            r3 = r3[r4]
            long r4 = parse(r3)
            java.lang.String[] r1 = r1.split(r2)
            r2 = 1
            r1 = r1[r2]
            long r6 = parse(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            com.flextv.livestore.view.SubtitleView$Line r2 = new com.flextv.livestore.view.SubtitleView$Line
            r3 = r2
            r3.<init>(r4, r6, r8)
            r9.put(r1, r2)
            goto L11
        L5b:
            return r9
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r2, r0)
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.removeCallbacks(r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            if (r0 == 0) goto L2d
            java.util.TreeMap<java.lang.Long, com.flextv.livestore.view.SubtitleView$Line> r1 = r4.track
            if (r1 == 0) goto L2d
            long r0 = r0.getCurrentPosition()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            com.google.android.exoplayer2.ExoPlayer r1 = r4.player
            long r1 = r1.getCurrentPosition()
            java.lang.String r1 = r4.getTimedText(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
        L2d:
            r0 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r4, r0)
            return
    }

    public java.lang.String secondsToDuration(long r6) {
            r5 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 3600(0xe10, double:1.7786E-320)
            long r3 = r6 / r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            long r1 = r6 % r1
            r3 = 60
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            long r6 = r6 % r3
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 2
            r0[r7] = r6
            java.util.Locale r6 = java.util.Locale.US
            r7 = 3
            r0[r7] = r6
            java.lang.String r6 = "%02d:%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            return r6
    }

    public void setPlayer(com.google.android.exoplayer2.ExoPlayer r1) {
            r0 = this;
            r0.player = r1
            return
    }

    public void setSubSource(java.lang.String r1) {
            r0 = this;
            java.util.TreeMap r1 = r0.getSubtitleFile(r1)
            r0.track = r1
            return
    }
}
