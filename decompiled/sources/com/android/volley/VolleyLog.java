package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public class VolleyLog {
    private static final java.lang.String CLASS_NAME = null;
    public static boolean DEBUG = false;
    public static java.lang.String TAG = "Volley";

    /* JADX INFO: loaded from: classes2.dex */
    public static class MarkerLog {
        public static final boolean ENABLED = false;
        private static final long MIN_DURATION_FOR_LOGGING_MS = 0;
        private boolean mFinished;
        private final java.util.List<com.android.volley.VolleyLog.MarkerLog.Marker> mMarkers;

        public static class Marker {
            public final java.lang.String name;
            public final long thread;
            public final long time;

            public Marker(java.lang.String r1, long r2, long r4) {
                    r0 = this;
                    r0.<init>()
                    r0.name = r1
                    r0.thread = r2
                    r0.time = r4
                    return
            }
        }

        static {
                boolean r0 = com.android.volley.VolleyLog.DEBUG
                com.android.volley.VolleyLog.MarkerLog.ENABLED = r0
                return
        }

        public MarkerLog() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMarkers = r0
                r0 = 0
                r1.mFinished = r0
                return
        }

        private long getTotalDuration() {
                r4 = this;
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r0 = r4.mMarkers
                int r0 = r0.size()
                if (r0 != 0) goto Lb
                r0 = 0
                return r0
            Lb:
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r0 = r4.mMarkers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.android.volley.VolleyLog$MarkerLog$Marker r0 = (com.android.volley.VolleyLog.MarkerLog.Marker) r0
                long r0 = r0.time
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r2 = r4.mMarkers
                int r3 = r2.size()
                int r3 = r3 + (-1)
                java.lang.Object r2 = r2.get(r3)
                com.android.volley.VolleyLog$MarkerLog$Marker r2 = (com.android.volley.VolleyLog.MarkerLog.Marker) r2
                long r2 = r2.time
                long r2 = r2 - r0
                return r2
        }

        public synchronized void add(java.lang.String r9, long r10) {
                r8 = this;
                monitor-enter(r8)
                boolean r0 = r8.mFinished     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L18
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r0 = r8.mMarkers     // Catch: java.lang.Throwable -> L20
                com.android.volley.VolleyLog$MarkerLog$Marker r7 = new com.android.volley.VolleyLog$MarkerLog$Marker     // Catch: java.lang.Throwable -> L20
                long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
                r1 = r7
                r2 = r9
                r3 = r10
                r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                r0.add(r7)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r8)
                return
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r10 = "Marker added to finished log"
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L20
                throw r9     // Catch: java.lang.Throwable -> L20
            L20:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
        }

        public final void finalize() throws java.lang.Throwable {
                r2 = this;
                boolean r0 = r2.mFinished
                if (r0 != 0) goto L11
                java.lang.String r0 = "Request on the loose"
                r2.finish(r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Marker log finalized without finish() - uncaught exit point for request"
                com.android.volley.VolleyLog.e(r1, r0)
            L11:
                return
        }

        public synchronized void finish(java.lang.String r11) {
                r10 = this;
                monitor-enter(r10)
                r0 = 1
                r10.mFinished = r0     // Catch: java.lang.Throwable -> L5f
                long r1 = r10.getTotalDuration()     // Catch: java.lang.Throwable -> L5f
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L10
                monitor-exit(r10)
                return
            L10:
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r3 = r10.mMarkers     // Catch: java.lang.Throwable -> L5f
                r4 = 0
                java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L5f
                com.android.volley.VolleyLog$MarkerLog$Marker r3 = (com.android.volley.VolleyLog.MarkerLog.Marker) r3     // Catch: java.lang.Throwable -> L5f
                long r5 = r3.time     // Catch: java.lang.Throwable -> L5f
                java.lang.String r3 = "(%-4d ms) %s"
                r7 = 2
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5f
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L5f
                r8[r4] = r1     // Catch: java.lang.Throwable -> L5f
                r8[r0] = r11     // Catch: java.lang.Throwable -> L5f
                com.android.volley.VolleyLog.d(r3, r8)     // Catch: java.lang.Throwable -> L5f
                java.util.List<com.android.volley.VolleyLog$MarkerLog$Marker> r11 = r10.mMarkers     // Catch: java.lang.Throwable -> L5f
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L5f
            L31:
                boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L5f
                if (r1 == 0) goto L5d
                java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L5f
                com.android.volley.VolleyLog$MarkerLog$Marker r1 = (com.android.volley.VolleyLog.MarkerLog.Marker) r1     // Catch: java.lang.Throwable -> L5f
                long r2 = r1.time     // Catch: java.lang.Throwable -> L5f
                java.lang.String r8 = "(+%-4d) [%2d] %s"
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L5f
                long r5 = r2 - r5
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
                r9[r4] = r5     // Catch: java.lang.Throwable -> L5f
                long r5 = r1.thread     // Catch: java.lang.Throwable -> L5f
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
                r9[r0] = r5     // Catch: java.lang.Throwable -> L5f
                java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L5f
                r9[r7] = r1     // Catch: java.lang.Throwable -> L5f
                com.android.volley.VolleyLog.d(r8, r9)     // Catch: java.lang.Throwable -> L5f
                r5 = r2
                goto L31
            L5d:
                monitor-exit(r10)
                return
            L5f:
                r11 = move-exception
                monitor-exit(r10)
                throw r11
        }
    }

    static {
            java.lang.String r0 = "Volley"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.android.volley.VolleyLog.DEBUG = r0
            java.lang.Class<com.android.volley.VolleyLog> r0 = com.android.volley.VolleyLog.class
            java.lang.String r0 = r0.getName()
            com.android.volley.VolleyLog.CLASS_NAME = r0
            return
    }

    public VolleyLog() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String buildMessage(java.lang.String r7, java.lang.Object... r8) {
            if (r8 != 0) goto L3
            goto L9
        L3:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = java.lang.String.format(r0, r7, r8)
        L9:
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
            java.lang.Throwable r8 = r8.fillInStackTrace()
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            r0 = 2
            r1 = 2
        L18:
            int r2 = r8.length
            r3 = 1
            if (r1 >= r2) goto L5d
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = com.android.volley.VolleyLog.CLASS_NAME
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5a
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            r4 = 46
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            r4 = 36
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            java.lang.String r4 = "."
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r4)
            r8 = r8[r1]
            java.lang.String r8 = r8.getMethodName()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            goto L5f
        L5a:
            int r1 = r1 + 1
            goto L18
        L5d:
            java.lang.String r8 = "<unknown>"
        L5f:
            java.util.Locale r1 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2[r4] = r5
            r2[r3] = r8
            r2[r0] = r7
            java.lang.String r7 = "[%d] %s: %s"
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            return r7
    }

    public static void d(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r1 = buildMessage(r1, r2)
            android.util.Log.d(r0, r1)
            return
    }

    public static void e(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r1 = buildMessage(r1, r2)
            android.util.Log.e(r0, r1)
            return
    }

    public static void e(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r2 = buildMessage(r2, r3)
            android.util.Log.e(r0, r2, r1)
            return
    }

    public static void setTag(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r1 = "Changing log tag to %s"
            d(r1, r0)
            com.android.volley.VolleyLog.TAG = r2
            r0 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            com.android.volley.VolleyLog.DEBUG = r2
            return
    }

    public static void v(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.android.volley.VolleyLog.DEBUG
            if (r0 == 0) goto Ld
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r1 = buildMessage(r1, r2)
            android.util.Log.v(r0, r1)
        Ld:
            return
    }

    public static void wtf(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r1 = buildMessage(r1, r2)
            android.util.Log.wtf(r0, r1)
            return
    }

    public static void wtf(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = com.android.volley.VolleyLog.TAG
            java.lang.String r2 = buildMessage(r2, r3)
            android.util.Log.wtf(r0, r2, r1)
            return
    }
}
