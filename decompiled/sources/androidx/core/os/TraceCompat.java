package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void beginSection(java.lang.String r0) {
                android.os.Trace.beginSection(r0)
                return
        }

        @androidx.annotation.DoNotInline
        public static void endSection() {
                android.os.Trace.endSection()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void beginAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.beginAsyncSection(r0, r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void endAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.endAsyncSection(r0, r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isEnabled() {
                boolean r0 = android.os.Trace.isEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setCounter(java.lang.String r0, long r1) {
                android.os.Trace.setCounter(r0, r1)
                return
        }
    }

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 >= r2) goto L6d
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Exception -> L65
            r2 = 0
            long r1 = r1.getLong(r2)     // Catch: java.lang.Exception -> L65
            androidx.core.os.TraceCompat.sTraceTagApp = r1     // Catch: java.lang.Exception -> L65
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "isTagEnabled"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L65
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L65
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L65
            androidx.core.os.TraceCompat.sIsTagEnabledMethod = r1     // Catch: java.lang.Exception -> L65
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceBegin"
            r4 = 3
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L65
            r7[r6] = r5     // Catch: java.lang.Exception -> L65
            r7[r3] = r0     // Catch: java.lang.Exception -> L65
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L65
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch: java.lang.Exception -> L65
            androidx.core.os.TraceCompat.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L65
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L65
            r7[r6] = r5     // Catch: java.lang.Exception -> L65
            r7[r3] = r0     // Catch: java.lang.Exception -> L65
            r7[r9] = r8     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch: java.lang.Exception -> L65
            androidx.core.os.TraceCompat.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L65
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L65
            r4[r6] = r5     // Catch: java.lang.Exception -> L65
            r4[r3] = r0     // Catch: java.lang.Exception -> L65
            r4[r9] = r8     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r0 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L65
            androidx.core.os.TraceCompat.sTraceCounterMethod = r0     // Catch: java.lang.Exception -> L65
            goto L6d
        L65:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L6d:
            return
    }

    private TraceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(@androidx.annotation.NonNull java.lang.String r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.beginAsyncSection(r6, r7)
            goto L2e
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L27
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
            r3 = 0
            long r4 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L27
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L27
            r2[r3] = r4     // Catch: java.lang.Exception -> L27
            r3 = 1
            r2[r3] = r6     // Catch: java.lang.Exception -> L27
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L27
            r2[r6] = r7     // Catch: java.lang.Exception -> L27
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L27
            goto L2e
        L27:
            java.lang.String r6 = "TraceCompat"
            java.lang.String r7 = "Unable to invoke asyncTraceBegin() via reflection."
            android.util.Log.v(r6, r7)
        L2e:
            return
    }

    public static void beginSection(@androidx.annotation.NonNull java.lang.String r0) {
            androidx.core.os.TraceCompat.Api18Impl.beginSection(r0)
            return
    }

    public static void endAsyncSection(@androidx.annotation.NonNull java.lang.String r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.endAsyncSection(r6, r7)
            goto L2e
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L27
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
            r3 = 0
            long r4 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L27
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L27
            r2[r3] = r4     // Catch: java.lang.Exception -> L27
            r3 = 1
            r2[r3] = r6     // Catch: java.lang.Exception -> L27
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L27
            r2[r6] = r7     // Catch: java.lang.Exception -> L27
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L27
            goto L2e
        L27:
            java.lang.String r6 = "TraceCompat"
            java.lang.String r7 = "Unable to invoke endAsyncSection() via reflection."
            android.util.Log.v(r6, r7)
        L2e:
            return
    }

    public static void endSection() {
            androidx.core.os.TraceCompat.Api18Impl.endSection()
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.TraceCompat.Api29Impl.isEnabled()
            return r0
        Lb:
            r0 = 0
            java.lang.reflect.Method r1 = androidx.core.os.TraceCompat.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L25
            r2 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L25
            long r4 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L25
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L25
            r3[r0] = r4     // Catch: java.lang.Exception -> L25
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L25
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L25
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r1, r2)
            return r0
    }

    public static void setCounter(@androidx.annotation.NonNull java.lang.String r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r7
            androidx.core.os.TraceCompat.Api29Impl.setCounter(r6, r0)
            goto L2f
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sTraceCounterMethod     // Catch: java.lang.Exception -> L28
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
            r3 = 0
            long r4 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L28
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L28
            r2[r3] = r4     // Catch: java.lang.Exception -> L28
            r3 = 1
            r2[r3] = r6     // Catch: java.lang.Exception -> L28
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L28
            r2[r6] = r7     // Catch: java.lang.Exception -> L28
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L28
            goto L2f
        L28:
            java.lang.String r6 = "TraceCompat"
            java.lang.String r7 = "Unable to invoke traceCounter() via reflection."
            android.util.Log.v(r6, r7)
        L2f:
            return
    }
}
