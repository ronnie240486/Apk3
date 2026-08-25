package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkResponse {

    @androidx.annotation.Nullable
    public final java.util.List<com.android.volley.Header> allHeaders;
    public final byte[] data;

    @androidx.annotation.Nullable
    public final java.util.Map<java.lang.String, java.lang.String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    private NetworkResponse(int r1, byte[] r2, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r3, @androidx.annotation.Nullable java.util.List<com.android.volley.Header> r4, boolean r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.statusCode = r1
            r0.data = r2
            r0.headers = r3
            if (r4 != 0) goto Lf
            r1 = 0
            r0.allHeaders = r1
            goto L15
        Lf:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.allHeaders = r1
        L15:
            r0.notModified = r5
            r0.networkTimeMs = r6
            return
    }

    @java.lang.Deprecated
    public NetworkResponse(int r8, byte[] r9, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r10, boolean r11) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public NetworkResponse(int r9, byte[] r10, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r11, boolean r12, long r13) {
            r8 = this;
            java.util.List r4 = toAllHeaderList(r11)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public NetworkResponse(int r9, byte[] r10, boolean r11, long r12, @androidx.annotation.Nullable java.util.List<com.android.volley.Header> r14) {
            r8 = this;
            java.util.Map r3 = toHeaderMap(r14)
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public NetworkResponse(byte[] r8) {
            r7 = this;
            java.util.List r6 = java.util.Collections.emptyList()
            r1 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r4 = 0
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    @java.lang.Deprecated
    public NetworkResponse(byte[] r8, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r9) {
            r7 = this;
            r1 = 200(0xc8, float:2.8E-43)
            r4 = 0
            r5 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.Nullable
    private static java.util.List<com.android.volley.Header> toAllHeaderList(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lf
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.android.volley.Header r2 = new com.android.volley.Header
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L20
        L41:
            return r0
    }

    @androidx.annotation.Nullable
    private static java.util.Map<java.lang.String, java.lang.String> toHeaderMap(@androidx.annotation.Nullable java.util.List<com.android.volley.Header> r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            java.util.Map r3 = java.util.Collections.emptyMap()
            return r3
        Lf:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            com.android.volley.Header r1 = (com.android.volley.Header) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = r1.getValue()
            r0.put(r2, r1)
            goto L1a
        L32:
            return r0
    }
}
